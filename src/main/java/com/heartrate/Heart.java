package karvonen_practice.src.main.java.com.heartrate;

import java.util.Scanner;

public class Heart 
{
    public static void main( String[] args )
    {
        int rp, age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Resting Pulse: ");
        rp = sc.nextInt();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.println("Intensity   |   Rate");
        System.out.println("------------|-------");
        for (int intensity = 55; intensity <= 95; intensity += 5) 
        {
            int targetHR = targetHeartRate(age, rp, intensity);
            System.out.printf("%d %% \t\t %d bpm \n", intensity, targetHR);
        }
    }
    public static int targetHeartRate(int A, int restingpulse, int inten) 
    {
        int maxHR = 220 - A;
        int targetHR = (((maxHR - restingpulse) * inten) / 100) + restingpulse;
        return targetHR;
    }        
}
 