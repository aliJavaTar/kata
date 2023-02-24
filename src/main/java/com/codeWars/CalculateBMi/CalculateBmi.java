package com.codeWars.CalculateBMi;

public class CalculateBmi {
    public String bmi(double weight, double height) {

        double bmi = weight / ( height * height );
        if (bmi <=  25)
            return "Normal";
        else return "";

    }
}
