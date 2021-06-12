
package tugas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class main extends javax.swing.JFrame {
    public Connection cons;
    public Statement stat;  
    
    public main() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasetugas","root",""); //connection
            stat = cons.createStatement();
            DefaultTableModel tb = new DefaultTableModel();
            String query = "select * from datatables";
               
               tb.addColumn("Nama");
               tb.addColumn("No HP");
               tb.addColumn("Berat Barang");
               tb.addColumn("Total");
               tabel.setModel(tb);
               
                ResultSet result2 = stat.executeQuery(query);
            
                while (result2.next()){
               
                tb.addRow(new Object[]{
               result2.getString("Nama"),
               result2.getString("NoHP"),
               result2.getString("BeratBarang"),
               result2.getString("TotalDiterima")
                   
           });
                }
        
        }
        catch (Exception E) {
            
           JOptionPane.showMessageDialog(null,"Program Can't Connect To Database!");
           System.exit(0);
        }        
        jtotal.setEditable(false);
        receive.setEditable(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        nohp = new javax.swing.JTextField();
        beratbarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        receive = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tabel);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("NAMA : ");

        jLabel2.setText("NO HP :  ");

        jLabel3.setText("BERAT BARANG  (KG) :");

        jButton4.setText("EDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("PRINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6.setText("BANK SAMPAH ");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("TOTAL : ");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*NB : <10KG = Rp. 2000 / KG");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText(">10KG = Rp. 2500 / KG");

        jLabel5.setText("UANG YANG DIDAPAT : ");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*NB : SETELAH DIKURANGI PPN 10%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(198, 198, 198)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(247, 247, 247))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(167, 167, 167))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nama)
                                        .addComponent(nohp)
                                        .addComponent(beratbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(receive))))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(beratbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(receive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DefaultTableModel tb = new DefaultTableModel();
       int berat = Integer.valueOf(beratbarang.getText());
       int total;
       int ppn;
       int hasil;
       
       if(berat > 10){
           total = berat * 2500;
           ppn = (total/100) * 10;
           hasil = total - ppn;
           jtotal.setText(String.valueOf(total));
           receive.setText(String.valueOf(hasil));
           
       }
       
       else{
           total = berat * 2000;
           ppn = (total/100) * 10;
           hasil = total - ppn;
           jtotal.setText(String.valueOf(total));
           receive.setText(String.valueOf(hasil));
       }
          
       String db = "insert into datatables values (?,?,?,?)";
            try{
             PreparedStatement statement = cons.prepareStatement(db);
             statement.setString(1,nama.getText());
             statement.setString(2,nohp.getText());
             statement.setString(3,beratbarang.getText());
             statement.setString(4,receive.getText());
          
              statement.executeUpdate();
              JOptionPane.showMessageDialog(null,"BERHASIL!");

                 
        }
           catch (Exception E){
           JOptionPane.showMessageDialog(null, "GAGAL!");
           }
       
     
          tb.addColumn("Nama");
          tb.addColumn("No HP");
          tb.addColumn("Berat Barang");
          tb.addColumn("Total");
          tabel.setModel(tb);
          
        try{
       String query = "select * from datatables";
       ResultSet result = stat.executeQuery(query);
            
       while (result.next()){
           tb.addRow(new Object[]{
               result.getString("Nama"),
               result.getString("NoHP"),
               result.getString("BeratBarang"),
               result.getString("TotalDiterima")
                   
           });
       }
        }
        
        catch(Exception E){
             JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
        }
            
            
            
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String selection = JOptionPane.showInputDialog("Masukkan Nama Data Yang Ingin Dihapus : ");
         DefaultTableModel tb = new DefaultTableModel();
        try{
        String db = "select *from datatables where Nama = '" +selection + "'";
        ResultSet result = stat.executeQuery(db);
           
           if(result.next()){
               JOptionPane.showMessageDialog(null, "Data Ditemukan! Data Akan Di Delete!");
               String delete = "delete from datatables where Nama = '" + selection + "'";
               PreparedStatement statement = cons.prepareStatement(delete);
               
               statement.executeUpdate();
               
               String query = "select * from datatables";
               
               tb.addColumn("Nama");
               tb.addColumn("No HP");
               tb.addColumn("Berat Barang");
               tb.addColumn("Total");
               tabel.setModel(tb);
               
                ResultSet result2 = stat.executeQuery(query);
            
                while (result2.next()){
               
                tb.addRow(new Object[]{
               result2.getString("Nama"),
               result2.getString("NoHP"),
               result2.getString("BeratBarang"),
               result2.getString("TotalDiterima")
                   
           });
       }
               
           }
        }
        
        catch (Exception E){
            JOptionPane.showMessageDialog(null,"Tidak Ada Data Dengan Nama : " +selection + "!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
           JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reporttable.jasper"), null, cons);
        JasperViewer.viewReport(jp, false);
        
           }
           
           catch (Exception E){
               JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
          }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tb = new DefaultTableModel();
        String nama = JOptionPane.showInputDialog("Masukkan Nama Yang Ingin Diubah : ");
        if (nama == null){
                       
         }
        else{
         try{
        String db = "select *from datatables where Nama = '" +nama + "'";
        ResultSet result = stat.executeQuery(db);
           
           if(result.next()){
               JOptionPane.showMessageDialog(null, "Data Ditemukan!");
               String Choose = JOptionPane.showInputDialog("Masukkan Kolom Yang Ingin Diubah : ");
               
               if(Choose.equals("nama") || Choose.equals("Nama") || Choose.equals("NAMA")){
                   String change = JOptionPane.showInputDialog("Masukkan Nama Baru : ");
                   if (change == null){
                       
                   }
                   else{
                   String que = "update datatables Set Nama = '" +change + "' where nama ='"+nama +"';";
                   PreparedStatement statement = cons.prepareStatement(que);
                   statement.executeUpdate();
                   
                   JOptionPane.showMessageDialog(null,"Data Berhasil Diubah!");
                   }
                   
                   
                   String query = "select * from datatables";
               
               tb.addColumn("Nama");
               tb.addColumn("No HP");
               tb.addColumn("Berat Barang");
               tb.addColumn("Total");
               tabel.setModel(tb);
               
                ResultSet result2 = stat.executeQuery(query);
            
                while (result2.next()){
               
                tb.addRow(new Object[]{
               result2.getString("Nama"),
               result2.getString("NoHP"),
               result2.getString("BeratBarang"),
               result2.getString("TotalDiterima")
                   
           });
       }
                   
               }
               
               
               else if(Choose.equals("nohp") || Choose.equals("No HP") || Choose.equals("NO HP") || Choose.equals("NoHP")){
                   String dbase = "select *from datatables where Nama = '" +nama + "'";
                   ResultSet hasil = stat.executeQuery(dbase);
                   
                   if(hasil.next()){
                   String no = hasil.getString("nohp");
                   String change = JOptionPane.showInputDialog("Masukkan No HP Baru : ");
                   if (change == null){
                       
                   }
                   else{
                   String que = "update datatables Set nohp = '" +change + "' where nohp ='"+no +"';";
                   PreparedStatement statement = cons.prepareStatement(que);
                   statement.executeUpdate();
                   
                   JOptionPane.showMessageDialog(null,"Data Berhasil Diubah!");
                    }
                   }

                   String query = "select * from datatables";
               
               tb.addColumn("Nama");
               tb.addColumn("No HP");
               tb.addColumn("Berat Barang");
               tb.addColumn("Total");
               tabel.setModel(tb);
               
                ResultSet result2 = stat.executeQuery(query);
            
                while (result2.next()){
               
                tb.addRow(new Object[]{
               result2.getString("Nama"),
               result2.getString("NoHP"),
               result2.getString("BeratBarang"),
               result2.getString("TotalDiterima")
                   
           });
       }
                   
               }
               
           }
           
           else{
               JOptionPane.showMessageDialog(null,"Data Tidak Ditemukan!");
           }
           
       }
         
           catch(Exception E){
              JOptionPane.showMessageDialog(null, "Terjadi Sebuah Kesalahan!");
           }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratbarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jtotal;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nohp;
    private javax.swing.JTextField receive;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
