package projetoPáscoa;

public class Exponenciacao extends Operacao {
    public float calcula() {
        return (float) Math.pow(Numero1, Numero2);
    }

    public float calcula(int prm1, int prm2) {
        return (float) Math.pow(prm1, prm2);
    }
}