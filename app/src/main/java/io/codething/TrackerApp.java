/*
 * Tracker app for tracking activities and reporting calories
 */
package io.codething;

import java.util.ArrayList;
import java.util.List;

public class TrackerApp {

	private static List<User> users = new ArrayList<User>();
	
	private List<Activity> activities = new ArrayList<Activity>();
	
    public TrackerApp addActivity(Activity activity) {
    	activities.add(activity);
    	return this;
    }

    public int totalActivities() {
        return activities.size();
    }   
    
    public int totalCalories() {
    	int total = 0;
    	for (Activity activity : activities) {
			total += activity.getCalories();
		}
        return total;
    }
    
    public void printTotalDuration() {
    	int total = 0;
    	for (Activity activity : activities) {
			total += activity.getDuration();
		}
        
    	int hours = total/60;
    	int minutes = total%60;
    	
    	System.out.println("Total Duration: "+hours+" hours and "+minutes+" minutes");
    }
    
    public void printTrackerDetails() {
    	for (Activity activity : activities) {
			System.out.println(activity.getClass().getSimpleName()+": "+activity.getCalories()+" calories, Speed: "+activity.getVelocity()+" mph");
		}
    	
    	printTotalDuration();
    	
    	System.out.println("Total Calories: "+ totalCalories()+" calories");
    }
    
    public static void main(String[] args) {
		TrackerApp app = new TrackerApp();
		//running 5km in 30 minutes
		Running running = new Running(5*1000, 30);
		//Walking 4km in 60 minutes
		Walking walking = new Walking(4*1000, 60);
		//Cycling 10km in 60 minutes
		Cycling cycling = new Cycling(20*1000, 60);
		//Swimming 4km in 40 minutes
		Swimming swimming = new Swimming(4*1000, 40);
		
		app.addActivity(running);
		app.addActivity(walking);
		app.addActivity(cycling);
		app.addActivity(swimming);
		
		app.printTrackerDetails();
		
		
		//multiple users
		System.out.println();
		System.out.println("-- Users --");
		User userA = new User("Joerlan");
		
		userA.getTrackerApp()
			.addActivity(new Running(5*1000, 30))
			.addActivity(new Walking(4*1000, 60))
			.addActivity(new Cycling(5*1000, 30))
			.addActivity(new Swimming(5*1000, 30));
		
		User userB = new User("Lima");
		
		userB.getTrackerApp()
			.addActivity(new Running(6*1000, 30))
			.addActivity(new Walking(3*1000, 50))
			.addActivity(new Cycling(30*1000, 40))
			.addActivity(new Swimming(3*1000, 10));
		
		users.add(userA);
		users.add(userB);
		
		for (User user : users) {
			user.printDetails();
		}
	}
    
}
