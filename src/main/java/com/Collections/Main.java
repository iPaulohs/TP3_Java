package com.Collections;

import com.Collections.Modells.Cliente;
import com.Collections.Modells.LinhaFixa;
import com.Collections.Modells.LinhaMovel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao cadastro de linhas telefônicas e clientes!");
        System.out.println("Vamos cadastrar duas linhas telefônicas móveis, duas linhas telefônicas fixas e dois clientes.");

        Scanner sc = new Scanner(System.in);

        LinhaMovel[] linhasMoveis = new LinhaMovel[2];
        LinhaFixa[] linhasFixas = new LinhaFixa[2];
        Cliente[] clientes = new Cliente[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a quantidade de minutos utilizados da linha móvel " + (i + 1) + ": ");
            int qtMinutos = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner
            System.out.println("Digite o número da linha telefônica móvel " + (i + 1) + ": ");
            String numeroLinha = sc.nextLine();
            System.out.println("A linha começa habilitada? (1 - Sim ou 2 - Não)");
            int isHabilitadoControle = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner

            boolean isHabilitado;
            if (isHabilitadoControle == 1) {
                isHabilitado = true;
            } else if (isHabilitadoControle == 2) {
                isHabilitado = false;
            } else {
                System.out.println("Opção inválida. A linha será considerada não habilitada.");
                isHabilitado = false;
            }

            System.out.println("Agora digite apenas o primeiro nome do dono da linha:");
            String nomeCliente = sc.nextLine();
            System.out.println("Agora digite o sobrenome do dono da linha:");
            String sobrenomeCliente = sc.nextLine();

            linhasMoveis[i] = new LinhaMovel(qtMinutos, numeroLinha, isHabilitado, new Cliente(nomeCliente, sobrenomeCliente));
            System.out.println("Linha Móvel " + (i + 1) + " cadastrada com sucesso!");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a quantidade de minutos utilizados da linha fixa " + (i + 1) + ": ");
            int qtMinutos = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner
            System.out.println("Digite o número da linha telefônica fixa " + (i + 1) + ": ");
            String numeroLinha = sc.nextLine();
            System.out.println("Agora digite apenas o primeiro nome do dono da linha:");
            String nomeCliente = sc.nextLine();
            System.out.println("Agora digite o sobrenome do dono da linha:");
            String sobrenomeCliente = sc.nextLine();

            linhasFixas[i] = new LinhaFixa(qtMinutos, numeroLinha, new Cliente(nomeCliente, sobrenomeCliente));
            System.out.println("Linha Fixa " + (i + 1) + " cadastrada com sucesso!");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o primeiro nome do cliente " + (i + 1) + ":");
            String nomeCliente = sc.nextLine();
            System.out.println("Digite o sobrenome do cliente " + (i + 1) + ":");
            String sobrenomeCliente = sc.nextLine();

            clientes[i] = new Cliente(nomeCliente, sobrenomeCliente);
            System.out.println("Cliente " + (i + 1) + " cadastrado com sucesso!");
        }

        for (LinhaMovel linhaMovel : linhasMoveis) {
            System.out.println(linhaMovel.toString());
        }

        for (LinhaFixa linhaFixa : linhasFixas) {
            System.out.println(linhaFixa.toString());
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }

        sc.close();
    }
}
