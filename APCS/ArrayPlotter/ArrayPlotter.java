/**
 * ArrayPlotter.java  10/18/14
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 *
 * The ArrayPlotter class provides methods for drawing in
 *    a grid by setting the boolean values of a 2D array.
 *
 *    Each drawing method must
 *    - take zero arguments,
 *    - have a void return type, and
 *    - have a name that conforms to the on...ButtonClick format.
 *      (This restriction allows the GridPlotterGUI to recognize methods,
 *       for which it automatically generates buttons.)
 *
 * License Information:
 *   This class is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation.
 *
 *   This class is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 */

import javax.swing.JOptionPane;

public class ArrayPlotter
{
	/** The Array Plotter Graphical User Interface. */
  	private ArrayPlotterGUI gui;

	/** The Color Array.  The element values indicate how to color a grid cell:
	 *  - true: Color the cell with the Drawing Color.
	 *  - false: Color the cell with the Background Color.
	 */
  	private boolean[][] colorArray;


	/** Constructs an Array Plotter */
	public ArrayPlotter()
	{
		gui = new ArrayPlotterGUI(this);
	}

	/** Initialize this's Color Array to a new 2D array of boolean values
	 *  with the given dimensions.
	 *  @param rows the number of rows in the new array.
	 *  @param cols the number of columns in the new array.
	 *  Postcondition: All of the Color Array's elements have the value false.
	 */
	public void initializeColorArray(int rows, int cols)
	{
		colorArray = new boolean[rows][cols];
	}


  	// Drawing Methods
	public void onColumnMajorFillButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int col = 0; col < colorArray[0].length; col++)
		{
			for(int row = 0; row < colorArray.length; row++)
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
		}
	}
	
	public void onReverseColumnMajorFillButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int col = colorArray.length - 1; col >= 0; col--)
		{
			for(int row = colorArray.length - 1; row >= 0; row--)
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
		}
	}
	

	/** Fills in all the cells of the grid using a row-major traversal. */
	public void onRowMajorFillButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int row = 0; row < colorArray.length; row++)
		{
			for(int col = 0; col < colorArray[row].length; col++)
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
		}
	}
	public void onReverseRowMajorFillButtonClick()
		{
			// REPLACE showMessageDialog call with correct code.
			for(int row = colorArray.length-1; row >= 0; row--)
			{
				for(int col = 0; col < colorArray[row].length; col++)
				{
					colorArray[row][col] = true;
					gui.update(colorArray);
				}
			}
		}
	
		public void onMainTriangleFillButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int row = 0; row < colorArray.length; row++)
		{
			for(int col = 0; col < colorArray[row].length; col++)
			{
				if(row >= col)
				{
					colorArray[row][col] = true;
					gui.update(colorArray);
				}
				
			}
		}
	}
	
	public void onOtherTriangleFillButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int row = 0; row < colorArray.length; row++)
		{
			for(int col = 0; col < colorArray[row].length; col++)
			{
				if(row <= col)
				{
					colorArray[row][col] = true;
					gui.update(colorArray);
				}
				
			}
		}
	}
	
	public void onMainDiagonalFillButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int row = 0; row < colorArray.length; row++)
		{
			for(int col = 0; col < colorArray[row].length; col++)
			{
				if(row == col)
				{
					colorArray[row][col] = true;
					gui.update(colorArray);
				}
				
			}
		}
	}
	
	public void onOtherDiagonalFillButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int row = 0; row < colorArray.length; row++)
		{
			for(int col = colorArray[row].length - 1; col >= 0; col--)
			{
				if(row + col == colorArray[row].length - 1)
				{
					colorArray[row][col] = true;
				}
					
				
			}
			gui.update(colorArray);
		}
	}
	
	
	public void onXFillButtonClick()
	{
		onMainDiagonalFillButtonClick();
		onOtherDiagonalFillButtonClick();	
	}
	
	private void fillRowLeftToRight(boolean[] row) 
	{
		for(int i = 0; i < row.length; i++)
		{
				row[i] = true;
				gui.update(colorArray);
		}
	}
	
	private void fillRowRightToLeft(boolean[] row) 
	{
		for(int i = row.length-1; i >= 0; i--)
		{
			row[i] = true;
			gui.update(colorArray);
		}
	}
	
	public void onSerpentineFillButtonClick()
	{
		for(int r = 0; r < colorArray.length; r++)
		{
			if(r % 2 == 0)
			{
				fillRowLeftToRight(colorArray[r]);
			}
			else
			{
				fillRowRightToLeft(colorArray[r]);
			}
		}
	}
	
	public void onBorderFillButtonClick()
	{
		fillRowLeftToRight(colorArray[0]);
		for(int row = 1; row < colorArray.length - 1; row++)
		{
			if(!(colorArray[row][colorArray[0].length - 1]))
			{
			colorArray[row][colorArray[0].length-1] = true;
			gui.update(colorArray);
			}
			
		}
		if(colorArray.length > 1)
		{
		fillRowRightToLeft(colorArray[colorArray.length - 1]);
		}
		
		for(int row = colorArray.length - 2; row > 0; row--)
		{
			colorArray[row][0] = true;
			gui.update(colorArray);
		}
			
	}
	
	/** Removes all objects from the grid. */
	public void onClearGridButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		for(int row = 0; row < colorArray.length; row++)
		{
			for(int col = 0; col < colorArray[row].length; col++)
			{
				colorArray[row][col] = false;
				
			}
			gui.update(colorArray);
		}
	}
	
  	/** main method that creates the grid plotter application. */
	public static void main(String[] args)
   {
   	ArrayPlotter obj = new ArrayPlotter();
	}
}
