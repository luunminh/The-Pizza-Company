package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import model.bean.taikhoan;

public class taikhoan_dao {
	Connection conn = null;  		
	PreparedStatement ps = null;   
	ResultSet rs = null; 	
public boolean isExistUser(String TenTaiKhoan, String MatKhau) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			Statement stmt = conn.createStatement();
			PreparedStatement ps;
			ps = conn.prepareStatement("SELECT * from taikhoan where TenTaiKhoan='"+TenTaiKhoan+"' and MatKhau='"+ MatKhau+"'");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error" + e);
		}
		return false;
	}
public ArrayList<taikhoan> getAllTaiKhoan(){
	ArrayList<taikhoan> result = new ArrayList<taikhoan>();
	String query ="SELECT * from taikhoan";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888","root","");
		ps= conn.prepareStatement(query);
		rs = ps.executeQuery();
		while(rs.next()) {
			result.add(new taikhoan(rs.getString(1)
					,rs.getString(2)
					,rs.getString(3)
					,rs.getString(4)));
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error: "+ e);
	}
	
	
	
	return result;
}
public static void main(String[] args) {
	taikhoan_dao dao = new taikhoan_dao();
	ArrayList<taikhoan> list = dao.getAllTaiKhoan();
	for(taikhoan i : list) {
		System.out.println("object la: "+i);
	}
}
}
