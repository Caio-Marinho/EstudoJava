public class Dollar {
    private final double dolar;

    public Dollar(double dolar) {
        this.dolar = dolar;
    }

    public double getDolar() {
        return dolar;
    }

    public static void main(String[] args){
        Dollar DOLAR = new Dollar(4.94);
        System.out.println(6*DOLAR.getDolar());
    }
}
