import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao; 

        do {
            System.out.println("\n== CONVERSOR DE TEMPERATURA ===");
            System.out.println("1) Celsius -> Fahrenheit");
            System.out.println("2) Fahrenheit -> Celsius");
            System.out.println("0)Sair");
            System.out.println("Escolha");
            if (entrada.hasNextInt()) {
                opcao = entrada.nextInt();
            } else { 
                System.out.println("Digite apenas os números!");
                entrada.next();
                opcao = -1;
                continue;

            }

            switch (opcao) {
                case 1:
                    System.out.print("Temperatura em Celsius: ");
                    if (entrada.hasNextDouble()) {
                    double c = entrada.nextDouble();
                    System.out.printf("%.2f °C = %.2f °F%n", c, celsiusParaFahrenheit(c));
                    } else { 
                        System.out.println("Digite um número válido");
                        entrada.next();
                    }
                    break;
                case 2:
                    System.out.print("Temperatura em Fahrenheit: ");
                    if (entrada.hasNextDouble()) {
                    double f = entrada.nextDouble();
                    System.out.printf("%.2f °F = %.2f °C%n", f, fahrenheitParaCelsius(f));
                    } else { 
                        System.out.println("Digite um número válido");
                    }    
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            } // fecha o switch (já existe na linha 32)
        } while (opcao != 0); // fecha o do
        entrada.close();
    } // fecha o main

    static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
} // fecha a classe
