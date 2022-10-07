package br.com.appmusic.service;

import java.util.List;

import br.com.appmusic.domain.Playlist;

public interface PlaylistService {
    
    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorId(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);
}