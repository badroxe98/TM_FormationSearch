
package org.formation;
import org.formation.dao.ClientRepository;
import org.formation.dao.FormationRepository;
import org.formation.dao.LocalRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FormationOpApplication {
	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(FormationOpApplication.class, args);
		FormationRepository formationdao =ctx.getBean(FormationRepository.class);
		ClientRepository clientRepository=ctx.getBean(ClientRepository.class);
		LocalRepository localRepository=ctx.getBean(LocalRepository.class);
		//System.out.println(formationdao.countByArticleCat("Development"));
	}

}
