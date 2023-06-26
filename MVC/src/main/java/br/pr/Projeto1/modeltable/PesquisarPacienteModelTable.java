package br.pr.Projeto1.modeltable;

import br.pr.Projeto1.model.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;


@SuppressWarnings("serial")
public class PesquisarPacienteModelTable extends AbstractTableModel{
    private Vector<Vector<Object>> linhas = new Vector<Vector<Object>>();
    private Vector<String> colunas = new Vector<String>();
    private List<Paciente> lista;

    public PesquisarPacienteModelTable() {
        init();
    }

    public PesquisarPacienteModelTable(Vector<String> colunas) {
        this.colunas = colunas;
    }

    private void init() {
        colunas.add("codigo");
        colunas.add("nome_Paciente");
        colunas.add("estado");
        colunas.add("cidade");
        colunas.add("sexo");
        colunas.add("documento");
        colunas.add("doenca");
    }

    public int getColumnCount() {
        return colunas.size();
    }

    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public String getColumnName(int pos) {
        return colunas.get(pos);
    }

    public Object getValueAt(int l, int c) {
        return linhas.get(l).get(c);
    }

    public Paciente getAt(int l) {
        return lista.get(l);
    }

    public void removeAt(int l) {
        lista.remove(l);
        renderGrid();
    }

    public void removeAll() {
        lista = new ArrayList<Paciente>();

        renderGrid();
    }

    public void add(Paciente paciente) {
        if (lista == null) {
            lista = new ArrayList<Paciente>();
        }

        lista.add(paciente);
        renderGrid();
    }

    public void update(Paciente paciente) {
        for (Paciente estadoAux : lista) {
            if (estadoAux.getCodigo().equals(estadoAux.getCodigo())) {
                estadoAux.setEstado(paciente.getNome());
                break;
            }
        }
        renderGrid();
    }

    public void setGridBusca(List<Paciente> lista) {
        this.lista = new ArrayList<Paciente>();
        this.lista.addAll(lista);
        renderGrid();
    }

    public void renderGrid() {
        linhas = new Vector<Vector<Object>>();
        for (Paciente paciente : lista) {

            Vector<Object> linha = new Vector<Object>();
            linha.add(paciente.getCodigo());
            linha.add(paciente.getNome());
            linha.add(paciente.getIdade());
            linha.add(paciente.getEstado());
            linha.add(paciente.getCidade());
            linha.add(paciente.getSexo());
            linha.add(paciente.getDocumento());
            linha.add(paciente.getDoenca());
            
            linhas.add(linha);
        }
    }
    
    
    
}
