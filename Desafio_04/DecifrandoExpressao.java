import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DecifrandoExpressao{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int tamanho = Integer.parseInt(reader.readLine());

			String input[] = new String[tamanho];
			
			for(int i = 0; i < input.length; i++)
				input[i] = reader.readLine();
			
			System.out.println("\n");
			
			for(int i = 0; i < input.length; i++) {
				int tamanhoTexto = input[i].length();
				System.out.println(new StringBuilder(input[i].substring(0, tamanhoTexto/2)).reverse()+
				""+new StringBuilder(input[i].substring(tamanhoTexto/2, tamanhoTexto)).reverse());
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}