public class biblioteca{

  int num_livros;
  String gen_favorito;
  String prazo_devolucao;

  public biblioteca() {
    System.out.println("---------------------------------");
    System.out.println("Dados da biblioteca:");
  }

  public int getNum_livros(){
    return num_livros;
  }

  public void setNum_livros(int num_livros){

    int nm = 100 + (int) (Math.random() * 1000);
    System.out.println("Quantidade de livros: " + nm);
  }

  public String getGen_favorito(){
    return gen_favorito;
  }

  public void setGen_favorito(String gen_favorito){
    this.gen_favorito = gen_favorito;

    System.out.println("o gênero favorito é: " + gen_favorito);
  }

  public String getPrazo_devolucao(){
    return prazo_devolucao;
  }

  public void setPrazo_devolucao(String prazo_devolucao){
    this.prazo_devolucao = prazo_devolucao;

    System.out.println("O prazo de devolução é: " + prazo_devolucao);
  }
}

