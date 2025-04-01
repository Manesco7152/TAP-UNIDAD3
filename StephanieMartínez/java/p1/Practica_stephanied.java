import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Practica_stephanied{

    public static void main(String []args){
            String  URL="jdbc:postgresql://localhost:5432/practica_stephanied";
                String USER ="admin" ;
                String PASS="123456";
                Connection connection=null;
                Statement statement =null;
                ResultSet resultSet =null;
                try {
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.out.println("Exitosa");
                    statement = connection.createStatement();
                    String query = "select * from \"Gestion_escolar\".\"Alumnos_Stephanied\"";
                    resultSet=statement.executeQuery(query);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println ("id:"+ resultSet.getInt("id"));
                        System.out.println("nombre:"+ resultSet.getString ("nombre"));
                        System.out.println("edad:"+ resultSet.getInt ("edad"));
                        System.out.println("semestre:"+ resultSet.getString ("semestre"));
                    }
                    System.out.println("/////////////////////////////////");
                    statement = connection.createStatement();
                    String query2 = "select * from \"Gestion_escolar\".\"Alumnos_Stephanied\"";
                    resultSet=statement.executeQuery(query2);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println ("id:"+ resultSet.getInt("id"));
                        System.out.println("no_control:"+ resultSet.getString ("no_control"));
                        System.out.println("carrera:"+ resultSet.getString ("carrera"));
                        System.out.println("correo:"+ resultSet.getString ("correo"));
                    }
                    System.out.println("/////////////////////////////////////");
                    statement = connection.createStatement();
                    String query3 = "select * from \"Gestion_escolar\".\"Alumnos_Stephanied\"";
                    resultSet=statement.executeQuery(query3);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println ("id:"+ resultSet.getInt("id"));
                        System.out.println("no_control:"+ resultSet.getString ("no_control"));
                        System.out.println("carrera:"+ resultSet.getString ("carrera"));
                        System.out.println("correo:"+ resultSet.getString ("correo"));
                    }
                    
                } catch (Exception e) {
                    System.out.println("Conexion fallida "+e);                    
                } 
                
            }
    }