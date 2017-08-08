package dbproject;


import java.awt.Color;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.sql.Connection;
//import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.Box;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeListener;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.event.ChangeEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class customerInterface1 extends JFrame {
    
     private String user, pass, dbName;
     int clickc=1;
     int clickb =1;
     JButton[] ct;
     String searchInput, searchBy, query;
     ResultSet rs = null;
     Statement st  = null;
     Connection conn = null;
    DatabaseHandler ob = new DatabaseHandler();
    /**
     * Creates new form customerInterface1
     */
    public customerInterface1() {
        initComponents();
        
        //connection to database
        
        
        user = "root";
        pass = "";
        dbName = "electro";
        ob.setConnection(dbName, user, pass);
        
       // Box b1 = Box.createHorizontalBox();
        
        
        //changing border and fill color
        
        //javax.swing.border.Border emptyBorder = (javax.swing.border.Border) BorderFactory.createEmptyBorder();
        
        homeBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        homeBtn.setContentAreaFilled(false);
        homeBtn.setOpaque(true);
        
        //homeBtn.setBackground(new Color(5,54,21).darker());
        
        catagoryBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        catagoryBtn.setContentAreaFilled(false);
        catagoryBtn.setOpaque(true);
        
        brandBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        brandBtn.setContentAreaFilled(false);
        brandBtn.setOpaque(true);
        
        
        homeBtn.getModel().addChangeListener((ChangeEvent e) -> {
            ButtonModel model = (ButtonModel) e.getSource();
            if(model.isRollover()){
                homeBtn.setBackground(new Color(2,119,189).brighter());
            }
            else{
                //[2,119,189]
                homeBtn.setBackground(new Color(2,119,189));
            }
        });
        
        catagoryBtn.getModel().addChangeListener((ChangeEvent e) -> {
            ButtonModel model = (ButtonModel) e.getSource();
            if(model.isRollover()){
                catagoryBtn.setBackground(new Color(1,87,155).brighter());
            }
            else{
                //[2,119,189]
                catagoryBtn.setBackground(new Color(1,87,155));
            }
        });
        
        brandBtn.getModel().addChangeListener((ChangeEvent e) -> {
            ButtonModel model = (ButtonModel) e.getSource();
            if(model.isRollover()){
                brandBtn.setBackground(new Color(2,119,189).brighter());
            }
            else{
                //[2,119,189]
                brandBtn.setBackground(new Color(2,119,189));
            }
        });
        
        searchCombo.removeAllItems();
        searchCombo.addItem("SEARCH BY");
        searchCombo.addItem("Brand");
        searchCombo.addItem("Catagory");
        
        
//        c1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
//        c1.setContentAreaFilled(false);
//        c1.setOpaque(true);
//        
//        c3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
//        c3.setContentAreaFilled(false);
//        c3.setOpaque(true);
//        
//        c2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
//        c2.setContentAreaFilled(false);
//        c2.setOpaque(true);
//        
//        c4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
//        c4.setContentAreaFilled(false);
//        c4.setOpaque(true);
//        
//        c5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
//        c5.setContentAreaFilled(false);
//        c5.setOpaque(true);
//        
//        c6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
//        c6.setContentAreaFilled(false);
//        c6.setOpaque(true);
        
        catagoryList.setOpaque(false);
        catagoryList.setVisible(false);
        catagoryList.setLocation(20, 0);
        
        brandList.setOpaque(false);
        brandList.setVisible(false);
      //  DropShadowBorder(brandList);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        menuBar4 = new java.awt.MenuBar();
        menu7 = new java.awt.Menu();
        menu8 = new java.awt.Menu();
        contentPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        catagoryBtn = new javax.swing.JButton();
        brandBtn = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        searchText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchCombo = new javax.swing.JComboBox<>();
        catagoryList = new javax.swing.JPanel();
        brandList = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        menu7.setLabel("File");
        menuBar4.add(menu7);

        menu8.setLabel("Edit");
        menuBar4.add(menu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 750));
        setModalExclusionType(null);
        setPreferredSize(new java.awt.Dimension(1366, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPanel.setBackground(new java.awt.Color(244, 244, 244));
        contentPanel.setMaximumSize(new java.awt.Dimension(1140, 660));
        contentPanel.setMinimumSize(new java.awt.Dimension(1140, 660));

        userPanel.setBackground(new java.awt.Color(102, 102, 102));

        homeBtn.setBackground(new java.awt.Color(2, 119, 189));
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("ELECTRO ARENA");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        catagoryBtn.setBackground(new java.awt.Color(1, 87, 155));
        catagoryBtn.setText("CATAGORY");
        catagoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryBtnActionPerformed(evt);
            }
        });

        brandBtn.setBackground(new java.awt.Color(2, 119, 189));
        brandBtn.setText("BRAND");
        brandBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
            .addComponent(catagoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(brandBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catagoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brandBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setLayout(null);

        searchText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        searchText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchText.setDragEnabled(true);
        searchText.setOpaque(false);
        searchText.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        menuPanel.add(searchText);
        searchText.setBounds(230, 50, 480, 30);

        searchBtn.setText("SEARCH");
        searchBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchBtn.setBorderPainted(false);
        searchBtn.setContentAreaFilled(false);
        searchBtn.setFocusPainted(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        menuPanel.add(searchBtn);
        searchBtn.setBounds(720, 40, 70, 40);

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        menuPanel.add(jLabel1);
        jLabel1.setBounds(220, 40, 0, 45);

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1206, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        menuPanel.add(jPanel2);
        jPanel2.setBounds(0, 0, 1206, 25);

        searchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboActionPerformed(evt);
            }
        });
        menuPanel.add(searchCombo);
        searchCombo.setBounds(90, 40, 120, 40);

        catagoryList.setLayout(null);

        brandList.setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        brandList.add(jPanel1);
        jPanel1.setBounds(-70, 330, 0, 0);

        catagoryList.add(brandList);
        brandList.setBounds(0, 50, 195, 430);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(catagoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 948, Short.MAX_VALUE))))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(catagoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brandBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandBtnActionPerformed
        // TODO add your handling code here:
        
        //String[] cname = ob.getCatagoryName();
        String[] bname = ob.getBrandName();
        int j =0;
           JButton[] bt;
           Font font = new Font("Garamond", Font.BOLD, 14);
           bt = new JButton[10];
           
        Object source = evt.getSource();
        
        System.out.print(clickb);
        catagoryList.removeAll();
        if(source == brandBtn){
            if(clickb%2!=0){
        catagoryList.setVisible(true);
        //for(int i=0; i<6; i++){
        
        //}
        
              
           
           for(int i = 0; i<10; i++){
            
            bt[i] = new JButton();
            bt[i].setText(bname[i]);
            if(i%2==0){
                bt[i].setBackground(new Color(181,0,0));
            }
            else{
                bt[i].setBackground(new Color(153,0,0));
            }
            
            bt[i].setForeground(Color.WHITE);
            bt[i].setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
            bt[i].setContentAreaFilled(false);
            bt[i].setOpaque(true);
            brandList.add(bt[i]);
            bt[i].setLocation(0, j);
            bt[i].setSize(178,40);
            bt[i].setFont(font);
            j += 40;
        }
           catagoryList.add(brandList);
           brandList.setVisible(true);
            }
            else if(clickb%2==0){
                brandList.setVisible(false);
                catagoryList.setVisible(false);
            }
            clickb++;
        }
        
            
    }//GEN-LAST:event_brandBtnActionPerformed

    private void catagoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryBtnActionPerformed
        // TODO add your handling code here:
        
        Object source = evt.getSource();
        
        String[] cname = ob.getCatagoryName();
        
        
        
           int j =0;
           
           Font font = new Font("Garamond", Font.BOLD, 18);
            ct = new JButton[6];
        
        if(source == catagoryBtn){
            if(clickc%2!=0){
                catagoryList.setVisible(true);
                for(int i = 0; i<6; i++){
            
            ct[i] = new JButton();
            ct[i].setText(cname[i]);
            if(i%2==0){
                ct[i].setBackground(new Color(181,0,0));
            }
            else{
                ct[i].setBackground(new Color(153,0,0));
            }
            
            ct[i].setForeground(Color.WHITE);
            ct[i].setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
            ct[i].setContentAreaFilled(false);
            ct[i].setOpaque(true);
            catagoryList.add(ct[i]);
            ct[i].setLocation(0, j);
            ct[i].setSize(178,46);
            ct[i].setFont(font);
            j += 46;
        }
                
            }
            if(clickc%2==0){
                catagoryList.setVisible(false);
            }
            
            clickc++;
        }
        
        
       
        
        //dispose();
        
        
        
        
    }//GEN-LAST:event_catagoryBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
         
         
    }//GEN-LAST:event_homeBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        searchInput = searchText.getText();
         searchBy = searchCombo.getSelectedItem().toString();
         query = "SELECT product_name, color, price from product where "+searchBy+"_name = '"+searchInput+"'";
         System.out.println(query);
         ob.searchQuery(query);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchComboActionPerformed

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
            java.util.logging.Logger.getLogger(customerInterface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerInterface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerInterface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerInterface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerInterface1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brandBtn;
    private javax.swing.JPanel brandList;
    private javax.swing.JButton catagoryBtn;
    private javax.swing.JPanel catagoryList;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.Menu menu7;
    private java.awt.Menu menu8;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.MenuBar menuBar4;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchCombo;
    private javax.swing.JTextField searchText;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables

    
}
