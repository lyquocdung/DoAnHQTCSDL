package model;

public class HoaDonDatHang {
	private int MaHDDH;
	private int MaNCC;
	private int MaNV;
	private int MaSP;
	private String NgayLapHoaDonDatHang;
	private int GiaTri;
	private int SoLuongDat;

	public HoaDonDatHang() {
	}

	public HoaDonDatHang(int maHDDH, int maNCC, int maNV, int maSP, String ngayLapHoaDonDatHang, int giaTri,
			int soLuongDat) {
		super();
		MaHDDH = maHDDH;
		MaNCC = maNCC;
		MaNV = maNV;
		MaSP = maSP;
		NgayLapHoaDonDatHang = ngayLapHoaDonDatHang;
		GiaTri = giaTri;
		SoLuongDat = soLuongDat;
	}

	public int getMaHDDH() {
		return MaHDDH;
	}

	public void setMaHDDH(int maHDDH) {
		MaHDDH = maHDDH;
	}

	public int getMaNCC() {
		return MaNCC;
	}

	public void setMaNCC(int maNCC) {
		MaNCC = maNCC;
	}

	public int getMaNV() {
		return MaNV;
	}

	public void setMaNV(int maNV) {
		MaNV = maNV;
	}

	public int getMaSP() {
		return MaSP;
	}

	public void setMaSP(int maSP) {
		MaSP = maSP;
	}

	public String getNgayLapHoaDonDatHang() {
		return NgayLapHoaDonDatHang;
	}

	public void setNgayLapHoaDonDatHang(String ngayLapHoaDonDatHang) {
		NgayLapHoaDonDatHang = ngayLapHoaDonDatHang;
	}

	public int getGiaTri() {
		return GiaTri;
	}

	public void setGiaTri(int giaTri) {
		GiaTri = giaTri;
	}

	public int getSoLuongDat() {
		return SoLuongDat;
	}

	public void setSoLuongDat(int soLuongDat) {
		SoLuongDat = soLuongDat;
	}

	@Override
	public String toString() {
		return "HoaDonDatHang [MaHDDH=" + MaHDDH + ", MaNCC=" + MaNCC + ", MaNV=" + MaNV + ", MaSP=" + MaSP
				+ ", NgayLapHoaDonDatHang=" + NgayLapHoaDonDatHang + ", GiaTri=" + GiaTri + ", SoLuongDat=" + SoLuongDat
				+ "]";
	}
}
