package com.roadsafetyvideogame;

public class SpeedImplementation {
	
	public String setSpeed(Speed s, int spd) {
		try {
			if(spd<30 || spd>90) {
				throw new SpeedInvalidException("SpeedInvalidException");
			}
			s.speed="Valid Speed";
		}
		catch(SpeedInvalidException e) {
			s.speed="Invalid Speed";
			return e.getMessage();
		}
		return s.speed;
	}
}
