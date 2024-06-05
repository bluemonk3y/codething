package io.codething;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Activities
 */
interface Activity {
	
	/*
	 * @return the amount of calories for this activity in calories
	 */
	long getCalories();
	
	/*
	 * set the duration time in minutes
	 */
	void setDuration(long minutes);
	
	/*
	 * get the duration time in minutes
	 */
	long getDuration();
	
	/*
	 * set the distance meters
	 */
	void setDistance(long dist);

	/*
	 * @return get the distance meters
	 */
	long getDistance();

	/**
	 * @return the Velocity in MPH
	 */
	public default BigDecimal getVelocity() {
		return new BigDecimal(getDistance()).multiply(new BigDecimal(2.237)).divide(new BigDecimal(getDuration()*60), 2, RoundingMode.HALF_UP);
	}
	
	
}
