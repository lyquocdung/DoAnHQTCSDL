package model;

public class GioHang {
	private int MaSP;
	private String TenSP;
	private int GiaSP;
	public GioHang() {

	}

	public GioHang(int maSP, String tenSP, int giaSP) {
		super();
		this.MaSP = maSP;
		this.TenSP = tenSP;
		this.GiaSP = giaSP;
		
	}

	public int getMaSP() {
		return MaSP;
	}

	public void setMaSP(int maSP) {
		MaSP = maSP;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	
	public int getGiaSP() {
		return GiaSP;
	}

	public void setGiaSP(int giaSP) {
		GiaSP = giaSP;
	}


	@Override
	public String toString() {
		return "GioHang [MaSP=" + MaSP + ", TenSP=" + TenSP + ", GiaSP=" + GiaSP+"]";
	}
}
