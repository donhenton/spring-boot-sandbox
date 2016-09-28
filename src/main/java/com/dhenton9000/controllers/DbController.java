/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.controllers;

import com.dhenton9000.domain.Customers;
import com.dhenton9000.repository.CustomersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/db")
public class DbController {
    
    private Logger log = LoggerFactory.getLogger(DbController.class);
    @Autowired
    private CustomersRepository customers;
    
     @RequestMapping("/listCustomers")
    public String listCustomers(Model model) {
        Iterable<Customers> customersList = customers.findAll();
        model.addAttribute("customersList", customersList);
        return "pages/db/listCustomers";
    }
}
