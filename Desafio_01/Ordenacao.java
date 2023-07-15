import java.util.*;

class Ordenacao {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		int tamanho = scan.nextInt();
		
		for(int i = 0; i < tamanho; i++) {
			numeros.add(scan.nextInt());
		}
		
		for(int i = 0; i < numeros.size(); i++ ) {
			if(numeros.get(i) % 2 == 0)
				pares.add(numeros.get(i));
			else
				impares.add(numeros.get(i));
		}
		
		Collections.sort(pares);
		Collections.sort(impares);
		Collections.reverse(impares);
		
		numeros.clear();
		numeros.addAll(pares);
		numeros.addAll(impares);
		
		System.out.println("\n\n");
		
		for (int i : numeros) {
			System.out.println(i);
		}

	}
}