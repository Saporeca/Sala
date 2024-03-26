public class informatica{

  private int Qtd_computadores;
  private String memoria;
  private String polegadas;

  public informatica() {
    System.out.println("---------------------------------");
    System.out.println("Dados da informatica:");
  }


  public int getQtd_computadores(){
    return Qtd_computadores;
  }

  public void setQtd_computadores(int Qtd_computadores){
    this.Qtd_computadores = Qtd_computadores;

    int computadores = 15 + (int) (Math.random() * 100);
    System.out.println("Quantidade de computadores: " + computadores);
  }

  public String getMemoria(){
    return memoria;
  }

  public void setMemoria(String memoria){
    this.memoria = memoria;

    System.out.println("Memória: " + memoria);
  }

  public String getPolegadas(){
    return polegadas;
  }

  public void setPolegadas(String polegadas){
    this.polegadas = polegadas;

    System.out.println("Polegadas: " + polegadas);
  }
}

