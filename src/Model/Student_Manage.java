package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Student_Manage {

	// get all student
	public List<Student> getAllAtudent() {
		List<Student> ls = new ArrayList<Student>();
		DataBase db = new DataBase();
		Query q = new Query();
		try {
			ResultSet rs = db.getResulByQuery(q.getAllStudent());
			if (rs == null) {
			} else {
				while (rs.next()) {
					Student stu = new Student();
					stu.id = rs.getInt(1);
					stu.name = rs.getString(2);
					stu.code = rs.getString(3);
					stu.address = rs.getString(4);
					stu.average_score = rs.getDouble(5);
					stu.birth = rs.getDate(6);
					ls.add(stu);
				}
				db.closeConnectData();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
}
