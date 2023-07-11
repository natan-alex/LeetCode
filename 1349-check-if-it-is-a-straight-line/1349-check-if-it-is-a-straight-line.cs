public class Solution {
    public bool CheckStraightLine(int[][] coordinates) {
        if (coordinates.Length <= 2) return true;

        int p1p0dx = coordinates[1][0] - coordinates[0][0];
        int p1p0dy = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.Length; ++i) {
            int dx = coordinates[i][0] - coordinates[0][0];
            int dy = coordinates[i][1] - coordinates[0][1];

            if ((p1p0dy * dx) != (p1p0dx * dy)) return false;
        }

        return true;
    }
}