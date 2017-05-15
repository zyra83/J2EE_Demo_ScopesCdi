import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Le controleur de ma page web
 * 
 * @author mickael
 *
 */
// @LocalBean
@Named
@ViewScoped
public class AjouterCadeauPageBean implements Serializable {

	String cadeauSaisi;

	@Inject
	private Panier panier;

	public String getCadeauSaisi() {
		return cadeauSaisi;
	}

	public void setCadeauSaisi(String cadeauSaisi) {
		this.cadeauSaisi = cadeauSaisi;
	}

	public void ajouterCadeau() {
		System.out.printf("Ajout de %s%n", cadeauSaisi);
		panier.ajouterSouhait(cadeauSaisi);
	}

	public List<String> getListeCadeaux() {
		return Collections.unmodifiableList(this.panier.getSouhaits());
	}

}
