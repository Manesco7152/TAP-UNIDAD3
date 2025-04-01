import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Aerovuelos{

    public static void main(String []args){
            String  URL="jdbc:postgresql://localhost:5432/aerovuelos_db";
                String USER ="admin" ;
                String PASS="123456";
                Connection connection=null;
                Statement statement =null;
                ResultSet resultSet =null;
                try {
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query = "select * from \"ARVUELOS\".\"vuelo.rt\"";
                    resultSet=statement.executeQuery(query);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:   "+ resultSet.getInt("id"));
                        System.out.println("numero:   "+ resultSet.getString("numero"));
                        System.out.println("destino:  "+ resultSet.getString ("destino"));
                    }
                    System.out.println("////////////////////////////////////////////////////////////////");
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query2 = "select * from \"ARVUELOS\".\"vuelo.rt\"";
                    resultSet=statement.executeQuery(query2);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:"+ resultSet.getInt("id"));
                        System.out.println("fechasalida:"+ resultSet.getString("fechasalida"));
                        System.out.println("id_aerolinea:"+ resultSet.getString ("id_aerolinea"));
                    }
                    System.out.println("//////////////////////////////////////////////////////////////////");
                    connection =DriverManager.getConnection(URL,USER,PASS);
                    System.err.println("Exitosa");
                    statement = connection.createStatement();
                    String query3 = "select * from \"ARVUELOS\".\"Aerolinea.rt\"";
                    resultSet=statement.executeQuery(query3);
                    System.out.println ("resultSet:" + resultSet);
                    while (resultSet.next()){
                        System.out.println("id:"+ resultSet.getInt("id"));
                        System.out.println("nombre"+ resultSet.getString("nombre"));
                        System.out.println("pais_de_origen:"+ resultSet.getString ("pais_de_origen"));
                    }
                } catch (Exception e) {
                    System.out.println("Conexion fallida "+e);                    
                } 
                
            }
    }