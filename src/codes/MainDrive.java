package codes;

import java.io.File;
import java.io.FileWriter;

public class MainDrive {

	public static void main(String[] args) {
		writeToFile();
	}
	
	static void writeToFile() {
//		���� SAVE (Output �ǽ�)
		
//		1. ��� ������ ��������? ��� ����.
		File myFile = new File("mytest.txt");
		
//		2. ���� �ۼ� Ŭ���� Ȱ��.
		FileWriter fw = new FileWriter(myFile);
	}

}
