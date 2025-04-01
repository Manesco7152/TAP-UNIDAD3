import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Gestion_escolar{

    public static void main(String []args){
            String  URL="jdbc:postgresql://localhost:5432/practica_jasonr";
                String USER ="admin" ;
                String PASS="123456";
                Connection connection=null;
                Statement statement =null;
                ResultSet resultSet =null;
                try {
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query = "select * from \"Gestion_escolar\".\"materias_JasonR\"";
                    resultSet=statement.executeQuery(query);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:   "+ resultSet.getInt("id"));
                        System.out.println("carrera:   "+ resultSet.getString("carrera"));
                        System.out.println("materia:  "+ resultSet.getString ("nombre_materia"));
                    }
                    System.out.println("/////////////////////////////////////////////////////////////////////");
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query2 = "select * from \"Gestion_escolar\".\"Alumnos_JasonR\"";
                    resultSet=statement.executeQuery(query2);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:   "+ resultSet.getInt("id"));
                        System.out.println("nombre:"+ resultSet.getString("nombre"));
                        System.out.println("correo:"+ resultSet.getString ("correo"));
                        System.out.println("carrera:"+ resultSet.getString ("carrera"));
                    }
                    System.out.println("/////////////////////////////////////////////////////////////////////");
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query3 = "select * from \"Gestion_escolar\".\"materias_JasonR\"";
                    resultSet=statement.executeQuery(query3);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:   "+ resultSet.getInt("id"));
                        System.out.println("activo:"+ resultSet.getString("activo"));
                        System.out.println("semestre:"+ resultSet.getString ("semestre"));
                        System.out.println("carrera:"+ resultSet.getString ("carrera"));
                    }
                } catch (Exception e) {
                    System.out.println("Conexion fallida "+e);                    
                } 
                
            }
    }