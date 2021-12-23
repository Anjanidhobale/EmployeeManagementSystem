package Employee;
import java.sql.*;
public class conn {
	    
	    public Connection c;
	    public Statement s;
	 
	    public conn()
	    {
	        try{
	          
	            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project3","root","@Thisismypass06");
	            s = c.createStatement();
	        	}catch(Exception e) 
	        	{
	        			e.printStackTrace();
	        	}
	    }
}
