import java.util.*;

public class Onlinereservation {
    private static boolean seats[] = new boolean[10];

    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("please select an option");
            System.out.println("1.view seat map");
            System.out.println("2.Reserve seat");
            System.out.println("3.Cancel Reservation");
            System.out.println("4.exit");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    viewseatMap();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid option");
            }
        }
    }

    private static void viewseatMap() {
        System.out.println("current seat map");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.println("x");
            } else {
                System.out.println((i + 1) + " ");
            }
        }
        System.out.println();
    }

    private static void reserveSeat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the seat number");
        int x = sc.nextInt();
        if (x < 1 || x > 10) {
            System.out.println("invalid seat number");
        } else if (seats[x - 1]) {
            System.out.println("seat already reserved");
        } else {
            seats[x - 1] = true;
            System.out.println("seat reserved");
        }
    }

    private static void cancelReservation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the seat number");
        int x = sc.nextInt();
        if (x < 1 || x > 10) {
            System.out.println("invaid seat number");
        } else if (!seats[x - 1]) {
            System.out.println("seat not reserved");
        } else {
            seats[x - 1] = false;
            System.out.println("seat cancelled");
        }
    }
}