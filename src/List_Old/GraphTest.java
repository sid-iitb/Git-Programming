/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */
public class GraphTest {
    public static void main(String args[])
    {
        char Vertices[]={'A','B','C','D','E','F','G','H'}; 
        Graph g=new Graph();
        for(char c:Vertices)
            g.addVertex(c);
       //g.displayVertex();
        //g.printGraph();
        /*g.addEdge(Vertices[0], Vertices[1]);
        g.addEdge(Vertices[1], Vertices[7]);
        g.addEdge(Vertices[1], Vertices[2]);
        g.addEdge(Vertices[2], Vertices[3]);
        g.addEdge(Vertices[2], Vertices[4]);
        g.addEdge(Vertices[4], Vertices[7]);
        g.addEdge(Vertices[4], Vertices[5]);
        g.addEdge(Vertices[4], Vertices[6]);
        /*g.addWDEdge(Vertices[4], Vertices[3],1);
        g.addWDEdge(Vertices[5], Vertices[5],1);*/
        g.addEdge(Vertices[0], Vertices[1]);
        //g.printGraph();
        g.addEdge(Vertices[1], Vertices[2]);
        g.addEdge(Vertices[1], Vertices[7]);
        g.addEdge(Vertices[2], Vertices[3]);
        g.addEdge(Vertices[2], Vertices[4]);
        g.addEdge(Vertices[4], Vertices[5]);
        g.addEdge(Vertices[4], Vertices[6]);
        g.addEdge(Vertices[4], Vertices[7]);
        g.addEdge(Vertices[7], Vertices[6]);
        g.sortVertexList();
        //System.out.println(g.vertexUnvisited(1));
        /*g.addWEdge(Vertices[0], Vertices[1],1);
        //g.printGraph();
        g.addWEdge(Vertices[1], Vertices[2],2);
        g.addWEdge(Vertices[1], Vertices[7],3);
        g.addWEdge(Vertices[2], Vertices[3],4);
        g.addWEdge(Vertices[2], Vertices[4],5);
        g.addWEdge(Vertices[4], Vertices[5],6);
        g.addWEdge(Vertices[4], Vertices[6],7);
        g.addWEdge(Vertices[4], Vertices[7],8);
        //g.addEdge(Vertices[7], Vertices[6]);*/
        g.printGraph();
        g.depthFirstSearch(0);
        g.breadthFirstSearch(0);
    }
}
