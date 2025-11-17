import java.util.Scanner;

public class Main {
    static Transport car1 = new Transport();
    static Transport car2 = new Transport();
    static Transport car3 = new Transport();


    public static void main(String[] args) {

        printMenu();
        Race.pathTraveled();


    }

    static void printMenu(){

        while (true) {
            System.out.println("Ч ¬ведите название машины є1:");
            Scanner a = new Scanner(System.in);
            if (a.hasNextLine()) {
                String sc = a.nextLine();
                car1.name = sc;
                if (sc.trim().isEmpty()) {
                    System.out.println("Ч Ќеправильна€ название:");
                }
                if (sc.trim().isEmpty() == false) {
                    break;
                }
            }
        }

        while (true){
            System.out.println("Ч ¬ведите скорость машины є1:");
            Scanner a = new Scanner(System.in);

            if (a.hasNextInt()) {
                car1.speed = a.nextInt();
                if (car1.speed > 0 && car1.speed <= 250) {
                    break;
                }
            }
            System.out.println("Ч Ќеправильна€ скорость");
        }

        while (true) {
            System.out.println("Ч ¬ведите название машины є2:");
            Scanner a = new Scanner(System.in);
            if (a.hasNextLine()) {
                String sc = a.nextLine();
                car2.name = sc;
                if (sc.trim().isEmpty()) {
                    System.out.println("Ч Ќеправильна€ название:");
                }
                if (sc.trim().isEmpty() == false) {
                    break;
                }
            }
        }

        while (true){
            System.out.println("Ч ¬ведите скорость машины є2:");
            Scanner a = new Scanner(System.in);

            if (a.hasNextInt()) {
                car2.speed = a.nextInt();
                if (car2.speed > 0 && car2.speed <= 250) {
                    break;
                }
            }
            System.out.println("Ч Ќеправильна€ скорость");
        }

        while (true) {
            System.out.println("Ч ¬ведите название машины є3:");
            Scanner a = new Scanner(System.in);
            if (a.hasNextLine()) {
                String sc = a.nextLine();
                car3.name = sc;
                if (sc.trim().isEmpty()) {
                    System.out.println("Ч Ќеправильна€ название:");
                }
                if (sc.trim().isEmpty() == false) {
                    break;
                }
            }
        }

        while (true){
            System.out.println("Ч ¬ведите скорость машины є3:");
            Scanner a = new Scanner(System.in);

            if (a.hasNextInt()) {
                car3.speed = a.nextInt();
                if (car3.speed > 0 && car3.speed <= 250) {
                    break;
                }
            }
            System.out.println("Ч Ќеправильна€ скорость");
        }
    }
}

