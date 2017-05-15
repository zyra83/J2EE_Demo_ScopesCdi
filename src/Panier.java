import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named("MONPANIER")
@SessionScoped
public class Panier implements Serializable {

	private List<String> cadeaux;

	@PostConstruct
	public void init() {
		System.out.println("Initialisation de " + this.getClass().getSimpleName());
		cadeaux = new ArrayList();
	}

	public void ajouterSouhait(String souhait) {
		cadeaux.add(souhait);
	}

	public List<String> getSouhaits() {
		return this.cadeaux;
	}

	@PreDestroy
	public void shutdown() {
		System.out.println("Shutdown");
	}

}
