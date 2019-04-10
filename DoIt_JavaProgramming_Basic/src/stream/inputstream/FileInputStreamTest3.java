package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {

		// byte 배열로 읽기
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;

			while ((i = fis.read(bs)) != -1) {
				// 배열의 남아있는 자료가 다시 출력됨
				for (byte b : bs) {
					System.out.print((char) b);
				}
				System.out.println(": " + i + "Byte 읽음");

				// 읽은 byte 길이만큼만 출력
				for (int k = 0; k < i; k++) {
					System.out.print((char) bs[k]);
				}
				System.out.println(": " + i + "Byte 읽음");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("end");
	}
}
