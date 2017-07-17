package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IGrupoAlimentoDietaDAO;
import br.cefetmg.inf.geral.model.dao.impl.GrupoAlimentoDietaDAO;
import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.geral.model.service.IManterGrupoAlimentoDieta;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterGrupoAlimentoDieta implements IManterGrupoAlimentoDieta {

    private IGrupoAlimentoDietaDAO grupoAlimentoDietaDAO;

    public ManterGrupoAlimentoDieta() {
        grupoAlimentoDietaDAO = new GrupoAlimentoDietaDAO();
    }

    @Override
    public Long cadastrar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException {
        if (grupoAlimentoDieta.getPer_Composicao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = grupoAlimentoDietaDAO.inserir(grupoAlimentoDieta);
        return result;
    }

    @Override
    public boolean alterar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException {
        if (grupoAlimentoDieta.getPer_Composicao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = grupoAlimentoDietaDAO.atualizar(grupoAlimentoDieta);
        return result;
    }

    @Override
    public boolean excluir(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException {
        boolean result = grupoAlimentoDietaDAO.delete(grupoAlimentoDieta);
        return result;
    }

    @Override
    public List<GrupoAlimentoDieta> pesquisarTodos() throws PersistenciaException {
        List<GrupoAlimentoDieta> result = grupoAlimentoDietaDAO.listarTodos();
        return result;
    }

    @Override
    public GrupoAlimentoDieta pesquisarPorCod(Long cod) throws PersistenciaException {
        GrupoAlimentoDieta result = grupoAlimentoDietaDAO.consultarPorCod(cod);
        return result;
    }
}
