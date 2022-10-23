package atividade1;

public class Sequencial {
	public static int linear(int a, int num[]) {
		final int n = num.length;
		int quantidadedIguais = 0;
		
		for (int i = 0; i < n; i++)
			if (a == num[i])
				quantidadedIguais++;
			    
		return quantidadedIguais;
	 }
}