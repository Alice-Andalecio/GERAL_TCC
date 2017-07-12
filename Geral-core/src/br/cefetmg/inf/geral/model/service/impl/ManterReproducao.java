package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IReproducaoDAO;
import br.cefetmg.inf.geral.model.dao.impl.ReproducaoDAO;
import br.cefetmg.inf.geral.model.domain.Reproducao;
import br.cefetmg.inf.geral.model.service.IManterReproducao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterReproducao implements IManterReproducao {

    private IReproducaoDAO reproducaoDAO;

    public ManterReproducao() {
        reproducaoDAO = new ReproducaoDAO();
    }

    @Override
    public Long cadastrar(Reproducao reproducao) throws PersistenciaException, NegocioException {
        if (reproducao.getDat_Inseminacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (reproducao.getDat_Gestacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = reproducaoDAO.inserir(reproducao);
        return result;
    }

    @Override
    public boolean alterar(Reproducao reproducao) throws PersistenciaException, NegocioException {
        if (reproducao.getDat_Inseminacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (reproducao.getDat_Gestacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = reproducaoDAO.atualizar(reproducao);
        return result;
    }

    @Override
    public boolean excluir(Reproducao reproducao) throws PersistenciaException, NegocioException {
        boolean result = reproducaoDAO.delete(reproducao);
        return result;
    }

    @Override
    public List<Reproducao> pesquisarTodos() throws PersistenciaException {
        List<Reproducao> result = reproducaoDAO.listarTodos();
        return result;
    }

    @Override
    public Reproducao pesquisarPorSeq(Long seq) throws PersistenciaException {
        Reproducao result = reproducaoDAO.consultarPorSeq(seq);
        return result;
    }

}
