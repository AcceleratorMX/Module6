package src.HomeWork.h13;


import java.util.Arrays;
import java.util.Objects;

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}

class QuarkeTrack {
    private int lines;


    public QuarkeTrack(int[] lines) {
        int sum = 0;
        for (int i=0;i < lines.length;i++){
            sum = sum+lines[i];
        }
        this.lines = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack quarkeTrack = (QuarkeTrack) o;
        return  lines == quarkeTrack.lines;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lines);
    }
}