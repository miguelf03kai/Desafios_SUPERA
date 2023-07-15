import java.util.*;

class ParesEntreElementos{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int tamanho = scan.nextInt();
		int alvo = scan.nextInt();
		int contador = 0;
		
		System.out.println();

		int[] array = new int[tamanho];
		
		for(int i = 0; i < tamanho ; i++) {
			array[i] = scan.nextInt();
		}
		
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array.length;j++) {
				if(j != (array.length-1))
					if(array[i] < array[j+1])
						if(array[j+1] - array[i] == alvo)
							contador++;
					else 
						if (array[i] - array[j+1] == alvo)
							contador++;
			}
		}
		
		System.out.print("\narr = [");
		for (int i = 0; i < array.length; i++) {			
			System.out.print(array[i]);
			if(i < (array.length-1))
				System.out.print(", ");
		}
		System.out.print("]\n\n");
		
		System.out.println(contador);
    }
}