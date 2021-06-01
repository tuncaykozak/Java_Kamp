package hrms.try1.core.utilies.results;

public class Result {
	
	private Boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success =success;
	}
	
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	public Boolean isSuccess() {
		return this.success;
	}
	
	public String message() {
		return this.message;
	}

}
