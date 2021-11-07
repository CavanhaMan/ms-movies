package com.iftm.moviecatalogservice.resources;

import com.iftm.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        //return Collections.singletonList(new CatalogItem("Test", "Test Desc", 4));
        return Collections.singletonList(new CatalogItem("Transformers", "Filme de Robo", 4));
        //esse retorno foi criado para ele retornar algo "a força" sendo que ainda não temos dados
    }
}