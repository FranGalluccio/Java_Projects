
public class Util {
	
	//aggiunge un valore ad una quantità fino al raggiungimento della quantità massima
	public void add(int value, int quantDisp, int quantMax)
    {
        if (quantDisp > 0)
        {
            value += quantDisp;

            if (quantDisp > quantMax)
            {
                quantDisp = quantMax;
            }
        }
    }
	
	//rimuove un valore ad una quantità (se il valore da rimuovere non è superiore alla quantità disponibile)
	 public int remove(int value, int quantDisp, int quantMax)
     {        

         if (quantDisp > 0)
         {
             value = (value > quantMax) ? quantMax : quantDisp;
             quantDisp -= value;
         }
         return value;
     }

}
