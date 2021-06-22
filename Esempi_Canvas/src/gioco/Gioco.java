package gioco;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;


public class Gioco extends Canvas implements KeyListener{	
	
	// impostazioni della finestra
	private static final int larghezza = 1280;
	private static final int altezza = 720;	
	// nome del gioco
	private static final String nome_gioco = "Gioco RealBattle";
	// carica immagini
	BufferedImage sfondo = null;
	BufferedImage coniglio = null;
	BufferedImage ombrello = null;
	
	
	public Gioco() {
		caricaRisorse();
	}

	public static void main(String[] args) {
		
		Gioco gioco = new Gioco();
		
		JFrame finestra_gioco = new JFrame(nome_gioco);
		
		// Imposta la dimensione della finestra
		Dimension dimensione_finestra = new Dimension(larghezza, altezza);		
		finestra_gioco.setPreferredSize(dimensione_finestra);
		
		// dimensione massima della finestra
		finestra_gioco.setMaximumSize(dimensione_finestra);
		
		// finstra non ridimensionabile
		finestra_gioco.setResizable(false);
		
		// esce dal gioco quando sulla finestra si preme la x
		finestra_gioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		finestra_gioco.add(gioco);
		finestra_gioco.addKeyListener(gioco);
		
		finestra_gioco.pack();
		// rende la finestra visibile
		finestra_gioco.setVisible(true);		
		
	}
	
	private void caricaRisorse() {
		CaricatoreImmagini loader = new CaricatoreImmagini();
		sfondo = loader.caricaImmagine("/immagini/sfondo.jpg");
		coniglio = loader.caricaImmagine("/immagini/coniglio.jpg");
		ombrello = loader.caricaImmagine("/immagini/ombello.jpg");
		System.out.println("Risorse caricate");
	}
	private void disegna() {
		//prende l'oggetto del gioco e dichiara che si può disegnare su quell'oggetto
		Graphics g = this.getGraphics();
		g.drawImage(sfondo, 0, 0, larghezza, altezza, this);
		
		g.dispose();
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		disegna();
	}
	@Override
	public void keyReleased(KeyEvent e) {}
}
