import java.util.*;
import java.io.*;

class NotasMoedas{
	public static void main(String[] args) {

        double valor = lerArquivo("arquivo.txt");

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int notasContagem = (int) (valor / notas[i]);
            valor %= notas[i];
            System.out.printf("%d Nota(s) de R$ %.2f\n", notasContagem, (double) notas[i]);
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int moedasContagem = (int) (valor / moedas[i]);
            valor %= moedas[i];
            System.out.printf("%d Moedas(s) de R$ %.2f\n", moedasContagem, moedas[i]);
        }
    }
    
    public static double lerArquivo(String arquivo){
        double valor = 0.0;

        BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(arquivo));
            valor = Double.parseDouble(reader.readLine());
            System.out.println(valor+"\n");

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

        return valor;
    }
}