
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Alpha{

    public static void main(String []args){
            String  URL="jdbc:postgresql://localhost:5432/alpha";
                String USER ="admin";
                String PASS="123456";
                Connection connection=null;
                Statement statement =null;
                ResultSet resultSet =null;
                try {
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query = "select * from escuela.alumnos";
                    resultSet=statement.executeQuery(query);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:"+ resultSet.getInt("id"));
                        System.out.println("nombre_alumnos:"+ resultSet.getString ("nombre_alumnos"));
                        System.out.println("grupos__id:"+ resultSet.getInt ("grupos__id"));
                    }
                    System.out.println("//////////////////////////////////////");
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query2 = "select * from escuela.docentes";
                    resultSet=statement.executeQuery(query2);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:"+ resultSet.getInt("id"));
                        System.out.println("nombre_docente:"+ resultSet.getString ("nombre_docente"));
                        System.out.println("rfc:"+ resultSet.getString ("rfc"));
                    }
                    System.out.println("////////////////////////////////////////");
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query3 = "select * from escuela.materias";
                    resultSet=statement.executeQuery(query3);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:"+ resultSet.getInt("id"));
                        System.out.println("nombre_materia:"+ resultSet.getString ("nombre_materia"));
                        System.out.println("docentes_id:"+ resultSet.getInt ("docentes_id"));
                    }
                } catch (Exception e) {
                    System.out.println("Conexion fallida "+e);                    
                } 
                
            }
        }