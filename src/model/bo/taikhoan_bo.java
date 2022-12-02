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
		System.out.println(TenTK + " bo " + TenTK);
		return daotk.isExistUser(TenTK,password);
	}
	public boolean clickTaoTK() {
		System.out.println(TenTK + " bo " + TenTK);
		return daotk.isExistUser(TenTK,password);
	}
	
}
