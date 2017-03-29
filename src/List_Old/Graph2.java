
import java.util.ArrayList;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidhartha
 */

public class Graph2 {
    static ArrayList<Object> vertices;
    static node[] edges;
    static int[] edgeslength;
    static int vertexCount=0;
    public Graph2(int vertexCount)
    {
        Graph.vertexCount=vertexCount;
        vertices=new ArrayList<>();
        edges=new node[vertexCount];        
        for(int i=0;i<vertexCount;i++)
        {
            vertices.add(i);            
            edges[i]=new node();
        }
    }
    public void addEdge(int source,int destination)
    {
        int i=vertices.indexOf(source);
        int j=vertices.indexOf(destination);
        if(i!=-1||j!=-1)
        {
            //node temp=edges[i];
            edges[i]=edges[i].insertatbegin(edges[i],destination);
            edges[j]=edges[j].insertatbegin(edges[j],source);
        }
    }
    public void printGraph()
    {
        for(int v=0;v< vertexCount;v++)
        {
            System.out.println("Adjacent list of vertex "+v);
            System.out.print("head");
            node temp=edges[v];
            while(temp.next!=null)
            {
                System.out.print("-> "+temp.data);
                temp=temp.next;
            }
            System.out.println("");
        }
    }
}
