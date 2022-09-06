package com.annotationsSpring;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "38 minutes";
    }
}
