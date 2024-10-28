package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_10810 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int N = Integer.parseInt(str[0]) ;
        int M = Integer.parseInt(str[1]) ;

//        int N = sc.nextInt(); //5
//        int M = sc.nextInt(); //4

        int[] num = new int[5];

//        for(int q = 0; q < M; q++){
//            int i = sc.nextInt() -1;
//            int j = sc.nextInt() -1;
//            int k = sc.nextInt();
//
//            for(int a = i; a <= j; a++){
//                num[a] = k;
//            }
//        }
        for(int q = 0; q < M; q++){
            String[] s = sc.nextLine().split(" ");
            int i = Integer.parseInt(s[0]) -1;
            int j = Integer.parseInt(s[1]) -1;
            int k = Integer.parseInt(s[2]) ;

            for(int a = i; a <= j; a++){
                num[a] = k;
            }
        }

        for (int i : num) {
            System.out.print(i + " ");

        }
    }
}
