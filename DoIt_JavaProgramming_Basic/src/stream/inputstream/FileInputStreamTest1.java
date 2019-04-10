package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		// 파일내용을 알고 sysout을 3번 호출
		try {
			fis = new FileInputStream("input.txt");
			// 1byte 단위로 처리하여 아스키코드값이 나옴
			// System.out.println(fis.read());
			// System.out.println(fis.read());
			// System.out.println(fis.read());

			// 아스키코드값을 char로 변환하여 실제 문자로 출력
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
		} catch (IOException ie) {
			System.out.println(ie);
		} finally {
			try {
				fis.close();
			} catch (IOException ie) {
				System.out.println(ie);
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		System.out.println("End");
	}
}