package com.iuh.quanLiSinhVien;


public interface SinhVienManagement {

	
	public boolean addNewSinhVien(SinhVien sinhVien);
	
	public boolean editSinhVien(String idSv, SinhVien newSinhVien);
	
	public boolean deleteSinhVien(String idSv);
	
	public void sortListSinhVienByName();
	
	public void sortListSinhVienByGPA();
	
	public void showAll();
	
	public void exit();
	
	public SinhVien getSinhVienById(String idSv);
	
	
}
