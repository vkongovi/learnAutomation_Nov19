package Hackathon;

import java.util.Scanner;

//unit conversion m/s;km/hr; miles/hr
public class Question_60 {
    public static void main(String[] arg){
        int mileTo_meters=1609;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance covered (in meters):");
        float distance = sc.nextFloat();
        float distance_km = distance/1000;
        float distance_miles=distance/1609;
        System.out.println("Enter the hours taken to cover:");
        int hours=sc.nextInt();
        System.out.println("Enter the minutes taken to cover:");
        int minutes=sc.nextInt();
        System.out.println("Enter the seconds taken to cover:");
        int seconds=sc.nextInt();
        float timeInsecond,timeInhours;
        timeInsecond=time_calculator(hours,minutes,seconds);
        timeInhours=timeInsecond/3600;
        float speed_mps =distance/timeInsecond;
        float speed_kmph=distance_km/timeInhours;
        float speed_mph=distance_miles/timeInhours;
        System.out.println("Speed in (m/s) is :"+speed_mps);
        System.out.println("Speed in (Km/hr) is :"+speed_kmph);
        System.out.println("Speed in (miles/hr) is :"+speed_mph);

    }

    //to calculate time in seconds
    public static float time_calculator(int hh,int mm,int ss) {
        int total_time_seconds = 0;
        if (hh != 0 && mm != 0)
            total_time_seconds = hh * 3600 + mm * 60;
        if (mm != 0 && hh == 0)
            total_time_seconds = mm * 60;
        if (hh != 0 && mm == 0)
            total_time_seconds = hh * 3600;
        total_time_seconds = total_time_seconds + ss;
        return total_time_seconds;
    }

}
