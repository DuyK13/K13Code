package veHinh;

public class ToaDo {
	private int x;
	private int y;
	

	/**
	 * Phương thức khởi tạo
	 * Gán giá trị x, y bởi 1 giá trị được nhập vào
	 * Phương thức này, không gán trực tiếp mà thông qua hàm set tương ứng để kiểm tra và set
	 * @param x
	 * @param y
	 */
	public ToaDo(int x, int y) {
		super();
		setX(x);
		setY(y);
	}
	
	/**
	 * Phương thức khởi tạo
	 * Khởi tạo 1 tọa độ mặc định có tọa độ x = 0 ;  y = 0
	 * Hàm này gọi this(0, 0) chính là gọi lại chính bản thân nó
	 * this(0, 0) ứng với ToaDo(0, 0), constructor dòng thứ 15
	 */
	public ToaDo() {
		// TODO Auto-generated constructor stub
		this(0, 0);
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param Gán giá trị cho x
	 * Các giá trị này phải có biên từ -10000 đến 10000
	 * Nếu vượt ngưỡng/ dưới ngưỡng, mặc định cho về ngưỡng gần nhất
	 */
	public void setX(int x) {
		if (x > 10000) {
			this.x = 10000;
		}else if (x < -10000) {
			this.x  = -10000;
		}else {
			this.x = x;
		}
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param Gán giá trị cho y
	 * Các giá trị này phải có biên từ -10000 đến 10000
	 * Nếu vượt ngưỡng/ dưới ngưỡng, mặc định cho về ngưỡng gần nhất
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
}
