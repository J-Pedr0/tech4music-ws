package br.com.tech4me.tech4musicws.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4musicws.model.Musica;
import br.com.tech4me.tech4musicws.shared.MusicaDTO;

public interface MusicaService {
    MusicaDTO criarMusica(Musica musica);
    List<MusicaDTO> obterTodas();
    Optional<MusicaDTO> obterPorId(String id);
    void removerMusica(String id);
    MusicaDTO atualizarMusica(String id, Musica musicaNova);
}
