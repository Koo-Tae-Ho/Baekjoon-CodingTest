package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_10871 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] up = sc.nextLine().split(" ");
        int N = Integer.parseInt(up[0]);
        int v = Integer.parseInt(up[1]);

        String[] numberBox = sc.nextLine().split(" ");

        for(int i = 0; i < N; i++){
            if(Integer.parseInt(numberBox[i]) < v){
                System.out.print(numberBox[i] + " ");
            }
        }
    }
}
