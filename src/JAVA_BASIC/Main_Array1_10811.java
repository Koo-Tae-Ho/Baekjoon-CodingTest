package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_10811 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[][] order = new int[M][2];

        for(int i = 0; i < M; i++){
            String[] temp = sc.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                order[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            int start = order[i][0] - 1;
            int end = order[i][1] - 1;

            while (start < end) {
                // 시작과 끝의 요소를 교환
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;

                start++;
                end--;
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
