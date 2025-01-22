package com.tdd.spi;

import static org.mockito.Mockito.*;

class CleaningRobot {
    public void cleanDesk() {
        System.out.println("Cleaning the desk...");
    }

    public void cleanUnderBed() {
        System.out.println("Cleaning under the bed...");
    }
}

public class SpyExample {
    public static void main(String[] args) {
        CleaningRobot realRobot = new CleaningRobot();
        
        CleaningRobot spyRobot = spy(realRobot);

        spyRobot.cleanDesk();
        spyRobot.cleanUnderBed();


        verify(spyRobot).cleanDesk();
        verify(spyRobot).cleanUnderBed();
    }
}
