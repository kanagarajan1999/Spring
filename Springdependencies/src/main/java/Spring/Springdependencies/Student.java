package Spring.Springdependencies;

public class Student {
private String Studentname1;
private String Studentname;
public Student (String studentname) {
	Studentname = studentname;
}
public void setStudentname1(String studentname1) {
	Studentname1 = studentname1;
}
public void display(){
	System.out.println("Student name is = "+Studentname);
	System.out.println("Student name is = "+Studentname1);
}
}
