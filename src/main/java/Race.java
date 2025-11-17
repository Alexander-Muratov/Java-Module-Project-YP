public class Race {
    static int time = 24;
    static int a;
    static int b;
    static int c;
    static void pathTraveled(){
       a = time * Main.car1.speed;
       b = time * Main.car2.speed;
       c = time * Main.car3.speed;
       if (a > b & a > c)
           System.out.println("Самая быстрая машина: " + Main.car1.name);
        if (b > a & b > c)
            System.out.println("Самая быстрая машина: " + Main.car2.name);
        if (c > a & c > b)
            System.out.println("Самая быстрая машина: " + Main.car3.name);
    }

}
