package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
                              //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = { -1.7, -1.0, 2.6,  9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9,  1.4 };
        double sum = 0;
        double avarage;
        int min=1;
        int max=1;

        for (int i = 0; i < temperature.length; i++) {
            sum+=temperature[i];
            if (temperature[i]<temperature[min]){
                min = i;
            }
            if (temperature[i]>temperature[max]){
                max = i;
            }
        }
        avarage = sum/temperature.length;
        System.out.printf("Average annual temperature: %.3f\n", avarage);

        String month_min ="";
        switch (min){
            case 0: month_min = "I";
            break;
            case 1: month_min = "II";
                break;
            case 2: month_min = "III";
                break;
            case 3: month_min = "IV";
                break;
            case 4: month_min = "V";
                break;
            case 5: month_min = "VI";
                break;
            case 6: month_min = "VII";
                break;
            case 7: month_min = "VIII";
                break;
            case 8: month_min = "IX";
                break;
            case 9: month_min = "X";
                break;
            case 10: month_min = "XI";
                break;
            case 11: month_min = "XII";
                break;
        }
        System.out.println("Month with the lowest temperature in a year: " + month_min);
        String month_max ="";
        switch (max){
            case 0: month_max = "I";
                break;
            case 1: month_max = "II";
                break;
            case 2: month_max = "III";
                break;
            case 3: month_max = "IV";
                break;
            case 4: month_max = "V";
                break;
            case 5: month_max = "VI";
                break;
            case 6: month_max = "VII";
                break;
            case 7: month_max = "VIII";
                break;
            case 8: month_max = "IX";
                break;
            case 9: month_max = "X";
                break;
            case 10: month_max = "XI";
                break;
            case 11: month_max = "XII";
                break;
        }
        System.out.println("The month with the highest temperatures in a year: " + month_max);

    }
}