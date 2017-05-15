package de.egatlov.testeasyrs.entity;

import java.util.Set;

import de.egatlov.testeasyrs.entity.bases.Executeable;
import de.egatlov.testeasyrs.entity.bases.Resolveable;

public class Project implements Executeable, Resolveable {

	private String name;
	private String description;
	private Set<Case> cases;

	@Override
	public void execute() {
		for (Case testCase : cases) {
			testCase.execute();
		}
	}

	@Override
	public void resolve() {
		for (Case testCase : cases) {
			testCase.resolve();
		}
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Case> getCases() {
		return cases;
	}

	public void setCases(Set<Case> cases) {
		this.cases = cases;
	}

}
