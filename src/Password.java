import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Password {
    public static void main(String[] args) {

        String lozinka = "Password";
        Scanner sc = new Scanner(System.in);
        String x;
        do {
            System.out.println("Unesite lozinku: ");
            x = sc.nextLine();
        } while (!x.equals(lozinka));
    }
}