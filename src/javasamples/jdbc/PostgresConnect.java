package javasamples.jdbc;



import java.sql.*;

public class PostgresConnect{
  public static void main(String[] args) {
	  Connection conn = null;
	  Statement st = null;
	  ResultSet rs = null;

	  
	  
	  		System.out.println("Postgres Connect Example.");
		  	
		  	String url = "jdbc:postgresql://localhost:5432/";
		  	String dbName = "test";
		  	String driver = "org.postgresql.Driver";
		  	String userName = "postgres"; 
		  	String password = "postgres";
		  try {
			  Class.forName(driver).newInstance();
		  	conn = DriverManager.getConnection(url+dbName,userName,password);
		  	System.out.println("Connected to the database");
		  	st = conn.createStatement();
			String sql = "select * from myuser";
			rs = st.executeQuery(sql);

			System.out.println("id.  \tUserName  \tPassword");
			while (rs.next()) {
			  System.out.print(rs.getInt(1) + " \t");
			  System.out.print(rs.getString(2) + " \t");
			  System.out.println(rs.getString(3));
			}
		  	
		  	conn.close();
		  	System.out.println("Disconnected from database");
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		  
  }
  }