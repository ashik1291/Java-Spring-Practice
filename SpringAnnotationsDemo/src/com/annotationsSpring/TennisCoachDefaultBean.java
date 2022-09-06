package com.annotationsSpring;

import org.springframework.stereotype.Component;

@Component
public class TennisCoachDefaultBean implements Coach {

    @Override
    public String getDailyWorkout() {
        return "40 minutes from TennisCoachDefaultBean class";
    }
}
