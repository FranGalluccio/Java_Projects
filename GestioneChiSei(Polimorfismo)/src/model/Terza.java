package model;

public class Terza extends Seconda{
	@Override
	public void chiSei() {
		System.out.println("Sono la terza Classe");
	}
	
	@Override
	public void chiETuoPadre() {
		super.chiSei();
	}
	
	public void chiETuoNonno() {
		super.chiETuoPadre();
	}
	
	public void doveSei() {
		System.out.println(toString());
	}
	
}
