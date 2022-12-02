package model.bo;

import java.util.ArrayList;
import java.util.HashSet;

import model.bean.nguoidung;
import model.dao.nguoidung_dao;

public class nguoidung_bo {
	
	
	nguoidung_dao dao_NguoiDung = new nguoidung_dao();
	public void addNguoiDung(String MaNguoiDung, String TenNguoiDung, String SoDienThoai, String DiaChi, String PhanQuyen)
	{
		dao_NguoiDung.addNguoiDung(MaNguoiDung, TenNguoiDung, SoDienThoai, DiaChi, PhanQuyen);
		
	}
	public void updateNguoiDung(String MaNguoiDungUpdate, String TenNguoiDung, String SoDienThoai, String DiaChi)
	{
		dao_NguoiDung.updateNguoiDung(MaNguoiDungUpdate, TenNguoiDung, SoDienThoai, DiaChi);
		
	}
	//<-
}