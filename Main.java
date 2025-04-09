import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double classificacaoCliente = scanner.nextDouble();
      
        if (classificacaoCliente <= -50.00) {
            System.out.println("Negativado");
        } else if (classificacaoCliente >= 1000.00) {
            System.out.println("Confortavel");
        } else {
            System.out.println("Baixo");
        }
        
    

        scanner.close();
    }
}
