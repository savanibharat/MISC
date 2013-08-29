package databaseProgram;
import java.sql.*;
public class JDBCExample {
  public static void main(String [] args) {
	  String query;
	  query="select * from companies.laptop";// companies is schema
	  String insert_query="insert into companies.laptop values ('ban');";
	  ResultSet rs=null;
	  Connection conn=null;
	  try
      {
         conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=root"); 
        InsesrtNewRow(conn,query);
         
         Statement s = (Statement) conn.createStatement();
         
         s.executeUpdate(insert_query);
         
         rs=s.executeQuery(query);

          while(rs.next())
        	  System.out.println(rs.getString(1));
          
         rs.close();
         conn.close();
      }
      catch ( Exception e)
      {
          e.printStackTrace();
      }
	  finally
	  {//rs.close();
	  //conn.close();
	  }
}

/**
 * 
 */public static void InsesrtNewRow(Connection conn,String query){
	 try {
		Statement s = (Statement) conn.createStatement();
		ResultSet rs=s.executeQuery(query);
		 while(rs.next())
       	  System.out.println(rs.getString(1));

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 }
}