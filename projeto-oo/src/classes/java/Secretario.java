package classes.java;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login, senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Secretario() {
		
	}
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	@Override
	public double salario() {
		return 2500.97 * 0.99;
	}
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
	
		//return login.equals("admin") && senha.equals("admin");
		return autenticar();
	}
	
	

}
