package Spring.Spring_value_required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
    @Value ("${Student.name}")
	private String  name;
    @Value ("${Student.course}")
    
	private String course;
    @Value("${Student.hobby}")
	private String hobby;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void display(){
		System.out.println("The student name is "+ name);
		System.out.println("his/her selected course   is "+course);
		System.out.println("The student hobby is "+ hobby);
	}
	
}
