package com.iuh.quanLiSinhVien;

import java.util.Comparator;

public class SinhVienGPACompairator implements Comparator<SinhVien>{

	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		// TODO Auto-generated method stub
//		if(o1.getGpa() > o2.getGpa())
//			return 1;
//		else {
//			if(o1.getGpa() == o2.getGpa())
//				return 0;
//			return -1;
//		}
		Double gpa1 = o1.getGpa();
		Double gpa2 = o2.getGpa();
		return gpa1.compareTo(gpa2);
	}
	
}
