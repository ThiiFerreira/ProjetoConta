public class ContaPoupanca extends ContaComum {

  public void rendimento(double taxa){
    double aux = taxa/100;
    this.setSaldo(this.getSaldo()+this.getSaldo()*aux);
    System.out.println("Saldo na sua conta teve um rendimento de " + taxa +"%");
    System.out.println("Saldo disponivel: " + this.getSaldo());
  }
}