/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author dappo
 */
@Entity
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Integer paginas;
    private String isbn;
    private String idioma;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lancamento;
    @Lob
    private String sinopse;
    private String foto1;
    private String foto2;
    private String foto3;
    
    @ManyToOne
    private Genero genero;
    @ManyToOne
    private Editora editora;
    @ManyToMany
    private List<Autor> autores;
    
    
    
}
