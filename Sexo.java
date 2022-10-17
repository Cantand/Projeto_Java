import javax.swing.JOptionPane;

public class Sexo {

    Object[] op = {"Masculino", "Feminino"};
    /**
     *
     */
    String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n",
     "Pesquisa",
      JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
   (resp == null) /**
     * @param op
     * @param resp
     */
    public Sexo(Object[] op, String resp) {
      this.op = op;
      this.resp = resp;
    }

  /**
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
    };
    if(resp == "Masculino") {
      JOptionPane.showMessageDialog(null, "Você é homem.");
    }

    if (resp == "Feminino") {
      JOptionPane.showMessageDialog(null, "Você é mulher.");
    }
    System.exit(0);
    } 

}
 

