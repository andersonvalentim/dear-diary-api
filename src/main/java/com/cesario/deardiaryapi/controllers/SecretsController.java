package com.cesario.deardiaryapi.controllers;

import com.cesario.deardiaryapi.models.Secret;
import com.cesario.deardiaryapi.repository.SecretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
public class SecretsController {

    @Autowired
    SecretRepository secretRepository;

    @GetMapping(value = "/secrets")
    public List<Secret> listSecrets(){
        return secretRepository.findAll();
    }

    @PostMapping(value = "/secret")
    public Secret insertSecret(@RequestBody Secret secret){
        secret.setPublicationDate(Calendar.getInstance());
        return secretRepository.save(secret);
    }

    @PutMapping(value = "/secret")
    public Secret updateSecret(@RequestBody Secret secret){
        return secretRepository.save(secret);
    }

    @DeleteMapping(value = "/secret")
    public void deleteSecret(@RequestBody Secret secret){
        secretRepository.delete(secret);
    }

}
