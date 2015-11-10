import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ClientPrint extends javax.swing.JFrame {

    String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28;

    byte[] image_data;

    ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private static ClientPrint obj = null;

    public ClientPrint() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(ClientPrint.DO_NOTHING_ON_CLOSE);
    }

    public static ClientPrint getObj() {
        if (obj == null) {
            obj = new ClientPrint();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Image2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΚΑΡΤΕΛΑ ΠΕΛΑΤΗ");
        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        jLabel1.setText("ΕΠΩΝΥΜΟ ΑΣΘΕΝΗ");
        Result.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { {}, {}, {}, {} }, new String[] {}));
        jScrollPane1.setViewportView(Result);
        jButton1.setText("ΑΝΑΖΗΤΗΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("ΕΚΤΥΠΩΣΗ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Image2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel2.setText("ΣΤΟΙΧΕΙΑ ΑΣΘΕΝΗ");
        jButton3.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addGap(160, 160, 160).addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jButton3)).addComponent(jScrollPane1)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE).addComponent(Image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))).addGap(28, 28, 28)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton1).addComponent(jButton3).addComponent(jButton2)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))).addGap(46, 46, 46)));
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("org.sqlite.JDBC");
            String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement = ConnectiondatabaseConnection.createStatement();
            String str1 = Search.getText();
            if (!str1.startsWith("'"))
                str1 = "'" + str1;
            if (!str1.endsWith("'"))
                str1 = str1 + "'";
            String sql="SELECT students.Όνομα,students.Επώνυμο,students.Πατρώνυμο,students.'Ημερομηνία_Γέννησης',students.'Άδεια',students.'ΑΔΤ',students.'Πρωτόκολο',students.Παρατηρήσεις,students.Πρακτικά,students.Θεωρητικά,students.Κατηγορία FROM students  WHERE Επώνυμο="+str1;
            ResultSet result = statement.executeQuery(sql);
            Result.setModel(DbUtils.resultSetToTableModel(result));
            ConnectiondatabaseConnection.close();
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("org.sqlite.JDBC");
            String sourceURL = new String("jdbc:sqlite:hospital.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement = ConnectiondatabaseConnection.createStatement();
            String str1 = Search.getText();
            if (!str1.startsWith("'"))
                str1 = "'" + str1;
            if (!str1.endsWith("'"))
                str1 = str1 + "'";
            String sql = "SELECT students.Όνομα,students.Επώνυμο,students.Πατρώνυμο,students.'Ημερομηνία_Γέννησης',students.'Άδεια',students.'ΑΔΤ',students.'Πρωτόκολο',students.Παρατηρήσεις,students.Πρακτικά,students.Θεωρητικά,students.Κατηγορία,students.Image  FROM students  WHERE Επώνυμο=" +str1;
            ResultSet result = statement.executeQuery(sql);
            displayresults(result);
            ConnectiondatabaseConnection.close();
            File fontFile = new File("C:/Windows/Fonts/arialuni.ttf");
            BaseFont unicode = BaseFont.createFont(fontFile.getAbsolutePath(), BaseFont.IDENTITY_H, true);
            Font fonty = new Font(unicode, 14, Font.NORMAL);
            String Message = "Το αρχείο έχει δημιουργηθεί";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("test.pdf"));
            document.open();
            Image image = Image.getInstance(image_data);
            image.setWidthPercentage(30);
            PdfPTable table = new PdfPTable(1);
            table.setWidthPercentage(110);
            String str51 = "Όνομα:" + str15;
            PdfPCell cell55 = new PdfPCell(new Paragraph("Στοιχεία Ασθενη", fonty));
            table.addCell(cell55);
            PdfPCell cell66 = new PdfPCell(image);
            table.addCell(cell66);
            PdfPCell cell = new PdfPCell(new Paragraph(str51, fonty));
            table.addCell(cell);
            String str2 = "Επώνυμο:" + str16;
            PdfPCell cell2 = new PdfPCell(new Paragraph(str2, fonty));
            table.addCell(cell2);
            String str3 = "Πατρώνυμο:" + str17;
            PdfPCell cell3 = new PdfPCell(new Paragraph(str3, fonty));
            table.addCell(cell3);
            String str4 = "Αριθμος Αδείας Πιστοποιητικου:" + str18;
            PdfPCell cell4 = new PdfPCell(new Paragraph(str4, fonty));
            table.addCell(cell4);
            String str5 = "Ημερομηνία Γέννησης:" + str19;
            PdfPCell cell5 = new PdfPCell(new Paragraph(str5, fonty));
            table.addCell(cell5);
            String str6 = "Αριθμος Δελτίου Ταυτοτητας:" + str20;
            PdfPCell cell6 = new PdfPCell(new Paragraph(str6, fonty));
            table.addCell(cell6);
            String str7 = "Αριθμος Πρωτοκολλου:" + str21;
            PdfPCell cell7 = new PdfPCell(new Paragraph(str7, fonty));
            table.addCell(cell7);
            String str8 = "Παρατηρήσεις:" + str22;
            PdfPCell cell8 = new PdfPCell(new Paragraph(str8, fonty));
            table.addCell(cell8);
            String str12 = "Κατηγορία Εξετασεις:" + str26;
            PdfPCell cell12 = new PdfPCell(new Paragraph(str12, fonty));
            table.addCell(cell12);
            String str13 = "Επισκεψεις:" + str23;
            PdfPCell cell13 = new PdfPCell(new Paragraph(str13, fonty));
            table.addCell(cell13);
            String str14 = "Πρακτικά Εξετασεις:" + str24;
            PdfPCell cell14 = new PdfPCell(new Paragraph(str14, fonty));
            table.addCell(cell14);
            document.add(table);
            document.close();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, Message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientPrint.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientPrint.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ClientPrint.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Search.setText("");
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
            java.util.logging.Logger.getLogger(ClientPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ClientPrint().setVisible(true);
            }
        });
    }

    private void displayresults(ResultSet result) throws SQLException {
        if (result.next()) {
            str15 = result.getString(1);
            str16 = result.getString(2);
            str17 = result.getString(3);
            str18 = result.getString(4);
            str19 = result.getString(5);
            str20 = result.getString(6);
            str21 = result.getString(7);
            str22 = result.getString(8);
            str23 = result.getString(9);
            str24 = result.getString(10);
            str26 = result.getString(11);
            image_data = result.getBytes("Image");
            ImageIcon image1 = new ImageIcon(image_data);
            Image2.setIcon(image1);
        }
    }

    private javax.swing.JLabel Image2;

    private javax.swing.JTable Result;

    private javax.swing.JTextField Search;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton3;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JScrollPane jScrollPane1;

    
}
