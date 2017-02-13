package de.nvg.testeasy;

import java.util.HashSet;
import java.util.Set;

public class JSON implements Format<String> {

	private final Set<Project> projects;

	public JSON() {
		this.projects = new HashSet<>();
	}

	private void map() {
		// TODO map projects hear from json to projects
		this.projects.add(new Project());
	}

	@Override
	public Set<Project> projects(String content) {
		map();
		// TODO Auto-generated method stub
		return null;
	}
}