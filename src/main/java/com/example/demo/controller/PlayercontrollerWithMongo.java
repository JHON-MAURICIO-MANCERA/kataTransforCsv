package com.example.demo.controller;

import com.example.demo.CsvUtilFile;
import com.example.demo.model.Player;
import com.example.demo.repository.PlayerReactiveRepository;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayercontrollerWithMongo {

    @Autowired
    PlayerService playerService;

    @GetMapping("/mongo")
      Flux<Player> getAll(){ return playerService.findAll();}

}



