package de.nvg.testeasy.project.testcase.task.resolved;

import de.nvg.testeasy.project.testcase.task.executed.Executed;
import de.nvg.testeasy.project.testcase.task.executed.ExecutedPostTask;

public class ResolvedPostTask implements Resolved {
	
	@Override
	public Executed executed() {
		//Do the post call and save the result
		return new ExecutedPostTask();
	}

}
