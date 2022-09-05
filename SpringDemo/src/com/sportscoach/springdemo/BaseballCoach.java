package com.sportscoach.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theForTuneService){
        fortuneService = theForTuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spent 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
