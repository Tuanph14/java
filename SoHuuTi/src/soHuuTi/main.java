package soHuuTi;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo a = new PhanSo();
		PhanSo b = new PhanSo();
		
		HonSo hs1 = new HonSo();
		HonSo hs2 = new HonSo();
		
		a.setTu(1);
		try {
			a.setMau(4);
		} catch (FractionException e) {
			// TODO Auto-generated catch block
			System.out.println("mau khong the bang 0");;
		}
		b.setTu(7);
		try {
			b.setMau(2);
		} catch (FractionException e) {
			// TODO Auto-generated catch block
			System.out.println("mau khong the bang 0");
		}
		
		hs1.setSoNguyen(5);
		hs1.setPhanso(a);
		hs1.Xuat();
	}

}
