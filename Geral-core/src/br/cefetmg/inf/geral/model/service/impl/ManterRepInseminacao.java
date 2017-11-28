package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IRepInseminacaoDAO;
import br.cefetmg.inf.geral.model.dao.impl.RepInseminacaoDAO;
import br.cefetmg.inf.geral.model.domain.RepInseminacao;
import br.cefetmg.inf.geral.model.service.IManterRepInseminacao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterRepInseminacao implements IManterRepInseminacao {

    private IRepInseminacaoDAO repinseminacaoDAO;

    public ManterRepInseminacao() {
        repinseminacaoDAO = new RepInseminacaoDAO();
    }

    @Override
    public Long cadastrar(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException {

        if (repinseminacao.getDataInseminacao() == null) {
            throw new NegocioException("Insira a Data da Inseminação!");
        }

        if (repinseminacao.getHoraInseminacao() == null) {
            throw new NegocioException("Insira a Hora da Inseminação!");
        }

        if (repinseminacao.getReprodutor() == null) {
            throw new NegocioException("Insira o reprodutor.");
        }

        if (repinseminacao.getRaca() == null) {
            throw new NegocioException("Insira a raca.");
        }

        if (repinseminacao.getInseminador() == null) {
            throw new NegocioException("Insira o inseminador.");
        }

        if (repinseminacao.getNumDoses() == null) {
            throw new NegocioException("Insira o numero de doses.");
        }

        if (repinseminacao.getDataCio() == null) {
            throw new NegocioException("Insira a data do cio.");
        }

        if (repinseminacao.getHoraCio() == null) {
            throw new NegocioException("Insira a hora do cio.");
        }

        if (repinseminacao.getCio() == null) {
            throw new NegocioException("Insira a opcao.");
        }

        if (repinseminacao.getMuco() == null) {
            throw new NegocioException("Insira a opcao");
        }

        if (repinseminacao.getTe() == null) {
            throw new NegocioException("Insira a opcao");
        }

        if (repinseminacao.getEcc() == null) {
            throw new NegocioException("Insira o ECC");
        }

        if (repinseminacao.getProIATF() == null) {
            throw new NegocioException("Insira o IATF.");
        }

        Long result = repinseminacaoDAO.inserir(repinseminacao);
        return result;
    }

    @Override
    public boolean alterar(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException {

        if (repinseminacao.getDataInseminacao() == null) {
            throw new NegocioException("Insira a Data da Inseminação!");
        }

        if (repinseminacao.getHoraInseminacao() == null) {
            throw new NegocioException("Insira a Hora da Inseminação!");
        }

        if (repinseminacao.getReprodutor() == null) {
            throw new NegocioException("Insira o reprodutor.");
        }

        if (repinseminacao.getRaca() == null) {
            throw new NegocioException("Insira a raca.");
        }

        if (repinseminacao.getInseminador() == null) {
            throw new NegocioException("Insira o inseminador.");
        }

        if (repinseminacao.getNumDoses() == null) {
            throw new NegocioException("Insira o numero de doses.");
        }

        if (repinseminacao.getDataCio() == null) {
            throw new NegocioException("Insira a data do cio.");
        }

        if (repinseminacao.getHoraCio() == null) {
            throw new NegocioException("Insira a hora do cio.");
        }

        if (repinseminacao.getCio() == null) {
            throw new NegocioException("Insira a opcao.");
        }

        if (repinseminacao.getMuco() == null) {
            throw new NegocioException("Insira a opcao");
        }

        if (repinseminacao.getTe() == null) {
            throw new NegocioException("Insira a opcao");
        }

        if (repinseminacao.getEcc() == null) {
            throw new NegocioException("Insira o ECC");
        }

        if (repinseminacao.getProIATF() == null) {
            throw new NegocioException("Insira o IATF.");
        }

        boolean result = repinseminacaoDAO.atualizar(repinseminacao);
        return result;
    }

    @Override
    public boolean excluir(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException {
        boolean result = repinseminacaoDAO.delete(repinseminacao);
        return result;
    }

    @Override
    public List<RepInseminacao> pesquisarTodos() throws PersistenciaException {
        List<RepInseminacao> result = repinseminacaoDAO.listarTodos();
        return result;
    }

    @Override
    public RepInseminacao pesquisarPorSeq(Long seq) throws PersistenciaException {
        RepInseminacao result = repinseminacaoDAO.consultarPorSeq(seq);
        return result;
    }
}
