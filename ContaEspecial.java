public class ContaEspecial extends ContaComum {
  
  private double limite;
  
  public void abertura(double depositoInicial){
    this.setSaldo(depositoInicial);
    this.limite = depositoInicial*2;
    System.out.println("Conta aberta");
    System.out.println("Saldo disponivel: " + this.getSaldo());
    System.out.println("Limite disponivel: " + this.limite);
  }

  public void sacar(double valor){
    if(this.getSaldo() >= valor ){
      this.setSaldo((this.getSaldo()-valor));
      System.out.println("Saque de " + valor + " realizado!");
    }else if(this.getSaldo() < valor){
      if((this.getSaldo()+this.limite)< valor){
        System.out.println("Saldo+limite insuficinte para saque!");
      }else{
        double aux = valor;
        aux = valor - this.getSaldo();
        this.setSaldo(0f);
        this.limite = this.limite - aux;
        System.out.println("Saque de " + valor + " realizado!");
      }
    }
    System.out.println("Saldo disponivel: " + this.getSaldo());
    System.out.println("Limite disponivel: " + this.limite);
  }
  //metodos get e set
  public double getLimite(){
    return this.limite;
  }
  public void setLimte(double limite){
    this.limite = limite;
  }  
}