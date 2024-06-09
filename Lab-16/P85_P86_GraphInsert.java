import java.util.*;
import java.util.Queue;

public class P85_P86_GraphInsert {

    static Map<Character, List<Character>> adjList = new HashMap<>();
    static Map<Character, Boolean> visiteddfs = new HashMap<>();


    static class Node{
        Character val;
        ArrayList<Character> link;

        Node(char value, int n)
        {
            this.val = value;
            link  = new ArrayList<>();
        }
    }

    static void edge(char u, char v, Boolean dir)
    {
        if(!adjList.containsKey(u))
        {
            adjList.put(u, new ArrayList<Character>());
        }

        adjList.get(u).add(v);

        if(!dir)
        {
            if(!adjList.containsKey(v))
            {
                adjList.put(v, new ArrayList<>());
            }

            adjList.get(v).add(u);
        }
    }

    public static void DFS(char root)
    {
        visiteddfs.put(root, true);
        System.out.print(root+ ", ");

        for(Character next : adjList.getOrDefault(root, new ArrayList<Character>()))
        {
            if(!visiteddfs.getOrDefault(next, false))
            {
                DFS(next);
            }
        }
    }

    public static void BFS(char root)
    {
        Queue<Character> queue = new LinkedList<>();
        Map<Character, Boolean> visitedbfs = new HashMap<>();

        queue.add(root);
        visitedbfs.put(root, true);

        while (!queue.isEmpty()) {
            char frontNode = queue.poll();
            System.out.print(frontNode + ",");

            for (char neighbor : adjList.get(frontNode)) {
                if (!visitedbfs.getOrDefault(neighbor, false)) {
                    queue.add(neighbor);
                    visitedbfs.put(neighbor, true);
                }
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P85_P86_GraphInsert gi = new P85_P86_GraphInsert();

        System.out.println("Enter number of nodes : ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        Node[] x = new Node[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter node value : ");
            x[i] = new Node(sc.next().charAt(0), n);
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();

                if(mat[i][j] == 1)
                {
                    edge(x[i].val, x[j].val, false);
                }
            }
        }

        System.out.println("1. DFS :\n2. BFS :");
        int c = sc.nextInt();

        switch(c)
        {
            case 1 : 
            gi.DFS(x[0].val);
            break;

            case 2 :
            gi.BFS(x[0].val);
            break;
        }
    }
}
