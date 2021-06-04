package br.com.tech4me.tech4musicws.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musicas")
public class Musica {
    @Id
    private String id;

    @NotBlank(message = "Título da musica não pode estar só com com caracter branco.")
    @NotEmpty(message = "Título da musica não pode estar em branco.")
    private String titulo;

    @NotBlank(message = "Artista da musica não pode estar só com com caracter branco.")
    @NotEmpty(message = "Artista da musica não pode estar em branco.")
    private String artista;

    @NotBlank(message = "Álbum da musica não pode estar só com com caracter branco.")
    @NotEmpty(message = "Álbum da musica não pode estar em branco.")
    private String album;

    @NotBlank(message = "Gênero da musica não pode estar só com com caracter branco.")
    @NotEmpty(message = "Gênero da musica não pode estar em branco.")
    private String genero;

    @NotBlank(message = "Ano de Lançamento da musica não pode estar só com com caracter branco.")
    @NotEmpty(message = "Ano de Lançamento da musica não pode estar em branco.")
    private String anoLancamento;

    @NotBlank(message = "Compositor da musica não pode estar só com com caracter branco.")
    @NotEmpty(message = "Compositor da musica não pode estar em branco.")
    private String compositor;
    
    @Override
    public String toString() {
        return "Musica [album=" + album + ", anoLancamento=" + anoLancamento + ", artista=" + artista + ", compositor="
                + compositor + ", genero=" + genero + ", id=" + id + ", titulo=" + titulo + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    
}
