package stream.others;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){

			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Job:");
			String job = sc.nextLine();
			System.out.println("CompanyNo:");
			int comNo = sc.nextInt();
			
			System.out.println(name);
			System.out.println(job);
			System.out.println(comNo);
		}catch(NoSuchElementException ne){
			ne.printStackTrace();
		}
	}
}
