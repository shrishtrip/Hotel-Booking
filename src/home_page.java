
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAPPY
 */


public class home_page extends javax.swing.JFrame {

    String date1;
        String date2;
        int no_room;
        int no_people;
    /**
     * Creates new form home_page
     */
    public home_page(String s) {
        initComponents();
        landing_page obj = new landing_page();
        l1.setText(s);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        d1 = new com.toedter.calendar.JDateChooser();
        d2 = new com.toedter.calendar.JDateChooser();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel8.setFont(new java.awt.Font("BankGothic Lt BT", 0, 48)); // NOI18N
        jLabel8.setText("Hello");

        jLabel10.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        jLabel10.setText("Cancel Previous Booking");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Location");

        jLabel3.setText("Check In");

        jLabel4.setText("Check Out");

        jLabel5.setText("No of Rooms");

        jLabel6.setText("No of People");

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Click", "Hyderabad", "Delhi", "Kolkata", "Mumbai", "Chennai", "Bangalore" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        b1.setText("Search");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("Clear");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("Logout");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price(per night)", "Total Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel7.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        jLabel7.setText("Cancel Previous Booking");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("BankGothic Lt BT", 0, 48)); // NOI18N
        jLabel9.setText("Hello");

        jLabel11.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        jLabel11.setText("Rate Your Stay");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(d2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(t1)
                                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1)
                                        .addGap(44, 44, 44)
                                        .addComponent(b2)
                                        .addGap(29, 29, 29)
                                        .addComponent(b3)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel9)
                    .addContainerGap(893, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2)
                            .addComponent(b3))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(548, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
String s=(String) c1.getSelectedItem();
 // JOptionPane.showMessageDialog (this, s);
  
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//JOptionPane.showMessageDialog (this, d1.getDate());
date1=dateFormat.format(d1.getDate());
 //JOptionPane.showMessageDialog (this, date1);
  
date2=dateFormat.format(d2.getDate());
 // JOptionPane.showMessageDialog (this, date2);


no_room =Integer.parseInt(t1.getText());
 // JOptionPane.showMessageDialog (this, no_room);
  
no_people=Integer.parseInt(t2.getText());
//JOptionPane.showMessageDialog (this,no_people); 
        // TODO add your handling code here:
        
        //JOptionPane.showMessageDialog (this,s.equalsIgnoreCase("click")); 
// Search the table to find a record matching  
//the input Mobile no. 
//String username=t1.getText();
//String password= new String(p1.getPassword());
if (s.equals("Click")) 
//Execute this part if text field is blank
    {       //t1.setText("");
           // p1.setText("");
            JOptionPane.showMessageDialog (this,"Choose some location"); 
} 
else if ((t1.getText()).equals(""))
    {       //t1.setText("");
            //p1.setText("");
            JOptionPane.showMessageDialog (this,"Enter no of room"); 
}
else if ((t2.getText()).equals(""))
    {       //t1.setText("");
            //p1.setText("");
            JOptionPane.showMessageDialog (this,"Enter no of people"); 
} 
// This part is executed if a Mobile No is 
// input in the text field
 else  
{ 
 DefaultTableModel model = (DefaultTableModel) 
         table.getModel(); 
 try
      {
Class.forName("java.sql.DriverManager");  
Connection con = (Connection)
        DriverManager.getConnection ("jdbc:mysql://localhost:3306/hotel_buddy", 
                "root", "2358");
                Statement stmt = (Statement) con.createStatement();
                //String Tname;   
                /*if (jRadioButton1.isSelected())
                    Tname="Contact";
                else   
                    Tname="Official"; */
                /* The query is executed on different tables depending 
                upon the Purpose */  
                String query="SELECT * FROM hotel_info where location = '"+s+"';";
                ResultSet rs = stmt.executeQuery(query);  
                while(rs.next())   
                {
                    String Name   = rs.getString("h_name");
                 //String Mobile = rs.getString("Mobile");
                  //String Email  = rs.getString("Email");
                  int Price = rs.getInt("price");
                  int Cost=Price*no_room;
                   //JOptionPane.showMessageDialog (this, Name); 
                   //JOptionPane.showMessageDialog (this, Price);
                   //JOptionPane.showMessageDialog (this, Cost); 
                  model.addRow (new Object[] {Name, Price,Cost});  
                }  
      }
    catch (Exception e) 
    {   
        JOptionPane.showMessageDialog (this, e.getMessage()); 
    }  
    
    
    
 } 


    
        
        
    }//GEN-LAST:event_b1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
int index = table.getSelectedRow();
TableModel model1 = table.getModel();

 String cbf=null;
  String cr=null;
   String wifi=null;


String hotel_name=(String) model1.getValueAt(index, 0);

int price=Integer.parseInt( model1.getValueAt(index, 1).toString() );
//Integer.parseInt( tableModel.getValueAt(i, 1).toString() );
//=(String) model1.getValueAt(index, 1);
//String pricee=(String) (model1.getValueAt(index, 1));
//int price=Integer.parseInt(pricee);
//JOptionPane.showMessageDialog (this, hotel_name); 
///////JOptionPane.showMessageDialog (this, pricee); 


 //DefaultTableModel model = (DefaultTableModel) 
   //      table.getModel(); 
  
   
   try
    {
    Class.forName("java.sql.DriverManager");  
    Connection con = (Connection)  
            DriverManager.getConnection 
            ("jdbc:mysql://localhost:3306/hotel_buddy", "root", "2358"); 
    Statement stmt = (Statement) con.createStatement();
    String query="SELECT * FROM hotel_info WHERE h_name='"+hotel_name+"';";  
    ResultSet rs=stmt.executeQuery(query); 
    //JOptionPane.showMessageDialog (this, rs.next());
    rs.previous();
    if (rs.next())
    {   
        //n=rs.getString("name");
        //JOptionPane.showMessageDialog (this,n);  
    //home_page obj = new home_page(n);
    //obj.setVisible(true);
    //this.dispose();
        cbf=rs.getString("complementary_bf");
        wifi=rs.getString("wifi");
        cr=rs.getString("car_rental");
        
    
    }
       else    
       JOptionPane.showMessageDialog (this,"Sorry!Please try again");  
    } 
    

 catch (Exception e)  
         {   
         JOptionPane.showMessageDialog(this, e.getMessage());  
         }

  
  String name=l1.getText();
  //JOptionPane.showMessageDialog(this, l1.getText());  
selected_hotel obj=new selected_hotel(hotel_name,date1,date2,cbf,wifi,cr,name,no_room,price);
 obj.setVisible(true);
this.dispose();
//JOptionPane.showMessageDialog (this, hotel_name); 


        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
t1.setText("");
t2.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
landing_page obj=new landing_page();
obj.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        cancellation obj=new cancellation(l1.getText(),no_room*no_people);
obj.setVisible(true);
this.dispose();


// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
    rating_form obj=new rating_form(l1.getText());//cancellation(l1.getText(),no_room*no_people);
obj.setVisible(true);
this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JComboBox<String> c1;
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private Object String(int no_room) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
