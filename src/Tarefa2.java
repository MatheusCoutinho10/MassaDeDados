import java.io.FileReader; //Ler
import java.io.IOException; //Exceção do Catch
import javax.swing.JOptionPane; //Mensagem na Tela
import static javax.swing.JOptionPane.showMessageDialog;

public class Tarefa2 extends javax.swing.JFrame {

    public Tarefa2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Dados = new javax.swing.JTextArea();
        jtf_RF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Consultar = new javax.swing.JButton();
        btn_Cadastro = new javax.swing.JButton();
        jtf_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_NomePai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_NomeMae = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_Endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_RG = new javax.swing.JTextField();
        jtf_Telefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_Salario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_Departamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jta_Dados.setColumns(20);
        jta_Dados.setRows(5);
        jScrollPane1.setViewportView(jta_Dados);

        jLabel1.setText("Registro Funcional:");

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        btn_Cadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Cadastro.setText("Cadastrar Funcionário");
        btn_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome do Pai:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nome da Mãe:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("RG (Registro Geral):");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("E-mail Corporativo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Salário Mensal:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Departamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Cadastro)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_RF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtf_NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jtf_NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jtf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jtf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtf_Salario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_RG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_Telefone)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_RF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Consultar))
                    .addComponent(btn_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Arrays globais que irão guardar cada dado
    String rf[]           = new String[250];
    String nome[]         = new String[250];
    String nomePai[]      = new String[250];
    String nomeMae[]      = new String[250];
    String endereco[]     = new String[250];
    String rg[]           = new String[250];
    String telefone[]     = new String[250];
    String email[]        = new String[250];
    String salario[]      = new String[250];
    String departamento[] = new String[250];
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Ao iniciar o programa
        //Desativando a edição dos componentes em que aparecerão as informações
        jta_Dados.setEnabled(false);
        jtf_Nome.setEnabled(false);
        jtf_NomePai.setEnabled(false);
        jtf_NomeMae.setEnabled(false);
        jtf_Endereco.setEnabled(false);
        jtf_RG.setEnabled(false);
        jtf_Telefone.setEnabled(false);
        jtf_Email.setEnabled(false);
        jtf_Salario.setEnabled(false);
        jtf_Departamento.setEnabled(false);
        
        //Carregando o arquivo txt
        FileReader arq;
        try{
            arq = new FileReader("massadedados.txt");

            jta_Dados.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastroActionPerformed
        //Abrir outro formulário, o de Cadastro
        Tarefa02 frm = new Tarefa02();
        frm.setVisible(true);
    }//GEN-LAST:event_btn_CadastroActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        //Botão Consultar
        //Criando variáveis e contadores
        String consulta  = jtf_RF.getText();
        String texto     = jta_Dados.getText();
        String linha[]   = texto.split("\n");
        int contDados    = 0;
        int contConsulta = 0;
        int achou        = 0;
        
        //Guardando os dados nos seus respectivos arrays através do loop
        while(contDados<250){
            String linhaAtual       = linha[contDados];
            String dados[]          = linhaAtual.split("#");
            rf[contDados]           = dados[0];
            nome[contDados]         = dados[1];
            nomePai[contDados]      = dados[2];
            nomeMae[contDados]      = dados[3];
            endereco[contDados]     = dados[4];
            rg[contDados]           = dados[5];
            telefone[contDados]     = dados[6];
            email[contDados]        = dados[7];
            salario[contDados]      = dados[8];
            departamento[contDados] = dados[9];
            contDados++;
        }
        
        //Verificando se existe o Registro Funcional consultado
        while(contConsulta<250){
            if(consulta.equals(rf[contConsulta])){
                jtf_Nome.setText(nome[contConsulta]);
                jtf_NomePai.setText(nomePai[contConsulta]);
                jtf_NomeMae.setText(nomeMae[contConsulta]);
                jtf_Endereco.setText(endereco[contConsulta]);
                jtf_RG.setText(rg[contConsulta]);
                jtf_Telefone.setText(telefone[contConsulta]);
                jtf_Email.setText(email[contConsulta]);
                jtf_Salario.setText(salario[contConsulta]);
                jtf_Departamento.setText(departamento[contConsulta]);
                contConsulta++;
            }
            else{
                achou++;
                contConsulta++;
            }
        }
        
        //Mensagem caso exista ou não
        if(achou == 250){
            //Caso não exista
            showMessageDialog(null, "Colaborador não encontrada!");
            jtf_RF.setText(null);
        }else{
            //Caso exista
            showMessageDialog(null, "Colaborador encontrado!");
        }
        
        //Limpando e recolocando o foco no jTextField
        jtf_RF.setText(null);
        jtf_RF.requestFocus();
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tarefa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarefa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarefa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarefa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarefa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastro;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_Dados;
    private javax.swing.JTextField jtf_Departamento;
    private javax.swing.JTextField jtf_Email;
    private javax.swing.JTextField jtf_Endereco;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_NomeMae;
    private javax.swing.JTextField jtf_NomePai;
    private javax.swing.JTextField jtf_RF;
    private javax.swing.JTextField jtf_RG;
    private javax.swing.JTextField jtf_Salario;
    private javax.swing.JTextField jtf_Telefone;
    // End of variables declaration//GEN-END:variables
}