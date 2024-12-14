import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    
Scanner scanner = new Scanner(System.in);

        System.out.printf("Convertor de temperatura, digite abaixo qual temperatura está:\n");
        
       double temp = scanner.nextDouble();

        scanner.nextLine();
        
        System.out.printf("Digite a escala da temperatura: (C, K ou F)\n");

           String esc1 = scanner.nextLine();


        System.out.printf("Digite para qual deseja converter:\n");
        
       String esc2 = scanner.nextLine();

        if (esc1.equals("C") && esc2.equals("F")){
            System.out.printf("%.2f\n", ((temp * 9/5) + 32));
        }
         else if(esc1.equals("C") && esc2.equals("K")) {
    System.out.printf("%.2f\n", (temp + 273.15)); 
    }
        else if(esc1.equals("F") && esc2.equals("C")){
System.out.printf("%.2f\n", ((temp - 32) * 5/9));
    }
        else if (esc1.equals("F") && esc2.equals("K")){
            System.out.printf("%.2f\n", ((temp - 32) * 5/9 + 273.15));
    }
        else if (esc1.equals("K") && esc2.equals("C")){
System.out.printf("%.2f\n", (temp - 273.15));
    }
        else if (esc1.equals("K") && esc2.equals("F")){
            System.out.printf("%.2f\n", ((temp - 273.15) * 9/5 + 32));
    }
        else{
        System.out.printf("Escala Invalida\n");
        }

            
        scanner.close();
            }
}