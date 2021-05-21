package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class PlayerService {

    private Player player;
    private PlayerReactiveRepository playerReactiveRepository;

    @Autowired

    public PlayerService(PlayerReactiveRepository playerReactiveRepository) {
        this.playerReactiveRepository = playerReactiveRepository;}

        public Flux<Player> findAll(){return playerReactiveRepository.findAll();}

}
