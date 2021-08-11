package utility;

import java.util.List;

import model.Account;
import model.Dipendente;

public interface ICrud {
	
	public void create(Account u);
	public Dipendente read(Integer i);
	public List<Account> readList();
	public void update(Account u);
	public void cancel(Integer i);

}
