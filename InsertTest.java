
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args)
	{
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			//Statement applicantIdinfo=conn.createStatement();
			Scanner scan=new Scanner(System.in);
			int appid=scan.nextInt();
			String name=scan.next();
			String email=scan.next();
			String address=scan.next();
			String mobileNo=scan.next();
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
			pst.setInt(1, appid);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, address);
			pst.setString(5, mobileNo);
			
			Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			pst.setDate(6,sqlDate);
			System.out.println("prepared statement is created..."+pst);
		
			
		//	String sequel = ();
		
			Statement applicantIdinfo=conn.createStatement();
			ResultSet results = applicantIdinfo.executeQuery("SELECT * FROM BANK_APPLICANT WHERE APPLICANT_ID="+appid);
		
			if(results.next())
{
				throw new DuplicateValueFoundException("applicant with same  id value exist"+appid); 
			}
			else 
			{
				int row = pst.executeUpdate();
				System.out.println("row inserted..."+row);
			}
			
			results.close();
			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(SQLException | DuplicateValueFoundException e) {
			System.out.println("Some problem : "+e);
		}
		
	}

}






