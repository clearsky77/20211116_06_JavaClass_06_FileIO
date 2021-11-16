package codes;

import java.io.File;
import java.io.FileWriter;

public class MainDrive {

	public static void main(String[] args) {
		writeToFile();
	}
	
	static void writeToFile() {
//		파일 SAVE (Output 실습)
		
//		1. 어디에 파일을 저장할지? 경로 설정.
		File myFile = new File("mytest.txt");
		
//		2. 파일 작성 클래스 활용.
		FileWriter fw = new FileWriter(myFile);
	}

}
