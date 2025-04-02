import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
class CineDB {
public static void main(String[] args){
String URL = "jdbc:postgresql://localhost:5432/CineDB";
String USER = "admin";
String PASS = "123456";
Connection connection = null;
Statement statement = null;
ResultSet resultset = null;
try {
connection = DriverManager.getConnection(URL, USER, PASS);
System.out.println("Exitosa"); 
statement = connection.createStatement();
String query = "select * from peliculas.pelicula";
resultset = statement.executeQuery(query);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID: " + resultset.getInt("id"));
System.out.println("--Pelicula: " + resultset.getString("nombre"));
System.out.println("--Año de estreno: " + resultset.getInt("año"));
System.out.println("--Genero: " + resultset.getString("genero"));
}
String query2 = "select * from peliculas.actores";
resultset = statement.executeQuery(query2);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--Actor: " + resultset.getString("nombre"));
System.out.println("--Fecha de nacimiento: " + resultset.getString("fecha_nacimiento"));
}
String query3 = "select * from peliculas.actores";
resultset = statement.executeQuery(query3);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--Nombre del actor: " + resultset.getString("nombre"));
System.out.println("--ID de la pelicula en la cual participa: " + resultset.getInt("pelicula_id"));
}
} catch (Exception e) {
System.out.println("Conexion fallida" + e);
}
}
}