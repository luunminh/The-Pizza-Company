package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import model.bean.monan;

public class monan_dao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public ArrayList<monan>getAllMonAnPizzaActive() {
		ArrayList<monan> ArrayList = new ArrayList<>();
		String query = "SELECT * FROM monan Where TrangThai='active' and TheLoai='pizza'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList.add(new monan(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6)
						));
			}
		} catch (Exception e) {
			System.out.println("error while get all ArrayList monan" + e);
		}
		
		
		
		
		return ArrayList;
	}
	
	public ArrayList<monan>getAllMonAnSaladActive() {
		ArrayList<monan> ArrayList = new ArrayList<>();
		String query = "SELECT * FROM monan Where TrangThai='active' and TheLoai='salad'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList.add(new monan(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6)
						));
			}
		} catch (Exception e) {
			System.out.println("error while get all ArrayList monan" + e);
		}
		
		
		
		
		return ArrayList;
	}
	
	public ArrayList<monan>getAllMonAnPastaActive() {
		ArrayList<monan> ArrayList = new ArrayList<>();
		String query = "SELECT * FROM monan Where TrangThai='active' and TheLoai='pasta'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList.add(new monan(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6)
						));
			}
		} catch (Exception e) {
			System.out.println("error while get all ArrayList monan" + e);
		}
		
		
		
		
		return ArrayList;
	}
	
	
	
	public void addMonAn(String MaMonAn, String TenMonAn, String TheLoai, String Gia, String MoTa, String Anh, String TrangThai)
	{
		try
		{
			
			try
			{
				String query = "INSERT INTO `monan`(`MaMonAn`, `TenMonAn`, `TheLoai`, `Gia`, `MoTa`, `Anh`, `TrangThai`) VALUES ('" + MaMonAn +"','" + TenMonAn + "','" + TheLoai + "','" + Gia + "','" + MoTa +"','" + Anh +"','" + TrangThai + "');";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm", "root", "");
				Statement stmtt  = (Statement) con.createStatement();
				stmtt.executeUpdate(query);
				stmtt.close();
				
			} catch (Exception e) {
				System.out.println("error: "+ e);
			}
		} catch (Exception e) {
			System.out.println("error while delete "+ e);
		}
	}
	
	public void updateMonAn(String MaMonAnUpdate, String TenMonAn, String TheLoai, String Gia, String MoTa, String Anh)
	{
		try
		{
			
			try
			{
				String query = "UPDATE `monan` SET `TenMonAn`='" + TenMonAn + "',`TheLoai`='" + TheLoai + "',`Gia`='" + Gia + "',`MoTa`='" + MoTa + "',`Anh`='" + Anh + "' WHERE `MaMonAn`='" + MaMonAnUpdate + "';";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm", "root", "");
				Statement stmtt  = (Statement) con.createStatement();
				stmtt.executeUpdate(query);
				stmtt.close();
				
			} catch (Exception e) {
				System.out.println("error: "+ e);
			}
		} catch (Exception e) {
			System.out.println("error while delete "+ e);
		}
	}

	public void DeleteMonAn(String mamonan) {
		try {
			String query ="UPDATE monan set TrangThai='noactive' WHERE MaMonAn='"+ mamonan+"'";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			Statement smtt = (Statement) conn.createStatement();
			smtt.executeUpdate(query);
			smtt.close();
		} catch (Exception e) {
			System.out.println("error while delete" + e);
		}
	}
	public monan GetMonAnByID(String maMonAn) {
		monan result = new monan();
		String query = "SELECT * from monan where MaMonAn='"+ maMonAn +"'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			ps= conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				result.setMaMonAn(rs.getString(1));
				result.setTenMonAn(rs.getString(2));
				result.setTheLoai(rs.getString(3));
				result.setGia(rs.getInt(4));
				result.setMoTa(rs.getString(5));
				result.setAnh(rs.getString(6));
				
			}
		} catch (Exception e) {
			System.out.println("error when get product by id"+ e);
		}
		
		return result;
	}
	
	
	public ArrayList<monan> SearchMonAn(){
		ArrayList<monan> result = new ArrayList<monan>();
		
		
		return result;
	}
	
	public static void main(String[] args) {
		monan_dao dao = new monan_dao();
		System.out.println(dao.GetMonAnByID("pz001"));
  }
}

