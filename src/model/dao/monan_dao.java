package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	
	public monan getMonAnByID() {
		monan result = new monan();
		
		
		
		return result;
	}
	
	public void AddMonAn() {
		
	}
	
	public void UpdateMonAn() {
		
	}
	public void DeleteMonAn() {
		
	}
	public ArrayList<monan> SearchMonAn(){
		ArrayList<monan> result = new ArrayList<monan>();
		
		
		return result;
	}
	
	public static void main(String[] args) {
		monan_dao dao = new monan_dao();
		ArrayList<monan> ArrayLists = dao.getAllMonAnPizzaActive();
		for(monan i : ArrayLists) {
			System.out.println("object la: "+i);
	}
  }
}

