package src.HomeWork.h10;

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}

class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Distance() {
    }

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        double res;
        int rasX = endX - startX;
        int rasY = endY - startY;
        res = Math.sqrt(rasX*rasX + rasY*rasY);
        return (int) Math.round(res);
    }
}