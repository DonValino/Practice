
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake
 */
public class UniversityGUI extends javax.swing.JFrame {

    /**
     * Creates new form UniversityGUI
     */
    private int counter = 0;
    private University theUni;
    
    public UniversityGUI(University u) {
        initComponents();
         theUni = u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        universityNameText = new javax.swing.JTextField();
        presidentText = new javax.swing.JTextField();
        locationText = new javax.swing.JTextField();
        numberOfDepartmentText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        departmentNameText = new javax.swing.JTextField();
        departmentIDText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        leftButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        exitClick = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("University name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel5.setText("President:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        jLabel6.setText("Location:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));

        jLabel7.setText("Number of department:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 150, 20));

        universityNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityNameTextActionPerformed(evt);
            }
        });
        jPanel2.add(universityNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 150, 20));

        presidentText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presidentTextActionPerformed(evt);
            }
        });
        jPanel2.add(presidentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 150, 20));
        jPanel2.add(locationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 20));
        jPanel2.add(numberOfDepartmentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 100, 20));

        jLabel2.setText("Department Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, 24));
        jPanel2.add(departmentNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 130, -1));
        jPanel2.add(departmentIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 130, -1));

        jLabel3.setText("Department ID:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 110, 24));

        leftButton.setText("<");
        leftButton.setToolTipText("left button");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });
        jPanel2.add(leftButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 70, -1));

        jButton2.setText(">");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 70, -1));

        addButton.setText("Add");
        addButton.setToolTipText("Add a University");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 80, -1));

        updateButton.setText("Update");
        updateButton.setToolTipText("Update a University");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 90, -1));

        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Delete a University");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 80, -1));

        refreshButton.setText("Refresh");
        refreshButton.setToolTipText("Exit Button");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        jPanel2.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mercedes-Benz-E-Class-04.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        exitClick.setText("File");
        exitClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitClickMouseClicked(evt);
            }
        });
        exitClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitClickActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('P');
        jMenuItem1.setText("exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        exitClick.add(jMenuItem1);

        menuBar.add(exitClick);

        jMenu2.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Help Content");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("About");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Developers");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Version Info.");
        jMenu2.add(jMenuItem5);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        // TODO add your handling code here:
        if ((counter - 1) >= 0) {
                    counter--;
                    departmentNameText.setText(theUni.getDept(counter).getDeptName());
                    departmentIDText.setText(Integer.toString(theUni.getDept(counter).getDeptid()));
                }
    }//GEN-LAST:event_leftButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if ((counter + 1) < theUni.getNumDept()) {
                    counter++;
                    departmentNameText.setText(theUni.getDept(counter).getDeptName());
                    departmentIDText.setText(Integer.toString(theUni.getDept(counter).getDeptid()));
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void universityNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityNameTextActionPerformed
        // TODO add your handling code here:
         universityNameText.setText(theUni.getuName());
    }//GEN-LAST:event_universityNameTextActionPerformed

    private void presidentTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presidentTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_presidentTextActionPerformed

    private void exitClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitClickActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_exitClickActionPerformed

    private void exitClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_exitClickMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      new developersGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        setFirst();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        new addForm(theUni).setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateDep();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        deleteDep();
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */

public void setFirst() {
		counter = 0;
		if (theUni.getNumDept() > 0) {
            departmentNameText.setText(theUni.getDept(counter).getDeptName());
            departmentIDText.setText(Integer.toString(theUni.getDept(counter).getDeptid()));
		}
		numberOfDepartmentText.setText(Integer.toString(theUni.getNumDept()));

	}

public void setText1()
{
    universityNameText.setText(theUni.getuName());
    presidentText.setText(theUni.getPresident());
    locationText.setText(theUni.getLocation());
    numberOfDepartmentText.setText(Integer.toString(theUni.getNumDept()));
}
	public void deleteDep() {
		{
			String b = "";

			while (b==null || theUni.findDep(b) == -1) {
				b = JOptionPane.showInputDialog(null,
						"Enter the name of department you wish to delete: ",
						"University", JOptionPane.QUESTION_MESSAGE);
			}
			int numberOfDeleted = theUni.removeDep(b);
			JOptionPane.showMessageDialog(null, numberOfDeleted
					+ " Record(s) deleted.");
		}
	}

	public void updateDep() {

		String d = "", nd = "";

		while (d.equals("") || theUni.findDep(d) == -1) {
			d = JOptionPane.showInputDialog(null,
					"Enter the name of department you wish to update: ",
					"University", JOptionPane.QUESTION_MESSAGE);
		}

		while (nd.equals("") || (Department.isNumber(nd))) {
			nd = JOptionPane.showInputDialog(null,
					"Enter the new name of the department: ", "University",
					JOptionPane.QUESTION_MESSAGE);
		}
		theUni.changedeptname(d, nd);
	}
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField departmentIDText;
    private javax.swing.JTextField departmentNameText;
    private javax.swing.JMenu exitClick;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton leftButton;
    private javax.swing.JTextField locationText;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField numberOfDepartmentText;
    private javax.swing.JTextField presidentText;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField universityNameText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}