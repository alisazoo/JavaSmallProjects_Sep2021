package school.management.system;

import java.util.List;

public class School {

    /**
     * Created by Arisa 7/9/2021
     * Implements teachers and student using an ArrayList.
     * A school can contain multiple students and multiple teachers.
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of the teachers in this school.
     * @param students list of the students in this school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add the teacher to the school
     * @param teacher the teacher to be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a new students to the school
     * @param student
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param moneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money the school spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money the school spent.
     * This is the money given by the school to its teachers.
     * @param moneySpent the money spent by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
