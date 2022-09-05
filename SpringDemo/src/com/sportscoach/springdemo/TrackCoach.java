package com.sportscoach.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spent 20 minutes on tracking";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doStartupStuff(){
        System.out.println("TrackCoach: initialized");
    }
    //add a destroy method
    public void doDestroyStuff(){
        System.out.println("TrackCoach: destroyed");
    }

}
