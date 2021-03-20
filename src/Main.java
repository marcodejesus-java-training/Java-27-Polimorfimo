public class Main {
    public static void main(String args[]){

        Suma suma = new Suma();
        realizarElCalculo(suma, 3, 4);
    }

    static void realizarElCalculo(CalculadoraBase calculadoraBase, double valor1, double valor2){
        calculadoraBase.setValor1(valor1);
        calculadoraBase.setValor2(valor2);
        calculadoraBase.calcular();
        System.out.println(calculadoraBase.getResultado());
    }
}
