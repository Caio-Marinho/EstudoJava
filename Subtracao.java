public class Subtracao {
    private double numero1;
    private double numero2;

    public Subtracao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double subtrair(){
        return this.numero1 - this.numero2;
    }

    public static void main(String[] args) {
        Subtracao subtracao = new Subtracao(10, 5);
        System.out.println(subtracao.subtrair());
    }
}
