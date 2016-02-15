import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		Graph g = new Graph();
		
		g.addNode(new UndirectedNode());
		g.addNode(new UndirectedNode());
		
		ArrayList<Node> nodes = g.getNodes();
		
		g.addArc(nodes.get(0), nodes.get(1), false);
		
		g.displayAdjacencyMatrix();
		
		g.addNode(new UndirectedNode());
		
		g.addArc(nodes.get(0), nodes.get(2), true);
		
		g.displayAdjacencyMatrix();
	}

}
