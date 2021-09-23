package fundamentaljava.ch8;

public class LocationTest {
    public static void main(String[] args) {
        Location classRoom1 = new Location();
        classRoom1.setAddress("4th floor, New Bank Building");
        classRoom1.setCapacity(20);
        classRoom1.setPricePerDay(300.0);

        Location classRoom2 = new Location();
        classRoom2.setAddress("Seminar room 5, University Computing Lab");
        classRoom2.setCapacity(40);
        classRoom2.setPricePerDay(450.0);

        Location classRoom3 = new Location();
        classRoom3.setAddress("Seminar room 5, University Computing Lab");
        classRoom3.setCapacity(40);
        classRoom3.setPricePerDay(450.0);

        System.out.println("1: " + classRoom1);
        System.out.println("1: " + classRoom2);
        System.out.println("1: " + classRoom3);

        boolean isEqual = classRoom2.equals(classRoom3);
        if(isEqual)
            System.out.println(classRoom2 + " is equals to " + classRoom3);
        else
            System.out.println(classRoom2 + " is NOT equals to " + classRoom3);
    }

}
