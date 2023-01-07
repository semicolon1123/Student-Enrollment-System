import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.print.PrintException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Courses extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    DefaultTableModel dm;
    
    /**
     * Creates new form StudentInfo
     */
    public Courses() {
        initComponents();
        
        // Creating a connection from your database to a java program
        conn = MySQLConnect.ConnectDB();
        // showing data in JTable upon execution
        updateTable();
        btn_save.setEnabled(false);
    }
    
    // Method for emptying all fields
    public void clearFields(){
        txtField_course_id.setText("");
        txtField_courseYear.setText("");
        txtField_courseDesc.setText("");
        txtField_subjectID.setText("");
    }
    
    private void updateTable(){
        
        try {
            
            String sql = "SELECT * FROM course";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_course_info.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } finally {
            
            try {
                // Closing the connection
                rs.close();
                pst.close();
            } catch (Exception e){
                
            }
            
        } // end of finally block
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtField_course_id = new javax.swing.JTextField();
        txtField_courseDesc = new javax.swing.JTextField();
        txtField_courseYear = new javax.swing.JTextField();
        txtField_subjectID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txtField_search = new javax.swing.JTextField();
        btn_print = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_course_info = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Course ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Course Year");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Course Description");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Subject ID");

        txtField_course_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtField_course_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_course_idActionPerformed(evt);
            }
        });

        txtField_courseDesc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtField_courseDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_courseDescActionPerformed(evt);
            }
        });

        txtField_courseYear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtField_courseYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_courseYearActionPerformed(evt);
            }
        });

        txtField_subjectID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtField_subjectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_subjectIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField_subjectID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_courseDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField_courseYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField_course_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtField_course_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField_courseYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField_courseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtField_subjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_new.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new-icon.png"))); // NOI18N
        btn_new.setText("New");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        txtField_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_searchActionPerformed(evt);
            }
        });
        txtField_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtField_searchKeyReleased(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update)
                .addGap(12, 12, 12)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_print)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(txtField_search))
                                .addComponent(btn_save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(btn_update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        table_course_info.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_course_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_course_info.setGridColor(new java.awt.Color(0, 153, 51));
        table_course_info.setRequestFocusEnabled(false);
        table_course_info.setSelectionBackground(new java.awt.Color(102, 102, 102));
        table_course_info.setSelectionForeground(new java.awt.Color(102, 255, 255));
        table_course_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_course_infoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_course_info);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // Checks if there is any selected data to be deleted 
        if (txtField_course_id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please select data to delete");
        } else {
            // Creating a confirmDialog for confirming data deletion
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this data?","Delete",JOptionPane.YES_NO_OPTION);
            
            // p = 0 means yes / p = -1 means no
            if (p == 0){
              try {
                  // MySQL query for deleting single record / row 
                  String sql = "DELETE FROM course WHERE course_id = ?";
                  pst = conn.prepareStatement(sql);
                  pst.setString(1, txtField_course_id.getText());
                  pst.execute();
                  // Display this message after successfully running DELETE query
                  JOptionPane.showMessageDialog(null, "Data deleted successfully!");
                  
              } catch (Exception e){
                  JOptionPane.showMessageDialog(null, e);
              } finally {
                  try{
                      // Closing the connection
                      rs.close();
                      pst.close();
                  } catch (Exception e){
                      
                  }
              } // end of finally block
            } 
        } // end of else statement
            clearFields();
            updateTable();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // Writing code for data input validation
        String courseID_validate = txtField_course_id.getText();
        String courseName_validate = txtField_courseYear.getText();
        String courseDesc_validate = txtField_courseDesc.getText();
        String subjectID_validate = txtField_subjectID.getText();
        
      
        // Using if-else conditions for validation
        if (courseID_validate.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Course ID");
        } else if(courseName_validate.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Course Name");
        } else if(courseDesc_validate.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Course Description name");
        } else if(subjectID_validate.equals("")){
           JOptionPane.showMessageDialog(null, "Please enter your Subject ID");
        }
        else {
           
        // If all data validations have been assigned a value then run 
        try {
            // Writing SQL query and storing in sql String variable
            String sql = "INSERT INTO course (course_id, course_year, course_desc, subj_id) VALUES (?, ?, ?, ?);";
            // Oject conn is used to create connection between java application and MySQL database and will execute the query
            pst = conn.prepareStatement(sql);
            
            // Getting data to INSERT INTO the database
            pst.setString(1, txtField_course_id.getText());
            pst.setString(2, txtField_courseYear.getText());
            pst.setString(3, txtField_courseDesc.getText());
            pst.setString(4, txtField_subjectID.getText());
           
            // execute() method used to execute the SQL query
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Saved Successfully!");
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        } finally {
            try {
                // Closing the connection in both ResultSet and PreparedStatement
                rs.close();
                pst.close();
            } catch (Exception e){
                
            }
        } // end of finally block
        } // end of else block
        
        // Updating data in JTable after saving 
        updateTable();
        // Clearing all the fields after saving
        clearFields();
        
        // Button Settings
        btn_save.setEnabled(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_clear.setEnabled(true);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // Calling clearFields method upon clicking New Button
        clearFields();
        
        // Button Settings
        btn_save.setEnabled(true);
        btn_new.setEnabled(false);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_clear.setEnabled(false);
    }//GEN-LAST:event_btn_newActionPerformed

    private void table_course_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_course_infoMouseClicked
        
        int row = table_course_info.getSelectedRow();
        String tableClick = (table_course_info.getModel().getValueAt(row, 0).toString());
        
        try {
            
            String sql = "SELECT * FROM course WHERE course_id = " + tableClick;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if (rs.next()){
                String str_courseID = rs.getString("course_id");
                txtField_course_id.setText(str_courseID);
                
                String str_courseYear = rs.getString("course_year");
                txtField_courseYear.setText(str_courseYear);
                
                String str_courseDesc = rs.getString("course_desc");
                txtField_courseDesc.setText(str_courseDesc);
                
                String str_subjID = rs.getString("subj_id");
                txtField_subjectID.setText(str_subjID);
         
                  
            } // end if rs.next() method
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e){
                
            }
            
        }
        
        // Button Settings
        btn_save.setEnabled(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_clear.setEnabled(true);
    }//GEN-LAST:event_table_course_infoMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        try {
            String sql = "UPDATE course SET course_year = ?, course_desc = ?, subj_id = ? WHERE course_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtField_courseYear.getText());
            pst.setString(2, txtField_courseDesc.getText());
            pst.setString(3, txtField_subjectID.getText());
            pst.setString(4, txtField_course_id.getText());
                        
            // execute() method used to execute the SQL query
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                // Closing the connection
                pst.close();
                rs.close();
            } catch (Exception e){
                
            }
            
        } // end of finally block
        clearFields();
        updateTable();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // Calling clear method for clearing data
        clearFields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        
        // Header Format name
        MessageFormat header = new MessageFormat("Student Enrollment Form Print");
        
        // Footer Format
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            // Basic syntax for printing JTable directly
            table_course_info.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (java.awt.print.PrinterException e){
            // Display error message if cannot be printed out
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void txtField_subjectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_subjectIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_subjectIDActionPerformed

    private void txtField_courseYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_courseYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_courseYearActionPerformed

    private void txtField_courseDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_courseDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_courseDescActionPerformed

    private void txtField_course_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_course_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_course_idActionPerformed

    private void txtField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_searchActionPerformed

    private void txtField_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_searchKeyReleased
       String search_validate = txtField_search.getText();
       
       if (search_validate.equals("")){
           updateTable();
       } else {
        
         try {
             String sql = "SELECT * FROM course WHERE subj_id = ?"; 
             pst = conn.prepareStatement(sql);
             pst.setString(1, txtField_search.getText());
             rs = pst.executeQuery();
             
             table_course_info.setModel(DbUtils.resultSetToTableModel(rs));
             
             pst.close();
             
         } catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
        
       }
    }//GEN-LAST:event_txtField_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Subject stud_subject = new Subject();
        stud_subject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_course_info;
    private javax.swing.JTextField txtField_courseDesc;
    private javax.swing.JTextField txtField_courseYear;
    private javax.swing.JTextField txtField_course_id;
    private javax.swing.JTextField txtField_search;
    private javax.swing.JTextField txtField_subjectID;
    // End of variables declaration//GEN-END:variables

}
