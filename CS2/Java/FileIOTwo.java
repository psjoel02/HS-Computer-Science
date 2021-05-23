import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;

public class FileIOTwo
{

	public static void main (String[]args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of the data file?");
		String fileName = scan.nextLine();
		Scanner fileScan = new Scanner(new File(fileName));

        System.out.println("What is the name of the output file (odd)?");
        String fileNameTwo = scan.nextLine();
        PrintWriter odd = new PrintWriter(new FileWriter(fileNameTwo));


        System.out.println("What is the name of the output file (even)?");
        String fileNameThree = scan.nextLine();
        PrintWriter even = new PrintWriter(new FileWriter(fileNameThree));

		while(fileScan.hasNextInt())
		{
			  int num = fileScan.nextInt();
              if (num % 2 == 1 )
              {
                odd.println(num);
              }
              else
              {
                even.println(num);
              }


		}

        fileScan.close();
        odd.close();
        even.close();



	}

	}