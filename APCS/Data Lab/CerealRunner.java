public class CerealRunner
{
	public static void main(String[]args)
	{
		
	 Cereal frootloops = new Cereal("Froot Loops", 2, 13);
	 System.out.println(frootloops);
	 
	 Cereal raisinbran = new Cereal("Raisin Bran", 2, 13);
	 System.out.println(raisinbran);
	 System.out.println(frootloops.getSugar());
	 
	}

}