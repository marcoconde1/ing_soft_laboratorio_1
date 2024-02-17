import java.util.ArrayList;

public class ListaTareas {
    ArrayList<Tareas> tareas;

    public ListaTareas(ArrayList<Tareas> tareas) {
        this.tareas = tareas;
    }

    public ArrayList<Tareas> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tareas> tareas) {
        this.tareas = tareas;
    }

    public void add(Tareas tarea){
        tareas.add(tarea);
    }

    public int size(){
        return tareas.size();
    }
    public void mostrar_tareas_completadas(){
        for(Tareas i : tareas){
            if(i.getCompletada()){
                int id = i.getId()+1;
                System.out.println(id+" "+i.getTarea()+" "+i.getDate());
            }
        }
    }

    public void mostrar_tareas_pendientes(){
        for(Tareas i : tareas){
            if(!i.getCompletada()){
                int id = i.getId()+1;
                System.out.println(id+" "+i.getTarea()+" "+i.getDate());
            }
        }
    }

    @Override
    public String toString() {
        return "tareas=" + tareas;
    }
}
