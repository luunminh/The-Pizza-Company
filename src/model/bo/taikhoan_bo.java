package model.bo;

import java.util.ArrayList;
import java.util.HashSet;

import model.bean.taikhoan;

import model.dao.taikhoan_dao;


public class taikhoan_bo {
	taikhoan_dao daotk = new taikhoan_dao();
	public ArrayList<taikhoan> getAllTaiKhoan(){
		return daotk.getAllTaiKhoan();
	}
	
	public boolean isValidUser(String TenTK, String password) {
		return daotk.isExistUser(TenTK,password);
	}
	
	public boolean isAdminRole(String TenTK, String password) {
		return daotk.isAdminRole(TenTK,password);
	}
	public void updateTaiKhoan(String MaNguoiDungUpdate, String MatKhau)
	{
		daotk.updateTaiKhoan(MaNguoiDungUpdate, MatKhau);
	}
}