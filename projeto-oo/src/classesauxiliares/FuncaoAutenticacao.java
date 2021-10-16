package classesauxiliares;

import interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
		
	}
	
	public boolean autenticarAcesso() {
		
		return permitirAcesso.autenticar();
	}
	
	//public boolean autenticarAcesso(PermitirAcesso acesso) {
	//	return acesso.autenticar();
	//}

}
