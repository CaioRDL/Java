/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.pr.Projeto1.GUI;
import br.pr.Projeto1.DAO.PacienteDAO;
import br.pr.Projeto1.model.Paciente;
import br.pr.Projeto1.modeltable.PesquisarPacienteModelTable;
import br.pr.Projeto1.utils.CellRenderer;
import br.pr.Projeto1.utils.Constantes;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

public class homePage extends javax.swing.JDialog {
    
    Paciente paciente = new Paciente();
    PacienteDAO pacienteDAO = new PacienteDAO();
    
    public homePage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
       

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        idade = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        documento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doenca = new javax.swing.JTextArea();
        jTextFieldnome = new javax.swing.JTextField();
        jTextField1idade = new javax.swing.JTextField();
        jTextField1Estado = new javax.swing.JTextField();
        jTextField1documento = new javax.swing.JTextField();
        jTextField1Cidade1 = new javax.swing.JTextField();
        jTextField1sexo = new javax.swing.JTextField();
        jButton1Pesquisa = new javax.swing.JButton();
        jTextField1PacientePesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jButton1AlterarPaciente = new javax.swing.JButton();
        jButton1ExcluirPaciente = new javax.swing.JButton();
        jButton1Enviar = new javax.swing.JButton();
        jTextField1NomePacientePesquisa = new javax.swing.JTextField();
        nome1 = new javax.swing.JLabel();
        idade1 = new javax.swing.JLabel();
        jTextField1idadePacientePesquisa = new javax.swing.JTextField();
        estado1 = new javax.swing.JLabel();
        jTextField1EstadoPacientePesquisa = new javax.swing.JTextField();
        cidade1 = new javax.swing.JLabel();
        jTextField1CidadePacientePesquisa = new javax.swing.JTextField();
        sexo1 = new javax.swing.JLabel();
        jTextField1sexoPacientePesquisa = new javax.swing.JTextField();
        documento1 = new javax.swing.JLabel();
        jTextField1documentoPacientePesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );

        nome.setText("Nome");

        idade.setText("Idade");

        estado.setText("Estado");

        cidade.setText("Cidade");

        sexo.setText("Sexo");

        documento.setText("Documento");

        doenca.setColumns(20);
        doenca.setRows(5);
        jScrollPane1.setViewportView(doenca);

        jTextField1idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1idadeActionPerformed(evt);
            }
        });

        jButton1Pesquisa.setText("Pesquisar");
        jButton1Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1PesquisaActionPerformed(evt);
            }
        });

        jTablePesquisa.setModel(new br.pr.Projeto1.modeltable.PesquisarPacienteModelTable());
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTablePesquisaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePesquisa);

        jButton1AlterarPaciente.setText("Alterar");

        jButton1ExcluirPaciente.setText("Excluir");

        jButton1Enviar.setText("Enviar");
        jButton1Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EnviarActionPerformed(evt);
            }
        });

        nome1.setText("Nome");

        idade1.setText("Idade");

        jTextField1idadePacientePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1idadePacientePesquisaActionPerformed(evt);
            }
        });

        estado1.setText("Estado");

        cidade1.setText("Cidade");

        sexo1.setText("Sexo");

        documento1.setText("Documento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidade)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome)
                                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(jTextField1idade)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(documento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1documento, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sexo))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1Cidade1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                        .addComponent(jTextField1Estado)
                                        .addComponent(jTextField1sexo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idade1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jTextField1idadePacientePesquisa))
                                    .addComponent(cidade1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(documento1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1documentoPacientePesquisa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sexo1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField1CidadePacientePesquisa)
                                            .addComponent(jTextField1EstadoPacientePesquisa)
                                            .addComponent(jTextField1sexoPacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nome1)
                                        .addGap(34, 34, 34)
                                        .addComponent(jTextField1NomePacientePesquisa)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1Pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1AlterarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1ExcluirPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1PacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton1Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome)
                            .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade)
                            .addComponent(jTextField1idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado)
                            .addComponent(jTextField1Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidade)
                            .addComponent(jTextField1Cidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexo)
                            .addComponent(jTextField1sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1Enviar))
                            .addComponent(documento, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1ExcluirPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1AlterarPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1Pesquisa)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1PacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1NomePacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nome1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade1)
                            .addComponent(jTextField1idadePacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado1)
                            .addComponent(jTextField1EstadoPacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidade1)
                            .addComponent(jTextField1CidadePacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexo1)
                            .addComponent(jTextField1sexoPacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1documentoPacientePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documento1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1EnviarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:

            paciente.setNome(jTextFieldnome.getText());
            paciente.setIdade(Integer.parseInt(jTextField1idade.getText()));
            paciente.setEstado(jTextField1Estado.getText());
            paciente.setCidade(jTextField1Cidade1.getText());
            paciente.setSexo(jTextField1sexo.getText());
            paciente.setDocumento(jTextField1documento.getText());
            paciente.setDoenca(doenca.getText());
            pacienteDAO.salvarOuAtualizar(paciente);
            JOptionPane.showMessageDialog(this, Constantes.MSG_REGISTRO_SALVO_SUCESSO,this.getTitle(), JOptionPane.INFORMATION_MESSAGE);

    }                                              

    private void jTextField1idadeActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    
    
    private Paciente pacienteSelecionado;
    /**
     * Creates new form CadastroEstadoPesquisar
     */
    public CadastroPacientePesquisar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jButton1AlterarPaciente.setEnabled(false);
        jButton1ExcluirPaciente.setEnabled(false);
        jButton1Enviar.setEnabled(false);
        jTextField1NomePacientePesquisa.setEnabled(false);
           
        organizarColunasTabela();
        carregarTabela();
        resetPesquisa();
        
        setVisible(true);
    }
    private void organizarColunasTabela() {
        TableColumn column = jTablePesquisa.getColumnModel().getColumn(1);
        column.setPreferredWidth(350);
        jTablePesquisa.setDefaultRenderer(Object.class, new CellRenderer());
    }
    private void resetPesquisa() {
        jTextField1NomePacientePesquisa.setText(null);
        PesquisarPacienteModelTable tableModel = (PesquisarPacienteModelTable) jTablePesquisa.getModel();
        jTablePesquisa.setPreferredSize(new Dimension(300, 64));
        tableModel.removeAll();
        tableModel.fireTableDataChanged();
    }
    public void carregarTabela() {
        try {
            PacienteDAO pacienteDAO = new PacienteDAO();
            List<Paciente> lista = pacienteDAO.buscarTodos();
            PesquisarPacienteModelTable tableModel = (PesquisarPacienteModelTable) jTablePesquisa.getModel();
            if (lista.isEmpty()) {
                jTablePesquisa.setPreferredSize(new Dimension(300, 64));
                tableModel.removeAll();
                tableModel.fireTableDataChanged();
            } else {
                tableModel.setGridBusca(lista);
                jTablePesquisa.setPreferredSize(new Dimension(300, lista.size() * 17));
                tableModel.fireTableDataChanged();
            }
        } catch (Exception e) {
        }
    }
    
    private void reset(){
        pacienteSelecionado = null;
        jTextField1NomePacientePesquisa.setText(null);
        jTextField1idadePacientePesquisa.setText(null);
        jTextField1EstadoPacientePesquisa.setText(null);
        jTextField1CidadePacientePesquisa.setText(null);
        jTextField1sexoPacientePesquisa.setText(null);
        jTextField1documentoPacientePesquisa.setText(null);
  
    }
    
    //Metodo pesquisa
     private void executarPesquisa(String pesquisa) throws Exception{
        List<Paciente> lista = new ArrayList<Paciente>();
        PesquisarPacienteModelTable tableModel = (PesquisarPacienteModelTable) jTablePesquisa.getModel();
        PacienteDAO pacienteDAO = new PacienteDAO();
        if(pesquisa == null || pesquisa.equals("")){
            lista = pacienteDAO.buscarTodos();
        }else{
            lista = pacienteDAO.buscarPorNome(pesquisa);
        }
        
        if(lista.isEmpty()){
            tableModel.removeAll();
            tableModel.fireTableDataChanged();
        }else{
            tableModel.setGridBusca(lista);
            jTablePesquisa.setPreferredSize(new Dimension(300, lista.size() * 17));
            tableModel.fireTableDataChanged();
            
        }
    }
    
    
    private void jButton1PesquisaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:try{
          try{
            if(jTextField1PacientePesquisa.getText() == null
                    || "".equals(jTextField1PacientePesquisa.getText())){
                executarPesquisa("");
                jButton1AlterarPaciente.setEnabled(true);
                jButton1ExcluirPaciente.setEnabled(true);
            }else {
                executarPesquisa(jTextField1PacientePesquisa.getText());
                jButton1AlterarPaciente.setEnabled(true);
                jButton1ExcluirPaciente.setEnabled(true);
            }
            
        }catch(Exception e){
            PesquisarPacienteModelTable tableModel = (PesquisarPacienteModelTable) jTablePesquisa.getModel();
            tableModel.removeAll();
            tableModel.fireTableDataChanged();
        }
       

    }                                                

    private void jTablePesquisaMousePressed(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
       
    }                                           

    private void jTextField1idadePacientePesquisaActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        // TODO add your handling code here:
    }                                                                

                /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                homePage dialog = new homePage(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cidade1;
    private javax.swing.JLabel documento;
    private javax.swing.JLabel documento1;
    private javax.swing.JTextArea doenca;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel estado1;
    private javax.swing.JLabel idade;
    private javax.swing.JLabel idade1;
    private javax.swing.JButton jButton1AlterarPaciente;
    private javax.swing.JButton jButton1Enviar;
    private javax.swing.JButton jButton1ExcluirPaciente;
    private javax.swing.JButton jButton1Pesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePesquisa;
    private javax.swing.JTextField jTextField1Cidade1;
    private javax.swing.JTextField jTextField1CidadePacientePesquisa;
    private javax.swing.JTextField jTextField1Estado;
    private javax.swing.JTextField jTextField1EstadoPacientePesquisa;
    private javax.swing.JTextField jTextField1NomePacientePesquisa;
    private javax.swing.JTextField jTextField1PacientePesquisa;
    private javax.swing.JTextField jTextField1documento;
    private javax.swing.JTextField jTextField1documentoPacientePesquisa;
    private javax.swing.JTextField jTextField1idade;
    private javax.swing.JTextField jTextField1idadePacientePesquisa;
    private javax.swing.JTextField jTextField1sexo;
    private javax.swing.JTextField jTextField1sexoPacientePesquisa;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel sexo1;
    // End of variables declaration                   
}
