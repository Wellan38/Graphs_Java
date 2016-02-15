import java.util.ArrayList;

public class SquareMatrix
{
	
	//------------------------------------------------------------------- Attributes
		
		/**
		 * This double ArrayList contains the coefficients of the matrix.
		 */
		
		protected ArrayList<ArrayList<Integer>> mat;
		
	//---------------------------------------------------------------------- Methods
		
		//------------------------------------------------------------- Constructors

		/**
		 * Default constructor. Creates a matrix of size 0.
		 */
		
		public SquareMatrix()
		{
			mat = new ArrayList<ArrayList<Integer>>();
		}
		
		//------------------------------------------------------------------ Getters
		
		/**
		 * Gives the coefficient at row i, column j of the matrix.
		 * The coefficient has to exist in the matrix, otherwise an exception
		 * will be raised.
		 * @param i The row index (starting from 1)
		 * @param j The column index (starting from 1)
		 * @return The coefficient at indices (i, j)
		 */
		
		public int getCoeff(int i, int j)
		{
			ArrayList<Integer> tempMat = mat.get(i-1);
			
			return tempMat.get(j-1);
		}
		
		/**
		 * Gives the size of the matrix.
		 * @return The size of the matrix
		 */
		
		public int getSize()
		{
			return mat.size();
		}
		
		//------------------------------------------------------------------ Setters
		
		/**
		 * This method sets the coefficient of position (i, j) in the matrix.
		 * If the size of the matrix dosen't fit with the specified position,
		 * it will be automatically increased, and the missing coefficients will be
		 * set to 0.
		 * 
		 * @param i The row index (starting from 1)
		 * @param j The column index (starting from 1)
		 * @param value The value at which the coefficient will be set
		 */
		
		public void setCoeff(int i, int j, int value)
		{
			int size = getSize();
			
			int max = Math.max(i, j);
			
			if (max > size)
			{
				setSize(max);
			}
			
			mat.get(i-1).set(j-1, value);
				
		}
		
		/**
		 * This method sets the size of the matrix according to the size
		 * specified as a parameter.
		 * If the matrix has to be extended, then the added coefficients will
		 * be set to 0.
		 * If it has to be shrunk, then the last rows will be removed,
		 * as well as the last coefficients of each remaining row.
		 * @param s The new size of the matrix. It has to be positive.
		 */
		
		public void setSize(int s)
		{
			int size = getSize();
			int diff = s - size;
			
			if (diff >= 0)
			{
				for (ArrayList<Integer> row : mat)
				{
					for (int i = 0; i < diff; i++)
					{
						row.add(0);
					}
				}
				
				for (int i = 0; i < diff; i++)
				{
					ArrayList<Integer> row = new ArrayList<Integer>();
					
					for (int j = 0; j < s; j++)
					{
						row.add(0);
					}
					
					mat.add(row);
				}
			}
			else
			{
				diff = Math.abs(diff);
				
				for (int i = 0; i < diff; i++)
				{
					mat.remove(mat.size() - 1);
				}
				
				for (int i = 0; i < mat.size(); i++)
				{
					ArrayList<Integer> row = mat.get(i);
					
					for (int j = 0; j < diff; j++)
					{
						row.remove(row.size() - 1);
					}
				}
			}
		}
		
		//------------------------------------------------------------ Other methods
		
		/**
		 * This method returns a string used to display the matrix with an
		 * adapted presentation.
		 * 
		 * @return A string adapted to display the matrix
		 */
		
		public String toString()
		{
			String s = "";
			
			for (ArrayList<Integer> row : mat)
			{
				for (int coeff : row)
				{
					s += coeff + " ";
				}
				
				s += "\n";
			}
			
			return s;
		}
}
