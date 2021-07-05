
@SuppressWarnings("serial")
public class EntityIllegalException extends IllegalArgumentException {
	
	public EntityIllegalException() {
		super("Attenzione!!! L'entità inserita non appartiene alla gerarchia prevista!!!");
	}

}
