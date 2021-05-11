/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.eletrônico;

import java.util.Scanner;

/**
 *
 * @author emers
 */
public class CaixaEletrônico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Construção de um programa na linguagem Java

        Scanner ler = new Scanner(System.in);
        String cpfdapessoa;
        String senhadapessoa;
        int Sair;
        int Menu;
        int Saldo;
        int Deposito;
        int Saque;
        int Saldoatual = 1000;
        int tentativas = 0;
        int tentativascpf = 0;
        boolean welcome=false;
        

        while (true){
        System.out.println("Welcome");

        while (tentativascpf < 2) {
            System.out.println("Digite seu CPF");
            cpfdapessoa = ler.next();

            if (cpfdapessoa.equals("12345678900")) {
                System.out.println("CPF CORRETO");
                break;
            } else {
                tentativascpf++;
            }
        }
        if (tentativascpf == 2) {
            System.out.println("Excedeu seu numero de tentativas");
            return;
        }
        while (tentativas < 2) {
            System.out.println("Digite a senha");
            senhadapessoa = ler.next();

            if (senhadapessoa.equals("01020304")) {
                System.out.println("Senha Correta");
                welcome=true;
                break;
            } else {
                tentativas++;
            }
        }
        if (tentativas == 2) {
            System.out.println("execedeu suas tentativas");
            return;
        }
while (welcome){
        
        System.out.println("Menu\n1saldo\n2Depósito\n3Saque\n0sair");
        Menu = ler.nextInt();
        

        switch (Menu) {

            case 1:

                System.out.println("Seu saldo é" + Saldoatual);
                break;
            case 2:

                System.out.println("valor do Depósito");
                Deposito = ler.nextInt();
                if (Deposito > 0) {
                    Saldoatual += Deposito;

                } else {
                    System.out.println("Valor do Depósito Invalido");
                }
                break;
            case 3:
                System.out.println("Valor do Saque");
                Saque = ler.nextInt();
                if (Saque > 0 && Saque <= Saldoatual) {
                    Saldoatual -= Saque;

                } else {
                    System.out.println("Saque Invalido");
                }
                break;

            case 0:
                System.out.println("Sair");
               welcome=false;
                break;
        }

    }

}
    }
}

