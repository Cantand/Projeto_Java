import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
   
    public static void main(String[] args) throws Exception {
      //armazenar vários valores do mesmo tipo
    String[] opcoes = new String[] { 
        "Home",
        "Sobre mim",
        "Desejo",
        "Contato",
        "Sobre",
        "Sair"
    };

    int opcoeEscolhida = 0;

    while(opcoeEscolhida != 6){
      opcoeEscolhida = JOptionPane.showOptionDialog(
        null,
        "Bem vindo Na loja", 
        "Boa Compra!",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE, 
         null,  
         opcoes,
         0
         );

         if (opcoeEscolhida != 6){
            String mensagem = "Você assistir " + opcoes[opcoeEscolhida];
            JOptionPane.showMessageDialog(null,mensagem);
         }
    }

    /*Vamos trabalha valores na matemática */

    import javax.swing.JOptionPane;

    public class App {
       
        public static void main(String[] args) throws Exception {
         
          Object[] op = {"Masculino", "Feminino"};
          String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n",
           "Pesquisa",
            JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
          if (resp == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou Cancelar");
          }
          if(resp == "Masculino") {
            JOptionPane.showMessageDialog(null, "Você é homem.");
          }
    
          if (resp == "Feminino") {
            JOptionPane.showMessageDialog(null, "Você é mulher.");
          }
          System.exit(0);
          }  
    }
  }

  
}

String aux = JOptionPane.showInputDialog(null, "Forneça o número do mês.");
if (aux != null) {
    {
    int mes = Integer.parseInt(aux);
    if (mes >= 1 && mes < 12) {
        JOptionPane.showMessageDialog(null, "Número do mês válido!\n" + mes);
    } else{
        JOptionPane.showMessageDialog(null, "Número do mês inválido!\n" + mes);


    }

 } try {
    
  } catch (NumberFormatException erro) {
      JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros."+ erro);
  }
} else {
  JOptionPane.showMessageDialog(null, "Operação cancelada.");
}
System.exit(0);