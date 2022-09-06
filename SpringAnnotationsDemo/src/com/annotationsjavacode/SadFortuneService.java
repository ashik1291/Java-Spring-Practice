package com.annotationsjavacode;

public class SadFortuneService implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "Sad day";
    }
}
