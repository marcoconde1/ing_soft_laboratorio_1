import java.util.Date;

public class Tareas {
    int id;

    String tarea;
    Date date;
    Boolean completada;


    public Tareas( int id,String tarea, Date date ) {
        this.id = id;
        this.tarea = tarea;
        this.date = date;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return  tarea + '\'' +
                " Fecha:" + date ;
    }

    public void completarTarea(){
        setCompletada(true);
    }
}
