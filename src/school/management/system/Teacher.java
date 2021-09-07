package school.management.system;

public class Teacher {

    /**
     * Created by Arisa 7/9/2021
     * This class is responsible for keeping the track of
     * teacher's id, name, and salary.
     */
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new teacher object.
     * @param id id of the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    /**
     *
     * @return id of the teacher
     */
    public int getId(){
        return id;
    }

    /**
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Set the saraly
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned.
     * Remove the same amount from the TotalMoneyEarned by the school.
     * @param salary
     */
    public void recieveSaraly(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return name + " earned $" + salary +
                ", and total earning is $" + salaryEarned;
    }
}
