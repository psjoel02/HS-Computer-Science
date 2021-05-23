import java.util.*;

public class SeatingChart
{
	// instance variables
	private Student[][] chart;  // the seating chart
	private Scanner keyboard;
	private int numRows;        // number of rows in chart
	private int numCols;        // number of columns in chart

    // default constructor
	public SeatingChart(int rows, int cols)
	{
		chart = new Student[rows][cols];
		keyboard = new Scanner(System.in);
		numRows = rows;
		numCols = cols;

        initChart(chart);
	}

    // another constructor
	public SeatingChart(Student[][] array2D)
	{
		chart = array2D;
		keyboard = new Scanner(System.in);
		numRows = chart.length;
		numCols = chart[0].length;
	}

	/*
	 * This method populates array2D with default
	 *   Student objects. A default Student, when
	 *   displayed, prints the word "vacant".
	 */
	public void initChart(Student[][] array2D)
	{
		for(int r=0; r < array2D.length; r++)
		{
			for(int c=0; c < array2D[r].length; c++)
			{
				array2D[r][c] = new Student();
			}
		}
	}

	/* This method displays the seating chart on the
	 *   console window.
	 */
	public void displayChart()
	{
		for(int r=0; r < chart.length; r++)
		{
			for(int c=0; c < chart[r].length; c++)
			{
				System.out.print("("+r+","+c+") " + chart[r][c]);
			}
			System.out.println();
		}
	}

	/* This method adds a Student to the seating chart at
	 *   the specified location. If the specified location is
	 *   a valid location the Student is added to the chart
	 *   and the method returns true; otherwise the Student is
	 *   not added to the chart and the method returns false.
	 * @param student the Student to be added to the seating chart
	 * @param row the row location where Student should be added.
	 * @param col the column location where Student should be added.
	 */
	public boolean addStudent(Student student, int row, int col)
	{
		if(row >= 4 || col >= 5)
        	return false;
        if(!chart[row][col].equals("vacant"))
        {
        	if(row < 4 && col < 5)
        	{
				for(int r = 0; r < row; r++)
				{
				   for(int c=0; c < col; c++)
				   {
						chart[row][col] = student;
						return true;
				   }
				}
        	}

        }
		return false;
	}

	/*
	 *	This method swaps seats of two Students in the seating chart.
	 *  If both seat locations are valid the Students are swapped and
	 *     the method returns true; otherwise the Students are not
	 *     swapped and the method returns false.
	 * @ row1, col1 location of first student
	 * @ row2, col2 location of second student
	 */
	public boolean swapSeats(int row1, int col1, int row2, int col2)
	{
		if((row1 < 4 && col1 < 5) && (row2 < 4 && col2 < 5))
        	{
				row1 = row1 + row2;
				row2 = row1 - row2;
				row1 = row1 - row2;

				col1 = col1 + col2;
				col2 = col1 - col2;
				col1 = col1 - col2;
				return true;
        	}
        	return false;
	}
	/*
	 * This method creates a new 2D array of Students by
	 *   taking all the students from the seating chart and
	 *   placing them in the new chart at random locations. Any
	 *   seats not assigned to a student should be assigned
	 *   a default Student object which, when displayed, will
	 *   print the word "vacant".
	 *   @ return the new 2D array
	 */
	public Student[][] scrambleChart()
	{
		Student[][] student = chart;
		
		Random random = new Random();
		for(int i =  student.length - 1; i > 0; i--)
		{
			for(int j = student[i].length - 1; j > 0; j--)
			{
				int m = random.nextInt(i + 1);
				int n = random.nextInt(j + 1);
				
				Student temp = student[i][j];
				student[i][j] = student[m][n];
				student[m][n] = temp;
			}
		}
		return student;	
	}

	
		
	}


