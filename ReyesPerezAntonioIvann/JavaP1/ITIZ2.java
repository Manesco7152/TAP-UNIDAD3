import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
class ITIZ2 {
public static void main(String[] args){
String URL = "jdbc:postgresql://localhost:5432/ITIZ_2";
String USER = "admin";
String PASS = "123456";
Connection connection = null;
Statement statement = null;
ResultSet resultset = null;
try {
connection = DriverManager.getConnection(URL, USER, PASS);
System.out.println("Exitosa"); 
statement = connection.createStatement();
String query = "select * from gestion_escolar.colores";
resultset = statement.executeQuery(query);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID: " + resultset.getInt("id"));
System.out.println("--Color: " + resultset.getString("nombre"));
System.out.println("--------------------------------------------------------------");
}
String query2 = "select * from gestion_escolar.usuarios";
resultset = statement.executeQuery(query2);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID: " + resultset.getInt("id"));
System.out.println("--Nombre: " + resultset.getString("nombre"));
System.out.println("--Color favorito: " + resultset.getInt("colores_id"));
System.out.println("--------------------------------------------------------------");
}
String query3 = "select * from gestion_escolar.estudiantes";
resultset = statement.executeQuery(query3);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID: " + resultset.getInt("id"));
System.out.println("--Nombre completo: " + resultset.getString("nombre"));
System.out.println("Edad: " + resultset.getInt("edad"));
System.out.println("--------------------------------------------------------------");
}
} catch (Exception e) {
System.out.println("Conexion fallida" + e);
}
}
}