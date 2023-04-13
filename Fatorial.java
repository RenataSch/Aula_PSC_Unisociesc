package projetoPáscoa;

public class Fatorial extends Operacao {
    public float calcula() {
        int fatorial = 1;
        for (int i = 1; i <= Numero1; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public float calcula(int prm1, int prm2) {
        int fatorial = 1;
        for (int i = 1; i <= prm1; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
