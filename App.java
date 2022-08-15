import javax.swing.JOptionPane;

public class App {
   
    public static void main(String[] args) throws Exception {
      //armazenar vários valores do mesmo tipo
    String[] opcoes = new String[] { 
        "Home",
        "Lista",
        "Contato",
        "Sobre",
        "Sair"
    };

    int opcoeEscolhida = 0;

    while(opcoeEscolhida != 5){
      opcoeEscolhida = JOptionPane.showOptionDialog(
        null,
        "O que você deseja assistir", 
        "FlexCh",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE, 
         null,  
         opcoes,
         0
         );

         if (opcoeEscolhida != 5){
            String mensagem = "Você assistir " + opcoes[opcoeEscolhida];
            JOptionPane.showMessageDialog(null,mensagem);
         }
    }

  }
}