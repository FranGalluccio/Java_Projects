package Model;

import java.util.ArrayList;

public class ScarpeCrud implements IScarpe{
	ArrayList<Scarpe> scarpe = new ArrayList<Scarpe>();

	@Override
	public void create(Scarpe s) {
		scarpe.add(s);
	}
	@Override
	public void readIndex(Integer index) {
		scarpe.get(index);
	}
	@Override
	public ArrayList<Scarpe> readList() {
		return scarpe;
	}
	@Override
	public void update(Integer index, Scarpe s) {
		scarpe.set(index, s);
	}
	@Override
	public void delete(Scarpe s) {
		scarpe.remove(s);
	}

}
