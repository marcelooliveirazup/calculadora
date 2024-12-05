import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int soma;
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação: \n1 - Soma: \n2 - Subtração: \n3 - Divisão: \n4 - Multiplicação: "));
        switch (operacao) {
            case 1;
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
                soma = numero1 + numero2;
                System.out.println("Resultado: " + soma);
                break;
            case 2:
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
                soma = numero1 - numero2;
                System.out.println("Resultado: " + soma);
                break;
            case 3:
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
                soma = numero1 / numero2;
                System.out.println("Resultado: " + soma);
                break;
            case 4:
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
                soma = numero1 * numero2;
                System.out.println("Resultado: " + soma);
                break;
        }

    }

}

