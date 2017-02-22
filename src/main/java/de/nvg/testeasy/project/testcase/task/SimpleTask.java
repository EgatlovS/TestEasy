package de.nvg.testeasy.project.testcase.task;

import de.nvg.testeasy.project.testcase.task.executed.Executed;
import de.nvg.testeasy.project.testcase.task.resolved.Resolved;
import de.nvg.testeasy.project.testcase.task.result.Result;

public abstract class SimpleTask implements Task {

	protected Resolved resolved;
	protected Executed executed;

	@Override
	public void execute() {
		this.executed = resolved.executed();
	}

	@Override
	public Result result() {
		return executed.result();
	}

	@Override
	public abstract void resolve();

}
