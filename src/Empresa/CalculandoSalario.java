package Empresa;

import java.util.Scanner;

public class CalculandoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scan.nextDouble();

        scan.nextLine(); // Limpa o buffer

        System.out.print("Digite o cargo (Gerente ou Programador): ");
        String cargo = scan.nextLine().trim().toLowerCase();

        Funcionario funcionario;

        if (cargo.equals("gerente")) {
            funcionario = new Gerente(nome, salario);
        } else if (cargo.equals("programador")) {
            funcionario = new Programador(nome, salario);
        } else {
            System.out.println("Cargo inválido!");
            scan.close();
            return;
        }

        funcionario.exibirInfo();
        scan.close();
    }
}
