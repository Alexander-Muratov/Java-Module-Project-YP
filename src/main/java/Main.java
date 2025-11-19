import java.util.Scanner;

public class Main {

    static int min = 0;
    static int max = 250;

    public static void main(String[] args) {

        printMenu();

    }

    static void printMenu(){

        Transport car1 = createTransport("— Ââåäèòå íàçâàíèå ìàøèíû ¹1:", "— Ââåäèòå ñêîğîñòü ìàøèíû ¹1:");
        Transport car2 = createTransport("— Ââåäèòå íàçâàíèå ìàøèíû ¹2:", "— Ââåäèòå ñêîğîñòü ìàøèíû ¹2:");
        Transport car3 = createTransport("— Ââåäèòå íàçâàíèå ìàøèíû ¹3:", "— Ââåäèòå ñêîğîñòü ìàøèíû ¹3:");

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
                    System.out.println("— Íåïğàâèëüíàÿ íàçâàíèå:");
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
                    System.out.println("— Íåïğàâèëüíàÿ ñêîğîñòü");
                }
            }
        }
    }


} //Finish class Main

