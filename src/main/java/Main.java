//package com.calculadora.partidas.rankeadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o número de vitórias: ");
            int vitorias = scanner.nextInt();

            System.out.print("Digite o número de derrotas: ");
            int derrotas = scanner.nextInt();

            // Calcula o saldo
            int saldo = vitorias - derrotas;

            // Verifica se o número de vitórias é menor que o número de derrotas ou se o saldo é zero
            if (vitorias < derrotas || saldo <= 0) {
                System.out.print("O Herói não tem saldo de vitórias.");
            } else {
                Partida partida = new Partida(vitorias, derrotas);
                Jogador jogador = CalculadoraRankeadas.calcularSaldo(partida);

                System.out.println("O Herói tem de saldo de " + jogador.getSaldoVitorias() +
                        " e está no nível de " + jogador.getNivel());
            }

            System.out.print(" Deseja calcular para outro jogador? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Obrigado por usar a calculadora de partidas ranqueadas!");
    }
}
