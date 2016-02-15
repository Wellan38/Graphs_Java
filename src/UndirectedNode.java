import java.util.ArrayList;

/**
 * 
 * @author alexandre
 *
 */

public class UndirectedNode extends Node
{
//------------------------------------------------------------------- Attributes
	
	/**
	 * The adjacent nodes of a node are the vertices to which it is connected,
	 * in an undirected graph.
	 */
	
	protected ArrayList<Node> adjacentNodes;

//---------------------------------------------------------------------- Methods

	//------------------------------------------------------------- Constructors
	
	/**
	 * Default constructor. Set the color of the node to white.
	 */
	
	public UndirectedNode()
	{
		adjacentNodes = new ArrayList<Node>();
		
		color = Color.White;
	}
	
	//------------------------------------------------------------------ Getters
	
	/**
	 * Gives the list of adjacent nodes.
	 * @return The list of adjacent nodes
	 */
	
	public ArrayList<Node> getAdjacentNodes()
	{
		return adjacentNodes;
	}
	
//---------------------------------------------------------------------- Setters
	
	/**
	 * Sets the color of the node.
	 * @param c The new color
	 */
	
	public void setColor(Color c)
	{
		color = c;
	}
	
	//------------------------------------------------------------ Other methods
	
	/**
	 * Adds a node to the list of adjacent nodes.
	 * @param n The node to be added
	 */
	
	public void addAdjacentNode(Node n)
	{
		adjacentNodes.add(n);
	}
	
	/**
	 * Deletes a node from the list of adjacent nodes.
	 * @param n The node to be deleted
	 * @return True if the node was is the list and has been deleted, wrong
	 * 		   otherwise
	 */
	
	public boolean removeAdjacentNode(Node n)
	{
		return adjacentNodes.remove(n);
	}
	
	public void addSuccessor(Node n)
	{
		adjacentNodes.add(n);
	}

}
