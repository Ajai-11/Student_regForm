import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudDao {
Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
public StudDao() {
	// TODO Auto-generated constructor stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Demo", "root", "root");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {

	e.printStackTrace();
}
}
public void saveData(Stud s) {
	String sql="insert into StudentDetails(name,email,dob,place,gender,course) values(?, ?, ?, ?, ?, ?)";
	try {
		pst=con.prepareStatement(sql);
		pst.setString(1, s.getName());
		pst.setString(2, s.getEmail());
		pst.setString(3, s.getDob());
		pst.setString(4, s.getPlace());
		pst.setString(5, s.getGender());
		pst.setString(6, s.getCourse());
		pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

