import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Divisions program");
        Scanner tb = new Scanner(System.in);
        System.out.print("Ange tal1:");
        int tal1 = tb.nextInt();
        System.out.print("Ange tal2:");
        int tal2 = tb.nextInt();
        double kvot = (double)tal1/tal2;
        System.out.println("kvoten är: "+ kvot);
        System.out.println("kvoten är : 0");

        // Nästa del
        Scanner subbis = new Scanner(System.in);
        System.out.print("Ange ett substantiv: ");
        String sub = subbis.nextLine();
        System.out.print("Ange substantivets pluraländelse: ");
        String end = subbis.nextLine();
        System.out.println("En "+sub+", flera "+sub+end);

    }
}
