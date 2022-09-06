package com.annotationsjavacode;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements TheCoach{
    private FortuneService fortuneService;


    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
    @Override
    public String getDailyWorkout() {
        return "Swam for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
