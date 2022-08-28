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

      int Contador = 0;
      JOptionPane.showMessageDialog(null,Contador,"Matemática" , JOptionPane.QUESTION_MESSAGE);
      Contador %= 10;
      JOptionPane.showMessageDialog(null,Contador,"Matemática" , JOptionPane.QUESTION_MESSAGE);
      Contador %= 10;

      Contador = 0;
      JOptionPane.showMessageDialog(null,Contador,"Contador" , JOptionPane.QUESTION_MESSAGE);
      Contador %= 10;
      //Exemple somar na matemática 
      int numeroA= 6;
      int numeroB= 5;
      int  resultado = (int)Math.sqrt(numeroA);
      JOptionPane.showMessageDialog(null,resultado);

  }
}