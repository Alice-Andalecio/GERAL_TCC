package br.cefetmg.inf.geral.model.domain;

import java.sql.Time;
import java.util.Date;

public class RepDiagnostico {
    private Long seq_ReproducaoDiagnostico;
    private Long numAnimal;
    private String nomAnimal;
    private String inseminadasCobertas;
    private String vazias;
    private String gestantes;
    private String emCrescimento;
    private String padrao;
    private String doadora;
    private String receptora;
    private String descarte;
    private Date dataDiagnostico;
    private Time horaDiagnostico;
    private String diagnostico;
    private String sexo;
    private String numDias;
    private String reprodutor;
    private String raca;
    private Date dataCio;
    private Time horaCio;
    private String cio;
    private String muco;
    private String te;
    private String utero;
    private String ovD;
    private String ovE;
    private String base;

    public Long getSeq_ReproducaoDiagnostico() {
        return seq_ReproducaoDiagnostico;
    }

    public void setSeq_ReproducaoDiagnostico(Long seq_ReproducaoDiagnostico) {
        this.seq_ReproducaoDiagnostico = seq_ReproducaoDiagnostico;
    }

    public Long getNumAnimal() {
        return numAnimal;
    }

    public void setNumAnimal(Long numAnimal) {
        this.numAnimal = numAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public String getInseminadasCobertas() {
        return inseminadasCobertas;
    }

    public void setInseminadasCobertas(String inseminadasCobertas) {
        this.inseminadasCobertas = inseminadasCobertas;
    }

    public String getVazias() {
        return vazias;
    }

    public void setVazias(String vazias) {
        this.vazias = vazias;
    }

    public String getGestantes() {
        return gestantes;
    }

    public void setGestantes(String gestantes) {
        this.gestantes = gestantes;
    }

    public String getEmCrescimento() {
        return emCrescimento;
    }

    public void setEmCrescimento(String emCrescimento) {
        this.emCrescimento = emCrescimento;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public String getDoadora() {
        return doadora;
    }

    public void setDoadora(String doadora) {
        this.doadora = doadora;
    }

    public String getReceptora() {
        return receptora;
    }

    public void setReceptora(String receptora) {
        this.receptora = receptora;
    }

    public String getDescarte() {
        return descarte;
    }

    public void setDescarte(String descarte) {
        this.descarte = descarte;
    }

    public Date getDataDiagnostico() {
        return dataDiagnostico;
    }

    public void setDataDiagnostico(Date dataDiagnostico) {
        this.dataDiagnostico = dataDiagnostico;
    }

    public Time getHoraDiagnostico() {
        return horaDiagnostico;
    }

    public void setHoraDiagnostico(Time horaDiagnostico) {
        this.horaDiagnostico = horaDiagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumDias() {
        return numDias;
    }

    public void setNumDias(String numDias) {
        this.numDias = numDias;
    }

    public String getReprodutor() {
        return reprodutor;
    }

    public void setReprodutor(String reprodutor) {
        this.reprodutor = reprodutor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataCio() {
        return dataCio;
    }

    public void setDataCio(Date dataCio) {
        this.dataCio = dataCio;
    }

    public Time getHoraCio() {
        return horaCio;
    }

    public void setHoraCio(Time horaCio) {
        this.horaCio = horaCio;
    }

    public String getCio() {
        return cio;
    }

    public void setCio(String cio) {
        this.cio = cio;
    }

    public String getMuco() {
        return muco;
    }

    public void setMuco(String muco) {
        this.muco = muco;
    }

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

    public String getUtero() {
        return utero;
    }

    public void setUtero(String utero) {
        this.utero = utero;
    }

    public String getOvD() {
        return ovD;
    }

    public void setOvD(String ovD) {
        this.ovD = ovD;
    }

    public String getOvE() {
        return ovE;
    }

    public void setOvE(String ovE) {
        this.ovE = ovE;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
