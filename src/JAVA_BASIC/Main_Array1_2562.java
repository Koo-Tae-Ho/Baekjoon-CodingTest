package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numberBox = new String[9];
        int[] real = new int[9];
        for(int i = 0; i < 9; i++){
            numberBox[i] = sc.nextLine();
            real[i] = Integer.parseInt(numberBox[i]);
        }


        int max = real[0];

        for(int i = 0; i < real.length; i++){
            if(max < real[i]){
                max = real[i];
            }
        }
        int maxindex = 0;
        for(int i = 0; i < real.length; i++){
            if(real[i] == max){
                maxindex = i;
            }
        }

        System.out.println(max);
        System.out.println((maxindex+1));









    }
}
