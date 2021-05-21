package com.example.demo.controller;

import com.example.demo.CsvUtilFile;
import com.example.demo.model.Player;
import com.example.demo.repository.PlayerReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ValueConstants;
import reactor.core.publisher.Flux;

import java.awt.*;
import java.util.List;

@Controller
@RequestMapping(value = "/players")
    public class PlayerController {

       @GetMapping("/list")
       public String listPlayers(Model model){
            List<Player> listP =CsvUtilFile.getPlayers();
           model.addAttribute("players", listP);
           return "players";
       }



}
