package view;

import java.util.*;

import model.Account;
import model.Dipendente;
import model.Ruolo;
import utility.Crittografia;
public final class GestoreIO implements IGestoreIO{
	private static GestoreIO instance=null;
	private GestoreIO() {}
	public static GestoreIO getInstance() {
		if(instance==null)
			instance=new GestoreIO();
		return instance;
	}
	@Override
	public String leggiStringa(String suggerimento) {
		System.out.print(suggerimento);
		return new Scanner(System.in).nextLine();
	}
	 @Override
	public Integer leggiIntero(String suggerimento) {
		int a;
		System.out.print(suggerimento);
		try {
			a=Integer.parseInt(new Scanner(System.in).nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Inserire un numero!");
			a=leggiIntero(suggerimento);
		}
		return a;
	}
	 @Override
	public Double leggiDouble(String suggerimento) {
		double a;
		System.out.print(suggerimento);
		try {
			a=Integer.parseInt(new Scanner(System.in).nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Inserire un numero!");
			a=leggiIntero(suggerimento);
		}
		return a;
	}
	@Override
	public void mascheraInserimento(Dipendente dip) {
		System.out.println("Dipendente: ");
		dip.setNome(leggiStringa("\t-Nome: "));
		dip.setCognome(leggiStringa("\t-Cognome: "));
		dip.setCodiceFiscale(leggiStringa("\t-Codice Fiscale: "));
		dip.setStipendio(leggiDouble("\t-Stipendio: "));
		dip.setAccount(new Account());
		dip.getAccount().setEmail(leggiStringa("E-mail: "));
		dip.getAccount().setUsername(leggiStringa("Username: "));
		dip.getAccount().setPassword(Crittografia.getInstance().getPassword());		
		dip.getAccount().setRuolo(new Ruolo());
		dip.getAccount().getRuolo().setRuolo(leggiStringa("Ruolo: "));
	}
	@Override
	public void mascheraModifica(Dipendente dip) {
		boolean flag;
		String s;
		s=leggiStringa("Nome ["+dip.getNome()+"]: ");
		if(s!="")
			dip.setNome(s);
		s=leggiStringa("Cognome ["+dip.getCognome()+"]: ");
		if(s!="")
			dip.setCognome(s);
		s=leggiStringa("Codice Fiscale ["+dip.getCodiceFiscale()+"]:");
		if(s!="")
			dip.setCodiceFiscale(s);
		do{
			flag=false;
			s=leggiStringa("Stipendio ["+dip.getStipendio()+"]:");
			if(s!="")
				try{
					dip.setStipendio(Double.parseDouble(s));
				}catch(NumberFormatException e){
					System.out.println("Inserire un numero!");
					flag=true;
				}
		 }while(flag);
		s=leggiStringa("E-mail ["+dip.getAccount().getEmail()+"]: ");
		if(s!="")
			dip.getAccount().setEmail(s);
		s=leggiStringa("Username ["+dip.getAccount().getUsername()+"]: ");
		if(s!="")
			dip.getAccount().setUsername(s);
		s=leggiStringa("Password ["+dip.getAccount().getPassword()+"]: Modificare?\n");
		if(s.equalsIgnoreCase("si"))
				dip.getAccount().setPassword(Crittografia.getInstance().getPassword());
		s=leggiStringa("Ruolo ["+dip.getAccount().getRuolo()+"]: ");
		if(s!="")
			dip.getAccount().getRuolo().setRuolo(s);
	}
	@Override
	public void stampaScheda(ArrayList<Dipendente> dipendente) {
		for(int i=0;i<dipendente.size();i++) {
			System.out.println("Scheda "+(i+1));
			System.out.print("Dipendente:\n\t-Nome: "+dipendente.get(i).getNome()+
					"\n\t-Cognome: "+dipendente.get(i).getCognome()+
					"\n\t-Codice Fiscale: "+dipendente.get(i).getCodiceFiscale()+
					"\nAccount:\n\t-Username: "+dipendente.get(i).getAccount().getUsername()+
					"\n\t-Email: "+dipendente.get(i).getAccount().getEmail()+
					"\n\t-Password: "+dipendente.get(i).getAccount().getPassword().charAt(0));
					for(int j=1;j<=(dipendente.get(i).getAccount().getPassword().length()-1);j++)
						System.out.print("*");
	System.out.println(dipendente.get(i).getAccount().getPassword().charAt((dipendente.get(i).getAccount().getPassword().length()-1))+"\nRuolo: "+dipendente.get(i).getAccount().getRuolo());
		}
	}
	public void stampaSchedaRuolo(ArrayList<Dipendente>dipendente,String ruolo){
		boolean flag=true;
				for(int i=0;i<dipendente.size();i++) {
					if(dipendente.get(i).getAccount().getRuolo().getRuolo().equalsIgnoreCase(ruolo)){
						flag=false;
						System.out.println("Scheda "+(i+1));
						System.out.print("Dipendente:\n\t-Nome: "+dipendente.get(i).getNome()+
								"\n\t-Cognome: "+dipendente.get(i).getCognome()+
								"\n\t-Codice Fiscale: "+dipendente.get(i).getCodiceFiscale()+
								"\n-Account:\n\t-Username: "+dipendente.get(i).getAccount().getUsername()+
								"\n\t-Email: "+dipendente.get(i).getAccount().getEmail()+
								"\n\t-Password: "+dipendente.get(i).getAccount().getPassword().charAt(0));
						for(int j=1;j<=(dipendente.get(i).getAccount().getPassword().length()-1);j++)
							System.out.print("*");
						System.out.println(dipendente.get(i).getAccount().getPassword().charAt((dipendente.get(i).getAccount().getPassword().length()-1))+"\nRuolo: "+dipendente.get(i).getAccount().getRuolo());
					}
		}
		if(flag)
			System.out.println("Non è stato trovato alcun Dipendente con questo ruolo");
	}
	@Override
	public void stampaCSV(ArrayList<Dipendente> dipendente) {
		for(int i=0;i<dipendente.size();i++) {
			System.out.println(dipendente.get(i));
		}
	}
	public String menu(){
		return "Menù:\n1)Inserimento\n2)Modifica\n3)Cancella\n4)Ricerca per codice fiscale\n5)Stampa Scheda\n6)Stampa CSV\n7)Stampa per ruolo in formato Scheda\n8)Exit\n";
	}
}
