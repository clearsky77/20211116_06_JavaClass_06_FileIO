package codes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainDrive {

	public static void main(String[] args) {
		writeToFile();
	}
	
	static void writeToFile() {
//		파일 SAVE (Output 실습)
		
//		1. 어디에 파일을 저장할지? 경로 설정.
		File myFile = new File("mytest.txt");
		
//		2. 파일 작성 클래스 활용.
		try {
			FileWriter fw = new FileWriter(myFile, true); // true 넣으면 이어 붙이기 
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append("파일에 text를 추가 >ㅂ<"); // 내용 저장. 내용을 싹 지우고 다시 쓴다.
			bw.newLine(); // 한 줄 띄우기
			bw.close(); fw.close(); // 파일 닫기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
