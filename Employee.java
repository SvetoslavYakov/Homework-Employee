package taskEmployee;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private boolean isWorking;
	AllWork allwork;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public boolean isWorking() {

		return isWorking;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public AllWork getAllwork() {
		return allwork;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	void work() {
		if (isWorking) {

			
			
			while (getHoursLeft() > 0) {
				if (currentTask == null) {
					System.out.println("No more tasks" + "\n" + getName());
					isWorking = true;
					return;
				}
				System.out.println(getName() + " starts to work on " + currentTask.getName());
				if (getHoursLeft() >= currentTask.getWorkingHours()) {


					setHoursLeft(getHoursLeft() - currentTask.getWorkingHours());
					currentTask.setWorkingHours(0);
					System.out.println(currentTask.getName() + " is done");
					setCurrentTask(allwork.getNextTask());


					if (getHoursLeft() == 0) {
						System.out.println(getName() + " finished for today");
						return;
					}
					
					
					
				} else {
					currentTask.setWorkingHours(currentTask.getWorkingHours() - getHoursLeft());
					setHoursLeft(0);
					System.out.println(getName() + " finished for today else");
				}
			}
		}

	}

	void startWorkingDay() {

		this.hoursLeft = 8;

	}

	public void setCurrentTask(Task currentTask) {
			isWorking = true;
			this.currentTask = currentTask;
	}

	public void setAllwork(AllWork allWork) {
		if (allWork != null) {
			this.allwork = allWork;
		}

	}

	void showReport() {

		if (isWorking) {

			System.out.println("Name :" + getName() + "\n" + "Task name :" + getCurrentTask().getName() + "\n"
					+ getName() + " work hours left :" + getHoursLeft() + "\n" + "Task need "
					+ currentTask.getWorkingHours() + " hours left");

		}
	}
}
