package controller;

import model.Prima;
import model.Seconda;
import model.Terza;

public class Avvio {

	public static void main(String[] args) {
		Prima p = new Prima();
		Seconda s = new Seconda();
		Terza t = new Terza();
		p.chiSei();
		System.out.println(p.toString());
		s.chiSei();
		s.chiETuoPadre();
		System.out.println(s.toString());
		t.chiSei();
		t.chiETuoPadre();
		t.chiETuoNonno();
		System.out.println(t.toString());
	}
}
