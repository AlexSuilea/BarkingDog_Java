package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay == 23)) && barking;
    }
}
