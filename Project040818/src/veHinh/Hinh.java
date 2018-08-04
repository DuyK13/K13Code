package veHinh;

/**
 * 
 * @author atv
 *	Một hình có 1 điểm toạn độ
 *	Trong đó, mỗi hinh đều có thể vẽ, nhưng chưa biết vẽ ra sao --> vẽ ở lớp con
 *	Tương tự với chu vi và diện tích
 */
public abstract class Hinh {
	//Tọa độ chính của hỉnh
	//protected có tác dụng cho phép các đối tượng con sử dụng được
	//protected có thể truy cập được (từ lớp con) khác package
	protected ToaDo toaDoChinh;
	
	/**
	 * Phương thức khỏi tạo
	 * Một hình có 1 điểm tọa độ được truyền vào
	 * @param toaDoChinh
	 */
	public Hinh(ToaDo toaDoChinh) {
		// TODO Auto-generated constructor stub
		this.toaDoChinh = toaDoChinh;
	}
	
	/**
	 * Phương thức khởi tạo 2
	 * KHởi tạo 1 hình có điểm chính nằm ở tọa đợ 0, 0
	 */
	public Hinh() {
		// TODO Auto-generated constructor stub
		this(new ToaDo());
	}
	
	/**
	 * Phương thức vẽ hình
	 */
	public abstract void veHinh();
	
	/**
	 * Phương thức tính diện tích
	 * @return 
	 */
	public abstract double tinhDienTich();
	
	/**
	 * Phương thức tính chu vi
	 * @return
	 */
	public abstract double tinhChuVi();
	
}
