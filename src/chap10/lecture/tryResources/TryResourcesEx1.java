package chap10.lecture.tryResources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryResourcesEx1 {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("file.txt");
			 FileOutputStream fos = new FileOutputStream("file2.txt");) {
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









