package codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainDrive {

	public static void main(String[] args) {
		
//		writeToFile(); //파일에 쓰기
		readFile();
	}
	
	static void readFile() {
//		파일 LOAD (Input 실습)
		
//		1. 어디서 파일을 읽어올지? 경로 설정.
		File myFile = new File("mytest.txt");
		
		try {
			FileReader fr = new FileReader(myFile);
			// 여러 글자를 뭉쳐서 String으로 읽어오기
			BufferedReader br = new BufferedReader(fr); // fr을 도와서
			
			while(true) { // 횟수가 불명확하므로 while로 반복
				String line = br.readLine();  // add catch lause 클릭해서 만든다!
				if(line==null) {System.out.println("끝까지 읽음"); break;}
				System.out.println(line);
			}
		// 사용이 끝나면 꼭 닫아주기!
			br.close(); fr.close(); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
