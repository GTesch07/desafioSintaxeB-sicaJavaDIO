import java.util.Scanner;

public class VerificaEmail {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        
        var expectedDomain = "@company.com";
        System.out.println("Informe seu e-mail corporativo: ");
        var email = scanner.nextLine().trim();
        if (email.endsWith(expectedDomain)) {
            System.out.println("E-mail válido.");
        }else{
            System.out.println("E-mail inválido.");
        }
    
        scanner.close();
    }
}
