package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array_10813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = i + 1;
        }

        for (int q = 0; q < M; q++) {
            String[] s = sc.nextLine().split(" ");
            int i = Integer.parseInt(s[0]) - 1;
            int j = Integer.parseInt(s[1]) - 1;
            int temp = 0;

            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }

        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
