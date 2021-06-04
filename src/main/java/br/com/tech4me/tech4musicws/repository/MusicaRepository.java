package br.com.tech4me.tech4musicws.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4musicws.model.Musica;

public interface MusicaRepository extends MongoRepository<Musica, String>{
    
}
