
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Personagem {
    public static void main (String[] args) throws Exception {
       String personagem = JOptionPane.showInputDialog(null, "Digite seu personagem favorito do Dragon Ball");
       String nomeImagem = "";
       String origem = "";




        switch (personagem) {
            case "Goku":
                origem = "Planeta Sayajin";
                nomeImagem = "goku-icone.png";
                break;
            case "Piccolo":
                  origem = " Planeta Namekuseijin";
                  nomeImagem = "piccolo-icone.png";
                  break;
            case "Vegeta":
                origem = "Planeta Sayajin";
                nomeImagem = "vegeta-icone.png";
                break;
            case " Bulma":
                origem = "Planeta terra";
                nomeImagem = "bulma-icone.png";
                break;
            case " Kuririn":
                origem = "Planeta terra";
                nomeImagem = "Kuririn-icone.png";
                break;
                default:
                origem = "Planeta Desconhecidos";
                nomeImagem = "default.png";
                break;
           }

           
            String caminho  = String.format("C:\\Users\\charl\\OneDrive\\Área de Trabalho\\JavaEstruturado\\imagem\\%s.png",nomeImagem);
            ImageIcon icone = new ImageIcon(caminho);

            String informaPersonagem = String.format("Personagem: %s\nOrigem: %s",personagem , origem);
            JOptionPane.showConfirmDialog(null, informaPersonagem, "Descrição",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
        
          
    }  
}
