package com.comviva.movie.moviecatalogservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @RequestMapping("/all")
    public String getAllCatalog() {
        return "movie catalog";
    }

    public String getCatalogById() {
        return "Catalog By Id";
    }
}
