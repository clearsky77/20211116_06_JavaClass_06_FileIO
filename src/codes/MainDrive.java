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
		
//		writeToFile(); //���Ͽ� ����
		readFile();
	}
	
	static void readFile() {
//		���� LOAD (Input �ǽ�)
		
//		1. ��� ������ �о����? ��� ����.
		File myFile = new File("mytest.txt");
		
		try {
			FileReader fr = new FileReader(myFile);
			// ���� ���ڸ� ���ļ� String���� �о����
			BufferedReader br = new BufferedReader(fr); // fr�� ���ͼ�
			
			while(true) { // Ƚ���� �Ҹ�Ȯ�ϹǷ� while�� �ݺ�
				String line = br.readLine();  // add catch lause Ŭ���ؼ� �����!
				if(line==null) {System.out.println("������ ����"); break;}
				System.out.println(line);
			}
		// ����� ������ �� �ݾ��ֱ�!
			br.close(); fr.close(); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	static void writeToFile() {
//		���� SAVE (Output �ǽ�)
		
//		1. ��� ������ ��������? ��� ����.
		File myFile = new File("mytest.txt");
		
//		2. ���� �ۼ� Ŭ���� Ȱ��.
		try {
			FileWriter fw = new FileWriter(myFile, true); // true ������ �̾� ���̱� 
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append("���Ͽ� text�� �߰� >��<"); // ���� ����. ������ �� ����� �ٽ� ����.
			bw.newLine(); // �� �� ����
			bw.close(); fw.close(); // ���� �ݱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
