package br.com.appmusic.domain;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "playlists")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(min = 2, max = 60)
    @Column(nullable = false, length = 60)
    private String nome;

    @NotBlank
    @Column(nullable = false, length = 60)
    private String descricao;

    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL)
    private List<Musica> musicas;

    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return List<Musica> return the musicas
     */
    public List<Musica> getMusicas() {
        return musicas;
    }

    /**
     * @param musicas the musicas to set
     */
    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

}