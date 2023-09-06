package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    /*Essa classe vai descrever as tarefas: nome, data, etc
     Vai marcar as mais importantes
     Vai mostrar as tarefas pendentes e concluídas
     */

  Scanner teclado = new Scanner(System.in);
  String nome, dataCriacao, prazo;

  List<Tarefas> tarefas = new ArrayList<>();

  public void informacoesTarefas(Tarefas tarefa){

    System.out.println("Qual o nome da sua tarefa?");
      nome = teclado.nextLine();

    System.out.println("Qual é a data de hoje?");
    dataCriacao = teclado.nextLine();

    System.out.println("Para quando é a entrega?");
    prazo = teclado.nextLine();

    tarefas.add(tarefa);

    }

    //Nessa parte ele lista as tarefas e adiciona elas na lista


    public void listarTarefas(){

      for (Tarefas tarefa : tarefas){
        System.out.println(tarefa.nome);

      }
    }

}
