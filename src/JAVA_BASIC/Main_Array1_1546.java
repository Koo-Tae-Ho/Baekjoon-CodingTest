package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numberBox = new int[10];

        for(int i = 0; i < numberBox.length; i++){
           numberBox[i] = Integer.parseInt(sc.nextLine());
        }

        int[] result = new int[10];

        for (int i = 0; i < numberBox.length; i++) {
            result[i] = numberBox[i]%42;
        }

        int count = 0;
        for (int i = 0; i < numberBox.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if(result[i] == result[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                count++;
            }
        }
        System.out.println(count);
    }
}

