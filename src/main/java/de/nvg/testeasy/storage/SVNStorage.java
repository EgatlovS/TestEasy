package de.nvg.testeasy.storage;

import de.nvg.testeasy.format.Format;
import de.nvg.testeasy.format.JSON;
import de.nvg.testeasy.project.Project;

/**
 * Connecting to a svn-repository
 * and checkout the single project-testeasy file and/or
 * commit a project-testeasy file.
 * The svn-sparse checkout is required so the svn version
 * must be 1.5 or higher.
 * 
 * Example sparse checkout:
 * svn checkout --depth empty http://svnserver/trunk/proj
 * svn update --set-depth infinity proj/foo
 * 
 * @author egatlovS
 */
public final class SVNStorage implements Storage {

	private final Format<String> format;

	public SVNStorage() {
		this.format = new JSON();
	}

	@Override
	public void save(Project project) throws Exception {
		// TODO Auto-generated method stub
		format.formattedProject(project);
	}

	@Override
	public Project project() throws Exception {
		String content = "";
		// TODO Auto-generated method stub
		format.project(content);
		return null;
	}
}
