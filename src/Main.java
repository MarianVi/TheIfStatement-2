import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TO DO:

        int numar = scanner.nextInt();

        if (numar % 2 == 0){
            System.out.println("Numarul " + numar + " este par.");
        }else {
            System.out.println("Numarul " + numar + " este impar.");
        }
    }
}