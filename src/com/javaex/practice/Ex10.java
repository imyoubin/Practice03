package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");

        int no = 0;
        boolean num = true;

        for (int i = 0; i < 5; i++) {
            System.out.print("숫자: ");
            int tr = sc.nextInt();

            if (num) {
                no = tr;
                num = false;
            } else if (tr > no) {
                no = tr;
            }
        }

        System.out.println("최대값은 \"" + no + "\" 입니다.");

        sc.close();
        
	}	

}
