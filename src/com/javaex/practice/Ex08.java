package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) { 
            for (int dan = 1; dan <= 9; dan++) { 
                System.out.print( i+ "*" + dan + "=" +(dan*i)+"\t");
            }
            System.out.println(); 
		}

	}

}
