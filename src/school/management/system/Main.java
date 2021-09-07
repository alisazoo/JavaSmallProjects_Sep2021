package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Created by Arisa 7/9/2021
     * This is used to execute this school management system.
     * Also set the data about individual teachers and students.
     * Process of payment is also conducted here.
     *
     * Based on the youtube tutorial: https://www.youtube.com/watch?v=e0X00EoFQbE&t=1010s
     */
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher tom = new Teacher(3, "Tom", 550);
        Teacher josh = new Teacher(4, "Josh", 900);

        Student taro = new Student(1, "Taro", 3);
        Student ken = new Student(2, "ken", 5);
        Student keeth = new Student(3, "Keeth", 2);
        Student claire = new Student(4, "Claire", 10);
        Student marco = new Student(5, "Marco", 12);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(mellisa);
        teachersList.add(tom);
        teachersList.add(josh);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(taro);
        studentsList.add(ken);
        studentsList.add(keeth);
        studentsList.add(claire);
        studentsList.add(marco);

        School ghs = new School(teachersList, studentsList);

        Teacher megan = new Teacher(6, "Megan", 450);
        ghs.addTeachers(megan);

        taro.payFees(5000);
        ken.payFees(6500);
        System.out.println( "GHS has earned $" + ghs.getTotalMoneyEarned() + " after students' payment.");
        for(Student student: studentsList)
            System.out.println(student);

        System.out.println("================ MAKING SCHOOL PAY SALARY ====================");

        lizzy.recieveSaraly(lizzy.getSalary());
        System.out.println( "First month: GHS has spent for saraly to " + lizzy.getName()+
                " and now has $" + ghs.getTotalMoneyEarned());

        for(Teacher teacher: teachersList)
            teacher.recieveSaraly(teacher.getSalary());
        System.out.println( "Second month: GHS has spent for saraly to all teachers belongs to" +
                " and now has $" + ghs.getTotalMoneyEarned() + "\n" );

        for(Teacher teacher: teachersList)
            System.out.println(teacher);


    }


}
