package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		
		//파일을 끝까지 읽음. AutoClose 사용
		try(FileInputStream fis = new FileInputStream("input.txt")) {
		//try(FileInputStream fis = new FileInputStream("reader.txt")) { //문자가 깨짐을 확인하기 위한 코드
			int i;
			while((i = fis.read()) != -1){
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch(FileNotFoundException fe) {
			fe.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
