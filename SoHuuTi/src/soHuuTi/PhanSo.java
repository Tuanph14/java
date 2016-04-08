package soHuuTi;

public class PhanSo {
	private int tu;
	private int mau;
	
	
	
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	public PhanSo() {
		
	}
	
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) throws FractionException {
		if(mau == 0){
			throw new FractionException("mau khong the bang 0");
			//System.out.println("mau khong the bang 0");
		}
		this.mau = mau;
	}
	
	public int UCLN(int a, int b){
		while(a!= b){
			if(a>b)
				a = a-b;
			else
				b = b-a;
		}
		return a;
	}
	
	public PhanSo RutGonPhanSo(){
		int temp;
		temp = UCLN(this.tu,this.mau);
		this.tu = this.tu/temp;
		this.mau = this.mau/temp;
		return this;
	}
	
	public PhanSo CongPhanSo(PhanSo psb){
		this.tu = this.tu*psb.mau+psb.tu*this.mau;
		this.mau= this.mau*psb.mau;
		return this;
	}
	
	public PhanSo TruPhanSo(PhanSo psb){
		this.tu = this.tu*psb.mau-psb.tu*this.mau;
		this.mau= this.mau*psb.mau;
		return this;
	}
	
	public PhanSo NhanPhanSo(PhanSo psb){
		this.tu = this.tu*psb.tu;
		this.mau= this.mau*psb.mau;
		return this;
	}
	
	public PhanSo ChiaPhanSo(PhanSo psb){
		this.tu = this.tu*psb.mau;
		this.mau= this.mau*psb.tu;
		return this;
	}
	
	public void Xuat(){
		RutGonPhanSo();
		if(this.mau == 1){
			System.out.println(getTu());
		}
		else
			System.out.println(getTu() +"/"+getMau());
	}
}
