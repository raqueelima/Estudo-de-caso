package Calculadora;
import java.util.Scanner;

public class RodarCalculadora {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
    
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
    
            System.out.println("Digite o tipo de operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);
    
            double resultado = 0;
    
            switch (operacao) {
                case '+':
                    resultado = Calculadora.somar(num1, num2);
                    break;
                case '-':
                    resultado = Calculadora.subtrair(num1, num2);
                    break;
                case '*':
                    resultado = Calculadora.multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = Calculadora.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }
    
            System.out.println("Resultado da operação: " + resultado);
    
            scanner.close();
        }
    }

