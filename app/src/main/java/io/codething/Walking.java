package io.codething;

import java.math.BigDecimal;

public class Walking implements Activity {

	/*
	 * distance in meters
	 */
	private long distance;

	/**
	 * duration on minutes
	 */
	private long duration;

	private static double caloriesFactor = 0.035;

	public Walking(long distance, long duration) {
		super();
		this.distance = distance;
		this.duration = duration;
	}

	@Override
	public long getCalories() {
		return new BigDecimal(distance*caloriesFactor).longValue();
	}

	@Override
	public long getDistance() {
		return distance;
	}

	@Override
	public void setDistance(long distance) {
		this.distance = distance;
	}

	@Override
	public long getDuration() {
		return duration;
	}

	@Override
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
}