import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.*;
class DecFormatExamples
{

	public static void main(String[] args) throws IOException
	{


		Scanner user = new Scanner(System.in);
		String inputFileName, outputFileName;

		System.out.print("What is the name of the data file?");
		inputFileName = user.nextLine().trim();
		File inputx = new File( inputFileName );

    	Scanner scanx = new Scanner( inputx );

		System.out.print("Output File Name: ");
    	outputFileName = user.nextLine().trim();
    	File outputx = new File(outputFileName);

    	Scanner inFileScan = new Scanner(new File(inputFileName));
    	PrintWriter outputwrt = new PrintWriter( outputx );

		float sum = 0;
		String format1 = "###0.00";
		DecimalFormat fm1 = new DecimalFormat(format1);
         while(inFileScan.hasNextFloat())
		{


				float num;

 				num = inFileScan.nextFloat();
				outputwrt.println(fm1.format(num));
					sum = sum + num;


		}
			outputwrt.println(fm1.format(sum));

          scanx.close();
          outputwrt.close();






	}
}