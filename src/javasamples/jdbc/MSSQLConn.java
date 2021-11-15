package javasamples.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSSQLConn {
    public static Connection  create(String server,String port,String database,String username,String password){
    	Connection connection = null;
        //System.out.println(server);
        
        try {
        	
        //String driverName = "com.microsoft.jdbc.sqlserver.SQLServerDriver"; // NetDirect JDBC driver
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // NetDirect JDBC driver
        //String serverName = "127.0.0.1";
       // String portNumber = "1433";
        //String mydatabase = server + ":" + port;
        //String url = "jdbc:microsoft:sqlserver://"+server+":"+port+";databasename="+database+";username="+username+";password="+password+";SelectMethod=cursor"; 
        String url = "jdbc:sqlserver://"+server+":"+port+";databasename="+database+";username="+username+";password="+password+";SelectMethod=cursor;"; 
        //Integrated Security=SSPI;Persist Security Info=False;Encrypt=True

        // Load the JDBC driver
        Class.forName(driverName);
        // Create a connection to the database
        connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
        // Could not find the database driver
        	//System.out.println(e.getMessage());
        	e.printStackTrace();
        }
     return connection;
    }
    public static void  close(Connection con){
    	try {
			con.close();
		} catch (SQLException e) {
			System.out.print("Can Not Colse Connections...");
		}
    	
    }


}
