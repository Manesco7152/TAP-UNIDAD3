import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
class EscSec249 {
public static void main(String[] args){
String URL = "jdbc:postgresql://localhost:5432/EscSec 249 Alpha";
String USER = "admin";
String PASS = "123456";
Connection connection = null;
Statement statement = null;
ResultSet resultset = null;
try {
connection = DriverManager.getConnection(URL, USER, PASS);
System.out.println("Exitosa"); 
statement = connection.createStatement();
String query = "select * from gestion_escolar.materias";
resultset = statement.executeQuery(query);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID de la materia: " + resultset.getInt("id"));
System.out.println("--Materia: " + resultset.getString("nombremat"));
System.out.println("--------------------------------------------------------------");
}
String query2 = "select * from gestion_docente.grupos";
resultset = statement.executeQuery(query2);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID del grupo: " + resultset.getInt("id"));
System.out.println("--Grupo: " + resultset.getString("nombreg"));
System.out.println("--------------------------------------------------------------");
}
String query3 = "select * from gestion_docente.maestros";
resultset = statement.executeQuery(query3);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID del profesor: " + resultset.getInt("id"));
System.out.println("--Nombre del profesor: " + resultset.getString("nombre"));
System.out.println("--Formacion académica: " + resultset.getString("formacion_academica"));
System.out.println("--Correo electrónico: " + resultset.getString("correo"));
System.out.println("--Celular: " + resultset.getString("numero_celular"));
System.out.println("--Grupo asignado: " + resultset.getInt("grupoasignado_id"));
System.out.println("--ID de la materia que impartira: " + resultset.getInt("materiaasignada_id"));
System.out.println("--Numero de control: " + resultset.getInt("numero_control"));
System.out.println("--------------------------------------------------------------");
}
String query4 = "select * from gestion_escolar.alumnos";
resultset = statement.executeQuery(query4);
System.out.println("resultset: " + resultset);
while (resultset.next()) {
System.out.println("--ID del alumno: " + resultset.getInt("id"));
System.out.println("--Nombre del alumno: " + resultset.getString("nombre_alumno"));
System.out.println("--Edad: " + resultset.getInt("edad"));
System.out.println("--CURP: " + resultset.getString("curp"));
System.out.println("--Grupo asignado: " + resultset.getInt("grupo_id"));
System.out.println("--Profesor asignado: " + resultset.getInt("profesor_id"));
System.out.println("--------------------------------------------------------------");
}
} catch (Exception e) {
System.out.println("Conexion fallida" + e);
}
}
}