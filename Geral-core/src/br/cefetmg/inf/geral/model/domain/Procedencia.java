package br.cefetmg.inf.geral.model.domain;

public class Procedencia {
    private Long seq_Procedencia;
    private String nom_Fazenda;
    private String nom_Proprietario;
    private Long idt_Proprietario;

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

    public Long getIdt_Proprietario() {
        return idt_Proprietario;
    }

    public void setIdt_Proprietario(Long idt_Proprietario) {
        this.idt_Proprietario = idt_Proprietario;
    }
}
