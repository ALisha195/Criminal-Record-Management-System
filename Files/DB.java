//For Link With MySQL


package criminaldatabase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Praveen
 */

public class DB {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/criminalrecord?allowPublicKeyRetrieval=true&useSSL=false";
            String user="root";
            String password="";
            con=DriverManager.getConnection(url, user, password);
        } catch(Exception e){
            System.out.println(e);
        }
        return con;
        
    }
}
