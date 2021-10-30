package model;

public class Account {
	private int Id_Account;
	private String UserName;
	private String PassWord;

	public Account() {
	}

	public Account(int id_Account, String userName, String passWord) {
		super();
		Id_Account = id_Account;
		UserName = userName;
		PassWord = passWord;
	}

	public int getId_Account() {
		return Id_Account;
	}

	public void setId_Account(int id_Account) {
		Id_Account = id_Account;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	@Override
	public String toString() {
		return "Account [Id_Account=" + Id_Account + ", UserName=" + UserName + ", PassWord=" + PassWord + "]";
	}

}
