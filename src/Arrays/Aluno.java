package Arrays;

public class Aluno extends Pessoa {
	private int numAluno;
	//Construtor default do aluno
	public Aluno()
	{
		super();		// acionar e construtor defaul da classe super
		numAluno = 10;	// 0reehcy8jeht9 do atributo local
		
	}
	
	//Construtor com parametro de entrada para atributos local e super
	public Aluno(String nome, String apelido, int numAluno)
	{
		super(nome,apelido);  //construtor super com passagem dos dois valores.
		this.numAluno = numAluno;
	}

	/**
	 * @return the numAluno
	 */
	public int getNumAluno() 
	{
		return numAluno;
	}

	/**
	 * @param numAluno the numAluno to set
	 */
	public void setNumAluno(int numAluno) 
	{
		this.numAluno = numAluno;
	}
	
	// OVERRIDE DO METODO DIZ OLA
	public String dizOlaAmigo(String nomeAmigo)
	{
		return "Olá " + nomeAmigo + " Eu Sou " + nome + apelido;
	}
	
}
