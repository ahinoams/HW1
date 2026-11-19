public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {return 0;}
        int n = m.length;
        int [] distance = new int[n];  //distance from i
        for (int a = 0; a < n; a++) {distance[a] = -1;}
        distance[i] = 0;
        for (int d = 1; d < n; d++) {  //for every possible distance
            for (int r = 0; r < n; r++) {
                if (distance[r] == d - 1){  //finding new nodes with distance d from i
                    for (int c = 0; c < n; c++) {
                        if (m[r][c] == 1) {
                            if (distance[c] == -1) {distance[c] = d;}  //discovered a new node
                            if (c == j) {return d;}  //if we found j, we finished! :)
                        }
                    }
                }
            }
        } 

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}