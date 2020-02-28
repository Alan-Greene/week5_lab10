package lab10;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {

        int floors = 0;
        int rooms = 0;
        int value = 0;

        int[][] hotel_rooms = new int[4][5];

        Random new_rand = new Random();

        for (floors = 0; floors < hotel_rooms.length; floors++){
            for (rooms = 0; rooms < hotel_rooms[floors].length; rooms++){
                value = new_rand.nextInt(1 - 4);
                hotel_rooms[floors][rooms] = value;
            }
        }
    }
}
