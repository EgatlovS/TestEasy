package de.nvg.testeasy.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import de.nvg.testeasy.format.Format;
import de.nvg.testeasy.format.JSON;
import de.nvg.testeasy.project.Project;

public class FileSystemStorage implements Storage {

	private final Path path;
	private final Format<String> format;

	public FileSystemStorage(Path path, Format<String> format) {
		this.path = path;
		this.format = format;
	}

	public FileSystemStorage(String url, Format<String> format) {
		this(Paths.get(url), format);
	}

	public FileSystemStorage(Path path) {
		this.path = path;
		this.format = new JSON();
	}

	public FileSystemStorage(String url) {
		this(Paths.get(url));
	}

	@Override
	public Project project() throws Exception {
		byte[] bytes;
		try {
			bytes = Files.readAllBytes(path);
		} catch (IOException e) {
			throw new Exception("Couldn't read file from path: " + path, e);
		}
		return format.project(new String(bytes));
	}

	@Override
	public void save(Project project) {
		// TODO save:
		format.formattedProject(project);
	}

}
