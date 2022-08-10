/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Toolkit;

/**
 *
 * @author Ozzyta
 */
public class vista4 extends javax.swing.JFrame {

    /**
     * Creates new form vista3
     */
    public vista4() {
    	setResizable(false);
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\New_Pc\\Pictures\\asercor.png"));
    	getContentPane().setBackground(new Color(204, 250, 204));
    	getContentPane().setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(0, 100, 0));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(new Color(0, 100, 0));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(new Color(0, 100, 0));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(new Color(0, 100, 0));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setForeground(new Color(0, 100, 0));
        btn_modificar = new javax.swing.JButton();
        btn_modificar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        btn_cancelar = new javax.swing.JButton();
        btn_cancelar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_buscar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASERCOR SAS");

        jLabel1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 24)); // NOI18N
        jLabel1.setText("Modificar Cliente");

        jLabel2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16)); // NOI18N
        jLabel7.setText("Direccion:");

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        txt_cedula.setToolTipText("");
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        
        JLabel lblNewLabel = new JLabel("MaycolCG © ");
        lblNewLabel.setForeground(new Color(0, 102, 0));
        lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 7));
        
        txtCiudad = new JTextField();
        
        JLabel lblCiudad = new JLabel();
        lblCiudad.setText("Ciudad:");
        lblCiudad.setForeground(new Color(0, 100, 0));
        lblCiudad.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
        
        txtDepartamento = new JTextField();
        
        lblDepartamento = new JLabel();
        lblDepartamento.setText("Departamento:");
        lblDepartamento.setForeground(new Color(0, 100, 0));
        lblDepartamento.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(139)
        			.addComponent(jLabel1))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(148)
        			.addComponent(txt_cedula, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btn_buscar))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(106)
        			.addComponent(btn_modificar)
        			.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
        			.addComponent(btn_cancelar)
        			.addGap(58)
        			.addComponent(lblNewLabel)
        			.addContainerGap())
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(31)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(jLabel5)
        							.addGap(60))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jLabel6)
        								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel2)
        									.addComponent(jLabel3)))
        							.addGap(48)))
        					.addGap(4))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblCiudad, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblDepartamento)
        						.addComponent(jLabel7))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(txtDireccion)
        				.addComponent(txtCiudad)
        				.addComponent(txt_telefono, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        				.addComponent(txt_nombre, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        				.addComponent(txt_correo, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        				.addComponent(txtDepartamento, 279, 279, Short.MAX_VALUE))
        			.addGap(62))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(jLabel1)
        			.addGap(6)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(5)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txt_cedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(4)
        					.addComponent(btn_buscar)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(15)
        					.addComponent(txt_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel3)))
        			.addGap(10)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel6)
        				.addComponent(txt_telefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(11)
        					.addComponent(jLabel5))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(txt_correo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addGap(14)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblCiudad, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(15)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblDepartamento)
        				.addComponent(txtDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(19)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(btn_modificar)
        					.addComponent(btn_cancelar))
        				.addComponent(lblNewLabel))
        			.addContainerGap(10, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txt_telefono;
    private JTextField txtCiudad;
    private JTextField txtDepartamento;
    private JLabel lblDepartamento;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_modificar() {
        return btn_modificar;
    }

    public void setBtn_modificar(JButton btn_modificar) {
        this.btn_modificar = btn_modificar;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JTextField getTxt_correo() {
        return txt_correo;
    }

    public void setTxt_correo(JTextField txt_correo) {
        this.txt_correo = txt_correo;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public void setTxt_nombre(JTextField txt_nombre) {
        this.txt_nombre = txt_nombre;
    }
   

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public void setBtn_buscar(JButton btn_buscar) {
        this.btn_buscar = btn_buscar;
    }

    public JTextField getTxt_telefono() {
        return txt_telefono;
    }

    public void setTxt_telefono(JTextField txt_telefono) {
        this.txt_telefono = txt_telefono;
    }

	public javax.swing.JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(javax.swing.JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextField getTxtCiudad() {
		return txtCiudad;
	}

	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}

	public JTextField getTxtDepartamento() {
		return txtDepartamento;
	}

	public void setTxtDepartamento(JTextField txtDepartamento) {
		this.txtDepartamento = txtDepartamento;
	}

	public JLabel getLblDepartamento() {
		return lblDepartamento;
	}

	public void setLblDepartamento(JLabel lblDepartamento) {
		this.lblDepartamento = lblDepartamento;
	}
    
}
