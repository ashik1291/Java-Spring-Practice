package com.sportscoach.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    // create no-arg constructor
    public CricketCoach(){
        System.out.println("no-arg CricketCoach Created!");
    }
    // setter for fortuneService field
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
