package studentdata;

public class Student {

	static String collegeName = "ABC";
	String principalName = "dipali";
	int estYear = 2018;

	int studid;
	String name;
	long mobile;
	char gender;
	int yearOfDOB;
	int marks;
	double avgOfMarks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		System.out.println(s1.collegeName);
		System.out.println(s2.collegeName);
		System.out.println(s3.collegeName);

		
		collegeName = "xyz";
		
		System.out.println(s1.collegeName);
		System.out.println(s2.collegeName);
		System.out.println(s3.collegeName);

	}

}
