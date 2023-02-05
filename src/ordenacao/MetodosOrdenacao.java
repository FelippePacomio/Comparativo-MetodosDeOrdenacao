package ordenacao;

public class MetodosOrdenacao {

    public static Contadores ordenacaoInsercao(int v[]) {
        int i, j, aux, passos = 0, troca = 0;
        for (i = 1; i < v.length; i++) {
            aux = v[i];
            j = i - 1;
            while (j >= 0 && v[j] > aux) {
                v[j + 1] = v[j];
                j--;
                troca++;
            }
            v[j + 1] = aux;
            passos++;
        }
        Contadores contadores = new Contadores(passos, troca);
        return contadores;
    }

    public static Contadores ordenacaoBolha(int v[]) {
        int aux, passos, troca;
        passos = 0;
        troca = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - (i + 1); j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    troca++;
                }

                
            }
            passos++;
        }
        Contadores contadores = new Contadores(passos, troca);
        return contadores;
    }

    public static Contadores ordenacaoSelecao(int v[]) {
        int passos = 0, troca = 0;
        for (int i = 0; i < v.length - 1; i++) {
            int min;
            int aux = i;
            
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[aux]) {
                    aux = j;
                    troca++;
                }
            }
            min = v[aux];
            v[aux] = v[i];
            v[i] = min;
            passos++;
        }
        Contadores contadores = new Contadores(passos, troca);
        return contadores;
        
    }
    
}
