package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	/*
	 * 아래와 같이 은행 프로그램을 작성하세요
		“1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다.
		“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다.
		“3.잔고” 선택시 현재 잔고가 출력됩니다.
		“4.종료” 선택시 종료됩니다.
		“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("  1.예금 : 2.출금 : 3.잔고: 4.종료");
		System.out.println("--------------------------------");
		System.out.print("선택>");
		
		int choice = sc.nextInt();
		int balance =0;
		switch(choice) {
		case 1:
			System.out.print("예금액>");
			int deposit = sc.nextInt();
			balance += deposit;
			break;
		case 2:
			System.out.print("출금액>");
			int Withdrawal = sc.nextInt();
			if(Withdrawal<balance) {
				
			}else {
				balance -= Withdrawal;
				break;
			}			
			
		case 3:
			System.out.println("잔고액>"+balance);			
			break;
			
		case 4:
			System.out.println("프로그램종료");			
			break;
		default:
			System.out.println("다시입력 해주세요");
			
			
			
		
		}
		sc.close();

		

	}

}