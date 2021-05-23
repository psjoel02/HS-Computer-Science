//Joel Pimenta 1/13/2020
public class JoelPimentaMoneyTest
{
	public static void main(String[] args)
	{

		JoelPimentaMoney m1 = new JoelPimentaMoney("123.4");
		m1.printMoney();
		JoelPimentaMoney m2 = new JoelPimentaMoney(".33");
		m2.printMoney();
		JoelPimentaMoney m3 = new JoelPimentaMoney("45");
		m3.printMoney();
		JoelPimentaMoney m4 = new JoelPimentaMoney("12.");
		m4.printMoney();
	}
}