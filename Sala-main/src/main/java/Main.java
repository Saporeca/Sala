public class Main {
  public static void main(String[] args) {

    aluno nome = new aluno();        
    nome.setNome("João");
    System.out.println(nome.getNome());

    aluno cpf = new aluno();
    cpf.setCpf("069.202.870-64");

    aluno idade = new aluno();    
    idade.setIdade(16);
    System.out.println(idade.getIdade());

    professor materia = new professor();
    materia.setMateria("Pds");
    System.out.println(materia.getMateria());

    professor altura = new professor();
      altura.setAltura(1.80);
      System.out.println(altura.getAltura());

    professor salario = new professor();
    salario.setSalario(4.582);
    System.out.println(salario.getSalario());

    ch turnos = new ch();
    turnos.setTurnos("13:10-17:45");
    System.out.println(turnos.getTurnos());

    ch intervalos = new ch();
    intervalos.setIntervalos("9:40-9:55");
    System.out.println(intervalos.getIntervalos());

    ch carga_horaria = new ch();
    carga_horaria.setCarga_horaria("6 aulas");
    System.out.println(carga_horaria.getCarga_horaria());

    informatica Qtd_computadores = new informatica();
    Qtd_computadores.setQtd_computadores(0);
    System.out.println(Qtd_computadores.getQtd_computadores());

    informatica memoria = new informatica();
    memoria.setMemoria("4GB");
    System.out.println(memoria.getMemoria());

    informatica polegadas = new informatica();
    polegadas.setPolegadas("18");
    System.out.println(polegadas.getPolegadas());

    biblioteca num_livros = new biblioteca();
    num_livros.setNum_livros(0);
    System.out.println(num_livros.getNum_livros());

    biblioteca gen_favorito = new biblioteca();
    gen_favorito.setGen_favorito("Ficção ciêntifica");
    System.out.println(gen_favorito.getGen_favorito());

    biblioteca prazo_devolucao = new biblioteca();
    prazo_devolucao.setPrazo_devolucao("12/04");
    System.out.println(prazo_devolucao.getPrazo_devolucao());
  }


}

