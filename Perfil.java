public class Perfil {
    private String nome;

    public Perfil(String nome){
        this.nome = nome;
    }


    public String getNome(){
        return this.nome;
    }

    public void Saudacao(){
        System.out.printf("Olá,%s \n",this.nome);
    }

    public void Saudacao2(){
        System.out.printf("Olá, %s, tudo bem com você?", this.nome);
    }

    public static void main(String[] args) {
        Perfil perfil = new Perfil("João");
        perfil.Saudacao();
        perfil.Saudacao2();
    }
}
