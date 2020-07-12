//Objetos
/* Objetos s�o produtos/instancias da classe;
 * 
 */
public class Programa22 {

	public static void main(String[] args) {
		int numero = 4;
		
		//Declara��o de um objeto
		Produto p0;
			
		//Declara��o e inicializando/instanciando o objeto
		//p1 = inst�ncia do objeto / objeto
		Produto p1 = new Produto(); //Construtor
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("========= Produtos =========");
		System.out.println(p1.nome);
		System.out.println("R$"+p1.preco);
		System.out.println(p1.desconto+"%\n");
		
		p0 = new Produto (); //Construtor
		p0.nome = "Caneta Bic";
		p0.preco = 2.14f;
		p0.desconto = 5;
		
		System.out.println(p0.nome);
		System.out.println("R$"+p0.preco);
		System.out.println(p0.desconto+"%\n");
		
		Pessoa pessoa1 = new Pessoa(); //Construtor
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nascimento = 1976;
		
		System.out.println("========= Pessoas =========");
		System.out.println("Nome: "+pessoa1.nome);
		System.out.println("E-mail: "+pessoa1.email);
		System.out.println("Ano de nascimento: "+pessoa1.ano_nascimento);
		
	}

}
