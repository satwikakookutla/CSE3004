import java.util.*;
public class Graph
{
     private static int infinite = 9999999;
     int[][]  LinkCost; 
     int      num_nodes;  
    Graph(int[][] mat)
    {
        int i, j;
        num_nodes = mat.length;
        LinkCost = new int[num_nodes][num_nodes];
        for ( i=0; i < num_nodes; i++)
        {
            for ( j=0; j < num_nodes; j++)
            {
                LinkCost[i][j] = mat[i][j];
 
                if ( LinkCost[i][j] == 0 )
                    LinkCost[i][j] = infinite;
            }
        }
    }
    public int unReached(boolean[] r)
    {
        boolean done = true;
 
        for ( int i = 0; i < r.length; i++ )
            if ( r[i] == false )
                return i;
 
        return -1;
    }
    public void Prim( )
    {
        int i, j, k, x, y;
        boolean[] Reached = new boolean[num_nodes]; // array to keep track of the reached nodes
        int[] predNode = new int[num_nodes];        // array to maintain min cost edge
        Reached[0] = true;
        
        for ( k = 1; k < num_nodes; k++ )
        {
            Reached[k] = false;
        }
        predNode[0] = 0;      
        printCoveredNodes( Reached );
        for (k = 1; k < num_nodes; k++)
        {
            x = y = 0;
                for ( i = 0; i < num_nodes; i++ )
                for ( j = 0; j < num_nodes; j++ )
                {
                if ( Reached[i] && !Reached[j] &&
                            LinkCost[i][j] < LinkCost[x][y] )
                    {
                        x = i;
                        y = j;
                    }
                }
                System.out.println("Next selected edge: (" +
                    + x + "," +
                    + y + ")" +
                    " cost = " + LinkCost[x][y]);
             predNode[y] = x;          
            Reached[y] = true;
            printCoveredNodes( Reached );
       System.out.println();
        }
       printMinCostEdges( predNode );
    }
   void printMinCostEdges( int[] a )
    {
 System.out.println("Edges in MST: ");
        for ( int i = 0; i < num_nodes; i++ )
            System.out.println( a[i] + " --> " + i );
    }
void printCoveredNodes(boolean[] Reached )
    {
        System.out.print("Covered Nodes = ");
        for (int i = 0; i < Reached.length; i++ )
            if ( Reached[i] )
                System.out.print( i + " ");
        System.out.println();
    }
}
