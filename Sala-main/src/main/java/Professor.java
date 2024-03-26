public class professor{

  private String materia;
  private double altura;
  private double salario;

  public professor() {
    System.out.println("---------------------------------");
    System.out.println("Dados do professor:");
  }

  public String getMateria(){
    return materia;
  }

  public void setMateria(String materia){
    this.materia = materia;

    if (materia.equals("Matemática") || materia.equals("Física") || materia.equals("Química") || materia.equals("Educação Financeira") || materia.equals("Biologia")){
      System.out.println("Professor de exatas");
    }

    else if (materia.equals("Português") || materia.equals("Inglês") || materia.equals("Sociologia") || materia.equals("Filosofia") || materia.equals("História") || materia.equals("Geografia") || materia.equals("Artes") || materia.equals("Projeto de Vida") || materia.equals("Educação Física")){
       System.out.println("Professor de humanas");
    } else {
      System.out.println("Materia especial / curso");
    }
  }
  public double getAltura(){
    return altura;
  }
  public void setAltura(double altura){
    this.altura = altura;

    System.out.println("Altura: " + altura);
   
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;

   if (salario >= 4.582) {
     System.out.println("Professor concursado");
   }
    else if(salario == 2.886){
      System.out.println("Professor não concursado");
    }
  }
 
   
 }

