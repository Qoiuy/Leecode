package P_463_岛屿的周长;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {

    public int islandPerimeter(int[][] grid) {

        Set<Grid> grids = new HashSet<>();

        for (int i = 0; i < grid.length; i++){
            for (int j =0; j < grid[i].length; j++){
                if (grid[i][j] == 1){
                    grids.add(new Grid(i, j));
                }
            }
        }

        if (grids.size() == 0){
            return  0;
        }

        int count = grids.size() * 4;

        for (Grid tmp : grids){
            if (grids.contains(new Grid(tmp.x + 1, tmp.y))){
                count -- ;
            }
            if (grids.contains(new Grid(tmp.x - 1, tmp.y))){
                count -- ;
            }if (grids.contains(new Grid(tmp.x, tmp.y + 1))){
                count -- ;
            }if (grids.contains(new Grid(tmp.x, tmp.y - 1))){
                count -- ;
            }

        }
        return count;
    }


    class Grid{
        int x;
        int y;

        public Grid(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Grid grid = (Grid) o;
            return x == grid.x &&
                    y == grid.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
