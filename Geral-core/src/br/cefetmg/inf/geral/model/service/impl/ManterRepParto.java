package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IRepPartoDAO;
import br.cefetmg.inf.geral.model.dao.impl.RepPartoDAO;
import br.cefetmg.inf.geral.model.domain.RepParto;
import br.cefetmg.inf.geral.model.service.IManterRepParto;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterRepParto implements IManterRepParto {

    private IRepPartoDAO reppartoDAO;

    public ManterRepParto() {
        reppartoDAO = new RepPartoDAO();
    }

    @Override
    public Long cadastrar(RepParto repparto) throws PersistenciaException, NegocioException {
        if (repparto.getTipo() == null) {
            throw new NegocioException("Selecione uma das opções.");
        }

        if (repparto.getPerParto1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getPerParto2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getDiasGest() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getTipo() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getRetencao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getDataParto() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getHoraParto() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getTipo() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getGrau() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getNumCrias() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getNumCria1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPelagem1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPeso1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getSexo1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getNumCria2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPelagem2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPeso2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getSexo2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = reppartoDAO.inserir(repparto);
        return result;
    }

    @Override
    public boolean alterar(RepParto repparto) throws PersistenciaException, NegocioException {
        if (repparto.getTipo() == null) {
            throw new NegocioException("Selecione uma das opções.");
        }

        if (repparto.getPerParto1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getPerParto2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getDiasGest() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getTipo() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getRetencao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getDataParto() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getHoraParto() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getTipo() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getGrau() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getNumCrias() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (repparto.getNumCria1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPelagem1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPeso1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getSexo1() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getNumCria2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPelagem2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getPeso2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        if (repparto.getSexo2() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = reppartoDAO.atualizar(repparto);
        return result;
    }

    public boolean excluir(RepParto repparto) throws PersistenciaException, NegocioException {
        boolean result = reppartoDAO.delete(repparto);
        return result;
    }

    @Override
    public List<RepParto> pesquisarTodos() throws PersistenciaException {
        List<RepParto> result = reppartoDAO.listarTodos();
        return result;
    }

    @Override
    public RepParto pesquisarPorSeq(Long seq) throws PersistenciaException {
        RepParto result = reppartoDAO.consultarPorSeq(seq);
        return result;
    }
}

