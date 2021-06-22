package gioco;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CaricatoreImmagini {

	BufferedImage image;
	public BufferedImage caricaImmagine(String posizione){
		try {
			image = ImageIO.read(getClass().getResource(posizione));
		} catch (IOException e) {
			System.out.println("Immagine alla posizione:"+posizione+ " aricata correttamente.");
			e.printStackTrace();
		}
		return image;
	}
	
}
