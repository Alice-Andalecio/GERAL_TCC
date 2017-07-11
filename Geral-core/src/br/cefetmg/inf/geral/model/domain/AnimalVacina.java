package br.cefetmg.inf.geral.model.domain;

import java.util.Date;

public class AnimalVacina { 
    private Long seq_Animal;
    private Long cod_Vacina;
    private Long seq_Vacina;
    private Date dat_Vacinacao;

    public Long getSeq_Animal() {
        return seq_Animal;
    }

    public void setSeq_Animal(Long seq_Animal) {
        this.seq_Animal = seq_Animal;
    }

    public Long getCod_Vacina() {
        return cod_Vacina;
    }

    public void setCod_Vacina(Long cod_Vacina) {
        this.cod_Vacina = cod_Vacina;
    }

    public Long getSeq_Vacina() {
        return seq_Vacina;
    }

    public void setSeq_Vacina(Long seq_Vacina) {
        this.seq_Vacina = seq_Vacina;
    }

    public Date getDat_Vacinacao() {
        return dat_Vacinacao;
    }

    public void setDat_Vacinacao(Date dat_Vacinacao) {
        this.dat_Vacinacao = dat_Vacinacao;
    }
}
