import javax.swing.JOptionPane;

public class App {
   
    public static void main(String[] args) throws Exception {
      //armazenar vários valores do mesmo tipo
    String[] opcoes = new String[] { 
        "Anime RickOfMor",
        "Série Game of Thrones",
        "Filme Vingadores",
        "Sair"
    };

    int opcoeEscolhida = 0;

    while(opcoeEscolhida != 3){
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

         if (opcoeEscolhida != 3){
            String mensagem = "Você assistir " + opcoes[opcoeEscolhida];
            JOptionPane.showMessageDialog(null,mensagem);
         }
    }

  }
}