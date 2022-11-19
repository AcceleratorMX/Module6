package src.HomeWork.h15;

import java.util.Arrays;

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int x = 0, y = 0;
        int difX = Math.abs(targets[0][0] - aiCoords[0]);
        int difY = Math.abs(targets[0][1] - aiCoords[1]);
        for (int i = 1; i < targets.length; i++) {
            int LocalDifX = Math.abs(targets[i][0] - aiCoords[0]);
            int LocalDifY = Math.abs(targets[i][1] - aiCoords[1]);
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
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
