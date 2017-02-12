package de.nvg.testeasy;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStorage implements Storage<String> {

	private final Path path;

	public FileStorage(Path path) {
		this.path = path;
	}

	public FileStorage(String url) {
		this(Paths.get(url));
	}

	@Override
	public String content() {
		// read from disk
		return null;
	}

}
