package model.bean;

public class taikhoan {
	private String TenTaiKhoan;
	private String MatKhau;
	private String MaNguoiDung;
	private String TrangThai;
	
	public String getTenTK() {
		return TenTaiKhoan;
	}
	public String getMK() {
		return MatKhau;
	}
	public void setTenTK(int mssv) {
		this.TenTaiKhoan = TenTaiKhoan;
	}
	public void setMK(int mssv) {
		this.MatKhau = MatKhau;
	}
	
	
	public String toString() {
		return "TaiKhoan [TenTaiKhoan=" + TenTaiKhoan + ", MatKhau=" + MatKhau + ", MaNguoiDung=" + MaNguoiDung + ", TrangThai=" + TrangThai + "]";
	}
	public taikhoan(String tenTaiKhoan, String matKhau, String maNguoiDung, String trangThai) {
		super();
		TenTaiKhoan = tenTaiKhoan;
		MatKhau = matKhau;
		MaNguoiDung = maNguoiDung;
		TrangThai = trangThai;
	}
	public taikhoan() {
		// TODO Auto-generated constructor stub
	}
}