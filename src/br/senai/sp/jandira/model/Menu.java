package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    //Essa classe vai perguntar o que o usuário quer fazer

    Tarefas tarefas = new Tarefas();
    Scanner teclado = new Scanner(System.in);
    String escolha;
    public void Menu(){

        while (true) {

            System.out.println("Olá, o que deseja fazer??");
            System.out.println("Listar tarefas [1] - Criar novas tarefas [2] -\n Atualizar tarefas [3] - Remover tarefas [4]");
            escolha = teclado.nextLine();

            if (escolha.equalsIgnoreCase("1")) {
                tarefas.listarTarefas();
            } else if (escolha.equalsIgnoreCase("2")) {
                tarefas.informacoesTarefas(tarefas);

            } else if (escolha.equalsIgnoreCase("3")) {

            } else if (escolha.equalsIgnoreCase("4")) {

            }

        }
    }
}
