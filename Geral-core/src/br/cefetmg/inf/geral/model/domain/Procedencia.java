package br.cefetmg.inf.geral.model.domain;

public class Procedencia {
    private Long seq_Procedencia;
    private String nom_Fazenda;
    private String nom_Proprietario;
    private Long idt_Proprio;

    public Long getSeq_Procedencia() {
        return seq_Procedencia;
    }

    public void setSeq_Procedencia(Long seq_Procedencia) {
        this.seq_Procedencia = seq_Procedencia;
    }

    public String getNom_Fazenda() {
        return nom_Fazenda;
    }

    public void setNom_Fazenda(String nom_Fazenda) {
        this.nom_Fazenda = nom_Fazenda;
    }

    public String getNom_Proprietario() {
        return nom_Proprietario;
    }

    public void setNom_Proprietario(String nom_Proprietario) {
        this.nom_Proprietario = nom_Proprietario;
    }

    public Long getItd_Proprio() {
        return idt_Proprio;
    }

    public void setItd_Proprio(Long itd_Proprio) {
        this.idt_Proprio = itd_Proprio;
    }
}
