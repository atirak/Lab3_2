import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JTextField txtUserlogin;
    private JPasswordField pwdUser;
    private JButton btnSumit;
    private JButton btnClear;
    private JPanel mainPanel;

    public login() {
        btnSumit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtUserlogin.getText()
                        +" "+new String(pwdUser.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserlogin.setText("");
                pwdUser.setText("");
            }
        });
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}
