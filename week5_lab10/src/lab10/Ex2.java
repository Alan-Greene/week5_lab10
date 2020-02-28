package lab10;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double CHILD_GIFT = 2.5;
        final double BOX = 0.2;
        final double ADULT_GIFT = 4.0;
        final int ADULT_GIFT_CUT_OFF = 4;
        int num_children = 0;
        int i = 0;
        int naughty = 0;
        int nice = 0;
        double total_cost_of_presents = 0.0;

        System.out.printf("%s%n", "Welcome to Santa's Grotto");
        System.out.printf("%s%n", "How many children in your group?");
        num_children = in.nextInt();
        in.nextLine();

        String[] childrens_names = new String[num_children];
        boolean[] naughty_or_nice = new boolean[num_children];
        String[] naughty_or_nice_print = new String[num_children];

        for (i = 0; i < childrens_names.length; i++){
            System.out.printf("What is the name of child #%d:", i+1);
            childrens_names[i] = in.nextLine();
            System.out.printf("Was %s nice this year? true/false:", childrens_names[i]);
            naughty_or_nice[i] = in.nextBoolean();
            in.nextLine();
        }

        for (i = 0; i < naughty_or_nice.length; i++){
            if (naughty_or_nice[i]){
                nice += 1;
                total_cost_of_presents += CHILD_GIFT;
            } else {
                naughty += 1;
                total_cost_of_presents += BOX;
            }
        }

        if (num_children > ADULT_GIFT_CUT_OFF){
            total_cost_of_presents += ADULT_GIFT;
        }

        for (i = 0; i < naughty_or_nice.length; i++){
            if (naughty_or_nice[i]){
                naughty_or_nice_print[i] = "Nice";
            } else {
                naughty_or_nice_print[i] = "Naughty";
            }
        }

        System.out.printf("Total number of children to visit Santa: %d%n", num_children);
        for (i = 0; i < childrens_names.length; i++){
            System.out.printf("%s was %s this year%n", childrens_names[i], naughty_or_nice_print[i]);
        }

        System.out.printf("There were %d nice children and %d naughty children%n", nice, naughty);
        System.out.printf("The total cost of the group was: €%,.2f", total_cost_of_presents);
    }
}
