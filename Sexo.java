import javax.swing.JOptionPane;

public class Sexo {

    Object[] op = {"Masculino", "Feminino"};
    String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n",
     "Pesquisa",
      JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
    if (resp == null) /**
     * @return the resp
     */
    public String getResp() {
        return resp;
    }

    /**
     * @param resp the resp to set
     */
    public void setResp(String resp) {
        this.resp = resp;
    }

    {
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
 

