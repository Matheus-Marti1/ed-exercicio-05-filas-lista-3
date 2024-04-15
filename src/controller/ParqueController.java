package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {

	public ParqueController() {
		super();
	}

	public void brinquedo(Fila f) {
		Pessoa pessoa = new Pessoa();
		while (!f.isEmpty()) {
			try {
				pessoa = (Pessoa) f.remove();
				if (pessoa.Idade > 16 && pessoa.Altura > 1.60) {
					System.out.println("Cliente " + pessoa.Nome + " passou para dentro do brinquedo.");
				} else {
					if (!(pessoa.Idade > 16) && !(pessoa.Altura > 1.60)) {
						System.out.println("Cliente " + pessoa.Nome
								+ " não passou por ter idade menor que 16 e altura menor que 1.60m.");
					}
					if (!(pessoa.Idade > 16) && (pessoa.Altura > 1.60)) {
						System.out.println("Cliente " + pessoa.Nome + " não passou por ter idade menor que 16.");
					}
					if ((pessoa.Idade > 16) && !(pessoa.Altura > 1.60)) {
						System.out.println("Cliente " + pessoa.Nome + " não passou por ter altura menor que 1.60m.");
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
