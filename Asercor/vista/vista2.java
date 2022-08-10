
package vista;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class vista2 extends javax.swing.JFrame {


    public vista2() {
    	setResizable(false);
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\New_Pc\\Pictures\\asercor.png"));
    	getContentPane().setBackground(new Color(204, 255, 204));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_salirSupervisor = new javax.swing.JButton();
        btn_salirSupervisor.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASERCOR SAS");
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new Font("Candara", Font.PLAIN, 26)); // NOI18N
        jLabel1.setText("Panel Supervisor");

        btn_salirSupervisor.setText("Salir");
        btn_salirSupervisor.setName("");
        
        btn_ExpBaseGeneral = new JButton("Exportar Base Datos");
        btn_ExpBaseGeneral.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        
        btn_ExpGestiones = new JButton("Exportar Gestiones");
        btn_ExpGestiones.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        
        btn_ImportarBase = new JButton("Importar Base Datos");
        btn_ImportarBase.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        
        btn_EliminarRegistro = new JButton("Eliminar Registro");
        btn_EliminarRegistro.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        
        btn_ImportarGestiones = new JButton("Importar Gestiones");
        btn_ImportarGestiones.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        
        btnGestionar = new JButton("Gestionar Cliente");
        btnGestionar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));        
                
        btn_listaUsuarios = new JButton("Listado Usuarios");
        btn_listaUsuarios.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        
        btn_crearUsuarios = new JButton("Crear Usuarios");
        btn_crearUsuarios.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
        btn_crearUsuarios.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        	
        });
        
        lblNewLabel = new JLabel("MaycolCG © ");
        lblNewLabel.setForeground(new Color(0, 128, 0));
        lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 8));
        
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(167)
        			.addComponent(btn_salirSupervisor, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btn_crearUsuarios, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(btn_EliminarRegistro, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(btn_ExpGestiones, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        				.addComponent(btn_ExpBaseGeneral, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
        			.addGap(32)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btn_ImportarBase, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        				.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING)
        					.addComponent(btn_listaUsuarios, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        					.addComponent(btnGestionar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        					.addComponent(btn_ImportarGestiones, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
        			.addGap(18))
        		.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        			.addGap(114)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(132, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btn_ExpBaseGeneral)
        				.addComponent(btn_ImportarBase))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_ImportarGestiones)
        				.addComponent(btn_ExpGestiones))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btnGestionar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btn_EliminarRegistro))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btn_crearUsuarios)
        				.addComponent(btn_listaUsuarios))
        			.addGap(37)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btn_salirSupervisor)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salirSupervisor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton btn_ExpBaseGeneral;
    private javax.swing.JButton btn_ExpGestiones;
    private javax.swing.JButton btn_ImportarBase;
    private javax.swing.JButton btn_EliminarRegistro;
    private javax.swing.JButton btn_ImportarGestiones;
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btn_crearUsuarios;
    private javax.swing.JButton btn_listaUsuarios;
    private JLabel lblNewLabel;

    
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtn_listaUsuarios() {
		return btn_listaUsuarios;
	}

	public void setBtn_listaUsuarios(javax.swing.JButton btn_listaUsuarios) {
		this.btn_listaUsuarios = btn_listaUsuarios;
	}

	public javax.swing.JButton getBtn_salirSupervisor() {
		return btn_salirSupervisor;
	}

	public void setBtn_salirSupervisor(javax.swing.JButton btn_salirSupervisor) {
		this.btn_salirSupervisor = btn_salirSupervisor;
	}

	public javax.swing.JButton getBtn_ExpBaseGeneral() {
		return btn_ExpBaseGeneral;
	}

	public void setBtn_ExpBaseGeneral(javax.swing.JButton btn_ExpBaseGeneral) {
		this.btn_ExpBaseGeneral = btn_ExpBaseGeneral;
	}

	public javax.swing.JButton getBtn_ExpGestiones() {
		return btn_ExpGestiones;
	}

	public void setBtn_ExpGestiones(javax.swing.JButton btn_ExpGestiones) {
		this.btn_ExpGestiones = btn_ExpGestiones;
	}

	public javax.swing.JButton getBtn_ImportarBase() {
		return btn_ImportarBase;
	}

	public void setBtn_ImportarBase(javax.swing.JButton btn_ImportarBase) {
		this.btn_ImportarBase = btn_ImportarBase;
	}

	public javax.swing.JButton getBtn_EliminarRegistro() {
		return btn_EliminarRegistro;
	}

	public void setBtn_EliminarRegistro(javax.swing.JButton btn_EliminarRegistro) {
		this.btn_EliminarRegistro = btn_EliminarRegistro;
	}

	public javax.swing.JButton getBtn_ImportarGestiones() {
		return btn_ImportarGestiones;
	}

	public void setBtn_ImportarGestiones(javax.swing.JButton btn_ImportarGestiones) {
		this.btn_ImportarGestiones = btn_ImportarGestiones;
	}


	public javax.swing.JButton getBtnGestionar() {
		return btnGestionar;
	}

	public void setBtnGestionar(javax.swing.JButton btnGestionar) {
		this.btnGestionar = btnGestionar;
	}

	public javax.swing.JButton getBtn_crearUsuarios() {
		return btn_crearUsuarios;
	}

	public void setBtn_crearUsuarios(javax.swing.JButton btn_crearUsuarios) {
		this.btn_crearUsuarios = btn_crearUsuarios;
	}
}
