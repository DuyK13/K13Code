package veHinh;

public class HinhChuNhat extends Hinh{
	private ToaDo toaDoThuHai;
	
	/**
	 * Phương thức khởi tạo, cho phép thêm 1 tọa độ nửa cho hình chữ nhật
	 * @param toaDoChinh
	 * @param toaDoThuHai
	 */
	public HinhChuNhat(ToaDo toaDoChinh, ToaDo toaDoThuHai) {
		super(toaDoChinh);
		this.toaDoThuHai = toaDoThuHai;
	}
	
	@Override
	public void veHinh() {
		// TODO Auto-generated method stub
		System.out.println("Vẽ hình chữ nhật");
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.abs(toaDoChinh.getX() - toaDoThuHai.getX())
				* Math.abs(toaDoChinh.getY() - toaDoThuHai.getY());
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return (Math.abs(toaDoChinh.getX() - toaDoThuHai.getX())
				+ Math.abs(toaDoChinh.getY() - toaDoThuHai.getY())) * 2;
	}

}
