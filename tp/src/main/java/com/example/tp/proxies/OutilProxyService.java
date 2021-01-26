package com.example.tp.proxies;

import com.example.tp.beans.OutilBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "outilservice")
public interface OutilProxyService {
        @GetMapping(value = "/outils/{id}")
        EntityModel<OutilBean> findOneOutilById(@PathVariable("id") Long id);

        @GetMapping(value = "/outils")
        CollectionModel<OutilBean> AllOutils();
}
