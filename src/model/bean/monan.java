package model.bean;

public class monan {
	private String MaMonAn;
	private String TenMonAn;
	private String TheLoai;
	private int Gia;
	private String MoTa;
	private String Anh;

	public String getMaMonAn() {
		return MaMonAn;
	}
	public void setMaMonAn(String maMonAn) {
		MaMonAn = maMonAn;
	}
	public String getTenMonAn() {
		return TenMonAn;
	}
	public void setTenMonAn(String tenMonAn) {
		TenMonAn = tenMonAn;
	}
	public String getTheLoai() {
		return TheLoai;
	}
	public void setTheLoai(String theLoai) {
		TheLoai = theLoai;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
	public String getAnh() {
		return Anh;
	}
	public void setAnh(String anh) {
		Anh = anh;
	}
	
	@Override
	public String toString() {
		return "monan [MaMonAn=" + MaMonAn + ", TenMonAn=" + TenMonAn + ", TheLoai=" + TheLoai + ", Gia=" + Gia
				+ ", MoTa=" + MoTa + ", Anh=" + Anh + "]";
	}
	
	public monan() {
		
	}
	public monan(String maMonAn, String tenMonAn, String theLoai, int gia, String moTa, String anh) {
		super();
		MaMonAn = maMonAn;
		TenMonAn = tenMonAn;
		TheLoai = theLoai;
		Gia = gia;
		MoTa = moTa;
		Anh = anh;
	}
}
