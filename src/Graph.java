import java.util.ArrayList;

/**
 * 
 * @author alexandre
 *
 */

public class Graph
{
	
//------------------------------------------------------------------- Attributes
	
	/**
	 * List of the nodes contained in the graph.
	 */
	
	protected ArrayList<Node> nodes;
	
	/**
	 * Adjacency matrix of the graph.
	 */
	
	protected SquareMatrix adjacencyMatrix;
	
//---------------------------------------------------------------------- Methods
	
	//------------------------------------------------------------- Constructors
	
	/**
	 * Default constructor. Creates an empty graph.
	 */
	
	public Graph()
	{
		nodes = new ArrayList<Node>();
		adjacencyMatrix = new SquareMatrix();
	}
	
	//------------------------------------------------------------------ Getters
	
	/**
	 * Gives the list of nodes contained in the graph.
	 * @return The list of nodes
	 */
	
	public ArrayList<Node> getNodes()
	{
		return nodes;
	}	
	
	/**
	 * Gives the adjacency coefficient at position (i, j).
	 * The coefficient has to exist in the matrix, otherwise an exception
	 * will be raised.
	 * 
	 * @param i The row index
	 * @param j The column index
	 * @return The adjacency coefficient
	 */
	
	public int getAdjacencyCoeff(int i, int j)
	{
		return adjacencyMatrix.getCoeff(i, j);
	}
	
	//------------------------------------------------------------ Other methods
	
	/**
	 * Adds the specified node to the graph.
	 * If the node is already present in the graph, it will still be included,
	 * for performance reasons.
	 * @param n The node to be added
	 */
	
	public void addNode(Node n)
	{
		nodes.add(n);
		
		adjacencyMatrix.setSize(adjacencyMatrix.getSize()+1);
	}
	
	/**
	 * This method adds an arc from node n1 to n2.
	 * If the arc already exists, it won't be added.
	 * If the boolean directed is set to false, then the link will be added
	 * both ways, it will be added only from n1 to n2 otherwise.
	 * The nodes are assumed to be contained in the graph.
	 * 
	 * @param n1 Origin of the arc
	 * @param n2 End of the arc
	 * @param directed True if the arc is directed, false otherwise
	 */
	
	public void addArc(Node n1, Node n2, boolean directed)
	{
		int i = nodes.indexOf(n1);
		int j = nodes.indexOf(n2);
		
		if (adjacencyMatrix.getCoeff(i+1, j+1) == 0)
		{
			n1.addSuccessor(n2);
			adjacencyMatrix.setCoeff(i+1, j+1, 1);
		}
		
		if (!directed)
		{
			n2.addSuccessor(n1);
			adjacencyMatrix.setCoeff(j+1, i+1, 1);
		}
	}
	
	public void displayAdjacencyMatrix()
	{
		System.out.println(adjacencyMatrix);
	}
}
