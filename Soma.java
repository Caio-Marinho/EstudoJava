public class Soma {
    private int numero1;
    private int numero2;

    public Soma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int somar(){
        return this.numero1 + this.numero2;
    }

    public static void main(String[] args) {
        Soma soma = new Soma(10, 5);
        System.out.println(soma.somar());
    }
}
