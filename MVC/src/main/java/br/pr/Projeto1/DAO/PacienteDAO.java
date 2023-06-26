package br.pr.Projeto1.DAO;
import java.util.*;
import br.pr.Projeto1.model.Paciente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class PacienteDAO extends AbstractDAO {
     public List<Paciente> buscarTodos() throws Exception {
        Criteria criteria = getSession().createCriteria(Paciente.class);
        //criteria.addOrder(Order.asc("codigo_estado"));
        criteria.addOrder(Order.asc("Paciente"));
        return criteria.list();
    }

    public List<Paciente> buscarPorNome(String nome) throws Exception {
        Criteria criteria = getSession().createCriteria(Paciente.class);
        criteria.add(Restrictions.ilike("Paciente", "%" + nome + "%"));
        criteria.addOrder(Order.asc("Paciente"));
        return criteria.list();
    }

    public void setNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdade(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
