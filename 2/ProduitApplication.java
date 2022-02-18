package org.sid.produit;

import org.sid.produit.dao.EmployeRepository;
//import org.sid.produit.dao.UserRepository;
import org.sid.produit.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner {
   // @Autowired
    //private UserRepository UserReposiotry;
    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ProduitApplication.class, args);
    }
    @Override
    public void  run(String... args)throws Exception{
        restConfiguration.exposeIdsFor(Employe.class);
    }
    /*@Bean
    public BCryptPasswordEncoder getBCPE(){
        return new BCryptPasswordEncoder();
    }*/
}
