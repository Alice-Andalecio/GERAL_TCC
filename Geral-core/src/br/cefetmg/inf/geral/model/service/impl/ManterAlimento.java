package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IAlimentoDAO;
import br.cefetmg.inf.geral.model.dao.impl.AlimentoDAO;
import br.cefetmg.inf.geral.model.domain.Alimento;
import br.cefetmg.inf.geral.model.service.IManterAlimento;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterAlimento implements IManterAlimento {

    private IAlimentoDAO alimentoDAO;

    public ManterAlimento() {
        alimentoDAO = new AlimentoDAO();
    }

    @Override
    public Long cadastrar(Alimento alimento) throws PersistenciaException, NegocioException {
        if ((alimento.getDes_Alimento() == null) || (alimento.getDes_Alimento().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = alimentoDAO.inserir(alimento);
        return result;
    }

    @Override
    public boolean alterar(Alimento alimento) throws PersistenciaException, NegocioException {
        if ((alimento.getDes_Alimento() == null) || (alimento.getDes_Alimento().isEmpty())) {
            throw new NegocioException("Obrigatório informar a descrição");
        }

        boolean result = alimentoDAO.atualizar(alimento);
        return result;
    }

    @Override
    public boolean excluir(Alimento alimento) throws PersistenciaException, NegocioException {
        boolean result = alimentoDAO.delete(alimento);
        return result;
    }

    @Override
    public List<Alimento> pesquisarTodos() throws PersistenciaException {
        List<Alimento> result = alimentoDAO.listarTodos();
        return result;
    }

    @Override
    public Alimento pesquisarPorCod(Long cod) throws PersistenciaException {
        Alimento result = alimentoDAO.consultarPorCod(cod);
        return result;
    }
}
