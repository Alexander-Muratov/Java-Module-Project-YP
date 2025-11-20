public class Race {
    static int time = 24;

     static void pathTraveled(Transport car1, Transport car2, Transport car3){

        int a = time * car1.speed;
        int b = time * car2.speed;
        int c = time * car3.speed;

        if (a > b & a > c)
           System.out.println("Самая быстрая машина: " + car1.name);
        if (b > a & b > c)
            System.out.println("Самая быстрая машина: " + car2.name);
         if (c > a & c > b)
            System.out.println("Самая быстрая машина: " + car3.name);
    }

}// Finish class Race.
