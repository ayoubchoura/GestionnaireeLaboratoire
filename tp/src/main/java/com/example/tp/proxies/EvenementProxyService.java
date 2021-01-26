package com.example.tp.proxies;

import com.example.tp.beans.EvenementBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="evenementservice")
public interface EvenementProxyService {
    @GetMapping(value = "/evenements/{id}")
    EntityModel<EvenementBean> findOneEvenementbyId(@PathVariable("id") Long id);

    @GetMapping(value = "/evenements")
    CollectionModel<EvenementBean> AllEvenements();
}
