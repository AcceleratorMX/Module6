package src.HomeWork.h15;

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int x = 0, y = 0;
        int difX = Math.abs(targets[0][0] - aiCoords[0]);
        int difY = Math.abs(targets[0][1] - aiCoords[1]);
        for (int i = 1; i < targets.length; i++) {
            int LocalDifX = Math.abs(targets[i][0] - aiCoords[0]);
            int LocalDifY = Math.abs(targets[i][0] - aiCoords[0]);
            if ((LocalDifX + LocalDifY) < (difX + difY)) {
                difX = LocalDifX;
                difY = LocalDifY;
                x = targets[i][0];
                y = targets[i][1];
            }
        }
        return new int[] {x, y};
    }

}
