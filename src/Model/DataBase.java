package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {
	Connection con = null;
	
	// get result by query
	public ResultSet getResulByQuery(String query) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien","root","");
		
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs =ps.executeQuery();
		return rs;
	}
	// close conection database
	public void closeConnectData() throws SQLException {
		if(con != null || !con.isClosed()) {
			con.close();
		}
	}
}
