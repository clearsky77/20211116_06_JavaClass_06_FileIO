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
