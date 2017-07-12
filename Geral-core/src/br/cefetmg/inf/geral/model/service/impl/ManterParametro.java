package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IParametroDAO;
import br.cefetmg.inf.geral.model.dao.impl.ParametroDAO;
import br.cefetmg.inf.geral.model.domain.Parametro;
import br.cefetmg.inf.geral.model.service.IManterParametro;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterParametro implements IManterParametro {

    private IParametroDAO parametroDAO;

    public ManterParametro() {
        parametroDAO = new ParametroDAO();
    }

    @Override
    public Long cadastrar(Parametro parametro) throws PersistenciaException, NegocioException {
        if (parametro.getQtd_Dia_Amamentacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (parametro.getQtd_Dia_Secagem() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = parametroDAO.inserir(parametro);
        return result;
    }

    @Override
    public boolean alterar(Parametro parametro) throws PersistenciaException, NegocioException {
        if (parametro.getQtd_Dia_Amamentacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (parametro.getQtd_Dia_Secagem() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = parametroDAO.atualizar(parametro);
        return result;
    }

    @Override
    public boolean excluir(Parametro parametro) throws PersistenciaException, NegocioException {
        boolean result = parametroDAO.delete(parametro);
        return result;
    }

    @Override
    public List<Parametro> pesquisarTodos() throws PersistenciaException {
        List<Parametro> result = parametroDAO.listarTodos();
        return result;
    }

    @Override
    public Parametro pesquisarPorCod(String cod) throws PersistenciaException {
        Parametro result = parametroDAO.consultarPorCod(cod);
        return result;
    }
}
