package model.bo;

import java.util.ArrayList;

import model.bean.monan;
import model.dao.monan_dao;
public class monan_bo {
	monan_dao dao_MonAn = new monan_dao();
	
	
	public ArrayList<monan> getAllMonAnPizzaActive(){
		return dao_MonAn.getAllMonAnPizzaActive();
	}
	public ArrayList<monan> getAllMonAnPastaActive(){
		return dao_MonAn.getAllMonAnPastaActive();
	}
	public ArrayList<monan> getAllMonAnSaladActive(){
		return dao_MonAn.getAllMonAnSaladActive();
	}
	public void DeleteMonAn(String monAnID) {
		 dao_MonAn.DeleteMonAn(monAnID);
	}
	public void addMonAn(String MaMonAn, String TenMonAn, String TheLoai, String Gia, String MoTa, String Anh, String TrangThai)
	{
		dao_MonAn.addMonAn(MaMonAn, TenMonAn, TheLoai, Gia, MoTa, Anh, TrangThai);
	}
	public void updateMonAn(String MaMonAnUpdate, String TenMonAn, String TheLoai, String Gia, String MoTa, String Anh)
	{
		dao_MonAn.updateMonAn(MaMonAnUpdate, TenMonAn, TheLoai, Gia, MoTa, Anh);
	}
	public monan GetMonAnByID(String id) {
		return dao_MonAn.GetMonAnByID(id);
	}
}
