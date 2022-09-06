package com.annotationsjavacode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SoccerTheCoach implements TheCoach {

    // Field Injection
    @Autowired
   private FortuneService fortuneService;

   /*
   // Constructor Injection
   @Autowired
   public SoccerTheCoach(FortuneService theFortuneService){
       fortuneService = theFortuneService;
   }
   */

    /*
    // Setter Injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */
    /*
    // Custom method Injection
    @Autowired
    public void customMethod(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */
    @Override
    public String getDailyWorkout() {
        return "Practice Dribble for 45 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
