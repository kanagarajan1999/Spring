package Spring.Spring_Postconstruct_Predestroy;

import java.sql.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//	@Component
public class Colleges {
 
     Connection con;
		
	@Value("${Collages.driver}")
	private String driver;
	
	@Value("${Collages.url}")
	private String url;
	
	@Value("${Collages.username}")
	private String username;
	
	@Value("${Collages.password}")
	private String password;
	
	
	public void init() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		 con = DriverManager.getConnection(url,username,password);
	}
	
	public void selectallrows() throws ClassNotFoundException, SQLException{
		Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM college");
        System.out.println("Collages  TotalStudents");
        
        while (rs.next()) {
        	String name=rs.getString(1);
        	String totalstudents=rs.getString(2);
           System.out.println(name+"     "+totalstudents);
        }       
	}
	
	public void delete(String totalstudents) throws ClassNotFoundException, SQLException{
		
		 Statement stmt = con.createStatement();
		 ResultSet rs= stmt.executeQuery("delete from college where name = "+totalstudents);
		 System.out.println("record deleted using name where name = "+ totalstudents);
	     
	}
	
public void destroy() throws ClassNotFoundException, SQLException{
	con.close();
}
}
