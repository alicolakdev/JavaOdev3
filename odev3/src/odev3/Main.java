package odev3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
        student1.setId(1);
        student1.setName("Ali");
        student1.setLastName("Colak");
        student1.setEmail("alicolak@gmail.com");



        Instructor instructor1 = new Instructor();
        instructor1.setId(2);
        instructor1.setName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setEmail("enginDemirog@demirog.com");
        instructor1.setSalary(0);

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.addNewCourse(instructor1);

        StudentManager studentManager = new StudentManager();

        studentManager.getNewCourse(student1);
	}

}
