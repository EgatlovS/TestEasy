package de.nvg.testeasy.project.testcase;

import java.util.HashSet;
import java.util.Set;

import de.nvg.testeasy.project.testcase.task.Task;

public final class TestCase {

	private final Set<Task> tasks;

	public TestCase() {
		this.tasks = new HashSet<>();
	}

	public Set<Task> tasks() {
		return tasks;
	}

}
