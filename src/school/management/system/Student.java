package school.management.system;

public class Student {

    /**
     * Created by Arisa 7/9/2021
     * This class is responsible for keeping the track of
     * student name, id, grade, fees paid.
     */

    private int id;
    private String name;
    private int grade; // 1-12
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initialising
     * Fees for every student is $30,000 pa.
     * Fees paid is initially 0.
     * @param id id for the student: unique
     * @param name name for the student
     * @param grade grade for the student
     */
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30_000;
    }

    // Not going to alter id, name of the student.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keep adding the feeds to feedsPaid field.
     * Add the fees to the fees paid.
     * The school is going to recieve the funds.
     * @param fees fees the student paid.
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return name + "(grade: " + grade +
                ") has paid $" + feesPaid + " so far.";
    }
}
