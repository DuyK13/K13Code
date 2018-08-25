package com.iuh.quanLiSinhVien;

import java.util.Scanner;

public class SinhVienManagementUI {

	public static void main(String[] args) {
		
		
		//init new SinhVienManagement
		SinhVienManagement manager = new SinhVienManagementImp();
		System.out.println("Sinh Vien Management Application\n"
				+ "===============================\n");
		boolean isExited = false;
		Scanner scanner = new Scanner(System.in);
		showUI();
		do {
			System.out.println("Nhap chuc nang: ");
			int index = scanner.nextInt();
			switch (index) {
			case 1:
				SinhVien sv = getSinhVienInfo(scanner);
				boolean isOk = manager.addNewSinhVien(sv);
				if(!isOk) {
					System.out.println("Add khong thanh cong " + sv.getName() + "\n");
				}else {
					System.out.println("Add thanh cong " + sv.getName() + "\n");
				}
				break;
			case 2:
				System.out.println("Nhap ma sinh vien can update: ");
				String idSinhVien = scanner.next();
				SinhVien oldSv = manager.getSinhVienById(idSinhVien);
				if(oldSv == null) {
					System.out.println("Sinh vien chua ton tai!");
				}else {
					System.out.println("Thong tin sinh vien cu: " + oldSv.toString());
					System.out.println("Nhap thong tin moi\n");
					SinhVien newSinhVien = getSinhVienInfoExclueId(oldSv.getId(),scanner);
					//update sinh vien info
					boolean isUpdated = manager.editSinhVien(newSinhVien.getId(), newSinhVien);
					//check is updated
					if(isUpdated) {
						System.out.println("Upated sinh vien: " + newSinhVien.getName() +"\n");
					}else {
						System.out.println("Can not update sinh vien: " + newSinhVien.getName() +"\n");
					}
				}
				break;
			case 3:
				System.out.println("Nhap id sinh vien can xoa: ");
				String idDelete = scanner.next();
				boolean isDeleted = manager.deleteSinhVien(idDelete);
				if(isDeleted) {
					System.out.println("Deleted sinh vien: " + idDelete +"\n");
				}else {
					System.out.println("Can not delete sinh vien: " + idDelete +"\n");
				}
				break;
			case 4:
				manager.sortListSinhVienByName();
				System.out.println("Sorted!");
				break;
			case 5:
				manager.sortListSinhVienByGPA();
				System.out.println("Sorted!");
				break;
			case 6:
				manager.showAll();
				break;
			case 0:
				isExited = true;
				break;
			default:
				System.out.println("Vui long nhap lai: ");
				showUI();
				break;
			}

		} while (!isExited);

		//neu nguoi dung exit
		if(isExited) {
			System.out.println("Bye!\n");
			scanner.close();
			
		}
	}


	private static SinhVien getSinhVienInfoExclueId(String idSv,Scanner scan) {
		// TODO Auto-generated method stub
		scan.nextLine();
		System.out.println("Nhap ten: ");
		String name = scan.nextLine();
		System.out.println("Nhap tuoi: ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap dia chi: ");
		String address = scan.nextLine();
		//scan.next();
		System.out.println("Nhap gpa: ");
		double  gpa = scan.nextDouble();
		boolean isOk = true;
		if(age < 0) {
			age = 0;
			isOk = false;
		}
		if(gpa < 0) {
			gpa = 0;
			isOk = false;
		}
		if(!isOk)
			System.out.println("Thong so nhap khong hop le. Se duoc dua ve default\n");
		SinhVien sinhVien = new SinhVien(idSv, name, age, address, gpa);
		
		return sinhVien;

	}


	private static void showUI() {
		System.out.println(
				"1. Add student.\n" + 
						"2. Edit student by id.\n" + 
						"3. Delete student by id.\n" + 
						"4. Sort student by gpa.\n" + 
						"5. Sort student by name.\n" + 
						"6. Show all student.\n" + 
						"0. Exit.\n"
						+ "===================================\n");

	}
	
	private static SinhVien getSinhVienInfo(Scanner scan) {
		scan.nextLine();
		System.out.println("Nhap id: ");
		String id = scan.nextLine();
		System.out.println("Nhap ten: ");
		String name = scan.nextLine();
		System.out.println("Nhap tuoi: ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap dia chi: ");
		String address = scan.nextLine();
		//scan.next();
		System.out.println("Nhap gpa: ");
		double  gpa = scan.nextDouble();
		boolean isOk = true;
		if(age < 0) {
			age = 0;
			isOk = false;
		}
		if(gpa < 0) {
			gpa = 0;
			isOk = false;
		}
		if(!isOk)
			System.out.println("Thong so nhap khong hop le. Se duoc dua ve default\n");
		SinhVien sinhVien = new SinhVien(id, name, age, address, gpa);
		
		return sinhVien;
	}

}
