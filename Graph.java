public class Graph {
    private int adjmatrix[][];
    private String cities[];
    private int vertices;
    Graph(int vertices) {
        this.vertices = vertices;
        adjmatrix = new int[vertices][vertices];
        cities = new String[vertices];
    }
    public void addVertex(String city) {
        int newmatrix[][] = new int[vertices+1][vertices+1];
        String newcities[] = new String[vertices+1];
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                newmatrix[i][j]=adjmatrix[i][j];
            }
            newcities[i]=cities[i];
        }
        adjmatrix=newmatrix;
        cities=newcities;
        cities[vertices]=city;
        vertices++;
        System.out.println("vertex added"+city);
    }
    public void deleteVertex(int vertex) {
        if(vertex<0 || vertex>=vertices){
            System.out.println("Invalid vertex");
            return;
        }
        int newmatrix[][]=new int[vertices-1][vertices-1];
        String newcities[]=new String[vertices-1];
        for(int i=0,ni=0;i<vertices;i++){
            if(i==vertex)
                continue;
            for(int j=0,nj=0;j<vertices;j++){
                if(j==vertex)
                    continue;
                newmatrix[ni][nj++]=adjmatrix[i][j];
            }
            newcities[ni++]=cities[i];

        }
        adjmatrix=newmatrix;
        cities=newcities;
        vertices--;
    }
    public void addEdge(int src,int dest) {
        if(src<0 || src>=vertices || dest<0 || dest>=vertices ){
            System.out.println("Invalid edge");
        }
        adjmatrix[src][dest]=1;
        adjmatrix[dest][src]=1;
        System.out.println("edge added between"+cities[src]+" and"+cities[dest]);
    }
    public void deleteEdge(int src,int dest) {
        if(src<0 || src>=vertices || dest<0 || dest>=vertices ){
            System.out.println("Invalid edge");
        }
        adjmatrix[src][dest]=0;
        adjmatrix[dest][src]=0;
        System.out.println("edge deleted from"+cities[src]+" and"+cities[dest]);
    }
    public void printMap() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(cities[i] + " -> ");
            for (int j = 0; j < vertices; j++) {
                if (adjmatrix[i][j] == 1) {
                    System.out.print(cities[j] + " ");
                }
            }
            System.out.println();
        }
    }
    public void dfs(int start){
        if(start<0 || start>=vertices){
            return;
        }
        boolean visited[]=new boolean[vertices];
        dfshelper(start,visited);
    }
    public void dfshelper(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(cities[v]+" ");
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                if(adjmatrix[v][j]==1 && !visited[j]){
                    dfshelper(j,visited);
                }
            }
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(0);

        graph.addVertex("Lahore");
        graph.addVertex("Karachi");
        graph.addVertex("Islamabad");
        graph.addVertex("Peshawar");

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);

        graph.printMap();
        graph.dfs(0);
    }
}
