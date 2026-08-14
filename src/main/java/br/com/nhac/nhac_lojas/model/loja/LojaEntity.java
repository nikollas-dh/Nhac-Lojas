package br.com.nhac.nhac_lojas.model.loja;

public class LojaEntity {
    private String id;
    private String nome;
    private String descricao;
    private String categoria;
    private String imagemUrl;
    private boolean isAberto;
    private DadosOperacionais dadosOperacionais;
    private Endereco endereco;
    private GeoLocalizacao geoLocalizacao;
    private HorariosFuncionamento horariosFuncionamento;
}
