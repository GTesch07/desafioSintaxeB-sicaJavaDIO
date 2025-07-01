import java.util.Scanner;

public class Temperatura {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);

        // Verifica se a próxima entrada é um número do tipo double
        if (scanner.hasNextDouble()) {
            // Lê o valor em Celsius fornecido pelo usuário
            double celsius = scanner.nextDouble();
          // TODO: Verifique se a temperatura fornecida é maior ou igual ao zero absoluto (-273.15°C)
            if (celsius >= -273.15) {
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.1f",fahrenheit);
            }else{
                System.out.println("Entrada inválida.");
            }
        }else{
            System.out.println("Entrada inválida");
        }
        scanner.close();
    }
}
