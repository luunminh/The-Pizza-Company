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
}
