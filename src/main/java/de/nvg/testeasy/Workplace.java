package de.nvg.testeasy;

import java.util.HashSet;
import java.util.Set;

public class Workplace {

	private final Set<Project> projects;
	private final Storage storage;

	public Workplace(Storage storage) {
		this.projects = new HashSet<Project>();
		this.storage = storage;
	}

	public Set<Project> projects() {
		if (projects.isEmpty()) {
			this.projects.addAll(storage.content());
		}
		return projects;
	}

}
