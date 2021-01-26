package com.example.tp.controller;

import com.example.tp.beans.EvenementBean;
import com.example.tp.beans.OutilBean;
import com.example.tp.beans.PublicationBean;
import com.example.tp.entities.EnseignantChercheur;
import com.example.tp.entities.Etudiant;
import com.example.tp.entities.Member;
import com.example.tp.proxies.EvenementProxyService;
import com.example.tp.proxies.OutilProxyService;
import com.example.tp.proxies.PublicationProxyService;
import com.example.tp.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MemberRestController {
    @Autowired
    IMemberService memberService;
    @Autowired
    PublicationProxyService publicationProxyService;
    @Autowired
    EvenementProxyService evenementProxyService;
    @Autowired
    OutilProxyService outilProxyService;

    @RequestMapping(value="/members",method = RequestMethod.GET)
    public List<Member> findMembers(){
        return memberService.findAll();
    }
    @GetMapping(value = "/members/{id}")
    public Member findOneMemberById(@PathVariable Long id){
        return memberService.findMember(id);
    }
    @GetMapping(value = "/members/search/cin")
    public Member findOneMemberByCin(@RequestParam String cin){
        return memberService.findByCin(cin);
    }
    @GetMapping(value="/member/search/email")
    public Member findOneMemberByEmail(@RequestParam String email) {
        return memberService.findByEmail(email);
    }
    /* _________________________________________________   */
    @PostMapping(value = "/members/enseignant")
    public Member addMember(@RequestBody EnseignantChercheur doct){
       return memberService.addMember(doct);
    }
    @PostMapping(value = "/members/etudiant")
    public Member addMember(@RequestBody Etudiant etd){
        return memberService.addMember(etd);
    }
    /*--------------------------------------------------------*/
    @DeleteMapping(value = "/members/{id}")
    public void deleteMember(@PathVariable Long id){
         memberService.deleteMember(id);
    }
    /*---------------------------------------------------------*/
    @PutMapping(value="/members/etudiant/{id}")
    public Member updatemembre(@PathVariable Long id, @RequestBody Etudiant p) {
        p.setId(id);
        return memberService.updateMember(p);
    }
    @PutMapping(value="/members/enseignant/{id}")
    public Member updateMembre(@PathVariable Long id, @RequestBody EnseignantChercheur p) {
        p.setId(id);
        return memberService.updateMember(p);
    }
    /*------------------------------------------------*/
    @PutMapping(value = "/membres/etudiant")
    public Member affectEncadToEtd(@RequestParam Long idetd, @RequestParam Long idens) {

         return memberService.affectEncadToEtd(idetd,idens);
    }

    /*----------------PubsProxyController-------------------------------------*/
   @GetMapping("/publications/{id}")
    public EntityModel<PublicationBean> findPublicationById(@PathVariable Long id)
    {
        return publicationProxyService.findPublicationById(id);

    }
    @GetMapping("/publications/auteur/{id}")
    public List<PublicationBean> findPublicationByMember(@PathVariable(name="id") Long idaut)
    {
        return memberService.findPublicationByAuteur(idaut);
    }
    @PutMapping(value = "/members/auteur")
    public void affectMemberToPublication(@RequestParam Long ideut, @RequestParam Long idpub) {
        memberService.affectAuteurToPublication(ideut,idpub);
    }

    /*----------------EvtsProxyController-------------------------------------*/
    @GetMapping("/evenements/{id}")
    public EntityModel<EvenementBean> findEvenementById(@PathVariable Long id)
    {
        return evenementProxyService.findOneEvenementbyId(id);

    }
    @GetMapping("/evenements/organisateur/{id}")
    public List<EvenementBean>findEvenementsByOrganisateur(@PathVariable(name="id") Long idorg)
    {
        return memberService.findEvenementByOrganiser(idorg);
    }
    @PutMapping(value = "/members/organiser")
    public void affectMemberToEvenement(@RequestParam Long idorg, @RequestParam Long idevt) {


        memberService.affectMemberToEvenement(idorg,idevt);
    }
    /*----------------OutilsProxyController-------------------------------------*/
    @GetMapping("/outils/developpeur/{id}")
    public List<OutilBean> findOutilByDeveloppeur(@PathVariable(name = "id") Long iddev) {
        return memberService.findOutilByDeveloppeur(iddev);
    }
    @GetMapping("/outils/{id}")
    public EntityModel<OutilBean> findOneOutilById(@PathVariable Long id) {
        return outilProxyService.findOneOutilById(id);
    }
    @PutMapping(value = "/members/developer")
    public void affecteMemberToOutil(@RequestParam Long iddev, @RequestParam Long idout) {

        memberService.affectDeveloppeurToOutil(iddev,idout);
    }
    //*************************************************************//
    @GetMapping("/fullmember/{id}")
    public Member findAFullMember(@PathVariable(name="id") Long id)
    {
        Member mmbr=memberService.findMember(id);
        mmbr.setPublications(memberService.findPublicationByAuteur(id));
        mmbr.setEvenements(memberService.findEvenementByOrganiser(id));
        mmbr.setOutils(memberService.findOutilByDeveloppeur(id));
        return mmbr;
    }





}
