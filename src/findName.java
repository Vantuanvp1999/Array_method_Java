import java.util.Scanner;

public class findName {
    public static void main(String[] args) {
        String[] names = {"Christian", "Connor","Daniel", "Michael","Joshua", "Camila","Destiny"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student name : ");
        String name = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println("Position of the student in the list "+name+" is "+i);
                found= true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
}
