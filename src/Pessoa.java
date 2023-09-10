public class Pessoa {
    double peso;
    double altura;

    public void IMC(){
        double IMC = peso/(altura * altura);
        IMC = Math.round(IMC * 100.0)/100.00;

        System.out.println("O seu IMC é: "+IMC);
    }
}
