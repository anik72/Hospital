import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Pacient extends javax.swing.JFrame {

    String str1, str2, str3;

    java.util.Date d1, d2;

    java.sql.Date sq1, sq2;

    SimpleDateFormat sd1, sd2;

    Object s1, o1;

    String Sinergates1, Vehicle1;

    byte[] person_image;

    ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private static Pacient obj = null;

    private Pacient() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(Pacient.DO_NOTHING_ON_CLOSE);
    }

    public static Pacient getObj() {
        if (obj == null) {
            obj = new Pacient();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        practice_lessons = new javax.swing.JTextField();
        afm = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        theory_lessons = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        name_mother = new javax.swing.JTextField();
        name_father = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        identity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        date_of_birth = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        place_of_birth = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        postal_code = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        number = new javax.swing.JTextField();
        cellphone_number = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Licence = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Protocolle = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Observations = new javax.swing.JTextField();
        Sinergates = new javax.swing.JComboBox();
        Vehicle = new javax.swing.JComboBox();
        date_entry = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΚΑΤΑΧΩΡΗΗ ΑΣΘΕΝΗ");
        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }

            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        jLabel11.setText("Τ.Κ.");
        jLabel10.setText("ΔΙΕΥΘΥΝΣΗ");
        jLabel9.setText("ΤΟΠΟΣ ΓΕΝΝΗΣΗΣ");
        jLabel8.setText("ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΗΣΗΣ");
        jLabel7.setText("Α . Δ . Τ .");
        jButton1.setText("ΑΠΟΘΗΚΕΥΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel17.setText("ΚΑΤΗΓΟΡΙΑ ΕΞΕΤΑΣΗΣ");
        jButton2.setText("ΑΝΕΒΑΣΕ ΦΩΤΟΓΡΑΦΙΑ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLabel14.setText("ΠΡΑΚΤΙΚΑ ΕΞΕΤΑΣΕΙΣ");
        jLabel16.setText("ΓΙΑΤΡΟΣ");
        jLabel15.setText("ΕΠΣΚΕΨΕΙΣ ΑΣΘΕΝΗ");
        jLabel12.setText("ΤΗΛΕΦΩΝΟ");
        jLabel13.setText("ΚΙΝΗΤΟ");
        jDesktopPane1.add(Image);
        Image.setBounds(0, 0, 140, 170);
        jLabel1.setText("ΕΠΩΝΥΜΟ");
        jLabel3.setText("ΑΦΜ");
        jLabel5.setText("ΠΑΤΡΩΝΥΜΟ");
        date_of_birth.setToolTipText("");
        date_of_birth.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        date_of_birth.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_of_birthActionPerformed(evt);
            }
        });
        jLabel6.setText("ΜΗΤΡΩΝΥΜΟ");
        address.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jButton4.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        number.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        cellphone_number.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellphone_numberActionPerformed(evt);
            }
        });
        jLabel2.setText("ΟΝΟΜΑ");
        jLabel18.setText("ΑΡ.ΑΔΕΙΑ ΠΙΣΤΟΠΟΙΗΤ.");
        jLabel19.setText("ΑΡΙΘΜΟΣ ΠΡΩΤΟΚΟΛΛΟΥ");
        jLabel20.setText("ΠΑΡΑΤΗΡΗΣΕΙΣ");
        Observations.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObservationsActionPerformed(evt);
            }
        });
        Sinergates.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Γεωργουλόπουλος" }));
        Sinergates.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinergatesActionPerformed(evt);
            }
        });
        Vehicle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ακτινογραφικα Θωρακος", "Γενικη Αιματος", "Ψυχιατρικη Εξεταση" }));
        jLabel4.setText("ΗΜΕΡΑ ΚΑΤΑΧΩΡΗΣΗΣ");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(Licence)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(identity).addComponent(name_father).addComponent(surname).addComponent(date_of_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel13)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(address).addComponent(cellphone_number))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(date_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(jLabel20).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Observations, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel17).addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(0, 0, Short.MAX_VALUE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(Vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(Sinergates, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Protocolle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(name).addComponent(name_mother).addComponent(afm).addComponent(place_of_birth).addComponent(postal_code).addComponent(number).addComponent(theory_lessons).addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(practice_lessons).addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(27, 27, 27)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel2).addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(name_father, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel6).addComponent(name_mother, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5)).addGap(5, 5, 5).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(identity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3).addComponent(afm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(date_of_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel9).addComponent(place_of_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel11).addComponent(postal_code, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cellphone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel13).addComponent(jLabel12).addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(date_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel15).addComponent(theory_lessons, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Licence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel14).addComponent(practice_lessons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton2).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Protocolle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel19))).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(3, 3, 3).addComponent(Observations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(8, 8, 8).addComponent(jLabel20))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Sinergates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(Vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton4).addComponent(jButton1))).addGroup(layout.createSequentialGroup().addGap(0, 18, Short.MAX_VALUE).addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(48, Short.MAX_VALUE)));
        setSize(new java.awt.Dimension(779, 514));
        setLocationRelativeTo(null);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon photo = new ImageIcon(filename);
        Image.setIcon(photo);
        try {
            FileInputStream fis = new FileInputStream(f);
            byte buf[] = new byte[1024];
            try {
                for (int readNum; (readNum = fis.read(buf)) != -1; ) {
                    bos.write(buf, 0, readNum);
                }
            } catch (IOException ex) {
                Logger.getLogger(Pacient.class.getName()).log(Level.SEVERE, null, ex);
            }
            person_image = bos.toByteArray();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pacient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String Message = "Είστε σίγουρος για την αποθήκευση του μαθητή??";
        Toolkit.getDefaultToolkit().beep();
        int response = JOptionPane.showConfirmDialog(null, Message, "", JOptionPane.OK_CANCEL_OPTION);
        if (response == JOptionPane.OK_OPTION) {
            try {
                Class.forName("org.sqlite.JDBC");
                String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
                java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
                String sql = "INSERT INTO students ('Όνομα','Επώνυμο','Πατρώνυμο','Μητρώνυμο','ΑΔΤ','Ημερομηνία_Γέννησης','Τόπος_Γέννησης','Διεύθυνση','ΤΚ','Τηλέφωνο','Κινητό','ΑΦΜ','Ημερομηνία','Θεωρητικά','Πρακτικά','Συνεργάτες','Κατηγορία','Άδεια','Πρωτόκολο','Παρατηρήσεις',Image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = ConnectiondatabaseConnection.prepareStatement(sql);
                o1 = Vehicle.getSelectedItem();
                Vehicle1 = String.valueOf(o1);
                s1 = Sinergates.getSelectedItem();
                Sinergates1 = String.valueOf(s1);
                pst.setString(1, name.getText());
                pst.setString(2, surname.getText());
                pst.setString(3, name_father.getText());
                pst.setString(4, name_mother.getText());
                pst.setString(5, identity.getText());
                pst.setString(6, date_of_birth.getText());
                pst.setString(7, place_of_birth.getText());
                pst.setString(8, address.getText());
                pst.setString(9, postal_code.getText());
                pst.setString(10, number.getText());
                pst.setString(11, cellphone_number.getText());
                pst.setString(12, afm.getText());
                pst.setString(13, date_entry.getText());
                pst.setString(14, practice_lessons.getText());
                pst.setString(15, theory_lessons.getText());
                pst.setString(16, Sinergates1);
                pst.setString(17, Vehicle1);
                pst.setString(18, Licence.getText());
                pst.setString(19, Protocolle.getText());
                pst.setString(20, Observations.getText());
                pst.setBytes(21, person_image);
                pst.execute();
                ConnectiondatabaseConnection.close();
                try {
                    str1 = date_of_birth.getText();
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
    }

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void cellphone_numberActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void date_of_birthActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        address.setText("");
        afm.setText("");
        cellphone_number.setText("");
        date_entry.setText("");
        date_of_birth.setText("");
        identity.setText("");
        name.setText("");
        name_father.setText("");
        name_mother.setText("");
        number.setText("");
        place_of_birth.setText("");
        practice_lessons.setText("");
        postal_code.setText("");
        surname.setText("");
        theory_lessons.setText("");
        Licence.setText("");
        Protocolle.setText("");
        Observations.setText("");
        Image.setIcon(null);
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
    }

    private void ObservationsActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void SinergatesActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Pacient().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Image;

    private javax.swing.JTextField Licence;

    private javax.swing.JTextField Observations;

    private javax.swing.JTextField Protocolle;

    private javax.swing.JComboBox Sinergates;

    private javax.swing.JComboBox Vehicle;

    private javax.swing.JTextField address;

    private javax.swing.JTextField afm;

    private javax.swing.JTextField cellphone_number;

    private javax.swing.JTextField date_entry;

    private javax.swing.JTextField date_of_birth;

    private javax.swing.JTextField identity;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton4;

    private javax.swing.JDesktopPane jDesktopPane1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel12;

    private javax.swing.JLabel jLabel13;

    private javax.swing.JLabel jLabel14;

    private javax.swing.JLabel jLabel15;

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

    private javax.swing.JTextField name;

    private javax.swing.JTextField name_father;

    private javax.swing.JTextField name_mother;

    private javax.swing.JTextField number;

    private javax.swing.JTextField place_of_birth;

    private javax.swing.JTextField postal_code;

    private javax.swing.JTextField practice_lessons;

    private javax.swing.JTextField surname;

    private javax.swing.JTextField theory_lessons;

    
}
