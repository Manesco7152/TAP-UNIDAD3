import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Practica_EmanuelEcon {

	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/Practica_EmanuelE";
        String USER = "admin";
        String PASS = "123456";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Exitosa");
            statement = connection.createStatement();
            String query = "select * from \"Gestion_escolar\".\"alumnos_EmanuelE\"";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "nombre: " + resultSet.getString("nombre") + "|" + "edad: " + resultSet.getString("edad") + "|" + "carrera: " + resultSet.getString("carrera") + "|" + "no_control: " + resultSet.getString("no_control") + "|" + "correo: " + resultSet.getString("correo") + "|" + "activo: " + resultSet.getString("activo") + "|" + "semestre: " + resultSet.getString("semestre") + "|");
            }
            System.out.println("----------------------------------------------------------------");
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
            String query2 = "select * from \"Gestion_escolar\".\"materias_EmanuelE\"";
            resultSet = statement.executeQuery(query2);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "nombre de la materia: " + resultSet.getString("nombre_materia") + "|" + "semestre: " + resultSet.getString("semestre") + "|" + "carrera: " + resultSet.getString("carrera") + "|" + "activo: " + resultSet.getString("activo") + "|");
            }
            System.out.println("----------------------------------------------------------------");
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
            String query3 = "select * from \"Gestion_escolar\".\"alumnos_EmanuelE\"where edad > 18";
            resultSet = statement.executeQuery(query3);
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id") + "|" + "nombre: " + resultSet.getString("nombre") + "|" + "edad: " + resultSet.getString("edad") + "|" + "carrera: " + resultSet.getString("carrera") + "|" + "no_control: " + resultSet.getString("no_control") + "|" + "correo: " + resultSet.getString("correo") + "|" + "activo: " + resultSet.getString("activo") + "|" + "semestre: " + resultSet.getString("semestre") + "|");
            }
		} catch (Exception e) {
            System.out.println("Fallida" + e);
        }
    }
}