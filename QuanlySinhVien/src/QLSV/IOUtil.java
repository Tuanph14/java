package QLSV;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOUtil {
	
	public static void writeHocVienByObject(String path, List<SinhVien> sinhvien){
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(path)));
			for(SinhVien students : sinhvien){
				objectOutputStream.writeObject(students);
			}
			
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<SinhVien> readHocVienByObject(String path){
		List<SinhVien> students = new ArrayList<>();
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream
					(new FileInputStream(path)));
			try{
				while(true){
					students.add((SinhVien) inputStream.readObject());
				}
				
			}catch(EOFException | ClassNotFoundException e)
			{
				System.out.println("");
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
		
	}
}
