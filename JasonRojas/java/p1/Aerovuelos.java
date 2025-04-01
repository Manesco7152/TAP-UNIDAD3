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
                } catch (Exception e) {
                    System.out.println("Conexion fallida "+e);                    
                } 
                
            }
    }