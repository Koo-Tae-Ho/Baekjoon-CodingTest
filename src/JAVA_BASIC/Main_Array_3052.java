package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array_3052 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int N = Integer.parseInt(sc.nextLine());

            String[] score = sc.nextLine().split(" ");

            double[] scores = new double[N]; //정수배열

            for(int i = 0; i<scores.length; i++) {
                scores[i] = Integer.parseInt(score[i]);
            }

            //최대값 찾기
            double max = 0;
            int maxindex = 0;

            for (int i = 0; i < scores.length; i++) {
                if(max < scores[i]) {
                    max = scores[i];
                    maxindex = i;
                }
            }

            for (int i = 0; i < scores.length; i++) {
                scores[i] = scores[i]/max*100;
            }


            double sum = 0;

            for (int i = 0; i < scores.length; i++) {
                sum += scores[i];
            }

            double result = sum/N;

            System.out.println(result);
    }
}
