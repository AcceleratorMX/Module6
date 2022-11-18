package src.singletone;

public class DatabaseConnection {

    private static final DatabaseConnection connection = new DatabaseConnection();

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        return connection;
    }
}

class DatabaseConnectionTest {
    public static void main(String[] args) {
        System.out.println(DatabaseConnection.getInstance());
        System.out.println(DatabaseConnection.getInstance());
        System.out.println(DatabaseConnection.getInstance());
        System.out.println(DatabaseConnection.getInstance());
    }
}
