package de.nvg.testeasy;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class FileStorage implements Storage {

	private final Path path;
	private final Format<String> format;

	public FileStorage(Path path, Format<String> format) {
		this.path = path;
		this.format = format;
	}

	public FileStorage(String url, Format<String> format) {
		this(Paths.get(url), format);
	}

	@Override
	public Set<Project> content() {
		String content = "";
		// read from disk
		format.projects(content);
		return null;
	}

}
