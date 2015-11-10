import java.awt.Toolkit;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PacientEdit extends javax.swing.JFrame {

    String str, str1, str2, Sinergates1, doctors, syn, cat;

    java.util.Date d1, d2;

    java.sql.Date sq1, sq2;

    SimpleDateFormat sd1, sd2;

    Object s1, o1;

    private static PacientEdit obj = null;

    private PacientEdit() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(PacientEdit.DO_NOTHING_ON_CLOSE);
    }

    public static PacientEdit getObj() {
        if (obj == null) {
            obj = new PacientEdit();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Surname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Father = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Mother = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Identity_Number = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Date_Of_Birth = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Adress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Postal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Mobile = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        AFM = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Theoritical = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Practical = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Protocolle = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Licence = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Observations = new javax.swing.JTextField();
        exam = new javax.swing.JComboBox();
        doctora = new javax.swing.JComboBox();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΕΠΕΞΕΡΓΑΣΙΑ ΑΣΘΕΝΗ");
        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }

            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        Search.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jLabel2.setText("ΟΝΟΜΑ");
        jLabel3.setText("ΕΠΩΝΥΜΟ");
        jLabel4.setText("ΠΑΤΡΩΝΥΜΟ");
        Father.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherActionPerformed(evt);
            }
        });
        jLabel5.setText("ΜΗΤΡΩΝΥΜΟ");
        Mother.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotherActionPerformed(evt);
            }
        });
        jLabel6.setText("Α.Δ.Τ.");
        jLabel7.setText("ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΝΗΣΗΣ");
        jLabel8.setText("ΤΟΠΟΣ ΓΕΝΝΗΣΗΣ");
        jLabel9.setText("ΓΙΑΤΡΟΣ");
        jLabel10.setText("ΔΙΕΘΥΝΣΗ");
        jLabel11.setText("Τ.Κ");
        Postal.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostalActionPerformed(evt);
            }
        });
        jLabel12.setText("ΤΗΛΕΦΩΝΟ");
        jLabel13.setText("ΚΙΝΗΤΟ");
        jLabel14.setText("ΑΦΜ");
        jLabel16.setText("ΕΠΙΣΚΕΨΕΙΣ ΑΣΘΕΝΗ");
        Theoritical.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoriticalActionPerformed(evt);
            }
        });
        jLabel17.setText("ΠΡΑΚΤΙΚΑ ΕΞΕΤΑΣΕΙΣ");
        Practical.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PracticalActionPerformed(evt);
            }
        });
        jLabel18.setText("ΚΑΤΗΓΟΡΙΑ ΕΞΕΤΑΣΗΣ");
        jButton1.setText("ΑΝΑΖΗΤΗΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("ΕΠΕΞΕΡΓΑΣΙΑ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton4.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLabel1.setText("ΑΡΙΘΜΟΣ ΠΡΩΤΟΚΟΛΛΟΥ");
        jLabel19.setText("ΑΡ.ΑΔΕΙΑ ΠΙΣΤ�ΠΟΙΗΤ.");
        jLabel20.setText("ΠΑΡΑΤΗΡΗΣΕΙΣ");
        exam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ακτινογραφια Θωρακος", "Γενικη Αιματος", "Ψυχιατρικη Εξεταση" }));
        doctora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Γεωργουλόπουλος" }));
        doctora.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoraActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel9).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7)).addGap(12, 12, 12).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Father, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Date_Of_Birth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel20)).addGap(0, 0, Short.MAX_VALUE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addGroup(layout.createSequentialGroup().addComponent(jLabel16).addGap(16, 16, 16))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(Theoritical).addComponent(Licence).addComponent(Identity_Number).addComponent(Adress).addComponent(Mobile).addComponent(doctora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Observations, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))).addGap(29, 29, 29).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel12).addComponent(jLabel1).addComponent(jLabel18)).addGap(0, 0, Short.MAX_VALUE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Practical).addComponent(Postal).addComponent(City).addComponent(Phone).addComponent(Protocolle).addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(AFM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Mother, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(jButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(Mother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(AFM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(6, 6, 6).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(Postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(Practical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(9, 9, 9).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(Protocolle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jButton2).addGap(2, 2, 2)).addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4).addComponent(Father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Identity_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel6)).addGap(6, 6, 6).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Date_Of_Birth, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(Theoritical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(9, 9, 9).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(Licence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(doctora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel20).addComponent(Observations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            str = Search.getText();
            if (!str.startsWith("'"))
                str = "'" + str;
            if (!str.endsWith("'"))
                str = str + "'";
            Class.forName("org.sqlite.JDBC");
            String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement = ConnectiondatabaseConnection.createStatement();
            String sql = "SELECT * FROM students WHERE Επώνυμο=" + str;
            ResultSet result = statement.executeQuery(sql);
            displayResults(result);
            result.close();
        } catch (ClassNotFoundException e1) {
            System.out.println(e1);
        } catch (SQLException e2) {
            System.out.println(e2);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            str = Search.getText();
            if (!str.startsWith("'"))
                str = "'" + str;
            if (!str.endsWith("'"))
                str = str + "'";
            Class.forName("org.sqlite.JDBC");
            String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            o1 = exam.getSelectedItem();
            doctors = String.valueOf(o1);
            s1 = doctora.getSelectedItem();
            Sinergates1 = String.valueOf(s1);
            String sql = "UPDATE students SET Όνομα='" + Name.getText() + "',Επώνυμο='" + Surname.getText() + "',Πατρώνυμο='" + Father.getText() + "',Μητρώνυμο='" + Mother.getText() + "','ΑΔΤ'='" + Identity_Number.getText() + "','Ημερομηνία_Γέννησης'='" + Date_Of_Birth.getText() + "','Τόπος_Γέννησης'='" + City.getText() + "',Διεύθυνση='" + Adress.getText() + "',Τηλέφωνο='" + Phone.getText() + "',Κινητό='" + Mobile.getText() + "',ΑΦΜ='" + AFM.getText() + "',Θεωρητικά='" + Theoritical.getText() + "',Πρακτικά='" + Practical.getText() + "',Συνεργάτες='" + Sinergates1 + "',Κατηγορία='" + doctors + "','Άδεια'='" + Licence.getText() + "','Πρωτόκολο'='" + Protocolle.getText() + "',Παρατηρήσεις='" + Observations.getText() + "' WHERE Επώνυμο='" + Search.getText() + "'";
            PreparedStatement pst = ConnectiondatabaseConnection.prepareStatement(sql);
            pst.execute();
            try {
                str1 = Date_Of_Birth.getText();
                sd1 = new SimpleDateFormat("yyyy-mm-dd");
                java.util.Date d1 = sd1.parse(str1);
                java.sql.Date sq1 = new Date(d1.getTime());
                ConnectiondatabaseConnection.close();
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        } catch (ClassNotFoundException e1) {
            System.out.println(e1);
        } catch (SQLException e2) {
            System.out.println(e2);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Search.setText("");
        Name.setText("");
        Surname.setText("");
        Father.setText("");
        Mother.setText("");
        Identity_Number.setText("");
        Date_Of_Birth.setText("");
        City.setText("");
        Adress.setText("");
        Postal.setText("");
        AFM.setText("");
        Practical.setText("");
        Theoritical.setText("");
        Mobile.setText("");
        Phone.setText("");
        Licence.setText("");
        Protocolle.setText("");
        Observations.setText("");
    }

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void TheoriticalActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void PracticalActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void PostalActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void FatherActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void MotherActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
    }

    private void doctoraActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you wanna close the window?", "Choose", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            setVisible(false);
            dispose();
        }
        if (selectedOption == JOptionPane.NO_OPTION) {
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PacientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PacientEdit().setVisible(true);
            }
        });
    }

    private void displayResults(ResultSet result) throws SQLException {
        if (result.next()) {
            Name.setText(result.getString(2));
            Surname.setText(result.getString(3));
            Father.setText(result.getString(4));
            Mother.setText(result.getString(5));
            Identity_Number.setText(result.getString(6));
            Date_Of_Birth.setText(result.getString(7));
            City.setText(result.getString(8));
            Adress.setText(result.getString(9));
            Postal.setText(result.getString(10));
            Phone.setText(result.getString(11));
            Mobile.setText(result.getString(12));
            AFM.setText(result.getString(13));
            Theoritical.setText(result.getString(15));
            Practical.setText(result.getString(16));
            doctors = result.getString(17);
            cat = result.getString(18);
            Licence.setText(result.getString(19));
            Protocolle.setText(result.getString(20));
            Observations.setText(result.getString(21));
            switch(cat) {
                case "Ακτινογραφια Θωρακος":
                    exam.setSelectedIndex(0);
                    break;
                case "Γενικη Αιματος":
                    exam.setSelectedIndex(1);
                    break;
                case "Ψυχιατρικη Εξεταση":
                    exam.setSelectedIndex(2);
                    break;
            }
            switch(doctors){
                case"Γεωργόυλοπουλος":
                   doctora.setSelectedIndex(0);
                    break;
            }
        } else {
            String Message = "Δεν υπάρχει εγγραφή";
            JOptionPane.showMessageDialog(null, Message);
        }
    }

    private javax.swing.JTextField AFM;

    private javax.swing.JTextField Adress;

    private javax.swing.JTextField City;

    private javax.swing.JTextField Date_Of_Birth;

    private javax.swing.JTextField Father;

    private javax.swing.JTextField Identity_Number;

    private javax.swing.JTextField Licence;

    private javax.swing.JTextField Mobile;

    private javax.swing.JTextField Mother;

    private javax.swing.JTextField Name;

    private javax.swing.JTextField Observations;

    private javax.swing.JTextField Phone;

    private javax.swing.JTextField Postal;

    private javax.swing.JTextField Practical;

    private javax.swing.JTextField Protocolle;

    private javax.swing.JTextField Search;

    private javax.swing.JTextField Surname;

    private javax.swing.JTextField Theoritical;

    private javax.swing.JComboBox doctora;

    private javax.swing.JComboBox exam;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton4;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel12;

    private javax.swing.JLabel jLabel13;

    private javax.swing.JLabel jLabel14;

    private javax.swing.JLabel jLabel16;

    private javax.swing.JLabel jLabel17;

    private javax.swing.JLabel jLabel18;

    private javax.swing.JLabel jLabel19;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel20;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JLabel jLabel9;

   
}
