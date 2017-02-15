package de.nvg.testeasy.format;

import de.nvg.testeasy.project.Project;

public interface Format<T> {

	Project project(T content);

	T formattedProject(Project project);
}
