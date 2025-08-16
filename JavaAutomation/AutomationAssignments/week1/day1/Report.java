package week1.day1;

public class Report {
	
	public static void main(String[] args) {
		System.out.println("STUDENT REPORT\n");
		Student student=new Student();
		System.out.println("Name of the Student: "+student.studentName);
		System.out.println("Roll number: "+student.rollNo);
		System.out.println("College Name: "+student.collegeName);
		System.out.println("Total marks scored: "+student.markScored);
		System.out.println("Overall CGPA: "+student.cgpa);
	}

}
