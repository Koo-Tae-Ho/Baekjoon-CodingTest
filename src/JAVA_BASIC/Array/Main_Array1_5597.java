package JAVA_BASIC;

import java.util.Scanner;

public class Main_Array1_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] submitted = new boolean[31]; // 인덱스 0은 사용하지 않음
        for(int i = 0; i < 28; i++) {
            int num = scanner.nextInt();
            submitted[num] = true;
        }

        for(int i = 1; i <= 30; i++) {
            if(!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}
