package com.gistimpact.companylist.controller;

import com.gistimpact.companylist.service.CompanyListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyListController {

    @Autowired
    private CompanyListService companyListService;
    @GetMapping("getCompanies")
    public ResponseEntity<List<String>> getComapnies(){
        return companyListService.getAllCompanies();
    }
}
