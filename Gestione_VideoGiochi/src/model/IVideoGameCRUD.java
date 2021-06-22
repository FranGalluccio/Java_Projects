package model;

import java.util.ArrayList;

public interface IVideoGameCRUD {
	
	public boolean cancella(int indice);
	public boolean modifica (int indice, VideoGame vid);
	public VideoGame leggi(int i);
	public ArrayList<VideoGame> leggi();
	boolean inserisci(VideoGame vid);
	
}
