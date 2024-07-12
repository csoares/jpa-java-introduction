package mysql;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class TestingMySQL {
    Connection connection = null;

    public Connection getConnection() {

        String dbURL = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "secret";

        try {
            connection = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            System.out.println("Connection failed: " + ex.getMessage());
        }

        return connection;
    }

    public void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println("Failure to close: " + ex.getMessage());
        }
    }


    public List<User> getUsers() throws SQLException {

        List<User> users = new LinkedList<>();

        // CREATING A STATEMENT
        Statement statement = connection.createStatement();

        // CREATIING A QUERY
        String query = "SELECT * FROM User";

        // EXECUTING THE QUERY
        ResultSet resultSet = statement.executeQuery(query);

        // DEALING WITH THE RESULTS
        while(resultSet.next()){
            String firstName = resultSet.getString("firstname");
            String lastName = resultSet.getString("lastname");
            String email = resultSet.getString("email");

            users.add(new User(firstName, lastName, email));
        }

        return users;
    }



}
