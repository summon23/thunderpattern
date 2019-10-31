package Problem;

public class NumberOfIsland {
    final static int[] offsets = {-1, 0, +1};

    static boolean neighborExists(int[][] matrix,  int i, int j) {
        if ((i >= 0) && (i < matrix.length) && (j >= 0) && (j < matrix[0].length)) {
            if (matrix[i][j] == 1) {
                return true;
            }
        }

        return false;
    }

    private static void runDFS(int[][] matrix, int i, int j, boolean[][] visitedNode) {
        if (visitedNode[i][j]) return;

        // Set to visited
        visitedNode[i][j] = true;

        int xOffset, yOffset;
        for (int k = 0; k < offsets.length; k++) {
            xOffset = offsets[k];
            for (int l = 0; l < offsets.length; l++) {
                yOffset = offsets[l];
                if (xOffset == 0 && yOffset == 0) {
                    continue;
                }

                // check if there exists a vertex at this offset and check if it is '1'
                if (neighborExists(matrix, i + xOffset, j + yOffset)) {
                    runDFS(matrix, i + xOffset, j + yOffset, visitedNode);
                }
            }
        }
    }

    private static int findNumberOfCluster(int[][] matrix) {
        boolean[][] visitedNode = new boolean[matrix.length][matrix[0].length];
        int numIsland = 0;

        // Run checking for every nodes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // If 1 then island found
                if (matrix[i][j] == 1 && !visitedNode[i][j]) {
                    numIsland++;
                    // run DFS for checking neighbord node of the island
                    runDFS(matrix, i, j, visitedNode);
                }
            }
        }

        return numIsland;
    }


    public static void main(String[] args) {
        int[][] matrixMaps = {
                {1, 1, 1, 1, 1},
                {1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1},
        };

        int numIsland = findNumberOfCluster(matrixMaps);
        System.out.println(numIsland);
    }
}
