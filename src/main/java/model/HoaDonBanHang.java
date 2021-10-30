package model;

public class HoaDonBanHang {
	private int MaHDBH;
	private String userName;
	private String firstlastname;
	private String diachi;
	private String numberphone;
	private String gender;
	private String nationality;
	private String noted;
	
	public HoaDonBanHang(){
		
	}
	public HoaDonBanHang(int maHDBH, String userName, String firstlastname, String diachi, String numberphone,
			String gender, String nationality, String noted) {
		super();
		this.MaHDBH = maHDBH;
		this.userName = userName;
		this.firstlastname = firstlastname;
		this.diachi = diachi;
		this.numberphone = numberphone;
		this.gender = gender;
		this.nationality = nationality;
		this.noted = noted;
	}
	public int getMaHDBH() {
		return MaHDBH;
	}
	public void setMaHDBH(int maHDBH) {
		this.MaHDBH = maHDBH;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstlastname() {
		return firstlastname;
	}
	public void setFirstlastname(String firstlastname) {
		this.firstlastname = firstlastname;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getNumberphone() {
		return numberphone;
	}
	public void setNumberphone(String numberphone) {
		this.numberphone = numberphone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNoted() {
		return noted;
	}
	public void setNoted(String noted) {
		this.noted = noted;
	}

	

}
