
public class Dinosaur {

    public static void main(String[] args) {
        // Write your program here
        Stats reportFI = new Stats("Finland", 270, 6600);
        Stats reportSE = new Stats("Sweden");
        System.out.println(reportFI);
        System.out.println(reportSE);
        reportFI.infect(7);
        reportFI.heal(200);
        reportSE.setInfect(65137);
        System.out.println(reportFI);
        System.out.println(reportSE);
    }
}
