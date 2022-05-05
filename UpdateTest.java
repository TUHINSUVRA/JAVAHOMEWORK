import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;



import com.sbi.exception.ApplicantNotFoundException;

public class UpdateTest {

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
			
			PreparedStatement pst = conn.prepareStatement("UPDATE BANK_APPLICANT SET APPLICANT_NAME=?, APPLICANT_ADDRESS=? WHERE APPLICANT_ID=?");
			
			pst.setString(1,"ROBERT");
			//pst.setString(3, "robert@gmail.com");
			pst.setString(2,"Mumbai");
			//pst.setString(5, "6667778880");
			pst.setInt(3,appid);
			/*Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			pst.setDate(6,sqlDate);*/
			System.out.println("prepared statement is created..."+pst);
		
			
		//	String sequel = ();
		
			Statement applicantIdinfo=conn.createStatement();
			ResultSet results = applicantIdinfo.executeQuery("SELECT * FROM BANK_APPLICANT WHERE APPLICANT_ID="+appid);
		
			if(results.next())
{				int row = pst.executeUpdate();
				System.out.println("row inserted..."+row);
				
			}
			else 
			{
				throw new ApplicantNotFoundException("applicant not found"+appid); 
			}
			
			results.close();
			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(SQLException | ApplicantNotFoundException e) {
			System.out.println("Some problem : "+e);
		}
		
	}

}






