//Realizando as importações necessárias
import java.io.FileReader; //Ler
import java.io.FileWriter; //Gravar
import java.io.IOException; //Exeção do catch
import java.util.Random; //Aleatoriedade
import javax.swing.JOptionPane; //Mensagem na tela

public class Cadastrar extends javax.swing.JFrame {
    public Cadastrar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_Nome = new javax.swing.JTextField();
        btn_Ler = new javax.swing.JButton();
        jtf_NomePai = new javax.swing.JTextField();
        btn_Limpar = new javax.swing.JButton();
        jtf_NomeMae = new javax.swing.JTextField();
        btn_Adicionar1 = new javax.swing.JButton();
        btn_Adicionar2 = new javax.swing.JButton();
        btn_Adicionar3 = new javax.swing.JButton();
        btn_Adicionar4 = new javax.swing.JButton();
        btn_Gravar1 = new javax.swing.JButton();
        btn_Gravar2 = new javax.swing.JButton();
        btn_Gravar3 = new javax.swing.JButton();
        btn_Gravar4 = new javax.swing.JButton();
        btn_Ler1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Dados = new javax.swing.JTextArea();
        btn_Ler2 = new javax.swing.JButton();
        btn_Ler3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_Nome = new javax.swing.JTextArea();
        btn_Ler4 = new javax.swing.JButton();
        jtf_Sobrenome1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta_NomePai = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jtf_Gerar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jta_NomeMae = new javax.swing.JTextArea();
        btn_Gerar = new javax.swing.JButton();
        btn_Gravar = new javax.swing.JButton();
        btn_Ler5 = new javax.swing.JButton();
        jtf_Sobrenome2 = new javax.swing.JTextField();
        btn_Adicionar5 = new javax.swing.JButton();
        btn_Gravar5 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jta_Sobrenome2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jta_Endereco = new javax.swing.JTextArea();
        jtf_Endereco = new javax.swing.JTextField();
        btn_Adicionar6 = new javax.swing.JButton();
        btn_Gravar6 = new javax.swing.JButton();
        btn_Ler6 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jta_Sobrenome1 = new javax.swing.JTextArea();
        btn_Fechar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_Ler.setText("Ler");
        btn_Ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LerActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Adicionar1.setText("Adicionar");
        btn_Adicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Adicionar1ActionPerformed(evt);
            }
        });

        btn_Adicionar2.setText("Adicionar");
        btn_Adicionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Adicionar2ActionPerformed(evt);
            }
        });

        btn_Adicionar3.setText("Adicionar");
        btn_Adicionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Adicionar3ActionPerformed(evt);
            }
        });

        btn_Adicionar4.setText("Adicionar");
        btn_Adicionar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Adicionar4ActionPerformed(evt);
            }
        });

        btn_Gravar1.setText("Gravar");
        btn_Gravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Gravar1ActionPerformed(evt);
            }
        });

        btn_Gravar2.setText("Gravar");
        btn_Gravar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Gravar2ActionPerformed(evt);
            }
        });

        btn_Gravar3.setText("Gravar");
        btn_Gravar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Gravar3ActionPerformed(evt);
            }
        });

        btn_Gravar4.setText("Gravar");
        btn_Gravar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Gravar4ActionPerformed(evt);
            }
        });

        btn_Ler1.setText("Ler");
        btn_Ler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ler1ActionPerformed(evt);
            }
        });

        jta_Dados.setColumns(20);
        jta_Dados.setRows(5);
        jScrollPane1.setViewportView(jta_Dados);

        btn_Ler2.setText("Ler");
        btn_Ler2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ler2ActionPerformed(evt);
            }
        });

        btn_Ler3.setText("Ler");
        btn_Ler3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ler3ActionPerformed(evt);
            }
        });

        jta_Nome.setColumns(20);
        jta_Nome.setRows(5);
        jScrollPane2.setViewportView(jta_Nome);

        btn_Ler4.setText("Ler");
        btn_Ler4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ler4ActionPerformed(evt);
            }
        });

        jta_NomePai.setColumns(20);
        jta_NomePai.setRows(5);
        jScrollPane3.setViewportView(jta_NomePai);

        jLabel1.setText("Número de registros a serem gerados:");

        jta_NomeMae.setColumns(20);
        jta_NomeMae.setRows(5);
        jScrollPane4.setViewportView(jta_NomeMae);

        btn_Gerar.setText("Gerar");
        btn_Gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GerarActionPerformed(evt);
            }
        });

        btn_Gravar.setText("Gravar");
        btn_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GravarActionPerformed(evt);
            }
        });

        btn_Ler5.setText("Ler");
        btn_Ler5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ler5ActionPerformed(evt);
            }
        });

        btn_Adicionar5.setText("Adicionar");
        btn_Adicionar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Adicionar5ActionPerformed(evt);
            }
        });

        btn_Gravar5.setText("Gravar");
        btn_Gravar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Gravar5ActionPerformed(evt);
            }
        });

        jta_Sobrenome2.setColumns(20);
        jta_Sobrenome2.setRows(5);
        jScrollPane6.setViewportView(jta_Sobrenome2);

        jta_Endereco.setColumns(20);
        jta_Endereco.setRows(5);
        jScrollPane7.setViewportView(jta_Endereco);

        btn_Adicionar6.setText("Adicionar");
        btn_Adicionar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Adicionar6ActionPerformed(evt);
            }
        });

        btn_Gravar6.setText("Gravar");
        btn_Gravar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Gravar6ActionPerformed(evt);
            }
        });

        btn_Ler6.setText("Ler");
        btn_Ler6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ler6ActionPerformed(evt);
            }
        });

        jta_Sobrenome1.setColumns(20);
        jta_Sobrenome1.setRows(5);
        jScrollPane8.setViewportView(jta_Sobrenome1);

        btn_Fechar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Fechar.setText("Fechar");
        btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btn_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_Gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Ler, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_Gerar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Gravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Ler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Adicionar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Gravar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane8)
                    .addComponent(jtf_Sobrenome1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Adicionar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Gravar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Ler4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtf_Sobrenome2)
                        .addComponent(jScrollPane6)
                        .addComponent(btn_Adicionar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Gravar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Ler5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtf_NomePai)
                        .addComponent(jScrollPane3)
                        .addComponent(btn_Adicionar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Gravar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Ler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtf_NomeMae)
                        .addComponent(jScrollPane4)
                        .addComponent(btn_Adicionar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Gravar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Ler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_Ler6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Adicionar6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Gravar6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Adicionar1)
                                    .addComponent(btn_Adicionar2)
                                    .addComponent(btn_Adicionar3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Gravar1)
                                    .addComponent(btn_Gravar2)
                                    .addComponent(btn_Gravar3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Ler1)
                                    .addComponent(btn_Ler2)
                                    .addComponent(btn_Ler3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane7)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_Sobrenome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_Sobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Adicionar5)
                                    .addComponent(btn_Adicionar4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Gravar5)
                                    .addComponent(btn_Gravar4))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jtf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Adicionar6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Gravar6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Ler6)
                                    .addComponent(btn_Ler5)
                                    .addComponent(btn_Ler4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtf_Gerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Gerar)
                                .addGap(14, 14, 14)
                                .addComponent(btn_Gravar))
                            .addComponent(btn_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Ler)
                            .addComponent(btn_Limpar))))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LerActionPerformed
        //Ler
        FileReader arq;
        try{
            arq = new FileReader("massadedados.txt");

            jta_Dados.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
    }//GEN-LAST:event_btn_LerActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        //Limpar
        jta_Dados.setText(null);
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_Adicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Adicionar1ActionPerformed
        //Adicionar_Nome
        jta_Nome.append(jtf_Nome.getText() + "\n");
        jtf_Nome.setText(null);
        jtf_Nome.requestFocus();
        
        //Ativando o botão Gravar
        btn_Gravar1.setEnabled(true);
    }//GEN-LAST:event_btn_Adicionar1ActionPerformed

    private void btn_Adicionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Adicionar2ActionPerformed
        //Adicionar_NomePai
        jta_NomePai.append(jtf_NomePai.getText() + "\n");
        jtf_NomePai.setText(null);
        jtf_NomePai.requestFocus();
        
        //Ativando o botão Gravar
        btn_Gravar2.setEnabled(true);
    }//GEN-LAST:event_btn_Adicionar2ActionPerformed

    private void btn_Adicionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Adicionar3ActionPerformed
        //Adicionar_NomeMãe
        jta_NomeMae.append(jtf_NomeMae.getText() + "\n");
        jtf_NomeMae.setText(null);
        jtf_NomeMae.requestFocus();
        
        //Ativando o botão Gravar
        btn_Gravar3.setEnabled(true);
    }//GEN-LAST:event_btn_Adicionar3ActionPerformed

    private void btn_Adicionar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Adicionar4ActionPerformed
        //Adicionar_Sobrenome1
        jta_Sobrenome1.append(jtf_Sobrenome1.getText() + "\n");
        jtf_Sobrenome1.setText(null);
        jtf_Sobrenome1.requestFocus();
        
        //Ativando o botão Gravar
        btn_Gravar4.setEnabled(true);
    }//GEN-LAST:event_btn_Adicionar4ActionPerformed

    private void btn_Gravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Gravar1ActionPerformed
        //Gravar_Nome
        FileWriter arq;
        try{
            arq = new FileWriter("nomes.txt", false);

            jta_Nome.write(arq);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar!");
        }
    }//GEN-LAST:event_btn_Gravar1ActionPerformed

    private void btn_Gravar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Gravar2ActionPerformed
        //Gravar_NomePai
        FileWriter arq;
        try{
            arq = new FileWriter("nomeshomens.txt", false);

            jta_NomePai.write(arq);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar!");
        }
    }//GEN-LAST:event_btn_Gravar2ActionPerformed

    private void btn_Gravar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Gravar3ActionPerformed
        //Gravar_NomeMãe
        FileWriter arq;
        try{
            arq = new FileWriter("nomesmulheres.txt", false);

            jta_NomeMae.write(arq);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar!");
        }
    }//GEN-LAST:event_btn_Gravar3ActionPerformed

    private void btn_Gravar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Gravar4ActionPerformed
        //Gravar_Sobrenome1
        FileWriter arq;
        try{
            arq = new FileWriter("sobrenomes1.txt", false);

            jta_Sobrenome1.write(arq);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar!");
        }
    }//GEN-LAST:event_btn_Gravar4ActionPerformed

    private void btn_Ler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ler1ActionPerformed
        //Ler_Nome
        FileReader arq;
        try{
            arq = new FileReader("nomes.txt");

            jta_Nome.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
        
        //Ativando o botão Adicionar
        btn_Adicionar1.setEnabled(true);
    }//GEN-LAST:event_btn_Ler1ActionPerformed

    private void btn_Ler2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ler2ActionPerformed
        //Ler_NomePai
        FileReader arq;
        try{
            arq = new FileReader("nomeshomens.txt");

            jta_NomePai.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
        
        //Ativando o botão Adicionar
        btn_Adicionar2.setEnabled(true);
    }//GEN-LAST:event_btn_Ler2ActionPerformed

    private void btn_Ler3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ler3ActionPerformed
        //Ler_NomeMãe
        FileReader arq;
        try{
            arq = new FileReader("nomesmulheres.txt");

            jta_NomeMae.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
        
        //Ativando o botão Adicionar
        btn_Adicionar3.setEnabled(true);
    }//GEN-LAST:event_btn_Ler3ActionPerformed

    private void btn_Ler4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ler4ActionPerformed
        //Ler_Sobrenome1
        FileReader arq;
        try{
            arq = new FileReader("sobrenomes1.txt");

            jta_Sobrenome1.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
        
        //Ativando o botão Adicionar
        btn_Adicionar4.setEnabled(true);
    }//GEN-LAST:event_btn_Ler4ActionPerformed

    private void btn_GerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GerarActionPerformed
        //Gerar aleatoriamente os dados dos colaboradores
        int n = Integer.parseInt(jtf_Gerar.getText());
        int id = 0;

        //Loop para gerar os dados
        for(int i=0; i<n; i++){
            id++;
            int k = 1000;
            int m = 10;
            int d = 10;
            int a = 100;
            int b = 1;
            int c = 1500;
            String registroFuncional = Integer.toString(id);
            String nomes[] = jta_Nome.getText().split("\n");
            String nomeshomens[] = jta_NomePai.getText().split("\n");
            String nomesmulheres[] = jta_NomeMae.getText().split("\n");
            String sobrenomes1[] = jta_Sobrenome1.getText().split("\n");
            String sobrenomes2[] = jta_Sobrenome2.getText().split("\n");
            String lorgadouro[] = jta_Endereco.getText().split("\n");
            String numeros[] = new String[2490];
            String telefone[] = new String[9000];
            String rg1[] = new String[89];
            String rg2[] = new String[899];
            String rg3[] = new String[9];
            String[] setores = {"Marketing", "Financeiro", "Recursos Humanos", "Comercial", "Estoque", "Contabilidade", "Administrativo"};
            String salarios[] = new String[35];

            //Loop do número de telefone
            for(int j = 0; j < 9000; j++){
                telefone[j] = Integer.toString(k);
                k++;
            }
            
            //Loop do número do endereço
            for(int j = 0; j < 2490; j++){
                numeros[j] = Integer.toString(m);
                m++;
            }

            //Loop do inicio do RG
            for(int j = 0; j < 89; j++){
                rg1[j] = Integer.toString(d);
                d++;
            }
               
            //Loop das duas outras partes do RG
            for(int j = 0; j < 899; j++){
                rg2[j] = Integer.toString(a);
                a++;
            }
            
            //Loop do dígito do RG
            for(int j = 0; j < 9; j++){
                rg3[j] = Integer.toString(b);
                b++;
            }
            
            //Loop do salário
            for(int j = 0; j < 35; j++){
                salarios[j] = Integer.toString(c);
                c = c + 100;
            }
            
            //Random para selecionar aleatóriamente os dados
            Random rnd = new Random();

            //Gerando as posíções aleatórias dos dados selecionados
            int posNome = rnd.nextInt(nomes.length);
            int posNomePai = rnd.nextInt(nomeshomens.length);
            int posNomeMae = rnd.nextInt(nomesmulheres.length);
            int posSobrenomePai1 = rnd.nextInt(sobrenomes1.length);
            int posSobrenomePai2 = rnd.nextInt(sobrenomes2.length);
            int posSobrenomeMae1 = rnd.nextInt(sobrenomes1.length);
            int posSobrenomeMae2 = rnd.nextInt(sobrenomes2.length);
            int posLorgadouro = rnd.nextInt(lorgadouro.length);
            int posEndereco = rnd.nextInt(nomes.length);
            int posEndereco2 = rnd.nextInt(sobrenomes1.length);
            int posEndereco3 = rnd.nextInt(sobrenomes2.length);
            int posNumero = rnd.nextInt(numeros.length);
            int posRG1 = rnd.nextInt(rg1.length);
            int posRG2 = rnd.nextInt(rg2.length);
            int posRG22 = rnd.nextInt(rg2.length);
            int posRG3 = rnd.nextInt(rg3.length);
            int posTelefone1 = rnd.nextInt(telefone.length);
            int posTelefone2 = rnd.nextInt(telefone.length);
            int posSetor = rnd.nextInt(setores.length);
            int posSalario = rnd.nextInt(salarios.length);
            
            //Guandando os dados de cada linha em uma String
            String novoFuncionario = registroFuncional + "#" + 
                                     nomes[posNome] + " " + sobrenomes1[posSobrenomeMae1] + " " + sobrenomes1[posSobrenomePai1] + "#" + 
                                     nomeshomens[posNomePai] + " " + sobrenomes1[posSobrenomePai1] + " " + sobrenomes2[posSobrenomePai2] + "#" + 
                                     nomesmulheres[posNomeMae] + " " + sobrenomes1[posSobrenomeMae1] + " " + sobrenomes2[posSobrenomeMae2] + "#" + 
                                     lorgadouro[posLorgadouro] + " " + nomes[posEndereco] + " " + sobrenomes1[posEndereco2] + " " + sobrenomes2[posEndereco3] + ", nº" + numeros[posNumero] + "#" + 
                                     rg1[posRG1] + "." + rg2[posRG2] + "." + rg2[posRG22] + "-" + rg3[posRG3] + "#" + 
                                     "(11) 9" + telefone[posTelefone1] + "-" + telefone[posTelefone2] + "#" + 
                                     nomes[posNome] + "." + sobrenomes1[posSobrenomePai1] + "@coutinhos.com.br" + "#" +
                                     "R$" + salarios[posSalario] + ".00" + "#" +
                                     setores[posSetor];

            //Adicionando a String com a linha no JTextArea
            jta_Dados.append(novoFuncionario + "\n");
        }
        
        //Limpando e recolocando o foco no jTextField
        jtf_Gerar.setText(null);
        jtf_Gerar.requestFocus();
    }//GEN-LAST:event_btn_GerarActionPerformed

    private void btn_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GravarActionPerformed
        //Gravar
        FileWriter arq;
        try{
            arq = new FileWriter("massadedados.txt", false);

            jta_Dados.write(arq);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar!");
        }
    }//GEN-LAST:event_btn_GravarActionPerformed

    private void btn_Ler5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ler5ActionPerformed
        //Ler_Sobrenome2
        FileReader arq;
        try{
            arq = new FileReader("sobrenomes2.txt");

            jta_Sobrenome2.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
        
        //Ativando o botão Adicionar
        btn_Adicionar5.setEnabled(true);
    }//GEN-LAST:event_btn_Ler5ActionPerformed

    private void btn_Adicionar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Adicionar5ActionPerformed
        //Adicionar_Sobrenome2
        jta_Sobrenome2.append(jtf_Sobrenome2.getText() + "\n");
        jtf_Sobrenome2.setText(null);
        jtf_Sobrenome2.requestFocus();
        
        //Ativando o botão Gravar
        btn_Gravar5.setEnabled(true);
    }//GEN-LAST:event_btn_Adicionar5ActionPerformed

    private void btn_Gravar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Gravar5ActionPerformed
        //Gravar_Sobrenome2
        FileWriter arq;
        try{
            arq = new FileWriter("sobrenomes2.txt", false);

            jta_Sobrenome2.write(arq);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar!");
        }
    }//GEN-LAST:event_btn_Gravar5ActionPerformed

    private void btn_Adicionar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Adicionar6ActionPerformed
        //Adicionar_Endereço
        jta_Endereco.append(jtf_Endereco.getText() + "\n");
        jtf_Endereco.setText(null);
        jtf_Endereco.requestFocus();
        
        //Ativando o botão Gravar
        btn_Gravar6.setEnabled(true);
    }//GEN-LAST:event_btn_Adicionar6ActionPerformed

    private void btn_Gravar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Gravar6ActionPerformed
        //Gravar_Endereço
        FileWriter arq;
        try{
            arq = new FileWriter("lorgadouro.txt", false);

            jta_Endereco.write(arq);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar gravar!");
        }
    }//GEN-LAST:event_btn_Gravar6ActionPerformed

    private void btn_Ler6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ler6ActionPerformed
        //Ler_Endereço
        FileReader arq;
        try{
            arq = new FileReader("lorgadouro.txt");

            jta_Endereco.read(arq, null);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar ler!");
        }
        
        //Ativando o botão Adicionar
        btn_Adicionar6.setEnabled(true);
    }//GEN-LAST:event_btn_Ler6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Ao iniciar o programa
        jta_Dados.setEnabled(false);
        jta_Nome.setEnabled(false);
        jta_NomePai.setEnabled(false);
        jta_NomeMae.setEnabled(false);
        jta_Sobrenome1.setEnabled(false);
        jta_Sobrenome2.setEnabled(false);
        jta_Endereco.setEnabled(false);
        btn_Gravar1.setEnabled(false);
        btn_Gravar2.setEnabled(false);
        btn_Gravar3.setEnabled(false);
        btn_Gravar4.setEnabled(false);
        btn_Gravar5.setEnabled(false);
        btn_Gravar6.setEnabled(false);
        btn_Adicionar1.setEnabled(false);
        btn_Adicionar2.setEnabled(false);
        btn_Adicionar3.setEnabled(false);
        btn_Adicionar4.setEnabled(false);
        btn_Adicionar5.setEnabled(false);
        btn_Adicionar6.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FecharActionPerformed
        //Fechar
        this.setVisible(false);
    }//GEN-LAST:event_btn_FecharActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar1;
    private javax.swing.JButton btn_Adicionar2;
    private javax.swing.JButton btn_Adicionar3;
    private javax.swing.JButton btn_Adicionar4;
    private javax.swing.JButton btn_Adicionar5;
    private javax.swing.JButton btn_Adicionar6;
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JButton btn_Gerar;
    private javax.swing.JButton btn_Gravar;
    private javax.swing.JButton btn_Gravar1;
    private javax.swing.JButton btn_Gravar2;
    private javax.swing.JButton btn_Gravar3;
    private javax.swing.JButton btn_Gravar4;
    private javax.swing.JButton btn_Gravar5;
    private javax.swing.JButton btn_Gravar6;
    private javax.swing.JButton btn_Ler;
    private javax.swing.JButton btn_Ler1;
    private javax.swing.JButton btn_Ler2;
    private javax.swing.JButton btn_Ler3;
    private javax.swing.JButton btn_Ler4;
    private javax.swing.JButton btn_Ler5;
    private javax.swing.JButton btn_Ler6;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jta_Dados;
    private javax.swing.JTextArea jta_Endereco;
    private javax.swing.JTextArea jta_Nome;
    private javax.swing.JTextArea jta_NomeMae;
    private javax.swing.JTextArea jta_NomePai;
    private javax.swing.JTextArea jta_Sobrenome1;
    private javax.swing.JTextArea jta_Sobrenome2;
    private javax.swing.JTextField jtf_Endereco;
    private javax.swing.JTextField jtf_Gerar;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_NomeMae;
    private javax.swing.JTextField jtf_NomePai;
    private javax.swing.JTextField jtf_Sobrenome1;
    private javax.swing.JTextField jtf_Sobrenome2;
    // End of variables declaration//GEN-END:variables
}