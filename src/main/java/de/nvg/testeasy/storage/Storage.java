package de.nvg.testeasy.storage;

import de.nvg.testeasy.project.Project;

public interface Storage {

	void save(Project project) throws Exception;

	Project project() throws Exception;

}
