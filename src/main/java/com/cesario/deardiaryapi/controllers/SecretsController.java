package com.cesario.deardiaryapi.controllers;

import com.cesario.deardiaryapi.models.Secret;
import com.cesario.deardiaryapi.repository.SecretRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
@CrossOrigin("*")
@Api(value = "Dear Diary")
public class SecretsController {

    @Autowired
    SecretRepository secretRepository;

    @ApiOperation(value ="This method returns a list of secrets in json.")
    @GetMapping(value = "/list-secrets")
    public List<Secret> listSecrets(){
        return secretRepository.findAll(Sort.by(Sort.Direction.DESC, "publicationDate"));
    }

    @ApiOperation(value = "\n" +
            "Adds a secret to the database. In this operation, the data is sent " +
            "in json receiving the parameters: subject, content and publicationDate.")
    @PostMapping(value = "/insert-secret")
    public Secret insertSecret(@RequestBody Secret secret){
        secret.setPublicationDate(Calendar.getInstance());
        return secretRepository.save(secret);
    }

    @ApiOperation(value = "Edit a secret. In this operation, the data is sent in json receiving " +
            "the parameters: subject, content and publicationDate.")
    @PutMapping(value = "/update-secret")
    public Secret updateSecret(@RequestBody Secret secret){
        secret.setPublicationDate(Calendar.getInstance());
        return secretRepository.save(secret);
    }

    @ApiOperation(value = "\n" +
            "Deletes a secret. In this operation, data is sent in json receiving the parameters: " +
            "subject, content and publicationDate.")
    @DeleteMapping(value = "/delete-secret/{id}")
    public void deleteSecret(@PathVariable long id){
        Secret secret = secretRepository.findById(id);
        secretRepository.delete(secret);
    }

}
