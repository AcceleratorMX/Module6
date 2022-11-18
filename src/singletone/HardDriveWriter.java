package src.singletone;

public class HardDriveWriter {

    private static HardDriveWriter writer = new HardDriveWriter();

    private HardDriveWriter(){
        System.out.println("Created object of class HardDriveWriter");
    }

    public static HardDriveWriter getInstance(){
        return writer;
    }
}

class HardDriveWriterTest {
    public static void main(String[] args) {
        System.out.println(HardDriveWriter.getInstance());
        System.out.println(HardDriveWriter.getInstance());
        System.out.println(HardDriveWriter.getInstance());
        System.out.println(HardDriveWriter.getInstance());
    }
}
