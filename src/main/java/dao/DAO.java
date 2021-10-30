package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connection.DBConnection;

import java.util.ArrayList;
import java.util.List;

import model.GioHang;
import model.HoaDonBanHang;
import model.SanPham;

public class DAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<SanPham> getAllSanPham() {
		List<SanPham> list = new ArrayList<>();
		String query = "select * from ThongTinSP";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public SanPham getSanPham(String txt) {
		String query = "select * from ThongTinSP where MaSP = ?";
		List<SanPham> list = new ArrayList<>();
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, txt);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		} catch (Exception e) {
		}
		return null;
	}

	public GioHang insertGioHang(int maSP, String tenSP, int i) {

		String query = "INSERT INTO GioHang(maSP,tenSP,GiaSP) VALUES (?,?,?)";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, maSP);
			ps.setString(2, tenSP);
			ps.setDouble(3, i);
			ps.executeUpdate();

		} catch (Exception e) {
		}
		return null;
	}

	public List<GioHang> getAllGioHang() {
		List<GioHang> list = new ArrayList<>();
		String query = "select * from GioHang";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new GioHang(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public GioHang deleteGioHang(String maSP) {
		String query = "Delete from GioHang where MaSP = ?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, maSP);
			ps.executeUpdate();

		} catch (Exception e) {
		}
		return null;
	}

	public HoaDonBanHang insertHoaDonBanHang(String username, String firstlastname, String diachi, String numberphone,
			String gender, String nationality, String noted) {

		String query = "INSERT INTO HoaDonBanHang(username, firstlastname, diachi, numberphone, gender, nationality,noted) VALUES (?,?,?,?,?,?,?)";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, firstlastname);
			ps.setString(3, diachi);
			ps.setString(4, numberphone);
			ps.setString(5, gender);
			ps.setString(6, nationality);
			ps.setString(7, noted);
			ps.executeUpdate();

		} catch (Exception e) {
		}
		return null;
	}
	
	public List<SanPham> searchSanPham(String txtSearch) {
		List<SanPham> list = new ArrayList<>();
		String query = "select * from ThongTinSP \r\n"
				+ "where TenSP like ?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1,"%" + txtSearch + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8)));
			}
		} catch (Exception e) {
			
		}
		return list;
	}
}
