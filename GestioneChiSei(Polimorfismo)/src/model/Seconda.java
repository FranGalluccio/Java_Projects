package model;

public class Seconda extends Prima{
	
	@Override
	public void chiSei() {
		System.out.println("Sono la seconda Classe");
	}
	
	public void chiETuoPadre() {
		super.chiSei();
	}
	
	public void doveSei() {
		System.out.println(toString());
	}
}
