package com.luv2code.springdemo;

public class MtbCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "MTB-Guide speaking, you should train bunny hop ;)";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
