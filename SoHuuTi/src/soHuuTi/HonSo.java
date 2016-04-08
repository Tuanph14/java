package soHuuTi;

public class HonSo {
	private int soNguyen;
	private PhanSo phanso;
	

	public HonSo() {
		
	}

	public HonSo(int soNguyen, int tu, int mau) {
		this.soNguyen = soNguyen;
		this.phanso = new PhanSo(tu, mau);
	}
	
	public int getSoNguyen() {
		return soNguyen;
	}
	public void setSoNguyen(int soNguyen) {
		this.soNguyen = soNguyen;
	}
	public PhanSo getPhanso() {
		return phanso;
	}
	public void setPhanso(PhanSo phanso) {
		this.phanso = phanso;
	}
	
	public void Xuat(){
		ChuyenSangHonSo();
		System.out.println(soNguyen +":"+ phanso.getTu() + "/" + phanso.getMau());
	}
	
	public HonSo ChuyenSangHonSo(){
		if(phanso.getTu()>phanso.getMau()){
			int temp;
			temp = phanso.getTu()/phanso.getMau();
			this.phanso.setTu(phanso.getTu()%phanso.getMau());
			this.setSoNguyen(this.getSoNguyen() + temp);
		}
		return this;
	}
	
	public PhanSo ChuyenSangPhanSo(){
		PhanSo temp = new PhanSo();
		temp.setTu(this.soNguyen*this.phanso.getMau() + this.phanso.getTu());
		try {
			temp.setMau(this.phanso.getMau());
		} catch (FractionException e) {
			// TODO Auto-generated catch block
			System.out.println("mau khong the bang 0");
		}
		return temp;
	}
	
	public HonSo CongHonSo(HonSo a){
		this.setSoNguyen(this.getSoNguyen() + a.getSoNguyen());
		this.phanso= this.phanso.CongPhanSo(a.phanso);
		ChuyenSangHonSo();
		return this;
	}
	
	public HonSo TruHonSo(HonSo a){
		this.setSoNguyen(this.getSoNguyen() - a.getSoNguyen());
		this.phanso= this.phanso.TruPhanSo(a.phanso);
		ChuyenSangHonSo();
		return this;
	}
	
	public HonSo NhanHonSo(HonSo a){
		
		ChuyenSangPhanSo().NhanPhanSo(a.ChuyenSangPhanSo());
		ChuyenSangHonSo();
		return this;
	}
	
	public HonSo ChiaHonSo(HonSo a){
		PhanSo temp = ChuyenSangPhanSo().ChiaPhanSo(a.ChuyenSangPhanSo());
		ChuyenSangHonSo();
		return this;
	}
	
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return soNguyen+":"+phanso.getTu()+"/"+phanso.getMau();
	}
}
