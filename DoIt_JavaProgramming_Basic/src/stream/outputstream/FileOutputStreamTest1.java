package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		// 파일을 새로만듬
		// try (FileOutputStream fos = new FileOutputStream("output.txt")) { //

		// 파일을 이어서 만듬
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			// 파일에 숫자를 쓰면 해당 아스키 코드값으로 변환
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("Write ended");
	}
}
