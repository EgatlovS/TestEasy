package de.nvg.testeasy.project.testcase.task.result;

public class BooleanResult implements Result{

	private final boolean isPositive;
	private final String content;
	
	public BooleanResult(boolean isPositive, String content){
		this.isPositive = isPositive;
		this.content = content;
	}
	
	public BooleanResult(boolean isPositive){
		this(isPositive, "The result is " + isPositive);
	}
	
	@Override
	public boolean isPositive(){
		return isPositive;
	}

	@Override
	public String content() {
		return content;
	}
	
}
