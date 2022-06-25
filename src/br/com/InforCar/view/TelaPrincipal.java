
package br.com.InforCar.view;

import br.com.InforCar.DAO.CarroDAO;
import br.com.InforCar.DAO.ClienteDAO;
import br.com.InforCar.model.Carro;
import br.com.InforCar.model.Cliente;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jpSuperior = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        lblInfor = new javax.swing.JLabel();
        lblCar = new javax.swing.JLabel();
        jpFundo = new javax.swing.JPanel();
        tabbed = new javax.swing.JTabbedPane();
        jpCadCliente = new javax.swing.JPanel();
        lblIdCli = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCell = new javax.swing.JLabel();
        txtCell = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jpBotoes4 = new javax.swing.JPanel();
        bntEditar4 = new javax.swing.JButton();
        bntNovo4 = new javax.swing.JButton();
        bntDeletar4 = new javax.swing.JButton();
        bntSalvar4 = new javax.swing.JButton();
        jpCadCarros = new javax.swing.JPanel();
        lblIdCar = new javax.swing.JLabel();
        txtIdCar = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblFab = new javax.swing.JLabel();
        txtFab = new javax.swing.JTextField();
        lblAnoFab = new javax.swing.JLabel();
        txtAnoFab = new javax.swing.JFormattedTextField();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jpBotoes5 = new javax.swing.JPanel();
        bntEditar5 = new javax.swing.JButton();
        bntNovo5 = new javax.swing.JButton();
        bntDeletar5 = new javax.swing.JButton();
        bntSalvar5 = new javax.swing.JButton();
        jpConsultCli = new javax.swing.JPanel();
        lblBuscarCli = new javax.swing.JLabel();
        txtBuscarCli = new javax.swing.JTextField();
        bntPesquisarC = new javax.swing.JButton();
        bntLimparC = new javax.swing.JButton();
        jpTblCli = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCli = new javax.swing.JTable();
        jpConsultCar = new javax.swing.JPanel();
        lblBuscarCar = new javax.swing.JLabel();
        txtBuscarCar = new javax.swing.JTextField();
        bntPesquisarCar = new javax.swing.JButton();
        bntLimparCar = new javax.swing.JButton();
        jpTblCar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCar = new javax.swing.JTable();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpSuperior.setBackground(new java.awt.Color(51, 51, 51));
        jpSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/InforCar/img/ExecutiveCar_Black_icon-icons.com_54904.png"))); // NOI18N

        lblInfor.setFont(new java.awt.Font("Palatino Linotype", 3, 48)); // NOI18N
        lblInfor.setForeground(new java.awt.Color(0, 51, 153));
        lblInfor.setText("Infor");

        lblCar.setFont(new java.awt.Font("Palatino Linotype", 3, 48)); // NOI18N
        lblCar.setForeground(new java.awt.Color(255, 255, 255));
        lblCar.setText("Car");

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img)
                .addGap(61, 61, 61))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSuperiorLayout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCar)
                    .addComponent(lblInfor))
                .addContainerGap())
        );

        tabbed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIdCli.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblIdCli.setForeground(new java.awt.Color(0, 0, 0));
        lblIdCli.setText("ID:");

        txtIdCli.setEditable(false);
        txtIdCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");

        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("E-mail:");

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        lblCell.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCell.setForeground(new java.awt.Color(0, 0, 0));
        lblCell.setText("Celular:");

        txtCell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCellKeyPressed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF:");

        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
        });

        lblRG.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRG.setForeground(new java.awt.Color(0, 0, 0));
        lblRG.setText("RG:");

        txtRG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRGKeyPressed(evt);
            }
        });

        lblIdade.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(0, 0, 0));
        lblIdade.setText("Idade:");

        txtIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpBotoes4.setBackground(new java.awt.Color(51, 51, 51));
        jpBotoes4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntEditar4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntEditar4.setForeground(new java.awt.Color(0, 0, 0));
        bntEditar4.setText("Editar");
        bntEditar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntEditar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditar4ActionPerformed(evt);
            }
        });

        bntNovo4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNovo4.setForeground(new java.awt.Color(0, 0, 0));
        bntNovo4.setText("Novo");
        bntNovo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntNovo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovo4ActionPerformed(evt);
            }
        });

        bntDeletar4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntDeletar4.setForeground(new java.awt.Color(0, 0, 0));
        bntDeletar4.setText("Deletar");
        bntDeletar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntDeletar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeletar4ActionPerformed(evt);
            }
        });

        bntSalvar4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSalvar4.setForeground(new java.awt.Color(0, 0, 0));
        bntSalvar4.setText("Salvar");
        bntSalvar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntSalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotoes4Layout = new javax.swing.GroupLayout(jpBotoes4);
        jpBotoes4.setLayout(jpBotoes4Layout);
        jpBotoes4Layout.setHorizontalGroup(
            jpBotoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoes4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntEditar4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntNovo4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntDeletar4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSalvar4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBotoes4Layout.setVerticalGroup(
            jpBotoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoes4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpBotoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntEditar4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNovo4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntDeletar4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSalvar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCadClienteLayout = new javax.swing.GroupLayout(jpCadCliente);
        jpCadCliente.setLayout(jpCadClienteLayout);
        jpCadClienteLayout.setHorizontalGroup(
            jpCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadClienteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCell)
                    .addGroup(jpCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblEmail)
                        .addComponent(lblNome)
                        .addGroup(jpCadClienteLayout.createSequentialGroup()
                            .addComponent(lblIdCli)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNome)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addGroup(jpCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRG)
                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(lblCPF)
                    .addComponent(txtRG)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade))
                .addContainerGap(384, Short.MAX_VALUE))
            .addComponent(jpBotoes4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCadClienteLayout.setVerticalGroup(
            jpCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadClienteLayout.createSequentialGroup()
                .addGroup(jpCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadClienteLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jpCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdCli)
                            .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadClienteLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jpBotoes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        tabbed.addTab("Cadastrar Cliente", jpCadCliente);

        lblIdCar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblIdCar.setForeground(new java.awt.Color(0, 0, 0));
        lblIdCar.setText("ID:");

        txtIdCar.setEditable(false);
        txtIdCar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblModelo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(0, 0, 0));
        lblModelo.setText("Modelo:");

        txtModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModelKeyPressed(evt);
            }
        });

        lblFab.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblFab.setForeground(new java.awt.Color(0, 0, 0));
        lblFab.setText("Fabricante:");

        txtFab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFabKeyPressed(evt);
            }
        });

        lblAnoFab.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblAnoFab.setForeground(new java.awt.Color(0, 0, 0));
        lblAnoFab.setText("Ano de Fab.");

        txtAnoFab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtAnoFab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAnoFab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnoFabKeyPressed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(0, 0, 0));
        lblPlaca.setText("Placa:");

        txtPlaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlacaKeyPressed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(0, 0, 0));
        lblPreco.setText("Preço:");

        txtPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpBotoes5.setBackground(new java.awt.Color(51, 51, 51));
        jpBotoes5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntEditar5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntEditar5.setForeground(new java.awt.Color(0, 0, 0));
        bntEditar5.setText("Editar");
        bntEditar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntEditar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditar5ActionPerformed(evt);
            }
        });

        bntNovo5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNovo5.setForeground(new java.awt.Color(0, 0, 0));
        bntNovo5.setText("Novo");
        bntNovo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntNovo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovo5ActionPerformed(evt);
            }
        });

        bntDeletar5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntDeletar5.setForeground(new java.awt.Color(0, 0, 0));
        bntDeletar5.setText("Deletar");
        bntDeletar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntDeletar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeletar5ActionPerformed(evt);
            }
        });

        bntSalvar5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSalvar5.setForeground(new java.awt.Color(0, 0, 0));
        bntSalvar5.setText("Salvar");
        bntSalvar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntSalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotoes5Layout = new javax.swing.GroupLayout(jpBotoes5);
        jpBotoes5.setLayout(jpBotoes5Layout);
        jpBotoes5Layout.setHorizontalGroup(
            jpBotoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoes5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntEditar5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntNovo5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntDeletar5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBotoes5Layout.setVerticalGroup(
            jpBotoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoes5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpBotoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntEditar5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNovo5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntDeletar5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCadCarrosLayout = new javax.swing.GroupLayout(jpCadCarros);
        jpCadCarros.setLayout(jpCadCarrosLayout);
        jpCadCarrosLayout.setHorizontalGroup(
            jpCadCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadCarrosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpCadCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnoFab)
                    .addGroup(jpCadCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblFab)
                        .addComponent(lblModelo)
                        .addGroup(jpCadCarrosLayout.createSequentialGroup()
                            .addComponent(lblIdCar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdCar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addComponent(txtFab))
                    .addComponent(txtAnoFab, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168)
                .addGroup(jpCadCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(368, Short.MAX_VALUE))
            .addComponent(jpBotoes5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCadCarrosLayout.setVerticalGroup(
            jpCadCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadCarrosLayout.createSequentialGroup()
                .addGroup(jpCadCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadCarrosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpCadCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdCar)
                            .addComponent(txtIdCar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnoFab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnoFab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadCarrosLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jpBotoes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        tabbed.addTab("Cadastrar Carros", jpCadCarros);

        lblBuscarCli.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBuscarCli.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarCli.setText("Buscar Cliente:");

        txtBuscarCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCliActionPerformed(evt);
            }
        });

        bntPesquisarC.setText("Pesquisar");
        bntPesquisarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarCActionPerformed(evt);
            }
        });

        bntLimparC.setText("Limpar");
        bntLimparC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparCActionPerformed(evt);
            }
        });

        tblCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-mail", "CPF", "RG", "Celular", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCli);

        javax.swing.GroupLayout jpTblCliLayout = new javax.swing.GroupLayout(jpTblCli);
        jpTblCli.setLayout(jpTblCliLayout);
        jpTblCliLayout.setHorizontalGroup(
            jpTblCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpTblCliLayout.setVerticalGroup(
            jpTblCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpConsultCliLayout = new javax.swing.GroupLayout(jpConsultCli);
        jpConsultCli.setLayout(jpConsultCliLayout);
        jpConsultCliLayout.setHorizontalGroup(
            jpConsultCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultCliLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(lblBuscarCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntPesquisarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntLimparC)
                .addContainerGap(188, Short.MAX_VALUE))
            .addComponent(jpTblCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpConsultCliLayout.setVerticalGroup(
            jpConsultCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultCliLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpConsultCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarCli)
                    .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisarC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntLimparC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTblCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        tabbed.addTab("Consultar Cliente", jpConsultCli);

        lblBuscarCar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBuscarCar.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarCar.setText("Buscar Carro:");

        txtBuscarCar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntPesquisarCar.setText("Pesquisar");
        bntPesquisarCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarCarActionPerformed(evt);
            }
        });

        bntLimparCar.setText("Limpar");
        bntLimparCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparCarActionPerformed(evt);
            }
        });

        tblCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Modelo", "Fabricante", "Ana de Fab.", "Placa", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCar);

        javax.swing.GroupLayout jpTblCarLayout = new javax.swing.GroupLayout(jpTblCar);
        jpTblCar.setLayout(jpTblCarLayout);
        jpTblCarLayout.setHorizontalGroup(
            jpTblCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jpTblCarLayout.setVerticalGroup(
            jpTblCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTblCarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpConsultCarLayout = new javax.swing.GroupLayout(jpConsultCar);
        jpConsultCar.setLayout(jpConsultCarLayout);
        jpConsultCarLayout.setHorizontalGroup(
            jpConsultCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultCarLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(lblBuscarCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntPesquisarCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntLimparCar)
                .addContainerGap(195, Short.MAX_VALUE))
            .addComponent(jpTblCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpConsultCarLayout.setVerticalGroup(
            jpConsultCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultCarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpConsultCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarCar)
                    .addComponent(txtBuscarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntLimparCar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTblCar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        tabbed.addTab("Consultar Carro", jpConsultCar);

        javax.swing.GroupLayout jpFundoLayout = new javax.swing.GroupLayout(jpFundo);
        jpFundo.setLayout(jpFundoLayout);
        jpFundoLayout.setHorizontalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed)
        );
        jpFundoLayout.setVerticalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntLimparCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparCActionPerformed
        // TODO add your handling code here:
        txtBuscarCli.setText("");
        
    }//GEN-LAST:event_bntLimparCActionPerformed

    private void bntLimparCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparCarActionPerformed
        // TODO add your handling code here:
        txtBuscarCar.setText("");
        
    }//GEN-LAST:event_bntLimparCarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEmail.requestFocus();
        }
        
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCell.requestFocus();
        }
        
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtCellKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCpf.requestFocus();
        }
        
    }//GEN-LAST:event_txtCellKeyPressed

    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRG.requestFocus();
        }
        
    }//GEN-LAST:event_txtCpfKeyPressed

    private void txtRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtIdade.requestFocus();
        }
        
    }//GEN-LAST:event_txtRGKeyPressed

    private void txtModelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtFab.requestFocus();
        }
        
    }//GEN-LAST:event_txtModelKeyPressed

    private void txtFabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFabKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtAnoFab.requestFocus();
        }
        
    }//GEN-LAST:event_txtFabKeyPressed

    private void txtAnoFabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoFabKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPlaca.requestFocus();
        }
        
    }//GEN-LAST:event_txtAnoFabKeyPressed

    private void txtPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPreco.requestFocus();
        }
        
    }//GEN-LAST:event_txtPlacaKeyPressed

    private void bntNovo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovo4ActionPerformed
        // TODO add your handling code here:
        txtIdCli.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtCell.setText("");
        txtCpf.setText("");
        txtRG.setText("");
        txtIdade.setText("");
    }//GEN-LAST:event_bntNovo4ActionPerformed

    private void bntDeletar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletar4ActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();
       
        cli.setId(Integer.parseInt(txtIdCli.getText()));
        
        ClienteDAO dao = new ClienteDAO();
        dao.deleteCli(cli);
    }//GEN-LAST:event_bntDeletar4ActionPerformed

    private void bntSalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvar4ActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();
        
        cli.setNome(txtNome.getText());
        cli.setEmail(txtEmail.getText());
        cli.setCelular(txtCell.getText());
        cli.setCpf(txtCpf.getText());
        cli.setRg(txtRG.getText());
        cli.setIdade(txtIdade.getText());
        
        
        ClienteDAO dao = new ClienteDAO();
        dao.saveCli(cli);
    }//GEN-LAST:event_bntSalvar4ActionPerformed

    private void bntNovo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovo5ActionPerformed
        // TODO add your handling code here:
        txtIdCar.setText("");
        txtModel.setText("");
        txtFab.setText("");
        txtAnoFab.setText("");
        txtPlaca.setText("");
        txtPreco.setText("");
    }//GEN-LAST:event_bntNovo5ActionPerformed

    private void bntDeletar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletar5ActionPerformed
        // TODO add your handling code here:
        Carro car = new Carro();
       
        car.setId(Integer.parseInt(txtIdCar.getText()));
        
        CarroDAO dao = new CarroDAO();
        dao.deleteCar(car);
    }//GEN-LAST:event_bntDeletar5ActionPerformed

    private void bntSalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvar5ActionPerformed
        // TODO add your handling code here:
                Carro car = new Carro();
        
        car.setModelo(txtModel.getText());
        car.setFabricante(txtFab.getText());
        car.setData_fabricacao(txtAnoFab.getText());
        car.setPlaca(txtPlaca.getText());
        car.setPreco(Double.parseDouble(txtPreco.getText()));
        
        CarroDAO dao = new CarroDAO();
        dao.saveCar(car);
    }//GEN-LAST:event_bntSalvar5ActionPerformed

    
        public void listarCarro(){
        CarroDAO dao = new CarroDAO();
        List<Carro> carros = dao.listCar();
        DefaultTableModel dados = (DefaultTableModel) tblCar.getModel();
        dados.setNumRows(0);
        
            for (Carro carro : carros) {
                dados.addRow(new Object []{
                carro.getId(),
                carro.getModelo(),
                carro.getFabricante(),
                carro.getData_fabricacao(),
                carro.getPlaca(),
                carro.getPreco(),
            });
            }
    }
        public void listarCliente(){
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.listCli();
        DefaultTableModel dados = (DefaultTableModel) tblCli.getModel();
        dados.setNumRows(0);
        
            for (Cliente cliente : clientes) {
              dados.addRow(new Object []{
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getCelular(),
                cliente.getCpf(),
                cliente.getRg(),
                cliente.getIdade()
            });
            }
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listarCliente();
        listarCarro();
    }//GEN-LAST:event_formWindowActivated

    private void tblCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCliMouseClicked
        // TODO add your handling code here:
        tabbed.setSelectedIndex(0);
        txtIdCli.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 0).toString());
        txtNome.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 1).toString());
        txtEmail.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 2).toString());
        txtCell.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 3).toString());
        txtCpf.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 4).toString());
        txtRG.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 5).toString());
        txtIdade.setText(tblCli.getValueAt(tblCli.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tblCliMouseClicked

    private void bntEditar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditar4ActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();
        
        cli.setId(Integer.parseInt(txtIdCli.getText()));
        cli.setNome(txtNome.getText());
        cli.setEmail(txtEmail.getText());
        cli.setCelular(txtCell.getText());
        cli.setCpf(txtCpf.getText());
        cli.setRg(txtRG.getText());
        cli.setIdade(txtIdade.getText());
        
        
        ClienteDAO dao = new ClienteDAO();
        dao.updateCli(cli);
    }//GEN-LAST:event_bntEditar4ActionPerformed

    private void bntPesquisarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarCActionPerformed
        // TODO add your handling code here:
        String nome = "%"+txtBuscarCli.getText()+"%";
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.pesquisaCli(nome);
        DefaultTableModel dados = (DefaultTableModel) tblCli.getModel();
        dados.setNumRows(0);
        
        for (Cliente cliente : clientes) {
                dados.addRow(new Object []{
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getCelular(),
                cliente.getCpf(),
                cliente.getRg(),
                cliente.getIdade()
            });
        }

    }//GEN-LAST:event_bntPesquisarCActionPerformed

    private void txtBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliActionPerformed

    private void bntEditar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditar5ActionPerformed
        // TODO add your handling code here:
        Carro car = new Carro();
        
        car.setId(Integer.parseInt(txtIdCar.getText()));
        car.setModelo(txtModel.getText());
        car.setFabricante(txtFab.getText());
        car.setData_fabricacao(txtAnoFab.getText());
        car.setPlaca(txtPlaca.getText());
        car.setPreco(Double.parseDouble(txtPreco.getText()));
        
        
        CarroDAO dao = new CarroDAO();
        dao.updateCar(car);
    }//GEN-LAST:event_bntEditar5ActionPerformed

    private void tblCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarMouseClicked
        // TODO add your handling code here:
        tabbed.setSelectedIndex(1);
        txtIdCar.setText(tblCar.getValueAt(tblCar.getSelectedRow(), 0).toString());
        txtModel.setText(tblCar.getValueAt(tblCar.getSelectedRow(), 1).toString());
        txtFab.setText(tblCar.getValueAt(tblCar.getSelectedRow(), 2).toString());
        txtAnoFab.setText(tblCar.getValueAt(tblCar.getSelectedRow(), 3).toString());
        txtPlaca.setText(tblCar.getValueAt(tblCar.getSelectedRow(), 4).toString());
        txtPreco.setText(tblCar.getValueAt(tblCar.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tblCarMouseClicked

    private void bntPesquisarCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarCarActionPerformed
        // TODO add your handling code here:
        String modelo = "%"+txtBuscarCar.getText()+"%";
        CarroDAO dao = new CarroDAO();
        List<Carro> carros = dao.pesquisaCar(modelo);
        DefaultTableModel dados = (DefaultTableModel) tblCar.getModel();
        dados.setNumRows(0);
        
        for (Carro carro : carros) {
           dados.addRow(new Object []{
           carro.getId(),
           carro.getModelo(),
           carro.getFabricante(),
           carro.getData_fabricacao(),
           carro.getPlaca(),
           carro.getPreco(),
            });
        }
    }//GEN-LAST:event_bntPesquisarCarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDeletar4;
    private javax.swing.JButton bntDeletar5;
    public javax.swing.JButton bntEditar4;
    public javax.swing.JButton bntEditar5;
    private javax.swing.JButton bntLimparC;
    public javax.swing.JButton bntLimparCar;
    private javax.swing.JButton bntNovo4;
    private javax.swing.JButton bntNovo5;
    private javax.swing.JButton bntPesquisarC;
    public javax.swing.JButton bntPesquisarCar;
    private javax.swing.JButton bntSalvar4;
    private javax.swing.JButton bntSalvar5;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBotoes4;
    private javax.swing.JPanel jpBotoes5;
    private javax.swing.JPanel jpCadCarros;
    private javax.swing.JPanel jpCadCliente;
    private javax.swing.JPanel jpConsultCar;
    private javax.swing.JPanel jpConsultCli;
    private javax.swing.JPanel jpFundo;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JPanel jpTblCar;
    private javax.swing.JPanel jpTblCli;
    private javax.swing.JLabel lblAnoFab;
    private javax.swing.JLabel lblBuscarCar;
    private javax.swing.JLabel lblBuscarCli;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCar;
    private javax.swing.JLabel lblCell;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFab;
    private javax.swing.JLabel lblIdCar;
    private javax.swing.JLabel lblIdCli;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblRG;
    private javax.swing.JTabbedPane tabbed;
    private javax.swing.JTable tblCar;
    private javax.swing.JTable tblCli;
    private javax.swing.JFormattedTextField txtAnoFab;
    public javax.swing.JTextField txtBuscarCar;
    private javax.swing.JTextField txtBuscarCli;
    public javax.swing.JFormattedTextField txtCell;
    public javax.swing.JFormattedTextField txtCpf;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtFab;
    public javax.swing.JTextField txtIdCar;
    public javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtIdade;
    public javax.swing.JTextField txtModel;
    public javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlaca;
    public javax.swing.JTextField txtPreco;
    public javax.swing.JFormattedTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
