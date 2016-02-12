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
	 * @param i The row index
	 * @param j The column index
	 * @return The coefficient at indexes (i, j)
	 */
	
	public int getCoeff(int i, int j)
	{
		ArrayList<Integer> tempMat = mat.get(i-1);
		
		return tempMat.get(j-1);
	}
	
	public int getNbRows()
	{
		return mat.size();
	}
	
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
	
	public void setCoeff(int i, int j, int value)
	{
		if (mat.size() < i)
		{
			mat.add(i-1, new ArrayList<Integer>());
		}
		
		ArrayList<Integer> tempMat = mat.get(i-1);
		
		tempMat.set(j-1, value);
	}

}
