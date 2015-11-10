import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        Username_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Username_TextField = new javax.swing.JTextField();
        Password_TextField = new javax.swing.JPasswordField();
        Ok_Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Username_Label.setFont(new java.awt.Font("Tahoma", 1, 14));
        Username_Label.setText("Username");
        Password_Label.setFont(new java.awt.Font("Tahoma", 1, 14));
        Password_Label.setText("Password");
        Username_TextField.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {
                Username_TextFieldKeyPressed(evt);
            }
        });
        Password_TextField.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {
                Password_TextFieldKeyPressed(evt);
            }
        });
        Ok_Button.setText("OK");
        Ok_Button.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_ButtonActionPerformed(evt);
            }
        });
        Ok_Button.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {
                Ok_ButtonKeyPressed(evt);
            }
        });
        jLabel3.setText("©");
        jLabel3.setToolTipText("Anik");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(Username_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(178, 178, 178)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(Password_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(179, 179, 179)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(Password_TextField, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Username_TextField, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Ok_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel3).addGap(37, 37, 37)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Username_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Username_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Password_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(Password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(29, 29, 29).addComponent(Ok_Button).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel3)));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 1, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        setSize(new java.awt.Dimension(239, 175));
        setLocationRelativeTo(null);
    }

    private void Ok_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = Username_TextField.getText();
        String password = Password_TextField.getText();
        String Message = "Παρακαλω? εισάγεται σωστά τα στοιχειά!!!";
        if (username.equals("root") && password.equals("anik")) {
            new Home().setVisible(true);
            setVisible(false);
            dispose();
        } else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, Message);
        }
    }

    private void Ok_ButtonKeyPressed(java.awt.event.KeyEvent evt) {
        String username = Username_TextField.getText();
        String password = Password_TextField.getText();
        String Message = "Παρακαλω? εισάγεται σωστά τα στοιχειά!!!";
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            if (username.equals("root") && password.equals("anik")) {
                new Home().setVisible(true);
                setVisible(false);
                dispose();
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, Message);
            }
        }
    }

    private void Password_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {
        String username = Username_TextField.getText();
        String password = Password_TextField.getText();
        String Message = "Παρακαλω? εισάγεται σωστά τα στοιχειά!!!";
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            if (username.equals("root") && password.equals("anik")) {
                new Home().setVisible(true);
                setVisible(false);
                dispose();
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, Message);
            }
        }
    }

    private void Username_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {
        String username = Username_TextField.getText();
        String password = Password_TextField.getText();
        String Message = "Παρακαλω? εισάγεται σωστά τα στοιχειά!!!";
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            if (username.equals("root") && password.equals("anik")) {
                new Home().setVisible(true);
                setVisible(false);
                dispose();
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, Message);
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Ok_Button;

    private javax.swing.JLabel Password_Label;

    private javax.swing.JPasswordField Password_TextField;

    private javax.swing.JLabel Username_Label;

    private javax.swing.JTextField Username_TextField;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JPanel jPanel1;

    public Gui() {
        super();
        create();
        this.setVisible(true);
        this.setResizable(false);
        initComponents();
    }

    private void create() {
        Username_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Username_TextField = new javax.swing.JTextField();
        Password_TextField = new javax.swing.JPasswordField();
        Ok_Button = new javax.swing.JButton();
        jPanel1 = (javax.swing.JPanel) this.getContentPane();
    }

   
}
