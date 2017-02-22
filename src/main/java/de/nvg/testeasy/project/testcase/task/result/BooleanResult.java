package de.nvg.testeasy.project.testcase.task.result;

public class BooleanResult implements Result{

	private final boolean result;
	private final String content;
	
	public BooleanResult(boolean result, String content){
		this.result = result;
		this.content = content;
	}
	
	public BooleanResult(boolean result){
		this(result, "The result is positive");
	}
	
	@Override
	public boolean positive(){
		return result;
	}

	@Override
	public String content() {
		return content;
	}
	
}
