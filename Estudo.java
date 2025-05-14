import java.util.ArrayList;

public class Estudo {
    private ArrayList<String> atividades;

    public Estudo(){
        atividades = new ArrayList<>();
    }

    public void adicionarAtividade(String atividade){
        atividades.add(atividade);
    }

    public ArrayList<String> Atividades(){
        return atividades;
    }

    public void ListarAtividades(){
        for (String atividade : atividades) {
            System.out.println(atividade);
        }
    }

    public static void main(String [] args) {
        Estudo estudo = new Estudo();
        estudo.adicionarAtividade("Matemática");
        estudo.adicionarAtividade("Português");
        estudo.adicionarAtividade("Revisar");
        estudo.ListarAtividades();
    }
}
