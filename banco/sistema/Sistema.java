package sistema;

public class Sistema {
    int id;
    double valor;
    static double[] valorTransf = new double[100];

    Sistema(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public static double storage(int codTransf, double valor) {
        
        int storageSize = valorTransf.length;

        if (valor != 0) {
            for (int i = 0; i < storageSize; i++) {
                if (valorTransf[i] == 0) {
                    valorTransf[codTransf] = valor;
                    System.out.println("Transferencia salva");
                    break;
                }
            }
        }
        return valorTransf[codTransf];
    }

    public static double retorno(int codTransf) {
        return storage(codTransf, 0);
    }
}

