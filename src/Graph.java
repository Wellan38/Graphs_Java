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
	 * List of all the arcs linking the nodes of the graph.
	 */
	
	//TODO Create class Arc
	
	// protected ArrayList<Arc> arcs;
	
	/**
	 * Adjacency matrix of the graph.
	 */
	
	protected int[][] adjacencyMatrix;
	
//---------------------------------------------------------------------- Methods
	
	//------------------------------------------------------------- Constructors
	
	/**
	 * Default constructor. Creates an empty graph.
	 */
	
	public Graph()
	{
		nodes = new ArrayList<Node>();
		
		//TODO Once class Arc is created, uncomment this
		
		// arcs = new ArrayList<Arc>();
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
	 * Gives the list of arcs linking the nodes of the graph;
	 * @return The list of arcs
	 */
	
	//TODO Once class arc is created, uncomment this
	
	/* public ArrayList<Arc> getArcs()
	{
		return arcs;
	}
	*/
	
	/**
	 * Gives the adjacency matrix of the graph.
	 * @return The adjacency matrix
	 */
	
	public int[][] getAdjacencyMatrix()
	{
		return adjacencyMatrix;
	}

}
