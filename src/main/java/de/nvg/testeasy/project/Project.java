package de.nvg.testeasy.project;

import java.util.HashSet;
import java.util.Set;

import de.nvg.testeasy.project.testcase.TestCase;

public final class Project {

	private final Set<TestCase> testCases;

	public Project() {
		testCases = new HashSet<>();
	}

	public Set<TestCase> testCases() {
		return testCases;
	}

}
