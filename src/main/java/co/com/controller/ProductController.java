/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controller;

import co.com.repository.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jpatarroyo
 */
@Controller
public class ProductController {
    
    @Autowired
    ProductoRepositorio repository;
    
    @RequestMapping("/productos")
    public String productos(Model model){
        model.addAttribute("productos", repository.findAll());
        return "productos";
    }
    
    @RequestMapping("/crear")
    public String crear(Model model){
        return "crear";
    }
    
    
}
