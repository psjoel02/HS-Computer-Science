import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;

public class FileIO
{

	public static void main (String[]args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of the data file?");
		String fileName = scan.nextLine();
		Scanner fileScan = new Scanner(new File(fileName));




         PrintWriter writer = new PrintWriter(new FileWriter("FileOutput.txt"));


		while(fileScan.hasNext())
		{
			  String line = fileScan.nextLine();
              writer.println(line);



		}

        fileScan.close();
        writer.close();















	}










}