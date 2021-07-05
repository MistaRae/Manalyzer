//package com.capstone.server.controllers;
//
//import com.capstone.server.models.Enchantment;
//import com.capstone.server.repositories.EnchantmentRespository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class EnchantmentController {
//
//    @Autowired
//    EnchantmentRespository enchantmentRespository;
//
//
//    @GetMapping(value = "/enchantments")
//    public ResponseEntity<List<Enchantment>> getAllEnchantments(){
//        return new ResponseEntity<>(enchantmentRespository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/enchantments/{id}")
//    public ResponseEntity getEnchantment(@PathVariable Long id){
//        return new ResponseEntity<>(enchantmentRespository.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/enchantments")
//    public ResponseEntity<Enchantment> saveEnchantment(@RequestBody Enchantment enchantment){
//        enchantmentRespository.save(enchantment);
//        return new ResponseEntity<>(enchantment, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping(value = "/enchantments/{id}")
//    public ResponseEntity<Enchantment> deleteEnchantment(@PathVariable Long id){
//        Enchantment found = enchantmentRespository.getById(id);
//        enchantmentRespository.delete(found);
//        return new ResponseEntity<>(null,HttpStatus.OK);
//    }
//
//}
