package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_10807 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String[] numberBox = sc.nextLine().split(" ");

        int v = Integer.parseInt(sc.nextLine());

        int count = 0;

        for(int i = 0; i < N; i++){
            if(Integer.parseInt(numberBox[i]) == v){
                count++;
            }
        }
        System.out.println(count);
    }
}
