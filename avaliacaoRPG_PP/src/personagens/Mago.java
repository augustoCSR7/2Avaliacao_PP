//Questão 1. c)
package personagens;

import interface_comportamentos.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico
{
	public Mago(String nome) 
	{
		super(nome);
	}

	@Override
	public void andar() 
	{
		System.out.println("Mago " + this.getNome() + " está andando.");
	}

	@Override
	public void guardarItem() 
	{
		System.out.println("Mago " + this.getNome() + " está guardando um cajado.");
	}

	@Override
	public void usarItem() 
	{
		System.out.println("Mago " + this.getNome() + " está usando uma poção de mana.");
	}

	@Override
	public void invisibilidade() 
	{
		System.out.println("Mago " + this.getNome() + " está invisível.");
	}

	@Override
	public void ultraRapidez() 
	{
		System.out.println("Mago " + this.getNome() + " está correndo na velocidade da luz.");
	}
}
