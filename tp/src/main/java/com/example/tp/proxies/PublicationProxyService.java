package com.example.tp.proxies;

import com.example.tp.beans.PublicationBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "publicationservice")
public interface PublicationProxyService {
    @GetMapping( value = "/publications/{id}")
    EntityModel<PublicationBean> findPublicationById(@PathVariable("id") Long id);
    @GetMapping(value = "/publications")
    CollectionModel<PublicationBean> AllPublications();
}
