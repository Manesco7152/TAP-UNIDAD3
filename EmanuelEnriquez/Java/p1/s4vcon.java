import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class s4vcon {

	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/s4v";
        String USER = "admin";
        String PASS = "123456";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Exitosa");
            statement = connection.createStatement();
            String query = "select * from \"TAP\".estudiantes";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "nombre: " + resultSet.getString("name") + "|" + "edad: " + resultSet.getString("age") + "|" + "materia: " + resultSet.getString("asignature") + "|" + "color favorito: " + resultSet.getString("color") + "|");
            }
            System.out.println("----------------------------------------------------------------");
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
            String query2 = "select * from \"TAP\".estudiantes order by age asc";
            resultSet = statement.executeQuery(query2);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "nombre: " + resultSet.getString("name") + "|" + "edad: " + resultSet.getString("age") + "|" + "materia: " + resultSet.getString("asignature") + "|" + "color favorito: " + resultSet.getString("color") + "|");
            }
            System.out.println("----------------------------------------------------------------");
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
            String query3 = "select * from \"TAP\".estudiantes order by age desc";
            resultSet = statement.executeQuery(query3);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "nombre: " + resultSet.getString("name") + "|" + "edad: " + resultSet.getString("age") + "|" + "materia: " + resultSet.getString("asignature") + "|" + "color favorito: " + resultSet.getString("color") + "|");
            }
		} catch (Exception e) {
            System.out.println("Fallida" + e);
        }
    }
}