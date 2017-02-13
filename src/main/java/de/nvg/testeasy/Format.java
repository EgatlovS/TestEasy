package de.nvg.testeasy;

import java.util.Set;

public interface Format<T> {

	Set<Project> projects(T content);

}
