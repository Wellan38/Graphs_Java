import java.util.ArrayList;

public class Matrix
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
	
	public Matrix()
	{
		mat = new ArrayList<ArrayList<Integer>>();
	}
	
	//------------------------------------------------------------------ Getters
	
	/**
	 * Gives the coefficient at row i, column j of the matrix.
	 * The coefficient has to exist in the matrix, otherwise an exception
	 * will be raised.
	 * @param i The row index
	 * @param j The column index
	 * @return The coefficient at indices (i, j)
	 */
	
	public int getCoeff(int i, int j)
	{
		ArrayList<Integer> tempMat = mat.get(i-1);
		
		return tempMat.get(j-1);
	}
	
	/**
	 * Gives the number of rows of the matrix.
	 * @return The number of rows
	 */
	
	public int getNbRows()
	{
		return mat.size();
	}
	
	/**
	 * Gives the number of columns of the matrix.
	 * @return The number of columns
	 */
	
	public int getNbColumns()
	{
		ArrayList<Integer> tempMat;
		
		int size = 0;
		
		for (int i = 0; i < mat.size(); i++)
		{
			tempMat = mat.get(i);
			
			if (size < tempMat.size())
			{
				size = tempMat.size();
			}
		}
		
		return size;
	}
	
	//------------------------------------------------------------------ Setters
	
	/**
	 * This method sets the coefficient of position (i, j) in the matrix.
	 * If the size of the matrix dosen't fit with the specified position,
	 * it will be automatically increased, and the missing coefficients will be
	 * set to 0.
	 * 
	 * @param i The row index
	 * @param j The column index
	 * @param value The value at which the coefficient will be set
	 */
	
	public void setCoeff(int i, int j, int value)
	{
		int k = mat.size();
		
		while (mat.size() < i)
		{
			ArrayList<Integer> row = new ArrayList<Integer>();
			
			mat.add(k, row);
			
			while (row.size() < Math.max(j, getNbColumns()))
			{
				row.add(0);
			}
		}
		
		ArrayList<Integer> tempMat = mat.get(i-1);
		
		k = tempMat.size();
		
		while (tempMat.size() < j)
		{
			tempMat.add(k, 0);
		}
		
		tempMat.set(j-1, value);
	}
	
	//------------------------------------------------------------ Other methods
	
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
