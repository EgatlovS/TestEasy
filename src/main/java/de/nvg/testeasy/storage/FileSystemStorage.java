package de.nvg.testeasy.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import de.nvg.testeasy.format.Format;
import de.nvg.testeasy.format.JSON;
import de.nvg.testeasy.project.Project;

public final class FileSystemStorage implements Storage {

	private final Path path;
	private final Format<String> format;

	public FileSystemStorage(Path path, Format<String> format) {
		this.path = path;
		this.format = format;
	}

	public FileSystemStorage(String url, Format<String> format) {
		this(Paths.get(url), format);
	}

	public FileSystemStorage(String url) {
		this(Paths.get(url));
	}

	public FileSystemStorage(Path path) {
		this(path, new JSON());
	}

	@Override
	public Project project() throws Exception {
		byte[] bytes;
		try {
			bytes = Files.readAllBytes(path);
		} catch (IOException e) {
			throw new Exception("Couldn't read file from path: " + path.toString(), e);
		}
		return format.project(new String(bytes));
	}

	@Override
	public void save(Project project) throws Exception {
		String content = format.formattedProject(project);
		try {
			Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE,
					StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			throw new Exception("Couldn't save file to path: " + path.toString(), e);
		}
	}

}
