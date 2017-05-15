import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

//@LocalBean
@Named
@Dependent
public class BeanDependentScope  implements Serializable{

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
