public class ch{
 
  String turnos;
  String carga_horaria;
  String intervalos;

  public ch() {
    System.out.println("---------------------------------");
    System.out.println("Dados do Calendário de Horarios:");
  }


 public String getTurnos(){
   return turnos;
 }

  public void setTurnos(String turnos){
    this.turnos = turnos;

    if (turnos == "7:10-12:25"){
      System.out.println("Turno matutino");
    }

   else if (turnos == "7:10-11:35"){
      System.out.println("Turno matutino");
   }

    else if (turnos == "13:10-17:45"){
      System.out.println("Turno vespertino");
    }

    else if (turnos == "18:00-23:00"){
      System.out.println("Turno Noturno");
    }
   }

    public String getIntervalos(){
      return intervalos;
    }

    public void setIntervalos(String intervalos){
      this.intervalos = intervalos;

      if (intervalos == "9:40-9:55"){
        System.out.println("Intervalo Matutino");
      }

     else if (intervalos == "13:40-15:55"){
        System.out.println("Intervalo Vespertino");
    }

      else if (intervalos == "19:30-19:45"){
        System.out.println("Intervalo Noturno");
       }
    }

  public String getCarga_horaria(){
    return carga_horaria;
  }

  public void setCarga_horaria(String carga_horaria){
    this.carga_horaria = carga_horaria;

    if (carga_horaria == "5 aulas"){
      System.out.println("Ensino fundamental");
    }

    else if (carga_horaria == "6 aulas"){
      System.out.println("Ensino médio");
    }
  }
     
  }  
