public class ContaComum {

  private String numero;
  private double saldo;
  private String titular;

  public void abertura( double depositoInicial ){
    this.saldo = depositoInicial;
    System.out.println("Conta aberta");
    System.out.println("Saldo disponivel: " + this.saldo);
  }
  
  public void depositar( double valor ){
    this.saldo = this.saldo + valor;
    System.out.println("Deposito de " + valor + " realizado");
  }

  public void sacar ( double valor ){
    if(this.saldo<=0){
      System.out.println("Saldo insuficinte para saque!");
    }else{
      this.saldo = this.saldo - valor;
      System.out.println("Saque de " + valor + " realizado!");
    }
    System.out.println("Saldo disponivel: " + this.saldo);
  }

  public double verificaSaldo (){
    return this.saldo;
  } 

  //metodos get e set
  public String getNumero(){
    return this.numero;
  }
  public void setNumero(String numero){
    this.numero = numero;
  }
  
  public double getSaldo(){
    return this.saldo;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public String getTitular(){
    return this.titular;
  }
  public void setTitular(String titular){
    this.titular = titular;
  }
}