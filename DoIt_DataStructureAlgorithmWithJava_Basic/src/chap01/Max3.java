package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){

		System.out.println("세 정수의 최댓값을 구합니다");
		System.out.println("a의 값: ");
		int a = scn.nextInt();
		System.out.println("b의 값: ");
		int b = scn.nextInt();
		System.out.println("c의 값: ");
		int c = scn.nextInt();

		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		System.out.println("최대값은 " + max + "입니다.");
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
