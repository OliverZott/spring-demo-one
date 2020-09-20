package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // no-arg constructor for spring bean-reference
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor.");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter-method.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricked Coach here: do some workout buddy";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
