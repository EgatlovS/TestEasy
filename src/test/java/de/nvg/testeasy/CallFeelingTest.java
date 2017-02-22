package de.nvg.testeasy;

import java.nio.file.Paths;

import org.junit.Test;

import de.nvg.testeasy.format.JSON;
import de.nvg.testeasy.project.Project;
import de.nvg.testeasy.project.testcase.task.PostTask;
import de.nvg.testeasy.project.testcase.task.Task;
import de.nvg.testeasy.project.testcase.task.result.Result;
import de.nvg.testeasy.storage.FileSystemStorage;
import de.nvg.testeasy.storage.Storage;

public class CallFeelingTest {

	@Test
	public void projectCreationCall() throws Exception {
		Storage storage = new FileSystemStorage("some/path", new JSON());
		Project project = storage.project();
	}

	@Test
	public void taskCalls() throws Exception {
		Task task = new PostTask(Paths.get("some/string/stuff"), "payload");
		task.resolve();
		task.execute();
		Result result = task.result();
	}

}
