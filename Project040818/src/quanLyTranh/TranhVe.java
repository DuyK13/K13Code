package quanLyTranh;

import java.util.ArrayList;

import veHinh.Hinh;
import veHinh.ToaDo;

/**
 * Tranh vẽ sẽ thực hiện các chức năng theo quy định bằng cách implement interface QuanLyTranhVe
 * @author atv
 *
 */
public class TranhVe implements QuanLyTranhVe{
	private String tenHoaSy;
	private ToaDo diemDau1;
	private ToaDo diemDau2;
	private ArrayList<Hinh> danhSachHinhVe;
	
	/**
	 * Tạo 1 bức tranh, ko có hình nào trong đó
	 * @param tenHoaSy
	 * @param diemDau1
	 * @param diemDau2
	 * @param danhSachHinhVe
	 */
	public TranhVe(String tenHoaSy, ToaDo diemDau1, ToaDo diemDau2) {
		super();
		this.tenHoaSy = tenHoaSy;
		this.diemDau1 = diemDau1;
		this.diemDau2 = diemDau2;
		this.danhSachHinhVe = new ArrayList<Hinh>();
	}

	@Override
	public boolean xoaHinh(Hinh hinhCanXoa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean themHinh(Hinh hinhCanThem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hinh thayDoiVuTriHinh(Hinh hinhCanThayDoi, ToaDo doaDoChinhMoi) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
