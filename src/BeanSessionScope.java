import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

//@LocalBean
@SuppressWarnings("serial")
@Named
// @SessionScoped
@SessionScoped
public class BeanSessionScope implements Serializable {

	private LocalDateTime date;

	@PostConstruct
	public void init() {
		System.out.println("Initialisation de " + this.getClass().getSimpleName());
		date = LocalDateTime.now();
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
