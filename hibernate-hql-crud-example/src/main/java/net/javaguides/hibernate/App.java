package net.javaguides.hibernate;

import java.util.List;

import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.entity.Student;

public class App {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student("Ramana", "peethala", "ramanapeethala@gmail.com");
		studentDao.saveStudent(student);
		
		
		Student student1 = new Student("Rahul", "ketha", "rahulketha@gmail.com");
		studentDao.saveStudent(student);
		studentDao.insertStudent();
		
		// update student
		Student student2 = new Student("Ram", "Fadatare", "rameshfadatare@javaguides.com");
		studentDao.updateStudent(student2);
		
		Student student3 = new Student("Ram", "Fadatare", "rameshfadatare@javaguides.com");
		studentDao.updateStudent(student3);
		
		// get students
		List<Student> students = studentDao.getStudents();
		students.forEach(s -> System.out.println(s.getFirstName()));
		
		// get single student
		Student student4 = studentDao.getStudent(1);
		System.out.println(student4.getFirstName());
		
		// delete student
		studentDao.deleteStudent(1);
	}
}
