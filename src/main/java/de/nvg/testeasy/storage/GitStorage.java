package de.nvg.testeasy.storage;

import java.io.File;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.CredentialsProvider;

import de.nvg.testeasy.format.Format;
import de.nvg.testeasy.format.JSON;
import de.nvg.testeasy.project.Project;

/**
 * Connecting to a git-remote-repository and checkout the single
 * project-testeasy file and/or commit a project-testeasy file.
 * 
 * Maybe with git sparse checkout but most likely with another approach...
 * 
 * @author egatlovS
 */
public class GitStorage implements Storage {

	private final GitPathConfig config;
	private final CredentialsProvider credentials;
	private final Format<String> format;

	public GitStorage(GitPathConfig config, CredentialsProvider credentials, Format<String> format) {
		this.config = config;
		this.credentials = credentials;
		this.format = format;
	}

	public GitStorage(GitPathConfig config, CredentialsProvider credentials) {
		this(config, credentials, new JSON());
	}

	public GitStorage(GitPathConfig config, Format<String> format) {
		this(config, null, format);
	}

	public GitStorage(GitPathConfig config) {
		this(config, null, new JSON());
	}

	@Override
	public void save(Project project) throws Exception {
		format.formattedProject(project);
		// save project to repo
		Git repo = Git.open(new File(config.localRepositoryPath()));
		repo.add().addFilepattern("").call();
		repo.commit().setMessage("message");
		repo.push().call();
	}

	@Override
	public Project project() throws Exception {
		CloneCommand cloneCommand = Git.cloneRepository();
		cloneCommand.setDirectory(new File(config.localRepositoryPath()));
		cloneCommand.setNoCheckout(true);
		cloneCommand.setRemote(config.remoteRepositoryPath());
		cloneCommand.setCredentialsProvider(credentials);
		Git repo = cloneCommand.call();
		repo.checkout().addPath(config.testEasyFilePath()).call();
		// read file from directory and work with it
		String content = "";
		format.project(content);
		return null;
	}

}
