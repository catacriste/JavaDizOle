package Arrays;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//criaçao de 2 objetos do tipo Pessoa
        //o 1º usa o contrutor com assinatura de uma só String
        // que vai preencher o atributo nome, apenas
        //o 2º construtor aceita duas strings, uma para o atibuto nome
        //a outra para o atributo apelido
        Pessoa p1 = new Pessoa ("António", "Coimbra");
        Pessoa p2 = new Pessoa("Mariana", "Costa");
        // Apresenta o das pessoas
        p1.setDataNascimento("31 - 01 - 2014");
        p1.setMorada(" Rua das Flores ");
        p1.setTelefone(961399690);
        p1.setBi(4737272647212l);
        p1.setNif(54321241331l);
        p1.setNiss(54355435454l);
        
        String[] listaAmigos = {"Maria ", "Marisa", "Manuela", "Mafalda" , "Mariana" , "Margarida", "Madonna"};

        System.out.println(p1.dizOlaAmigo(listaAmigos));


        System.out.println(p1.dizOlaAmigo(" ","Jorge" , "Manuel" , "Mario" , "Marienes" , "Mariana das Fossas"));

        System.out.println("------------------------------------HERANCA--");
        
        Pessoa p6 = new Pessoa();
        System.out.println("p6 tem como nome :" + p6.nome + p6.apelido);
        
        Aluno a1 = new Aluno();
        
        System.out.println("a1 - construtor defaul com o nome tem :" + p6.nome + p6.apelido + "e tem o nAluno: " + a1.getNumAluno() );
        
        Aluno a2 = new Aluno("David", "Dascouves" , 35);
        
        a2.dizOlaAmigo(a1.nome);
        
        
        
        System.out.println("-----------------------------------");
        
        
      
        
        Peca ola = new Peca1();
        Peca ola2 = new Peca2();
        ola.nome();
        ola2.nome();
       
        System.out.println("-------------Array Pecas Abstract----------------------");
        Peca[] pecas = new Peca[2];
        
        pecas[0] = ola;
        pecas[1] = ola2;
        
        for(Peca obj : pecas)
        {
        	obj.nome();
        }
        //para extrair os nomes dos atributos, usamos os métodos
        //criados na classe para esse efeito, e automaticamente
        //passados para os objetos p e p2, no momento da sua
        //criaçao: getName() e getApelido()
       // Console.ReadKey();
      //  System.out.println(" ");


      /*  System.out.println(p1.dizOla());
        p1.dizOlaAmigo(p2.getName());
        String dizOlaPessoa = p1.dizOlaAPessoa(p2);
        System.out.println(dizOlaPessoa);
        p1.dizOlaAmigo(p2);
        */

        /*
         * char[] nome  = " Ola mubdo";
         * int contaChar =  0;
         * foreach(char c in nome)
         * {
         *   if(C == 'o')
         *   {
         *      contaChar ++;
         *   }
         * }

        System.out.println("   ");
      /*  System.out.println("Eu chamo-me " + p1.getName() + " " + "E tenho o apelido de : " + p1.getLastName());
        System.out.println("Nasci no dia : " + p1.getDataN());
        System.out.println("Morada : " + p1.getMorada());
        System.out.println("Telefone " + p1.getTelefone());
        System.out.println("Bi : " + p1.getBi());
        System.out.println("Nif: " + p1.getNif());
        System.out.println("Niss : " + p1.getNiss());*/
        
        
 

	}

}
