package com.example.tp;

import com.example.tp.Dao.MemberRepo;
import com.example.tp.entities.EnseignantChercheur;
import com.example.tp.entities.Etudiant;
import com.example.tp.entities.Member;
import com.example.tp.service.MemberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class TpApplication implements CommandLineRunner {
	@Autowired
	MemberRepo memberRepo;
	@Autowired
	MemberImpl member;
	public static void main(String[] args) {
		SpringApplication.run(TpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Member etudiant1 = new Etudiant("1122","Ahmed","Ahmed",null,null,"cv","stud@stud.enis","abc",null,"informatique");
		//memberRepo.save(etudiant1);
		Member etudiant2 = new Etudiant("1133","Mohamed","Mohamed",null,null,"cv","stud@stud.enis","123",null,"informatique","member","student");
		memberRepo.save(etudiant2);

		Member enseignant1=new EnseignantChercheur("112","Ayoub","Choura",null,null,"cv","Ayoub@enis.tn","123","professeur","ENIS","member","teacher");
		memberRepo.save(enseignant1);
		Member enseignant2=new EnseignantChercheur("113","Karim","Kessentini",null,null,"cv","karim@enis.tn","456","professeur","ENIS","admin","teacher");
		memberRepo.save(enseignant2);


	}
}
