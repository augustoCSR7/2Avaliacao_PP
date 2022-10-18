//Questão 1. c)
package personagens;

import interface_comportamentos.ComportamentoFeroz;

public class Dragão extends Personagem implements ComportamentoFeroz
{
	public Dragão(String nome) 
	{
		super(nome);
	}

	@Override
	public void andar() 
	{
		System.out.println("Dragão " + this.getNome() + " está andando.");
	}

	@Override
	public void guardarItem() 
	{
		System.out.println("Dragão " + this.getNome() + " está guardando tesouro.");
	}

	@Override
	public void usarItem() 
	{
		System.out.println("Dragão " + this.getNome() + " está usando tesouro como isca.");
	}

	@Override
	public void atirarFogo() 
	{
		System.out.println("Dragão " + this.getNome() + " está incinerando seus inimigos.");
	}

	@Override
	public void voar() 
	{
		System.out.println("Dragão " + this.getNome() + " está voando.");
	}

	@Override
	public void morder() 
	{
		System.out.println("Dragão " + this.getNome() + " está abocanhando seus inimigos.");
	}
}
