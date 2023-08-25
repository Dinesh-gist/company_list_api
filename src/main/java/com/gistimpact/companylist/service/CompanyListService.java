package com.gistimpact.companylist.service;

import com.gistimpact.companylist.models.Company;
import com.gistimpact.companylist.repository.CompanyListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyListService {

    @Autowired
    private CompanyListRepository companyListRepository;
    public ResponseEntity<List<String>> getAllCompanies() {
        List<Company> companies = companyListRepository.getAllCompanies();
        List<String> companyList=new ArrayList<>();
        for(Company company:companies){
            companyList.add(company.getCompanyName());
        }
        return new ResponseEntity<>(companyList, HttpStatus.OK);
    }
}
