import model.Student;
import model.Teacher;
import model.School;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Teacher Omo = new Teacher(33, "Omo", 45000);
        Teacher John = new Teacher(45, "John", 3000);
        Teacher Simone = new Teacher(55, "Simone", 4000);
        Teacher Matt = new Teacher(30, "Mathew", 60000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Omo);
        teacherList.add(John);
        teacherList.add(Simone);
        teacherList.add(Matt);


        Student Adam = new Student(1, "Adam", 1);
        Student Bola = new Student(2,"Bola", 2);
        Student Curtis = new Student(3, "Curtis", 3);
        Student Desmond = new Student(4, "Desmond", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Adam);
        studentList.add(Bola);
        studentList.add(Curtis);
        studentList.add(Desmond);

        School ghs = new School(teacherList, studentList);

        Adam.payFees(2000);
        Bola.payFees(5000);
        System.out.println("Ghs school has earned $" + ghs.getTotalMoneyEarned());
        System.out.println(Adam.getRemainingFees());

        System.out.println("------------MAKING SCHOOL PAY SALARY-----------");
        John.receiveSalary(John.getSalary());
        System.out.println("The school has paid salary of $" +John.getSalary() + " to " + John.getName() +"\n" + "And now has $" + ghs.getTotalMoneyEarned());
        System.out.println("The school has paid salary of $" +Simone.getSalary() + " to " + Simone.getName() +"\n" + "And now has $" + ghs.getTotalMoneyEarned());









    }
}

