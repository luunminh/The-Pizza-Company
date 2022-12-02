package model.bo;

import java.util.ArrayList;
import java.util.HashSet;

import model.bean.monan;
import model.dao.monan_dao;

public class monan_bo {
	
	//Toan->
	monan_dao dao_MonAn = new monan_dao();
	public void addMonAn(String MaMonAn, String TenMonAn, String TheLoai, String Gia, String MoTa, String Anh, String TrangThai)
	{
		dao_MonAn.addMonAn(MaMonAn, TenMonAn, TheLoai, Gia, MoTa, Anh, TrangThai);
	}
	//<-
}