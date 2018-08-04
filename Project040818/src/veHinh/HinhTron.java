package veHinh;

public class HinhTron extends Hinh{
	private int banKinh;
	
	/**
	 * Hình tròn măc định
	 * Không gọi supper, xem ai có thể giải thích giùm anh nha :)
	 */
	public HinhTron() {
		// TODO Auto-generated constructor stub
		this(new ToaDo(), 0);
	}

	/**
	 * Hình tròn đầy đủ với tâm là toaDoChinh
	 * bán kính là banKinh
	 * @param toaDoChinh
	 * @param banKinh
	 */
	public HinhTron(ToaDo toaDoChinh, int banKinh) {
		super(toaDoChinh);
		this.banKinh = banKinh;
	}

	@Override
	public void veHinh() {
		// TODO Auto-generated method stub
		System.out.println("Vẽ hình tròn");
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh*banKinh;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*banKinh * Math.PI;
	}

}
