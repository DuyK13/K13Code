package quanLyTranh;

import veHinh.Hinh;
import veHinh.ToaDo;

/**
 * Trong bức tranh có nhiều hinh
 * Interface này quy định những việc khi vẽ 1 bức tranh có thể làm
 * @author atv
 *
 */
public interface QuanLyTranhVe {
	/**
	 * Phương thức xóa 1 hình ra khỏi bức tranh
	 * Để xóa hình ra, cần biết hình đó là hình nào
	 * Kết quả cuối cùng là thông báo có xóa được hay ko
	 * @param hinhCanXoa
	 * @return
	 */
	boolean xoaHinh(Hinh hinhCanXoa);
	
	/**
	 * Phương thức thêm hình vào tranh
	 * Để thêm, cần biết hình cần thêm
	 * Nguyên tác thêm: Hình ko được lọt ra phạm vi của tranh, nếu lọt ra thì ko thêm được
	 * @param hinhCanThem
	 * @return
	 */
	boolean themHinh(Hinh hinhCanThem);
	
	/**
	 * Thay đổi vị trí hình
	 * Để thay đổi, cần biết hình cần đổi và vị trí chuyển đến
	 * Nguyên tác đổi: Hình ko được lọt ra phạm vi của tranh, nếu lọt ra thì ko đổi được
	 * @param hinhCanThayDoi
	 * @param doaDoChinhMoi
	 * @return
	 */
	Hinh thayDoiVuTriHinh(Hinh hinhCanThayDoi, ToaDo doaDoChinhMoi);
}
