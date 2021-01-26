package com.example.tp.service;

import com.example.tp.beans.EvenementBean;
import com.example.tp.beans.OutilBean;
import com.example.tp.beans.PublicationBean;
import com.example.tp.entities.EnseignantChercheur;
import com.example.tp.entities.Etudiant;
import com.example.tp.entities.Member;

import java.util.List;
public interface IMemberService {
    public Member addMember(Member m);
    public void deleteMember(Long id);
    public Member updateMember(Member p);
    public Member findMember(Long id);
    public List<Member> findAll();
    //Filtrage par propriété
    public Member findByCin(String cin);
    public Member findByEmail(String email);
    public List<Member> findByNom(String nom);
    //recherche spécifique des étudiants
    public List<Etudiant> findByDiplome(String diplome);
    //recherche spécifique des enseignants
    public List<EnseignantChercheur> findByGrade(String grade);
    public List<EnseignantChercheur> findByEtablissement(String etablissement);
    public Etudiant affectEncadToEtd(Long idetd, Long idens);
    /*-------------------------------------------------------------*/
    //Affecter une publication à un auteur:
    public void affectAuteurToPublication(Long idauteur, Long idpub);
    //Récupérer les publications d’un auteur
    public List<PublicationBean> findPublicationByAuteur(Long idauteur);

    /*----------------------------------------------------------------*/
    //Affecter un organisateur a un evenement
    void affectMemberToEvenement(Long idorg, Long idevt);
    //Récupérer les evenements d’un oganisateur
    List<EvenementBean> findEvenementByOrganiser(Long idorg);

    /*----------------------------------------------------------------*/
    public List<OutilBean> findOutilByDeveloppeur(Long iddev);
    public void affectDeveloppeurToOutil(Long iddev, Long idout);

}
