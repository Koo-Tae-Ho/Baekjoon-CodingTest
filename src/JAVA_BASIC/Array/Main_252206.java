package JAVA_BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_252206 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] strArr = new String[20][3]; // 20행 3열 배열

        // 각 줄에서 3개의 데이터씩 입력받아 배열에 저장
        for (int i = 0; i < 20; i++) {
            String line = br.readLine(); // 한 줄 입력받기
            StringTokenizer st = new StringTokenizer(line); // 입력된 줄을 공백 기준으로 분리

            for (int j = 0; j < 3; j++) {
                if (st.hasMoreTokens()) {
                    strArr[i][j] = st.nextToken(); // 각 토큰을 배열에 저장
                }
            }
        }

        double score = 0;




        // 배열에 저장된 데이터를 출력
        for (int i = 0; i < 20; i++) {
            switch (strArr[i][2]) {
                case "A+":
                    score += Integer.parseInt(strArr[i][1]);
                    
            }


        }


    }
}
