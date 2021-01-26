package com.example.tp.service;

import com.example.tp.Dao.*;
import com.example.tp.beans.EvenementBean;
import com.example.tp.beans.OutilBean;
import com.example.tp.beans.PublicationBean;
import com.example.tp.entities.*;
import com.example.tp.proxies.EvenementProxyService;
import com.example.tp.proxies.OutilProxyService;
import com.example.tp.proxies.PublicationProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberImpl implements IMemberService{
    @Autowired
    MemberRepo memberRepo;
    @Autowired
    EtudiantRepo etudiantRepo;
    @Autowired
    EnseignantChercheurRepo enseignantChercheurRepo;
    @Autowired
    PublicationMemberRepo publicationMemberRepo;
    @Autowired(required = true)
    PublicationProxyService publicationProxyService;
    @Autowired
    EvenementMemberRepo evenementMemberRepo;
    @Autowired
    EvenementProxyService evenementProxyService;
    @Autowired
    OutilMemberRepo outilMemberRepo;
    @Autowired
    OutilProxyService outilProxyService;

    @Override
    public Member addMember(Member m) {
        memberRepo.save(m);
        return m;
    }


    @Override
    public void deleteMember(Long id) {
       memberRepo.deleteById(id);
    }

    @Override
    public Member updateMember(Member p) {
        return memberRepo.saveAndFlush(p);
    }

    @Override
    public Member findMember(Long id) {
        Member mem=memberRepo.findById(id).get();
        return mem;
    }

    @Override
    public List<Member> findAll() {
        return memberRepo.findAll();
    }

    @Override
    public Member findByCin(String cin) {
        return memberRepo.findByCin(cin);
    }

    @Override
    public Member findByEmail(String email) {
        return memberRepo.findByEmail(email);
    }

    @Override
    public List<Member> findByNom(String nom) {
        return memberRepo.findByNom(nom);
    }

    @Override
    public List<Etudiant> findByDiplome(String diplome) {
        return etudiantRepo.findByDiplome(diplome);
    }

    @Override
    public List<EnseignantChercheur> findByGrade(String grade) {
        return enseignantChercheurRepo.findByGrade(grade);
    }

    @Override
    public List<EnseignantChercheur> findByEtablissement(String etablissement) {
        return enseignantChercheurRepo.findByEtablissement(etablissement);
    }
    @Override
    public Etudiant affectEncadToEtd(Long idetd, Long idens) {
        Etudiant etd= etudiantRepo.findById(idetd).get();
        EnseignantChercheur ens= enseignantChercheurRepo.findById(idens).get();
        etd.setEncadrant(ens);

        return etudiantRepo.save(etd);
    }
    /*-----------------------------------------------------*/
    @Override
    public void affectAuteurToPublication(Long idauteur, Long idpub) {
        Member mbr= memberRepo.findById(idauteur).get();
        PublicationMember mbs= new PublicationMember();
        mbs.setAuteur(mbr);
        mbs.setId(new PublicationMemberIds(idauteur,idpub));
        publicationMemberRepo.save(mbs);
    }

    @Override
    public List<PublicationBean> findPublicationByAuteur(Long idauteur) {
        List<PublicationBean> pubs=new ArrayList<PublicationBean>();

        List<PublicationMember> idpubs=publicationMemberRepo.findpubId(idauteur);

        idpubs.forEach(s->{
                    //System.out.println(s);
                    pubs.add(publicationProxyService.findPublicationById(s.getId().getPublication_id()).getContent());

                }
        );

        return pubs;

    }
    /*----------------------------------------------------------------*/
    @Override
    public void affectMemberToEvenement(Long idorg, Long idevt) {
        Member mbr=memberRepo.findById(idorg).get();
        EvenementMember eventMember = new EvenementMember();
        eventMember.setOrganiser(mbr);
        eventMember.setId(new EvenementMemberIds(idevt,idorg));
        evenementMemberRepo.save(eventMember);

    }
    @Override
    public List<EvenementBean> findEvenementByOrganiser(Long idorg) {
        List<EvenementBean> events = new ArrayList<EvenementBean>();
        List<EvenementMember> idevents = evenementMemberRepo.findEvenementById(idorg);
        idevents.forEach(s->{
            System.out.println(s);
            events.add(evenementProxyService.findOneEvenementbyId(s.getId().getEvenement_id()).getContent());
        });
        return events ;
    }

    /*------------------------------------------------------------------------------*/
    @Override
    public List<OutilBean> findOutilByDeveloppeur(Long iddev) {
        List<OutilBean> outils= new ArrayList<OutilBean>();
        List<OutilMember> idoutils = outilMemberRepo.findOutilById(iddev);
        idoutils.forEach(s->{
            System.out.println(s);
            outils.add(outilProxyService.findOneOutilById(s.getOutilMemberIds().getOutil_id()).getContent());
        });
        return outils;
    }

    @Override
    public void affectDeveloppeurToOutil(Long iddev, Long idout) {
        Member mbr=memberRepo.findById(iddev).get();
        OutilMember mbo = new OutilMember() ;
        mbo.setDeveloppeur(mbr);
        mbo.setOutilMemberIds(new OutilMemberIds(idout,iddev));
        outilMemberRepo.save(mbo);
    }

}
