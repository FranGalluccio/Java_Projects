public class ArrayTools {	
	//Controlla se nell'array è presente il valore
	public static boolean Check(int[] array, int value)
	{
		if(array != null)
		{
			for (int i = 0; i < array.length; i++) {
				if(array[i] == value)
				return true;				
			}
		}
		return false;		
	}
	
	//Riempie l'array con value
	public static void Fill(int[] array, int value)
    {
        if (array != null)
        {
            for (int i = 0; i < array.length; i++)
            {
                array[i] = value;
            }
        }
    }	
	
	//Resetta L'array
	public static void Reset(int[] array)
    {
        Fill(array, 0);
    }

}
