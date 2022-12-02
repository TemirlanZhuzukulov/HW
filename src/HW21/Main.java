package HW21;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
           int rand= random.nextInt(1,100);
            numbers.add(rand);
            if (rand % 2 == 0) {
                firstArray.add(rand);
            } else {
                secondArray.add(rand);
            }
        }
        System.out.println("size of arrayList:"+numbers.size());
        System.out.println("all numbers:"+numbers);
        System.out.println("first odd numbers:"+firstArray);
        System.out.println("second numbers:"+secondArray);
    }
}