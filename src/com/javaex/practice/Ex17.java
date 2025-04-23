package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요");
        int num = sc.nextInt();

        for (int y = num; y >= 1; y--) {
            for (int x = 1; x <= y; x++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
