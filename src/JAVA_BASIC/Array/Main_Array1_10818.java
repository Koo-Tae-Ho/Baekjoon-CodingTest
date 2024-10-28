package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String[] numberBox = sc.nextLine().split(" ");
        int[] real = new int[N];

        for(int i = 0; i < numberBox.length; i++){
            real[i] = Integer.parseInt(numberBox[i]);
        }

        int min = real[0];
        int max = real[0];
        for (int i = 0; i < real.length; i++) {
            if(min > real[i]){
                min = real[i];
            }
        }

        for (int i = 0; i < real.length; i++) {
            if(max < real[i]){
                max = real[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
