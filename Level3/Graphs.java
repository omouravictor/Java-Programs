package Level3;

import java.util.ArrayList;
import java.util.List;

public class Graphs {

    private int[][] graphMatrix = {{0, 1, 0, 0, 1}, {1, 0, 1, 1, 1},
    {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}};

    public boolean areNeighbors(int v1, int v2) {
        if (v1 >= 1 && v1 <= 5 && v2 >= 1 && v2 <= 5) {
            return graphMatrix[v1 - 1][v2 - 1] == 1;
        }
        return false;
    }

    public List getNeighborsList(int v) {
        List neighborsList = new ArrayList();
        if (v >= 1 && v <= 5) {
            for (int j = 0; j < 5; j++) {
                if (graphMatrix[v - 1][j] == 1) {
                    neighborsList.add(j + 1);
                }
            }
        }
        return neighborsList;
    }

}
