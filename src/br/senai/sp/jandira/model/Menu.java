package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    //Essa classe vai perguntar o que o usuário quer fazer

    Tarefas tarefaObj = new Tarefas();
    Scanner teclado = new Scanner(System.in);
    String escolha;
    public void Menu(){

        while (true) {


            System.out.println("Olá, o que deseja fazer??");
            System.out.println("Criar novas tarefas[1] - Listar tarefas  [2] ");
            System.out.println(" Atualizar tarefas [3] - Remover tarefas [4] ");
            System.out.println("Marcar como concluída ou pendente [5] - Exit [6]");
            escolha = teclado.nextLine();
            System.out.println("");

            if (escolha.equalsIgnoreCase("1")) {

                Tarefas tarefa = tarefaObj.informacoesTarefas();
                tarefaObj.adicionarTarefa(tarefa);
                System.out.println("");

            } else if (escolha.equalsIgnoreCase("2")) {

                tarefaObj.listarTarefas();
                System.out.println("");

            } else if (escolha.equalsIgnoreCase("3")) {

                System.out.println("");

            } else if (escolha.equalsIgnoreCase("4")) {

                tarefaObj.removerTarefas();
                System.out.println("");

            } else if (escolha.equalsIgnoreCase("5")) {
                tarefaObj.concluidas();
            } else if (escolha.equalsIgnoreCase("6")) {
                break;
            }

        }
    }
}
