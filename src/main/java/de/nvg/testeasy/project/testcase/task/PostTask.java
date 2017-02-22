package de.nvg.testeasy.project.testcase.task;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

import de.nvg.testeasy.project.testcase.task.resolved.ResolvedPostTask;

public final class PostTask extends SimpleTask {

	private final Path path;
	private final String payload;
	private final List<Matcher> resultMatcher;

	public PostTask(Path path, String payload, Matcher... resultMatcher) {
		this.path = path;
		this.payload = payload;
		this.resultMatcher = Arrays.asList(resultMatcher);
	}

	@Override
	public void resolve() {
		// Resolve those regex things in payload and stuff so the execute call
		// works
		// like expected
		this.resolved = new ResolvedPostTask();
	}

}