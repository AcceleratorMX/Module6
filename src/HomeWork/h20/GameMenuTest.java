package src.HomeWork.h20;

class GameMenu {
    void act(MenuItem item) {
        System.out.println(item.getAction());
    }
    static abstract class MenuItem {
        abstract String getAction();
    }
    static class Start extends GameMenu.MenuItem {

        @Override
        String getAction() {
            return "start";
        }
    }
    static class Options extends GameMenu.MenuItem {
        @Override
        String getAction() {
            return "options";
        }
    }
    static class Exit extends GameMenu.MenuItem {
        @Override
        String getAction() {
            return "exit";
        }
    }
}
class Start extends GameMenu.MenuItem {

    @Override
    String getAction() {
        return "start";
    }
}
class Options extends GameMenu.MenuItem {
    @Override
    String getAction() {
        return "options";
    }
}
class Exit extends GameMenu.MenuItem {
    @Override
    String getAction() {
        return "exit";
    }
}


class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}