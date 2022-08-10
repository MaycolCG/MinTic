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

public class vista1 extends javax.swing.JFrame {

    public vista1() {
    	setResizable(false);
    	setSize(new Dimension(409, 379));
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
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_ver = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btnCampania = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASERCOR SAS");

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setText("ASERCOR SAS");

        jLabel2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18)); // NOI18N
        jLabel2.setText("Seleccione una Opción");

        btn_buscar.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18)); // NOI18N
        btn_buscar.setText("Gestionar Cliente");
        
        
        btnCampania.setText("Ingresar Camapaña");
        JButton btnCamapania = new JButton("Ingresar a Campaña");
        btnCamapania.setForeground(new Color(0, 0, 0));
        btnCamapania.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
        
        
        btn_ver.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18)); // NOI18N
        btn_ver.setText("Ver Base de Datos");

        btn_salir.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
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
        lblNewLabel.setForeground(new Color(0, 128, 0));
        lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 8));
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(342)
        							.addComponent(btn_salir))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(82)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(btn_buscar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(btn_ver, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        								.addComponent(btnCamapania, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        					.addGap(0, 24, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(379, Short.MAX_VALUE)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(118)
        					.addComponent(jLabel2))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(106)
        					.addComponent(jLabel1)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(37)
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addComponent(jLabel2)
        			.addGap(41)
        			.addComponent(btn_buscar)
        			.addGap(18)
        			.addComponent(btnCamapania)
        			.addGap(19)
        			.addComponent(btn_ver)
        			.addGap(50)
        			.addComponent(btn_salir)
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_salirKeyPressed
        // TODO add your handling code here:       
    }//GEN-LAST:event_btn_salirKeyPressed

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton btnCampania;
    // End of variables declaration//GEN-END:variables

	private JLabel lblNewLabel;

	public javax.swing.JButton getBtn_buscar() {
		return btn_buscar;
	}

	public void setBtn_buscar(javax.swing.JButton btn_buscar) {
		this.btn_buscar = btn_buscar;
	}

	public javax.swing.JButton getBtn_salir() {
		return btn_salir;
	}

	public void setBtn_salir(javax.swing.JButton btn_salir) {
		this.btn_salir = btn_salir;
	}

	public javax.swing.JButton getBtn_ver() {
		return btn_ver;
	}

	public void setBtn_ver(javax.swing.JButton btn_ver) {
		this.btn_ver = btn_ver;
	}
}
