package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nguoidung;

public class nguoidung_dao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void addNguoiDung(String MaNguoiDung, String TenNguoiDung, String SoDienThoai, String DiaChi, String PhanQuyen)
	{
		try
		{
			try
			{
				String query = "INSERT INTO `nguoidung`(`MaNguoiDung`, `TenNguoiDung`, `SoDienThoai`, `DiaChi`, `PhanQuyen`) VALUES ('" + MaNguoiDung +"','" + TenNguoiDung + "','" + SoDienThoai + "','" + DiaChi + "','" + PhanQuyen+ "');";
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
	
	public void updateNguoiDung(String MaNguoiDungUpdate, String TenNguoiDung, String SoDienThoai, String DiaChi)
	{
		try
		{
			try
			{
				String query = "UPDATE `nguoidung` SET`TenNguoiDung`='" + TenNguoiDung + "',`SoDienThoai`='" + SoDienThoai +"',`DiaChi`='" + DiaChi + "' WHERE `MaNguoiDung`='" + MaNguoiDungUpdate + "';";
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
}