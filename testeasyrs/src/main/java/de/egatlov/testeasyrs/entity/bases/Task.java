package de.egatlov.testeasyrs.entity.bases;

import de.egatlov.testeasyrs.entity.Result;

public abstract class Task implements Executeable, Resolveable {

	private Integer position;
	private Resolved resolved;
	private Result result;

	@Override
	public void execute() {
		result = resolved.result();
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Resolved getResolved() {
		return resolved;
	}

	public void setResolved(Resolved resolved) {
		this.resolved = resolved;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
