package thucThi;

import veHinh.Hinh;
import veHinh.HinhChuNhat;
import veHinh.HinhTron;
import veHinh.ToaDo;

public class UngDungVeHinh {
	public static void main(String[] args) {
		ToaDo d1 = new ToaDo();
		ToaDo d2 = new ToaDo(1, 2);
		ToaDo d3 = new ToaDo(6, 8);
		
		Hinh hinhTron = new HinhTron(d2, 10);
		Hinh hinhChuNhat = new HinhChuNhat(d1, d3);
		
		//In kết quả
		System.out.println("\n------------------------------------------\nThuc thi Hinh Tron\n");
		hinhTron.veHinh();
		System.out.println("\nChu vi: " + hinhTron.tinhChuVi());
		System.out.println("\nDien tich: " + hinhTron.tinhDienTich());
		
		System.out.println("\n------------------------------------------\nThuc thi Hinh Chu Nhat\n");
		hinhChuNhat.veHinh();
		System.out.println("\nChu vi: " + hinhChuNhat.tinhChuVi());
		System.out.println("\nDien tich: " + hinhChuNhat.tinhDienTich());
		System.out.println("\n\n-----------------------------------------\nKet thuc thuc thi");
	}
}
