package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Tarefas {

    /*Essa classe vai descrever as tarefas: nome, data, etc
     Vai marcar as mais importantes
     Vai mostrar as tarefas pendentes e concluídas
     */

  Scanner teclado = new Scanner(System.in);
  String nome, dataCriacao, prazo;
  int tamanhoLista;
  String finalizada;


  List<Tarefas> listaTarefas = new ArrayList<>();

  public Tarefas informacoesTarefas(){

    Tarefas tarefas = new Tarefas();
    System.out.println("Qual o nome da sua tarefa?");
     tarefas.nome = teclado.nextLine();
      System.out.println("");

    System.out.println("Qual é a data de hoje?");
    tarefas.dataCriacao = teclado.nextLine();
      System.out.println("");

    System.out.println("Para quando é a entrega?");
    tarefas.prazo = teclado.nextLine();

      System.out.println("");

      System.out.println("Essa tarefa está pendente ou já foi concluída? [C] - concluída [P] - pendente");
      finalizada = teclado.nextLine();

return tarefas;
    }
//---------------------------------------------------------------------------------------
    public void adicionarTarefa(Tarefas tarefa){
      listaTarefas.add(tarefa);
      tamanhoLista = listaTarefas.size();
    }
//---------------------------------------------------------------------------------------
    //Nessa parte ele lista as tarefas e adiciona elas na lista


    public void listarTarefas(){

      for (Tarefas tarefa : listaTarefas){
        System.out.println(tarefa.nome);

      }
    }

//---------------------------------------------------------------------------------------
    public void removerTarefas(){


      System.out.println("Escolha o item que deseja excluir: [1,2,3,4...]");
      System.out.println("Caso queira excluir tudo digite 0");
      int excluir = teclado.nextInt();

      if (excluir == 0){
        listaTarefas.clear();

    } else if (excluir <= tamanhoLista) {

        listaTarefas.remove(excluir - 1);

      } else {

        System.out.println("Não foi encontrado esse item na lista");
      }

    }

//---------------------------------------------------------------------------------------

public void editarTarefas(int indice){

    System.out.println("Qual tarefa deseja editar?");


}

//---------------------------------------------------------------------------------------

public void concluidas(){

//    System.out.println("Para marcar como concluída digite [C]");
//    String respostaConclusao = teclado.nextLine();
//
//    System.out.println("");
//
//    System.out.println("Para marcar como pendente digite [P]");
//    String respostaPendente = teclado.nextLine();

   if (finalizada == "C"){
       System.out.println(nome + " - Concluída");

   } else if (finalizada == "P") {
       System.out.println(nome + "Pendente");

   }


}
}



