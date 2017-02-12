package de.nvg.testeasy;

import java.util.HashSet;
import java.util.Set;

public class JSON implements Format {

	private final Set<Project> projects;
	private final Storage<String> storage;

	public JSON(Storage<String> storage) {
		this.storage = storage;
		this.projects = new HashSet<>();
	}

	private void map() {
		String json = storage.content();
		// TODO map projects hear from json to projects
		this.projects.add(new Project());
	}

	@Override
	public Set<Project> projects() {
		if (this.projects.isEmpty()) {
			map();
		}
		return new HashSet<>(this.projects);
	}
}