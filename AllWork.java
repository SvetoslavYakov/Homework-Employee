package taskEmployee;

public class AllWork {

	private Task[] tasks;

	private int freePlacesForTask;
	private int currentUnassinedTask = 0;

	AllWork() {
		tasks = new Task[10];
		freePlacesForTask = 10;
	}

	void addTask(Task task) {
		if (freePlacesForTask <= 0) {
			return;
		}

		tasks[tasks.length - freePlacesForTask] = task;
		freePlacesForTask--;

	}

	Task getNextTask() {
		if (currentUnassinedTask == tasks.length) {
			return null;
		}
		return tasks[currentUnassinedTask++];

	}

	boolean isAllWorkDone() {
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;

	}

}
