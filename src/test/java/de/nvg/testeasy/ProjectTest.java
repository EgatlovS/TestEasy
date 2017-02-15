package de.nvg.testeasy;

import org.junit.Test;

import de.nvg.testeasy.format.JSON;
import de.nvg.testeasy.project.Project;
import de.nvg.testeasy.storage.FileSystemStorage;
import de.nvg.testeasy.storage.Storage;

public class ProjectTest {

	@Test
	public void projectCreationFromJSON() throws Exception {
		Storage storage = new FileSystemStorage("some/path", new JSON());
		Project project = storage.project();
	}

}
