package de.nvg.testeasy;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void projectCreationFromJSON() {
		Projects projects = new Projects(new JSON(new FileStorage("some/path")));
	}

}
