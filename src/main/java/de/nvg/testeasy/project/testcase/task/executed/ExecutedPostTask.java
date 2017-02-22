package de.nvg.testeasy.project.testcase.task.executed;

import de.nvg.testeasy.project.testcase.task.result.BooleanResult;
import de.nvg.testeasy.project.testcase.task.result.Result;

public class ExecutedPostTask implements Executed {

	@Override
	public Result result() {
		// try some stuff make RESULT Object and return it
		// .....
		return new BooleanResult(true);
	}

}
