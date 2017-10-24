package br.cefetmg.inf.geral.model.domain;

import java.util.Date;

public class Animal {
    private Long seq_Animal;
    private Long seq_Procedencia;
    private Long cod_Grupo;
    private Long seq_Animal_Pai;
    private Long seq_Animal_Mae;
    private Long nro_Animal;
    private Date dat_Nascimento;
    private String idt_Tipo;
    private String idt_Status;
    private String cod_email;
    private String pelagem;
    private Integer peso;
    private Integer idade;
    private String nomeAnimal;
    private Long numSisbov;
    private Date desmama;
    private Date aptidao;
    private Long numPai;
    private Long numMae;
    private Date entrada;
    private Long brincoEletronico;
    private String racaPura;
    private String racaMestica_1;
    private String racaMestica_2;
    private Long porcentagem_1;
    private Long porcentagem_2;
    private String nomeMae;
    private String nomePai;

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Long getBrincoEletronico() {
        return brincoEletronico;
    }

    public void setBrincoEletronico(Long brincoEletronico) {
        this.brincoEletronico = brincoEletronico;
    }

    public String getRacaPura() {
        return racaPura;
    }

    public void setRacaPura(String racaPura) {
        this.racaPura = racaPura;
    }

    public String getRacaMestica_1() {
        return racaMestica_1;
    }

    public void setRacaMestica_1(String racaMestica_1) {
        this.racaMestica_1 = racaMestica_1;
    }

    public String getRacaMestica_2() {
        return racaMestica_2;
    }

    public void setRacaMestica_2(String racaMestica_2) {
        this.racaMestica_2 = racaMestica_2;
    }

    public Long getPorcentagem_1() {
        return porcentagem_1;
    }

    public void setPorcentagem_1(Long porcentagem_1) {
        this.porcentagem_1 = porcentagem_1;
    }

    public Long getPorcentagem_2() {
        return porcentagem_2;
    }

    public void setPorcentagem_2(Long porcentagem_2) {
        this.porcentagem_2 = porcentagem_2;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    
    

    public String getCod_email() {
        return cod_email;
    }

    public void setCod_email(String cod_email) {
        this.cod_email = cod_email;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public Long getNumSisbov() {
        return numSisbov;
    }

    public void setNumSisbov(Long numSisbov) {
        this.numSisbov = numSisbov;
    }

    public Date getDesmama() {
        return desmama;
    }

    public void setDesmama(Date desmama) {
        this.desmama = desmama;
    }

    public Date getAptidao() {
        return aptidao;
    }

    public void setAptidao(Date aptidao) {
        this.aptidao = aptidao;
    }

    public Long getNumPai() {
        return numPai;
    }

    public void setNumPai(Long numPai) {
        this.numPai = numPai;
    }

    public Long getNumMae() {
        return numMae;
    }

    public void setNumMae(Long numMae) {
        this.numMae = numMae;
    }
    
    public Long getSeq_Animal() {
        return seq_Animal;
    }

    public void setSeq_Animal(Long seq_Animal) {
        this.seq_Animal = seq_Animal;
    }

    public Long getSeq_Procedencia() {
        return seq_Procedencia;
    }

    public void setSeq_Procedencia(Long seq_Procedencia) {
        this.seq_Procedencia = seq_Procedencia;
    }

    public Long getCod_Grupo() {
        return cod_Grupo;
    }

    public void setCod_Grupo(Long cod_Grupo) {
        this.cod_Grupo = cod_Grupo;
    }

    public Long getSeq_Animal_Pai() {
        return seq_Animal_Pai;
    }

    public void setSeq_Animal_Pai(Long seq_Animal_Pai) {
        this.seq_Animal_Pai = seq_Animal_Pai;
    }

    public Long getSeq_Animal_Mae() {
        return seq_Animal_Mae;
    }

    public void setSeq_Animal_Mae(Long seq_Animal_Mae) {
        this.seq_Animal_Mae = seq_Animal_Mae;
    }

    public Long getNro_Animal() {
        return nro_Animal;
    }

    public void setNro_Animal(Long nro_Animal) {
        this.nro_Animal = nro_Animal;
    }

    public Date getDat_Nascimento() {
        return dat_Nascimento;
    }

    public void setDat_Nascimento(Date dat_Nascimento) {
        this.dat_Nascimento = dat_Nascimento;
    }

    public String getIdt_Tipo() {
        return idt_Tipo;
    }

    public void setIdt_Tipo(String idt_Tipo) {
        this.idt_Tipo = idt_Tipo;
    }

    public String getIdt_Status() {
        return idt_Status;
    }

    public void setIdt_Status(String idt_Status) {
        this.idt_Status = idt_Status;
    }  
}