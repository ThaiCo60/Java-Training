package Model;

public class Query {
	
	// get all student
	public String getAllStudent() {
		String query = "SELECT a.student_id, a.student_name, a.student_code, b.address, b.average_score, b.date_of_birth FROM student a, student_info b WHERE a.student_id=b.student_id";
		return query;
	}
}
