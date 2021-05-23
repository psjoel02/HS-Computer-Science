

class printfExamples
{
	public static void main(String[] args)
	{
		double d = 12.555;
		int k = 4;

		System.out.printf("%8.2f", d);
		System.out.println();
		System.out.printf("%+8.2f", d);
		System.out.println();
		//System.out.printf("%8.2d", d);


		//System.out.printf("%-+8.2f", (int)d);
		System.out.printf("%+010.4f", d);
		System.out.println();

		double[] gpas = {3.2, 4.1, 3.3, 2.0, 1.5}; //code to init
		String[] names = {"Joe", "Mary", "Sam", "Liz", "Julie"}; //code to init

		for(int i = 0; i < gpas.length; i++)
			System.out.printf("Name: %-10s GPA: %5.2f \n", names[i], gpas[i]);
	}
}
