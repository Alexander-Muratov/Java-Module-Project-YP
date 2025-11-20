import java.util.Scanner;

public class Main {

    static int min = 0;
    static int max = 250;

    public static void main(String[] args) {

        printMenu();

    }

    static void printMenu(){

        Transport car1 = createTransport("— Введите название машины №1:", "— Введите скорость машины №1:");
        Transport car2 = createTransport("— Введите название машины №2:", "— Введите скорость машины №2:");
        Transport car3 = createTransport("— Введите название машины №3:", "— Введите скорость машины №3:");

        Race.pathTraveled(car1, car2, car3);

    }

    static Transport createTransport(String namePrompt, String speedPrompt) {
        String name = readNonEmptyString(namePrompt);
        int speed = readIntegerWithinRange(speedPrompt, min, max);
        return new Transport(name, speed);
    }

    static String readNonEmptyString (String promt) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(promt);
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (!input.trim().isEmpty()) {
                    return input;
                } else {
                    System.out.println("— Неправильная название:");
                }
            }
        }
    }

    static int readIntegerWithinRange(String prompt, int min, int max) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("— Неправильная скорость");
                }
            }
        }
    }


} //Finish class Main

