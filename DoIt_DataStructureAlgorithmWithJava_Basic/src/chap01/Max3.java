package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){

		System.out.println("�� ������ �ִ��� ���մϴ�");
		System.out.println("a�� ��: ");
		int a = scn.nextInt();
		System.out.println("b�� ��: ");
		int b = scn.nextInt();
		System.out.println("c�� ��: ");
		int c = scn.nextInt();

		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		System.out.println("�ִ밪�� " + max + "�Դϴ�.");
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
