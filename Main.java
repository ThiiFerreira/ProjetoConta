class Main {
  public static void main(String[] args) {
    
    ContaEspecial c1 = new ContaEspecial();
    c1.abertura(1000f);
    c1.sacar(1000f);
    c1.sacar(105f);

    ContaPoupanca c2 = new ContaPoupanca();
    c2.abertura(1000f);
    c2.rendimento(50f);
  }
}