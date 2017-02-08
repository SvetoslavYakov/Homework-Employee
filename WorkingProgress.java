package taskEmployee;

public class WorkingProgress {

	public static void main(String[] args) {
		

		Task welding = new Task("Welding",45);
		Task cutting = new Task("Cutting",38);
		Task cleaning = new Task("Cleaning",12);
		Task coding = new Task("Make Game",18);
		Task writing = new Task("Writing",12);
		Task makePaperWork = new Task("Paper Work",12);
		Task makingMusic = new Task("Making Music",22);
		Task filming = new Task("Filming",10);
		Task webSearch = new Task("Web Search",45);
		Task calling = new Task("Calling",18);
		AllWork allWork = new AllWork();
		
		allWork.addTask(welding);
		allWork.addTask(cutting);
		allWork.addTask(cleaning);
		allWork.addTask(coding);
		allWork.addTask(writing);
		allWork.addTask(makePaperWork);
		allWork.addTask(makingMusic);
		allWork.addTask(filming);
		allWork.addTask(webSearch);
		allWork.addTask(calling);
	
		Employee pesho = new Employee("Petur");
		Employee gosho = new Employee("Georgi");
		Employee ivan = new Employee("Ivan");
		Employee stavri = new Employee("Stavri");
		
		Employee[] workers = new Employee[4];
		
		workers[0]=pesho;
		workers[1]=gosho;
		workers[2]=ivan;
		workers[3]=stavri;

		

		
		for (int i = 0; i < workers.length; i++) {
			workers[i].allwork=allWork;
			workers[i].setCurrentTask(allWork.getNextTask());
		}
		
		int day=1;
		
		
		while(true){
			System.out.println("=== Day ==="+"\n"+"===  "+ day++ +"  ===");

			for (int i = 0; i < workers.length; i++) {
				
				workers[i].startWorkingDay();
				workers[i].work();
			}
			if(allWork.isAllWorkDone()){
				break;
			}
			day++;
	}
		System.out.println("All work is done");


	
	}
		
	}

