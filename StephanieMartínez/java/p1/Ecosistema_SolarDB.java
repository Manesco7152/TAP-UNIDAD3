import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Ecosistema_SolarDB{

    public static void main(String []args){
            String  URL="jdbc:postgresql://localhost:5432/Ecosistema_SolarDB";
                String USER ="admin";
                String PASS="123456";
                Connection connection=null;
                Statement statement =null;
                ResultSet resultSet =null;
                try {
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.out.println("Exitosa");
                    statement = connection.createStatement();
                    String query = "select * from \"Fotosintesis\".planta";
                    resultSet=statement.executeQuery(query);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.print("id:"+ resultSet.getInt("id"));
                        System.out.println("nombre_cientifico:"+ resultSet.getString ("nombre_cientifico"));
                        System.out.println("id_sol:"+ resultSet.getInt ("id_sol"));
                    }

                    System.out.println("///////////////////////////////////////");
                    
                    System.out.println("Exitosa");
                    statement = connection.createStatement();
                    String query2= "select * from \"Fotosintesis\".\"Sol\"";
                    resultSet=statement.executeQuery(query2);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:"+ resultSet.getInt("id"));
                        System.out.println("Temperatura:"+ resultSet.getFloat ("Temperatura"));
                        System.out.println("luminosidad:"+ resultSet.getFloat ("luminosidad"));
                    }

                    System.out.println("///////////////////////////////////////");
                   
                    System.out.println("Exitosa");
                    statement = connection.createStatement();
                    String query3= "select * from \"Fotosintesis\".planta";
                    resultSet=statement.executeQuery(query3);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:"+ resultSet.getInt("id"));
                        System.out.println("nombre_cientifico:"+ resultSet.getString ("nombre_cientifico"));
                        System.out.println("Temperatura:"+ resultSet.getFloat ("Temperatura"));
                    }

                } catch (Exception e) {
                    System.out.println("Conexion fallida "+e);                    
                } 
                
            }
        }
