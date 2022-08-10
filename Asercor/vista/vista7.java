/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vista7 extends javax.swing.JFrame {

    public vista7() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\New_Pc\\Pictures\\asercor.png"));
    	getContentPane().setBackground(new Color(204, 255, 204));
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
        jLabel1.setBackground(new Color(51, 0, 102));
        jLabel1.setForeground(new Color(0, 100, 0));
        btn_SalirUsuarios = new javax.swing.JButton();
        btn_SalirUsuarios.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        btn_SalirUsuarios.setForeground(new Color(0, 100, 0));
        
        btn_ModificarUsuarios = new javax.swing.JButton();
        btn_ModificarUsuarios.setForeground(new Color(0, 100, 0));
        btn_ModificarUsuarios.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
        
        
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableUser = new javax.swing.JTable();
        jtableUser.setFillsViewportHeight(true);
        jtableUser.setColumnSelectionAllowed(true);
        jtableUser.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 14));
        jtableUser.setBackground(new Color(255, 255, 255));
        jtableUser.setForeground(new Color(25, 25, 112));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASERCOR SAS");
        setBackground(new Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setText("Listado Usuarios");
        
        btn_ModificarUsuarios.setText("Modificar");
        btn_ModificarUsuarios.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		AtrasActionPerformed(evt);
        	}
        });
        
        btn_SalirUsuarios.setText("Salir");
        btn_SalirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        

        jtableUser.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        	},
        	new String[] {
        		"Cedula", "Nombre", "Usuario", "Contrasena", "Privilegio", "Proyecto"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, Object.class, Object.class, Object.class, Object.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        jScrollPane3.setViewportView(jtableUser);
        
        lblNewLabel = new JLabel("MaycolCG © ");
        lblNewLabel.setForeground(new Color(0, 100, 0));
        lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 8));
              
        	
        
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblNewLabel)
        					.addContainerGap())
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        					.addContainerGap())))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(191)
        			.addComponent(btn_ModificarUsuarios)
        			.addGap(86)
        			.addComponent(btn_SalirUsuarios, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(186, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(238)
        			.addComponent(jLabel1)
        			.addContainerGap(241, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE)
        			.addGap(29)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_ModificarUsuarios)
        				.addComponent(btn_SalirUsuarios, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addGap(25)
        			.addComponent(lblNewLabel)
        			.addGap(7))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SalirUsuarios;
    private javax.swing.JButton btn_ModificarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtableUser;
    private JLabel lblNewLabel;
    // End of variables declaration//GEN-END:variables
	public javax.swing.JButton getBtn_SalirUsuarios() {
		return btn_SalirUsuarios;
	}

	public void setBtn_SalirUsuarios(javax.swing.JButton btn_SalirUsuarios) {
		this.btn_SalirUsuarios = btn_SalirUsuarios;
	}

	public javax.swing.JButton getBtn_ModificarUsuarios() {
		return btn_ModificarUsuarios;
	}

	public void setBtn_ModificarUsuarios(javax.swing.JButton btn_ModificarUsuarios) {
		this.btn_ModificarUsuarios = btn_ModificarUsuarios;
	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public javax.swing.JScrollPane getjScrollPane3() {
		return jScrollPane3;
	}

	public void setjScrollPane3(javax.swing.JScrollPane jScrollPane3) {
		this.jScrollPane3 = jScrollPane3;
	}

	public javax.swing.JTable getJtableUser() {
		return jtableUser;
	}

	public void setJtableUser(javax.swing.JTable jtableUser) {
		this.jtableUser = jtableUser;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

}

    
	