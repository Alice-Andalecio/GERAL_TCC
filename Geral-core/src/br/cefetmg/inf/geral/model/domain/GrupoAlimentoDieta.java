package br.cefetmg.inf.geral.model.domain;
import java.sql.Date;

public class GrupoAlimentoDieta {

    private Integer cod_Grupo;
    private Integer cod_Alimento;
    private Date dat_dieta;
    private Double qtd_manha_kg;
    private Double qtd_tarde_kg;
    private String txt_obs;

    public GrupoAlimentoDieta() {
    }

    public GrupoAlimentoDieta(Integer cod_Grupo, Integer cod_Alimento, Date dat_dieta, Double qtd_manha_kg, Double qtd_tarde_kg, String txt_obs) {
        this.cod_Grupo = cod_Grupo;
        this.cod_Alimento = cod_Alimento;
        this.dat_dieta = dat_dieta;
        this.qtd_manha_kg = qtd_manha_kg;
        this.qtd_tarde_kg = qtd_tarde_kg;
        this.txt_obs = txt_obs;
    }

    public Integer getCod_Grupo() {
        return cod_Grupo;
    }

    public void setCod_Grupo(Integer cod_Grupo) {
        this.cod_Grupo = cod_Grupo;
    }

    public Integer getCod_Alimento() {
        return cod_Alimento;
    }

    public void setCod_Alimento(int cod_Alimento) {
        this.cod_Alimento = cod_Alimento;
    }

    public Date getDat_dieta() {
        return dat_dieta;
    }

    public void setDat_dieta(Date dat_dieta) {
        this.dat_dieta = dat_dieta;
    }

    public Double getQtd_manha_kg() {
        return qtd_manha_kg;
    }

    public void setQtd_manha_kg(Double qtd_manha_kg) {
        this.qtd_manha_kg = qtd_manha_kg;
    }

    public Double getQtd_tarde_kg() {
        return qtd_tarde_kg;
    }

    public void setQtd_tarde_kg(Double qtd_tarde_kg) {
        this.qtd_tarde_kg = qtd_tarde_kg;
    }

    public String getTxt_obs() {
        return txt_obs;
    }

    public void setTxt_obs(String txt_obs) {
        this.txt_obs = txt_obs;
    }
}
