package src.HomeWork.h16;

class Level {
    private String test;

    public Level(String test) {
        this.test = test;
    }


    @Override
    public String toString() {
        return "Quarke level, name is " + test;
    }
}

class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}
