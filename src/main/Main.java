package main;


import java.util.Scanner;
import dao.StudentDAO;
import model.Student;
public class Main {
	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student student =
                new Student(name, age, course);

        StudentDAO dao =
                new StudentDAO();

        dao.addStudent(student);

        sc.close();
    }
}