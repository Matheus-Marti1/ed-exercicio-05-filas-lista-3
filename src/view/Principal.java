package view;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		ParqueController parqueController = new ParqueController();

		for (int i = 0; i < 30; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.Nome = "Pessoa" + (i + 1);
			pessoa.Idade = (int) (Math.random() * 31) + 10;
			pessoa.Altura = (float) ((float) (Math.random() * 0.65) + 1.35);
			f.insert(pessoa);
		}
		
		parqueController.brinquedo(f);

	}

}
