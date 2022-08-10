package vista;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTextField;

public class vista8 extends javax.swing.JFrame {

    public vista8() {
    	setResizable(false);
    	setSize(new Dimension(518, 524));
    	getContentPane().setSize(new Dimension(10, 8));
    	getContentPane().setEnabled(false);
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\New_Pc\\Pictures\\asercor.png"));
    	setBackground(new Color(0, 139, 139));
    	getContentPane().setBackground(new Color(204, 255, 204));
        initComponents();
    }

    @SuppressWarnings("unchecked") //eliminar alertas
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(new Color(51, 0, 102));
        jLabel1.setForeground(new Color(0, 102, 0));
        btn_crearUsuario = new javax.swing.JButton();
        btn_crearUsuario.setForeground(new Color(0, 102, 0));
        btn_salir = new javax.swing.JButton();
        btn_salir.setForeground(new Color(0, 102, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASERCOR SAS");

        jLabel1.setFont(new Font("Candara", Font.BOLD, 30)); // NOI18N
        jLabel1.setText("Creacion Usuarios");

        btn_crearUsuario.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16)); // NOI18N
        btn_crearUsuario.setText("Aceptar");
        btn_crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        btn_salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_salirKeyPressed(evt);
            }
        });
        
        lblNewLabel = new JLabel("MaycolCG © ");
        lblNewLabel.setForeground(new Color(0, 102, 0));
        lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 8));
        
        lblNewLabel_1 = new JLabel("Cedula:");
        lblNewLabel_1.setForeground(new Color(0, 100, 0));
        lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        
        lblNewLabel_2 = new JLabel("Nombre Completo:");
        lblNewLabel_2.setForeground(new Color(0, 100, 0));
        lblNewLabel_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        
        lblNewLabel_3 = new JLabel("Usuario:");
        lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        lblNewLabel_3.setForeground(new Color(0, 100, 0));
        
        lblNewLabel_4 = new JLabel("Contraseña:");
        lblNewLabel_4.setForeground(new Color(0, 100, 0));
        lblNewLabel_4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        lblNewLabel_4.setBackground(new Color(0, 100, 0));
        
        txt_cedulaAsesor = new JTextField();
        txt_cedulaAsesor.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
        txt_cedulaAsesor.setColumns(10);
        
        txt_nombreAsesor = new JTextField();
        txt_nombreAsesor.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
        txt_nombreAsesor.setColumns(10);
        
        txt_usuarioAsesor = new JTextField();
        txt_usuarioAsesor.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
        txt_usuarioAsesor.setColumns(10);
        
        txt_contraseñaAsesor = new JTextField();
        txt_contraseñaAsesor.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
        txt_contraseñaAsesor.setColumns(10);
        
        lblNewLabel_5 = new JLabel("Privilegio:");
        lblNewLabel_5.setForeground(new Color(0, 100, 0));
        lblNewLabel_5.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        
        txt_privilegio = new JTextField();
        txt_privilegio.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        txt_privilegio.setColumns(10);
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(148)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
        							.addGap(135))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblNewLabel)
        							.addPreferredGap(ComponentPlacement.RELATED))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(54)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblNewLabel_2)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(txt_nombreAsesor, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(104)
        							.addComponent(btn_crearUsuario)
        							.addGap(50)
        							.addComponent(btn_salir, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblNewLabel_4)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(txt_contraseñaAsesor, 167, 167, 167))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblNewLabel_1)
        							.addGap(18)
        							.addComponent(txt_cedulaAsesor, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblNewLabel_3)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(txt_usuarioAsesor, 206, 206, 206))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(txt_privilegio, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(28)
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel_2)
        				.addComponent(txt_nombreAsesor, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(34)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_1)
        				.addComponent(txt_cedulaAsesor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel_3)
        				.addComponent(txt_usuarioAsesor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_4)
        				.addComponent(txt_contraseñaAsesor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_5)
        				.addComponent(txt_privilegio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(74)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_crearUsuario)
        				.addComponent(btn_salir))
        			.addGap(10)
        			.addComponent(lblNewLabel)
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_salirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_salirKeyPressed
        // TODO add your handling code here:       
    }//GEN-LAST:event_btn_salirKeyPressed

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseClicked
    private javax.swing.JButton btn_crearUsuario;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JTextField txt_cedulaAsesor;
    private JTextField txt_nombreAsesor;
    private JTextField txt_usuarioAsesor;
    private JTextField txt_contraseñaAsesor;
    private JLabel lblNewLabel_5;
    private JTextField txt_privilegio;
    // End of variables declaration//GEN-END:variables



	public JTextField getTxt_cedulaAsesor() {
		return txt_cedulaAsesor;
	}

	public JTextField getTxt_privilegio() {
		return txt_privilegio;
	}

	public void setTxt_privilegio(JTextField txt_privilegio) {
		this.txt_privilegio = txt_privilegio;
	}

	public void setTxt_cedulaAsesor(JTextField txt_cedulaAsesor) {
		this.txt_cedulaAsesor = txt_cedulaAsesor;
	}

	public JTextField getTxt_nombreAsesor() {
		return txt_nombreAsesor;
	}

	public void setTxt_nombreAsesor(JTextField txt_nombreAsesor) {
		this.txt_nombreAsesor = txt_nombreAsesor;
	}

	public JTextField getTxt_usuarioAsesor() {
		return txt_usuarioAsesor;
	}

	public void setTxt_usuarioAsesor(JTextField txt_usuarioAsesor) {
		this.txt_usuarioAsesor = txt_usuarioAsesor;
	}

	public JTextField getTxt_contraseñaAsesor() {
		return txt_contraseñaAsesor;
	}

	public void setTxt_contraseñaAsesor(JTextField txt_contraseñaAsesor) {
		this.txt_contraseñaAsesor = txt_contraseñaAsesor;
	}

	public javax.swing.JButton getBtn_crearUsuario() {
		return btn_crearUsuario;
	}

	public void setBtn_crearUsuario(javax.swing.JButton btn_crearUsuario) {
		this.btn_crearUsuario = btn_crearUsuario;
	}

	public javax.swing.JButton getBtn_salir() {
		return btn_salir;
	}

	public void setBtn_salir(javax.swing.JButton btn_salir) {
		this.btn_salir = btn_salir;
	}
}
