import java.awt.Toolkit;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.JTable;
import java.lang.Exception;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Home extends javax.swing.JFrame {

    String str1;

    ImageIcon image1;

    public Home() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(PacientEdit.EXIT_ON_CLOSE);
        setDefaultCloseOperation(ClientPrint.EXIT_ON_CLOSE);
        try {
            Class.forName("org.sqlite.JDBC");
            String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement = ConnectiondatabaseConnection.createStatement();
            String sql = "SELECT * FROM students";
            ResultSet result = statement.executeQuery(sql);
            Students2.setModel(DbUtils.resultSetToTableModel(result));
            ConnectiondatabaseConnection.close();
            result.close();
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        Student_Add_Button = new javax.swing.JButton();
        Student_Delete_Button = new javax.swing.JButton();
        Student_Edit_Button = new javax.swing.JButton();
        Search_TextField = new javax.swing.JTextField();
        Student_Search_Button = new javax.swing.JButton();
        Clean_Button = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Students = new javax.swing.JScrollPane();
        Students2 = new javax.swing.JTable();
        Widget_Calendar = new com.toedter.calendar.JCalendar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Client_Print_Button = new javax.swing.JMenuItem();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Πελατολογιο Ασθενων");
        Student_Add_Button.setText("ΚΑΤΑΧΩΡΗΣΗ ΑΣΘΕΝΗ");
        Student_Add_Button.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Add_ButtonActionPerformed(evt);
            }
        });
        Student_Delete_Button.setText("ΔΙΑΓΡΑΦΗ ΑΣΘΕΝΗ");
        Student_Delete_Button.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Delete_ButtonActionPerformed(evt);
            }
        });
        Student_Edit_Button.setText("ΕΠΕΞΕΡΓΑΣΙΑ ΑΣΘΕΝΗ");
        Student_Edit_Button.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Edit_ButtonActionPerformed(evt);
            }
        });
        Search_TextField.setToolTipText("ΕΠΩΝΥΜΟ");
        Student_Search_Button.setText("ΑΝΑΖΗΤΗΣΗ ΑΣΘΕΝΗ");
        Student_Search_Button.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Search_ButtonActionPerformed(evt);
            }
        });
        Clean_Button.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        Clean_Button.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clean_ButtonActionPerformed(evt);
            }
        });
        Students2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { {}, {}, {}, {} }, new String[] {}));
        Students2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table_Students.setViewportView(Students2);
        jScrollPane3.setViewportView(Table_Students);
        jMenu2.setText("ΠΕΛΑΤΕΣ");
        Client_Print_Button.setText("ΚΑΡΤΕΛΑ ΠΕΛΑΤΗ");
        Client_Print_Button.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_Print_ButtonActionPerformed(evt);
            }
        });
        jMenu2.add(Client_Print_Button);
        jMenuBar1.add(jMenu2);
        setJMenuBar(jMenuBar1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(Student_Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(Student_Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addComponent(Student_Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(23, 23, 23).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Clean_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Student_Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))).addComponent(jScrollPane3)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE).addComponent(Widget_Calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Student_Add_Button).addComponent(Student_Delete_Button).addComponent(Student_Edit_Button)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Student_Search_Button).addComponent(Clean_Button)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(layout.createSequentialGroup().addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(Widget_Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(35, 35, 35)));
        setSize(new java.awt.Dimension(937, 597));
        setLocationRelativeTo(null);
    }

    private void Student_Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Pacient.getObj().setVisible(true);
    }

    private void Student_Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        PacientEdit.getObj().setVisible(true);
    }

    private void Student_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedOption = JOptionPane.showConfirmDialog(null, "Θελετε να διαγραψετε τον μαθητή!!!?", "Choose", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            try {
                Class.forName("org.sqlite.JDBC");
                String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
                java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
                String str1 = Search_TextField.getText();
                String sql = "DELETE FROM students WHERE   Επώνυμο= ?";
                PreparedStatement pst = ConnectiondatabaseConnection.prepareStatement(sql);
                pst.setString(1, str1);
                pst.execute();
                pst.close();
                ConnectiondatabaseConnection.close();
            } catch (ClassNotFoundException e1) {
                System.out.println(e1);
            } catch (SQLException e2) {
                System.out.println(e2);
                setVisible(false);
                dispose();
            }
        }
        if (selectedOption == JOptionPane.NO_OPTION) {
        }
    }

    private void Student_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("org.sqlite.JDBC");
            String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement = ConnectiondatabaseConnection.createStatement();
            String str1 = Search_TextField.getText();
            if (!str1.startsWith("'"))
                str1 = "'" + str1;
            if (!str1.endsWith("'"))
                str1 = str1 + "'";
            String sql = "SELECT * FROM students WHERE Επώνυμο=" + str1;
            ResultSet result = statement.executeQuery(sql);
            Students2.setModel(DbUtils.resultSetToTableModel(result));
            ConnectiondatabaseConnection.close();
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Clean_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Search_TextField.setText("");
        try {
            Class.forName("org.sqlite.JDBC");
            String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement = ConnectiondatabaseConnection.createStatement();
            String sql = "SELECT * FROM students ";
            ResultSet result = statement.executeQuery(sql);
            Students2.setModel(DbUtils.resultSetToTableModel(result));
            ConnectiondatabaseConnection.close();
            result.close();
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    private void Client_Print_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ClientPrint.getObj().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Clean_Button;

    private javax.swing.JMenuItem Client_Print_Button;

    private javax.swing.JLabel Image;

    private javax.swing.JTextField Search_TextField;

    private javax.swing.JButton Student_Add_Button;

    private javax.swing.JButton Student_Delete_Button;

    private javax.swing.JButton Student_Edit_Button;

    private javax.swing.JButton Student_Search_Button;

    private javax.swing.JTable Students2;

    private javax.swing.JScrollPane Table_Students;

    private com.toedter.calendar.JCalendar Widget_Calendar;

    private javax.swing.JMenu jMenu2;

    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JScrollPane jScrollPane3;

    
}
