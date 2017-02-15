package de.nvg.testeasy.project;

import java.util.HashSet;
import java.util.Set;

public class Project {

	private final Set<TestCase> testCases;

	public Project() {
		testCases = new HashSet<>();
	}

	public Set<TestCase> testCases() {
		return testCases;
	}

}
