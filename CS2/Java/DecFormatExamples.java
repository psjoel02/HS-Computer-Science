import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

class DecFormatExamples
{

	public static void main(String[] args)
	{
    double x = 4.7;
    double y = 55.48901;
    String format1 = "###0.00" ;
    DecimalFormat fm1 = new DecimalFormat( format1);

    System.out.println("X=" + fm1.format(x) + "\n Y=" + fm1.format(y));
	}
}

