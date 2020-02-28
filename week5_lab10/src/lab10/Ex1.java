package lab10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

        public static void main(String[] args) {
        // declaring a new scanner object for taking in user input
        Scanner in = new Scanner(System.in);
        // declaring variables for data manipulation
        double sum = 0.0;
        double average = 0.0;
        double max = 0.0;
        double min = 0.0;
        int i = 0;
        int j = 0;
        double temp = 0.0;
        String province_temp = "";
        String winner = "";

        // declaring a string array to hold the province names and a double array to hold their times
        String[] province_list = {"Ulster", "Leinster", "Munster", "Connacht"};
        double[] times_list = new double[4];

        // gathering the time data from the user
        for (i = 0; i < province_list.length; i++) {
            System.out.printf("Enter time for: %s%n", province_list[i]);
            times_list[i] += in.nextDouble();
        }

        // calculating the sum of the times list to use for calculating the average
        for (i = 0; i < times_list.length; i++) {
            sum += times_list[i];
        }

        // calculating the average
        average = sum / times_list.length;

        // setting the minimum value to the first entry in the times_list array
        min = times_list[0];

        // checking for the lowest time and using that values index to find the winner
        for (i = 1; i < times_list.length; i++) {
            if (times_list[i] < min) {
                min = times_list[i];
                winner = province_list[i];
            }
        }

        System.out.printf("The average race time was: %.2f%n", average);
        System.out.printf("%s is the winner with a time of %.2f%n", winner, min);


        for (j = 0; j < times_list.length; j ++) {
            for (i = 1; i < times_list.length; i++) {
                if (times_list[i - 1] > times_list[i]) {
                    temp = times_list[i - 1];
                    times_list[i - 1] = times_list[i];
                    times_list[i] = temp;

                    province_temp = province_list[i-1];
                    province_list[i - 1] = province_list[i];
                    province_list[i] = province_temp;

                }
            }
        }

        for (i = 0; i < province_list.length; i++) {
            System.out.printf("%s: %.2f%n", province_list[i], times_list[i]);
        }

    }
}
