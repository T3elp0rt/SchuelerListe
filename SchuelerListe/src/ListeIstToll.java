import java.util.Random;
public class ListeIstToll {

	List<Schueler> SchuelerListe;
	public void Start() {
		SchuelerListe = new List<Schueler>();
		Hallo();
		outputList();
	}
	
	public void Hallo() {
		
		Random RNG = new Random();
		for(int i = 0;i<10;i++) {
			//SchuelerListe.append();
		}
	}
	public void outputList() {
		SchuelerListe.toFirst();
		while(SchuelerListe.hasAccess()) {
			System.out.println(SchuelerListe.getContent());
			SchuelerListe.next();
		}
	}
}
