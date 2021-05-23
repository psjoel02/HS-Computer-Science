//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner
{
	public static void main( String args[] ) throws IOException
	{
		PascalsTriangle pt = new PascalsTriangle(2);

		System.out.println("Size 2:");
		pt.createTriangle();
		System.out.println(pt);

		pt = new PascalsTriangle(3);
		System.out.println("Size 3:");
		pt.createTriangle();
		System.out.println(pt);

		pt = new PascalsTriangle(4);
		System.out.println("Size 4:");
		pt.createTriangle();
		System.out.println(pt);

		pt = new PascalsTriangle(5);
		System.out.println("Size 5:");
		pt.createTriangle();
		System.out.println(pt);
	}
}



