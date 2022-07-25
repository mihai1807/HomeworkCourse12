package Tema2Ex1;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        System.out.println("Enter a day of the week: ");
        Scanner scanner = new Scanner(System.in);
        printStatus(Day.valueOf(scanner.nextLine()));
    }
    public static void printStatus(Day day){
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It is a working day!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It is a rest day!");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
