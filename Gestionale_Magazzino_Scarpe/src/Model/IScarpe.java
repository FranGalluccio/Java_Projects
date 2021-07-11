package Model;

import java.util.ArrayList;

public interface IScarpe {
	public void create(Scarpe s);
	public void readIndex(Integer index);
	public ArrayList<Scarpe> readList();
	public void update(Integer index, Scarpe s);
	public void delete(Scarpe s);
	
}
