/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.Font;

/**
 *
 * @author Ozzyta
 */
public class vista5 extends javax.swing.JFrame {

    /**
     * Creates new form vista5
     */
    public vista5() {
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
        Atras = new javax.swing.JButton();
        Atras.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        Atras.setForeground(new Color(0, 100, 0));
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTable2.setFillsViewportHeight(true);
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 14));
        jTable2.setBackground(new Color(255, 255, 255));
        jTable2.setForeground(new Color(51, 0, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASERCOR SAS");
        setBackground(new Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setText("Base Datos Clientes");

        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        

        jTable2.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"Cedula", "Nombre Cliente", "Telefono1 ", "Telefono2", "Telefono3", "Telefono4", "Correo ", "Direccion ", "Ciudad ", "Departamento ", "Producto", "Obligacion ", "Grupo ", "Min_Mora ", "Saldo_Gestionable", "Referencia ", "Dias_Mora", "Plan_Descuento "
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        jScrollPane3.setViewportView(jTable2);
        
        lblNewLabel = new JLabel("MaycolCG © ");
        lblNewLabel.setForeground(new Color(0, 100, 0));
        lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(516)
        					.addComponent(jLabel1))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap(1160, Short.MAX_VALUE)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(579, Short.MAX_VALUE)
        			.addComponent(Atras)
        			.addGap(577))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        			.addComponent(Atras)
        			.addGap(27)
        			.addComponent(lblNewLabel)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private JLabel lblNewLabel;
    // End of variables declaration//GEN-END:variables

    public JButton getAtras() {
        return Atras;
    }

    public void setAtras(JButton Atras) {
        this.Atras = Atras;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public void setjTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }
}