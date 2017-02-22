package de.nvg.testeasy.project.testcase.task;

import de.nvg.testeasy.project.testcase.task.result.Result;

public interface Task {

	void execute();

	Result result();

	void resolve();

}
