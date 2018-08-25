package com.iuh.quanLiSinhVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

public class SinhVienManagementImp implements SinhVienManagement{

	public static List<SinhVien> listSinhVien  = new ArrayList<SinhVien>();

	@Override
	public boolean addNewSinhVien(SinhVien sinhVien) {
		// TODO Auto-generated method stub
		//kiem tra ma so sinh vien add vao da ton tai chua
		boolean isExisted = false;
		for(SinhVien sv : listSinhVien) {
			if(sv.getId().equals(sinhVien.getId())) {
				isExisted = true;
				break;
			}
		}
		if(isExisted) {//ma so sinh vien da ton tai
			return false;
		}else {//ma so sinh vien chua ton tai
			SinhVienManagementImp.listSinhVien.add(sinhVien);
			return true;
		}
	}

	@Override
	public boolean editSinhVien(String idSv, SinhVien newSinhVien) {
		// TODO Auto-generated method stub
		//kiem tra ma so sinh vien add vao da ton tai chua
		boolean isExisted = false;
		int index = 0;
		for(SinhVien sv : listSinhVien) {
			if(sv.getId().equals(idSv)) {
				isExisted = true;
				index = listSinhVien.indexOf(sv);
				break;
			}
		}
		if(isExisted) {//ma so sinh vien da ton tai
			//update thong tin sinh vien
			SinhVien sinhVien = listSinhVien.get(index);
			sinhVien.setAddress(newSinhVien.getAddress());
			sinhVien.setAge(newSinhVien.getAge());
			sinhVien.setGpa(newSinhVien.getGpa());
			sinhVien.setId(newSinhVien.getId());
			sinhVien.setName(newSinhVien.getName());
			//updated
			listSinhVien.set(index, sinhVien);
			return true;
		}else {//ma so sinh vien chua ton tai
			return false;
		}

	}

	@Override
	public boolean deleteSinhVien(String idSv) {
		// TODO Auto-generated method stub
		//kiem tra ma so sinh vien add vao da ton tai chua
		boolean isExisted = false;
		int index = 0;
		for(SinhVien sv : listSinhVien) {
			if(sv.getId().equals(idSv)) {
				isExisted = true;
				index =  listSinhVien.indexOf(sv);
				break;
			}
		}
		if(isExisted) {//ma so sinh vien da ton tai
			listSinhVien.remove(index);
			return true;
		}else {//ma so sinh vien chua ton tai
			return false;
		}
	}

	@Override
	public void sortListSinhVienByName() {
		// TODO Auto-generated method stub
		listSinhVien.sort(new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	@Override
	public void sortListSinhVienByGPA() {
		// TODO Auto-generated method stub
		listSinhVien.sort(new SinhVienGPACompairator());
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		for(SinhVien sv : listSinhVien) {
			System.out.println(sv.toString());
		}
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.exit(1);
	}

	@Override
	public SinhVien getSinhVienById(String idSv) {
		// TODO Auto-generated method stub
		for(SinhVien sv : listSinhVien) {
			if(sv.getId().equals(idSv))
				return sv;
		}
		return null;
	}

}
