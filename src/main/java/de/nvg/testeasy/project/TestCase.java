package de.nvg.testeasy.project;

import java.util.HashSet;
import java.util.Set;

import de.nvg.testeasy.task.Task;

public class TestCase {

	private final Set<Task> tasks;

	public TestCase() {
		this.tasks = new HashSet<>();
	}

	public Set<Task> tasks() {
		return tasks;
	}

}
