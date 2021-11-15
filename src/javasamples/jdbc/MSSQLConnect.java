package javasamples.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MSSQLConnect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define database connections...
		Connection srcDBConn=null;
		ResultSet rs=null;
		Statement jsql=null;
		System.out.println("Start Convert Programs...");
		try{
		srcDBConn=MSSQLConn.create("vmwks20.monenco.com", "1433", "GorganSalary","sa","123456");
		String query="Select * From  SalaryInfo";	
		
			jsql=srcDBConn.createStatement();
			rs=jsql.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString("nam") +"-" +rs.getString("nameFamily") );
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
				
		if(srcDBConn!=null){
			try {
				srcDBConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Create a Connection to Source Database...Successfully");
		}
		else System.err.println("Error: Can Not Create a Connection to Source Database...");
		
		System.out.println("End Convert Programs...Successfully");
	}

	

}
