# Gestione-Dipendente
MVC+Package utility

model Dipendente
-nome
-cognome
-codiceFiscale
-stipendio:Double(wrapper)

model Ruolo
-ruolo:String

model Account
-username
-password(Autogenerata alfanumerica in classe Crittografia)
-email
---------VIEW---------------
view interface IGestoreIO
leggiString,leggiIntero,leggiDouble,mascheraInserimento,mascheraModifica,stampaCSV,stampaScheda;

view GestoreIO(singleton)
leggiString,leggiIntero,mascheraInserimento,mascheraModifica,stampe;
----------UTILITY------------
utility Crittografia(singleton)
-Creare metodo per autogenerazione password.

utility interface ICRUD

utility CRUD(singleton)
-ArrayList<Dipendente>
-inserimento(nel DataBase,in questo caso la lista) > lista.add(Dipendente d)
-rimozione dalla lista                > lista.remove(int i)
-ricerca del singolo dip            > lista.get(int i)
-ritorno della lista                > return lista
///////////////////////////NOTE SUI TIPI GENERICS//////////////////////////////////////////////////////////////////////
//La classe arraylist rientra nelle classe Generics. E' una classe che presenta 1 o più parametri e si presenta in queste forme:
Classe<T> al posto del parametro (T) va sostituito con un tipo reference. Le Generics non accettano primitivi,ma le loro classi wrapper si.

Classe<T,K> le classi generiche possono essere riciclate al variare del tipo reference che andrà a sostituire i parametri.
Nelle strutture generiche possono rientrare anche le interfacce,un esempio sono List e Map.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Crare una maschera di inserimento seguendo il model MVC con lo switch case
 e usando un Arraylist<Dipendente>.
Inserimento,modifica,rimozione,ricerca(Tramite codice fiscale)e ricerca ruoli(restituire l'elenco dei ruoli inseriti)
*-DA IMPLEMENTARE ALLA FINE-ricerca per ruolO(per esempio se cerco ADMIN restituire tutti i dipendenti che hanno ruolo ADMIN), 
visualizzazione dipendenti(mostra tutto) e visualizzazione ruoli e ricerca ruolo(stampacsv ed elenco)

Durante l'inserimento si dovrà non solo inserire il dipendente ma
anche il ruolo e l'utente.

Creare UML del progetto e alla fine fare un recap su Word su tutto il progetto.

public Dipendente cercaDip(String codFiscale){
....
if(utente non trovato)
return null;
else return riferimentoDipendente;
}

Vista v = Vista.getInstance();
CRUD crud = CRUD.getInstance();
v.mascheraModifica(crud.cercaDip("dccoda"));
