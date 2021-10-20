package classes.excecoes;

public class ExcecoesProcessarDados extends Exception{
	
	public ExcecoesProcessarDados(String erro) {
		//super(erro);
		super("ERRO NA LEITURA DO ARQUIVO: "+erro);
	}

}
