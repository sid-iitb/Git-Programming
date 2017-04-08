package List_Old;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sidhartha
 */
class Vertex {

    public char label;
    public boolean visited;

    public Vertex(char lab) {
        label = lab;
        visited = false;
    }
}

public class Graph {

    static Vertex vertices[];
    static int maxVertex = 20;
    static int nodeNum;
    static node[] edges;
    static int[] edgeslength;
    static int vertexCount;

    public Graph() {
        vertexCount = 0;
        nodeNum = 1;
        //Graph.vertexCount=vertexCount;
        vertices = new Vertex[maxVertex];
        edges = new node[maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            //vertices.add(i);            
            edges[i] = new node();
        }
    }

    public void addVertex(char lab) {
        vertices[vertexCount++] = new Vertex(lab);
    }

    public void displayVertex() {
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[i].label + "  ");
        }
        System.out.println("");

    }

    public void addEdge(char source, char destination) {
        int i = 0, j = 0;
        while (vertices[i].label != source) {
            i = i + 1;
        }
        while (vertices[j].label != destination) {
            j++;
        }
        //System.out.println(i+"   "+j);
        /*Arrays.sort(vertices);
         int i=Arrays.binarySearch(vertices, source);
         int j=Arrays.binarySearch(vertices, destination);*/
        if (i != -1 || j != -1) {
            //node temp=edges[i];
            edges[i] = edges[i].insertatbegin(edges[i], (int) destination);
            edges[j] = edges[j].insertatbegin(edges[j], (int) source);
        }
    }

    public void addDEdge(char source, char destination) {
        int i = 0, j = 0;
        while (vertices[i].label != source) {
            i = i + 1;
        }
        //System.out.println(i+"   "+j);
        /*Arrays.sort(vertices);
         int i=Arrays.binarySearch(vertices, source);
         int j=Arrays.binarySearch(vertices, destination);*/
        if (i != -1) {
            //node temp=edges[i];
            edges[i] = edges[i].insertatbegin(edges[i], (int) destination);
            //edges[j]=edges[j].insertatbegin(edges[j],(int)source);
        }
    }

    public void addWDEdge(char source, char destination, int weight) {
        int s = 0, j = 0;
        while (vertices[s].label != source) {
            s = s + 1;
        }
        //System.out.println(i+"   "+j);
        /*Arrays.sort(vertices);
         int i=Arrays.binarySearch(vertices, source);
         int j=Arrays.binarySearch(vertices, destination);*/
        if (s != -1) {
            //node temp=edges[i];
            edges[s] = edges[s].insertatbegin(edges[s], (int) destination, weight);
            //edges[j]=edges[j].insertatbegin(edges[j],(int)source);
        }
    }

    public void addWEdge(char source, char destination, int weight) {
        int i = 0, j = 0;
        while (vertices[i].label != source) {
            i = i + 1;
        }
        while (vertices[j].label != destination) {
            j++;
        }
        //System.out.println(i+"   "+j);
        /*Arrays.sort(vertices);
         int i=Arrays.binarySearch(vertices, source);
         int j=Arrays.binarySearch(vertices, destination);*/
        if (i != -1 || j != -1) {
            //node temp=edges[i];
            edges[i] = edges[i].insertatbegin(edges[i], (int) destination, weight);
            edges[j] = edges[j].insertatbegin(edges[j], (int) source, weight);
        }
    }

    public void sortVertexList() {

        //edges[1].display(edges[1]);
        for (int i = 0; i < vertexCount; i++) {
            edges[i] = edges[i].deleteLastNode(edges[i]);
            edges[i] = node.sort(edges[i]);
        }

        //edges[4].display(edges[4]);

        //edges[4].display(edges[4]);
        //System.exit(0);
        //edges[1].display(edges[1]);
        //edges[1].display(edges[4]);
        //SortLinkedList.sort(edges[4]);
        //edges[1].display(edges[4]);
        /*for(int i=0;i<vertexCount;i++)
         {
         SortLinkedList.sort(edges[i]);
         }*/
    }

    public void printGraph() {
        //System.out.println(vertexCount+" "+edges.length);
        for (int v = 0; v < vertexCount; v++) {
            System.out.println("Adjacent list of vertex " + vertices[v].label);
            System.out.print("head");
            node temp = edges[v];
            while (temp != null) {
                System.out.print("-> " + (char) temp.data + "(" + temp.flag + ")");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public void depthFirstSearch(int start) {
        vertices[start].visited = true;
        Stack<Integer> s = new Stack<Integer>();
        s.push(start);
        System.out.print(" --> " + vertices[start].label + "(" + nodeNum + ")");
        nodeNum++;
        while (!s.isEmpty()) {
            int i = vertexUnvisited(s.peek());
            if (i == -1) {
                int d = s.pop();
                System.out.print("-" + "(" + vertices[d].label + "-" + nodeNum + ")");
                nodeNum++;
            } else {
                vertices[i].visited = true;
                System.out.print(" --> " + vertices[i].label + "(" + nodeNum + ")");
                nodeNum++;
                s.push(i);
            }
        }
        for (int i = 0; i < vertexCount; i++) {
            if (vertices[i].visited == false) {
                depthFirstSearch(i);
            }
        }
        System.out.println("");
        allFalse();
    }

    public void allFalse() {
        for (int i = 0; i < vertexCount; i++) {
            vertices[i].visited = false;
        }
    }

    public int vertexUnvisited(int vertex) {
        //vertices[7].visited=true;
        //vertices[2].visited=true;
        //vertices[0].visited=true;
        node temp = edges[vertex];
        while (temp != null) {
            int i = 0;
            while (vertices[i].label != (char) temp.data) {
                i = i + 1;
            }
            if (!vertices[i].visited) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void breadthFirstSearch(int vertex) {
        vertices[vertex].visited = true;
        Queue<Integer> queue = new LinkedList();
        queue.add(vertex);
        int i = 1;
        System.out.print(" --> " + vertices[queue.peek()].label + "(0)");
        int x;
        while (!queue.isEmpty()) {
            int y = queue.poll();
            while ((x = vertexUnvisited(y)) != -1) {
                vertices[x].visited = true;
                System.out.print(" --> " + vertices[x].label + "(" + i + ")");
                queue.add(x);
            }
            i++;
        }
        System.out.println("");
        allFalse();
    }
}
