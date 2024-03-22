package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Task1 print
        System.out.println("-------------------------------");
        System.out.println("Task1 print");
        System.out.println(Task1.Distance(0, 0, 0, 3));
        System.out.println("-------------------------------");
        //Task2 print
        System.out.println("Task2 print");
        Task2.Pyramid(5);
        System.out.println("-------------------------------");
        //Task3 print
        System.out.println("Task3 print");
        System.out.println("Circle's radius " + Task3.calcCircle(8));
        System.out.println("Square's radius " + Task3.calcSquare(8));
        System.out.println("Triangle's radius " + Task3.calcTriangle(8, 3));
        System.out.println("-------------------------------");
        //Task4 print
        System.out.println("Task4 print");
        System.out.println(Arrays.toString(Task4.highestIndex()));
        System.out.println("-------------------------------");
        //Task5 print
        System.out.println("Task5 print");
        System.out.println(Arrays.toString(Task5.reArrange()));
        System.out.println("-------------------------------");
        //Task6 print
        System.out.println("Task6 print");
        System.out.println(Task6.Palindrome("Saippuakauppias"));
        System.out.println("-------------------------------");
        //Task7 print
        System.out.println("Task7 print");
        System.out.println(Task7.Fibbonacci(4));
        System.out.println("-------------------------------");
        //Task8 print
        System.out.println("Task8 print");
        Task8.primeNumber(10);
        System.out.println("-------------------------------");
        //Task9 print
        System.out.println("Task9 print");
        System.out.println(Task9.convertTime(3661));
        System.out.println("-------------------------------");
        //Task10 print
        System.out.println("task10 print");
        Task10.randomizer();
    }
}
class Task1 {
    public static double Distance(double x1, double x2, double y1, double y2) {
        double p1 = x1 - x2;
        double p2 = y1 - y2;
        double distance = Math.sqrt(p1 * p1 + p2 * p2);
        return distance;
    }
}
class Task2 {
    public static void Pyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Task3 {
    public static double calcCircle(double r) {
        double A = Math.PI * (r*r);
        return A;
    }
    public static double calcSquare(double x) {
        double A = x * x;
        return A;
    }
    public static double calcTriangle(double a, double b) {
        double A = a * b / 2;
        return A;
    }
}
class Task4 {

    public static int[] highestIndex() {
        int[][] matrix = {
                {1, 5, 7},
                {9, 3, 1},
                {0, 1, 1}
        };

        int max = matrix[0][0];
        int[] maxIndex = {0, 0};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
            }
        }
        return maxIndex;
    }
}
class Task5 {
    public static int[] reArrange() {
        int[] array1 = {8, 3, 2, 7, 10, 40, 23, 1, 6};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        Arrays.sort(array2);
        return array2;
    }
}
class Task6 {
    public static boolean Palindrome(String word) {
        word = word.toLowerCase();

        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
class Task7 {
    public static int Fibbonacci(int N) {
        if (N <= 1)
            return N;

        int num1 = 0, num2 = 1;
        for (int i = 2; i <= N; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num2;
    }
}
class Task8 {
    public static void primeNumber(int num) {
        int lowLimit = num / 2;
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = lowLimit; i <= num; i++) {
            if (prime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class Task9 {
    public static String convertTime(int seconds) {
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        String result = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return result;
    }
}
class Task10 {
    public static void randomizer() {
        ArrayList<Integer> negative = new ArrayList<Integer>();
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> zero = new ArrayList<Integer>();

        HashMap<String, ArrayList<Integer>> listOfThings = new HashMap<String, ArrayList<Integer>>();
        int tickets = 100;
        Random random = new Random();

        for (int i = 0; i < tickets; i++) {

            int randomNumber = random.nextInt(101) - 50;

            if (randomNumber >= -50 && randomNumber <= -1){
                negative.add(randomNumber);
            } else if (randomNumber >= 1 && randomNumber <= 50) {
                positive.add(randomNumber);
            }
            if (randomNumber == 0) {
                zero.add(randomNumber);
            }
        }
        listOfThings.put("Negative", negative);
        listOfThings.put("Positive", positive);
        listOfThings.put("Zero", zero);

        System.out.println(listOfThings);
    }
}
