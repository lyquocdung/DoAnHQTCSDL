package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import connection.DBConnection;
import model.Account;
import model.HoaDonBanHang;
import model.HoaDonDatHang;
import model.KhachHang;
import model.NhaCungCap;
import model.NhanVien;
import model.SanPham;
import model.ThongTinUuDai;

public class DAONHANVIEN {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

// select
	public List<HoaDonBanHang> getAllHoaDonBanHang() {
		List<HoaDonBanHang> list = new ArrayList<>();
		String query = "select * from HoaDonBanHang";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new HoaDonBanHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<NhanVien> getAllNhanVien() {
		List<NhanVien> list = new ArrayList<>();
		String query = "select * from NhanVien";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<Account> getAllAccount() {
		List<Account> list = new ArrayList<>();
		String query = "select * from Account";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<HoaDonDatHang> getAllHoaDonDatHang() {
		List<HoaDonDatHang> list = new ArrayList<>();
		String query = "select * from HoaDonDatHang";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new HoaDonDatHang(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<KhachHang> getAllKhachHang() {
		List<KhachHang> list = new ArrayList<>();
		String query = "select * from KhachHang";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<NhaCungCap> getAllNhaCungCap() {
		List<NhaCungCap> list = new ArrayList<>();
		String query = "select * from NhaCungCap";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<SanPham> getAllThongTinSanPham() {
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

	public List<ThongTinUuDai> getAllThongTinUuDai() {
		List<ThongTinUuDai> list = new ArrayList<>();
		String query = "select * from ThongTinUuDai";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new ThongTinUuDai(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	/*
	 * public static void main(String[] args) { DAONHANVIEN dao = new DAONHANVIEN();
	 * List<KhachHang> list = dao.getAllKhachHang(); for (KhachHang o : list) {
	 * System.out.print(o); }
	 * 
	 * }
	 */

}
