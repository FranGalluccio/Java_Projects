package model;

import java.util.ArrayList;

public class VideoGameCRUD implements IVideoGameCRUD{
	
	ArrayList<VideoGame> vid = new ArrayList<VideoGame>();

	@Override
	public boolean cancella(int indice) {
		vid.remove(indice);
		return true;
	}

	@Override
	public boolean modifica(int indice, VideoGame videogame) {
		vid.set(indice, videogame);
		return true;
	}

	@Override
	public VideoGame leggi(int i) {
		return vid.get(i);
	}

	@Override
	public ArrayList<VideoGame> leggi() {
		return vid;
	}

	@Override
	public boolean inserisci(VideoGame videogame) {
		vid.add(videogame);
		return true;
	}

	public VideoGame duplica(VideoGame vg) {
		VideoGame v2 = new VideoGame(vg.getId(), vg.getNome(), vg.getGenere(), vg.getPrezzo(), vg.getDataUscita(), vg.getSoftwareHouse(), vg.isRetrocompatibilita());
		return v2;
	}
}
