import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ITIZcon {

	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/ITIZ";
        String USER = "admin";
        String PASS = "123456";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Exitosa");
            statement = connection.createStatement();
            String query = "select * from gestion_escolar.estudiantes";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "no_control: " + resultSet.getString("no_control") + "|" + "nombre: " + resultSet.getString("name") + "|" + "carrera: " + resultSet.getString("carrera") + "|" + "edad: " + resultSet.getString("edad") + "|" + "semestre: " + resultSet.getString("semestre") + "|" + "correo: " + resultSet.getString("email"));
            }
            System.out.println("----------------------------------------------------------------");
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
            String query2 = "select * from direccion.directivos";
            resultSet = statement.executeQuery(query2);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "nombre: " + resultSet.getString("name") + "|" + "departamento: " + resultSet.getString("departamento") + "|" + "correo: " + resultSet.getString("email_institucional") + "|");
            }
            System.out.println("----------------------------------------------------------------");
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
            String query3 = "select * from gestion_escolar.estudiantes order by edad desc";
            resultSet = statement.executeQuery(query3);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "no_control: " + resultSet.getString("no_control") + "|" + "nombre: " + resultSet.getString("name") + "|" + "carrera: " + resultSet.getString("carrera") + "|" + "edad: " + resultSet.getString("edad") + "|" + "semestre: " + resultSet.getString("semestre") + "|" + "correo: " + resultSet.getString("email"));
            }
		} catch (Exception e) {
            System.out.println("Fallida" + e);
        }
    }
}