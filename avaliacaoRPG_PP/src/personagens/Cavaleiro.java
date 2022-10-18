//Questão 1. c)
package personagens;

import interface_comportamentos.*;

public class Cavaleiro extends Personagem implements ComportamentoHeroico
{
	public Cavaleiro(String nome) 
	{
		super(nome);
	}

	@Override
	public void andar() 
	{
		System.out.println("Cavaleiro " + this.getNome() + " está andando.");
	}

	@Override
	public void guardarItem() 
	{
		System.out.println("Cavaleiro " + this.getNome() + " está guardando uma espada.");
	}

	@Override
	public void usarItem() 
	{
		System.out.println("Cavaleiro " + this.getNome() + " está usando uma poção de estamina.");
	}

	@Override
	public void atacar() 
	{
		System.out.println("Cavaleiro " + this.getNome() + " está atacando um inimigo.");
	}

	@Override
	public void defender() 
	{
		System.out.println("Cavaleiro " + this.getNome() + " está se defendendo de um ataque.");
	}

	@Override
	public void saltar() 
	{
		System.out.println("Cavaleiro " + this.getNome() + " está saltando.");
	}
}
