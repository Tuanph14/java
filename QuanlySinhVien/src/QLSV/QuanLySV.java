package QLSV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLySV {

	static ArrayList<SinhVien> dssinhvien = new ArrayList<SinhVien>();
	public static int count = 0;
	static int soluong;

	public static void nhapDsSinhVien(){
		Scanner input = new Scanner(System.in);
		System.out.println("nhập số lượng sinh vien");
		try{
			soluong = Integer.parseInt(input.nextLine());
		}catch(Exception e){
			System.out.println("phai nhap so nguyen");
		}

		for (int i = 0; i < soluong; i++) {
			SinhVien svnew = new SinhVien();
			svnew.nhapSV(soluong);
			dssinhvien.add(svnew);
			IOUtil.writeHocVienByObject("E:/QLHV", dssinhvien);
		}
		
	}

	public static void deleteByStudentId(){
		System.out.print("nhập mã số học viên cần xóa: ");
		IOUtil.writeHocVienByObject("E:/QLHV", dssinhvien);
		Scanner nhap = new Scanner(System.in);
		int id = Integer.parseInt(nhap.nextLine());
		for (int i = 0; i < dssinhvien.size(); i++) {
			if(dssinhvien.get(i).getMaSinhVien() == id){
				dssinhvien.remove(i);
			}
			
		}
	}

	public static void main(String[] args) {
		SinhVien sinhvien = new SinhVien();
		int choice = 4;
		do{
			System.out.println("------------MENU QUẢN LÝ HỌC VIÊN------------");
			System.out.println("1.Nhập một học viên mới");
			System.out.println("2.Xem danh sách học viên");
			System.out.println("3.Xóa tên học viện theo mã học viên");
			System.out.println("4.Thoát");
			Scanner nhap = new Scanner(System.in);
			try{
			choice = Integer.parseInt(nhap.nextLine());
			}catch(Exception e){
				System.out.println("phải nhập vào số nguyên");
			}
			switch(choice){
			case 1:
				nhapDsSinhVien();
				break;
			case 2: 
				List<SinhVien> inputStudents = IOUtil.readHocVienByObject("E:/QLHV");
				for(SinhVien Students : inputStudents){
					System.out.println(Students.toString());
				}
				break;
			case 3:
					deleteByStudentId();
				break;
			case 4:
				System.out.println("BYE BYE!!!");
				break;
			}


		}while(choice<4);
	}

}
