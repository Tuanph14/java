package QLSV;

import java.io.Serializable;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.xml.bind.ValidationException;

public class SinhVien implements Serializable {
	private int MaSinhVien;
	private int tuoi;
	private String Ho_ten;
	private String Dia_chi;
	private String SoDienThoai;
	private String Email;


	public SinhVien() {

	}


	public SinhVien(int MaSinhVien, String Ho_ten, String Dia_chi, String 	SoDienThoai, String Email,int tuoi) {
		this.MaSinhVien = MaSinhVien;
		this.Ho_ten = Ho_ten;
		this.Dia_chi = Dia_chi;
		this.SoDienThoai = 	SoDienThoai;
		this.Email = Email;
		this.tuoi = tuoi;
	}


	public int getMaSinhVien() {
		return MaSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		MaSinhVien = maSinhVien;
	}
	public String getHo_ten() {
		return Ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		Ho_ten = ho_ten;
	}
	public String getDia_chi() {
		return Dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		Dia_chi = dia_chi;
	}
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
	
	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}

	
	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	//phuong thuc nhap danh sach hoc vien
	public void nhapSV(int n){
		Scanner input = new Scanner(System.in);
		String regex ="\\d{3}-\\d{7}";
		String id	= "\\d{6}";
		String ema = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		for (int i = 0; i < n; i++) {
			System.out.println("Thong tin sinh vien "+(i+1));
			System.out.print("Ma so sinh vien (xxxxxx): ");
			do{
				try {
					MaSinhVien = Integer.parseInt(input.nextLine());
				} catch (Exception e2) {
					System.out.println("mã số không hợp lệ");
					System.out.print("nhập lại số (xxxxxx): ");
				}
			}while(!SoDienThoai.matches(regex));
			System.out.println();
			System.out.print("Ho va Ten: ");
			Ho_ten = input.nextLine();
			System.out.println();
			System.out.print("Tuổi:");
			tuoi = Integer.parseInt(input.nextLine());
			System.out.println();
			System.out.print("so dien thoai (xxx-xxxxxxx): ");
			
			do{
				try {
					validatePhoneNumber(SoDienThoai = input.nextLine());
				} catch (Exception e) {
					System.out.println("số điện thoại không hợp lệ");
					System.out.print("nhập lại số điện thoại (xxx-xxxxxxx): ");
				}
			}while(!SoDienThoai.matches(regex));
			System.out.println();
			System.out.print("Dia chi:");
			Dia_chi = input.nextLine();
			System.out.println();
			System.out.print("Nhập Email: ");
			do{
				try{
				validateEmail(Email = input.nextLine());
				}catch(Exception e1){
					System.out.println("Email không hợp lệ");
					System.out.print("nhập lại Email: ");
				}
			}while(!Email.matches(ema));
			System.out.println();
		}
	}

	public void validatePhoneNumber(String phoneNo) throws ValidationException{
		String regex ="\\d{3}-\\d{7}";
		if(!phoneNo.matches(regex)){
			throw new ValidationException("Invailid number");
		}
		
	}
	
	public void validateEmail(String email) throws ValidationException{
		String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		if(!email.matches(regex)){
			throw new ValidationException("Invailid Email");
		}
	}
	
	public String toString(){
		return "Mã Số Sinh Viên: "+MaSinhVien + "\nHọ và Tên: "+Ho_ten +"\nTuổi: " + tuoi+ "\nSố điện thoại: "+ SoDienThoai+"\nĐịa chỉ:"+Dia_chi+"\nEmail: "+ Email +"\n";				
	}

}
