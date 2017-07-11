package br.cefetmg.inf.geral.model.domain;

import java.util.Date;

public class Animal {
    private Long seq_Animal;
    private Long seq_Procedencia;
    private Long cod_Grupo;
    private Long seq_Animal_Pai;
    private Long seq_Animal_Mae;
    private String nro_Animal;
    private Date dat_Nascimento;
    private String idt_Tipo;
    private String idt_Status;

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

    public String getNro_Animal() {
        return nro_Animal;
    }

    public void setNro_Animal(String nro_Animal) {
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