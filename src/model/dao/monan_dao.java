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
	
	public monan_dao()
	{
		
	}
	
	public boolean isExistUser(String userName, String password)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			Statement stmt = conn.createStatement();
			PreparedStatement ps;
			ps = conn.prepareStatement("SELECT * from admin where username='"+userName+"' and password='"+ password+"'");
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
	
	/*public ArrayList<monan_dao> getAllMonAn()
	{
		ArrayList<monan_dao> result = new ArrayList<monan_dao>();
		String query = "SELECT * FROM `monan`;";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltm","root","");
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next())
			{
				//result.add(new monan(rs.getString(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7)));
				result.add(new monan(rs.getString(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7)));
				//result.add(new monan(rs.getString(0), rs.getString(1),rs.getString(2),rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			} 
		} catch (Exception e)
		{
			System.out.println("error: "+ e);
		}
		return result;
	}*/
	public void addMonAn(String MaMonAn, String TenMonAn, String TheLoai, int Gia, String MoTa, String Anh, String TrangThai)
	{
		try
		{
			
			try
			{
				String query = "INSERT INTO `monan`(`MaMonAn`, `TenMonAn`, `TheLoai`, `Gia`, `MoTa`, `Anh`, `TrangThai`) VALUES ('" + MaMonAn +"','" + TenMonAn + "','" + TheLoai + "','" + Gia + "','" + MoTa +"','" + Anh +"','" + TrangThai + "');";
				Class.forName("com.mysql.jdbc.Driver");		
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test888", "root", "");
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
	
	/*public static void main(String[] args) {
		monan_dao dao = new monan_dao();
		//dao.addMonAn("pz005", "pizza thap cam", "pizza", 169, "full topping", "https://thepizzacompany.vn/images/thumbs/000/0002624_seafood-pesto_300.png", "active");

	}*/
}