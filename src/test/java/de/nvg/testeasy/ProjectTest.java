package de.nvg.testeasy;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void projectCreationFromJSON() {
		Workplace workplace = new Workplace(new FileStorage("some/path", new JSON()));
	}

}
