package de.nvg.testeasy.storage;

import de.nvg.testeasy.format.Format;
import de.nvg.testeasy.format.JSON;
import de.nvg.testeasy.project.Project;

public class GitStorage implements Storage {

	private final Format<String> format;

	public GitStorage() {
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
