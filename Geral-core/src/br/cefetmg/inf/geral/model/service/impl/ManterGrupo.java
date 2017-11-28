package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IGrupoDAO;
import br.cefetmg.inf.geral.model.dao.impl.GrupoDAO;
import br.cefetmg.inf.geral.model.domain.Grupo;
import br.cefetmg.inf.geral.model.service.IManterGrupo;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterGrupo implements IManterGrupo {

    private IGrupoDAO grupoDAO;

    public ManterGrupo() {
        grupoDAO = new GrupoDAO();
    }

    @Override
    public Long cadastrar(Grupo grupo) throws PersistenciaException, NegocioException {
        if ((grupo.getNom_Grupo() == null) || (grupo.getNom_Grupo().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (grupo.getQtd_Media_Producao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = grupoDAO.inserir(grupo);
        return result;
    }

    @Override
    public boolean alterar(Grupo grupo) throws PersistenciaException, NegocioException {
        if ((grupo.getNom_Grupo() == null) || (grupo.getNom_Grupo().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (grupo.getQtd_Media_Producao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = grupoDAO.atualizar(grupo);
        return result;
    }

    @Override
    public boolean excluir(Grupo grupo) throws PersistenciaException, NegocioException {
        boolean result = grupoDAO.delete(grupo);
        return result;
    }

    @Override
    public List<Grupo> pesquisarTodos() throws PersistenciaException {
        List<Grupo> result = grupoDAO.listarTodos();
        return result;
    }

    @Override
    public Grupo pesquisarPorCod(Long cod) throws PersistenciaException {
        Grupo result = grupoDAO.consultarPorCod(cod);
        return result;
    }
}
