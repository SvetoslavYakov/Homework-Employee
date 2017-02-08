package taskEmployee;

public class Task {
	
	private String name;
	int workingHours;
	
	Task(){
		super();
	}

	public Task(String name, int workingHours) {
		//setName(name);
		this.name = name;
		this.workingHours = workingHours;
	}

	public String getName() {
		return name;
	}



	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}
	
}
