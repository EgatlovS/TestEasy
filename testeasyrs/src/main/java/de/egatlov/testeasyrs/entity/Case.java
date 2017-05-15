package de.egatlov.testeasyrs.entity;

import java.util.Set;

import de.egatlov.testeasyrs.entity.bases.Executeable;
import de.egatlov.testeasyrs.entity.bases.Resolveable;
import de.egatlov.testeasyrs.entity.bases.Task;

public class Case implements Executeable, Resolveable {

	private String name;
	private String description;
	private Set<Task> tasks;

	@Override
	public void resolve() {
		for (Task task : tasks) {
			task.resolve();
		}
	}

	@Override
	public void execute() {
		for (Task task : tasks) {
			task.execute();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

}
