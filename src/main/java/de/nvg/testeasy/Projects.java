package de.nvg.testeasy;

import java.util.HashSet;

public class Projects extends HashSet<Project> {

	public Projects(Format format) {
		this.addAll(format.projects());
	}

	private static final long serialVersionUID = 1L;

}