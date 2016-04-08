package demo;

import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) {

		//xulichuoi.readTextUnicodeFile("E:/baitapjava/even");
		//xulichuoi.readTextUnicodeFile("E:/so_nguyen_to");
		//xulichuoi.readTextUnicodeFile_rate_3("E:/baitapjava/relate_3");
		
		//doc file unicode = FileReader
				

		try {
			//buoc 1:
			FileReader fileReader = new FileReader("E:/baitapjava/even");

			//buoc 2:
			char[] buffer = new char[7];
			int len = 0;
			String s = "";
			while((len = fileReader.read(buffer)) != -1){
				s+= new String(buffer,0, len);
			}
			System.out.println(s);

			for (int i = 0; i < s.length(); i++) {
				if(i%2==0)
					System.out.print(s.charAt(i));

			}
			System.out.println("");
			//buoc 3:
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//buoc 1:
			FileReader fileReader = new FileReader("E:/baitapjava/relate_3");

			//buoc 2:
			char[] buffer = new char[7];
			int len = 0;
			String s = "";
			while((len = fileReader.read(buffer)) != -1){
				s+= new String(buffer,0, len);
			}
			System.out.println(s);
			
			for (int i = 0; i <= s.length(); i++) {
				if(i%3==0||(i/10)%10==3||i%10==3||i/10==3)
				{
					System.out.print(s.charAt(i));
				}
			}
			System.out.println("");
			//buoc 3:
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			//buoc 1:
			FileReader fileReader = new FileReader("E:/baitapjava/so_nguyen_to");

			//buoc 2:
			char[] buffer = new char[7];
			int len = 0;
			String s = "";
			while((len = fileReader.read(buffer)) != -1){
				s+= new String(buffer,0, len);
			}
			System.out.println(s);

			for (int i = 0; i <= s.length(); i++) {
				if(Ktsonguyento(i)){
					System.out.print(s.charAt(i));
				}
			}
			System.out.println("");
			//buoc 3:
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean Ktsonguyento(int n){
		int temp = 0;
		for (int i = 1; i <=n; i++) {
			if(n%i == 0){
				temp++;
			}
		}
		if(temp==2)
			return true;
		else 
			return false;

	}
}
