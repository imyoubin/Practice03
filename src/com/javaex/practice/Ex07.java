package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num =sc.nextInt();
        for(int i = 1; i <=num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i); // 줄 바꿈 X
            }
            System.out.println(); // 한 줄 끝나고 줄 바꿈
        }
        
        sc.close();
	}

}
