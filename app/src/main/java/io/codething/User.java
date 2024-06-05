package io.codething;

public class User {
	
	private String name;
	private TrackerApp trackerApp = new TrackerApp();

	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TrackerApp getTrackerApp() {
		return trackerApp;
	}
	
	public void clearTracker() {
		setTrackerApp(new TrackerApp());
	}
	
	public void setTrackerApp(TrackerApp trackerApp) {
		this.trackerApp = trackerApp;
	}

	public void printDetails() {
		System.out.println("User: "+name);
		trackerApp.printTrackerDetails();
		System.out.println();

	}
	
}
