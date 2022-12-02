package model.bean;

public class monan {
	private String MaMonAn;
	private String TenMonAn;
	private String TheLoai;
	private int Gia;
	private String MoTa;
	private String Anh;
	private String TrangThai;
	
	public monan()
	{
		
	}

	public monan(String MaMonAn, String TenMonAn, String TheLoai, int Gia, String MoTa, String Anh, String TrangThai)
	{
		this.MaMonAn = MaMonAn;
		this.TenMonAn = TenMonAn;
		this.TheLoai = TheLoai;
		this.Gia = Gia;
		this.MoTa = MoTa;
		this.Anh = Anh;
		this.TrangThai = TrangThai;
	}
	
	
	public String getMaMonAn()
	{
		return MaMonAn;
	}
	public String getTenMonAn()
	{
		return TenMonAn;
	}
	public String getTheLoai()
	{
		return TheLoai;
	}
	public int getGia()
	{
		return Gia;
	}
	public String getAnh()
	{
		return Anh;
	}
	public String getTrangThai()
	{
		return TrangThai;
	}
	
	public void setMaMonAn(String MaMonAn)
	{
		this.MaMonAn = MaMonAn;
	}
	public void setTenMonAn(String TenMonAn)
	{
		this.TenMonAn = TenMonAn;
	}
	public void setTheLoai(String TheLoai)
	{
		this.TheLoai = TheLoai;
	}
	public void setGia(int Gia)
	{
		this.Gia = Gia;
	}
	public void setAnh(String Anh)
	{
		this.Anh = Anh;
	}
	public void setTrangThai(String TrangThai)
	{
		this.TrangThai = TrangThai;
	}
}
