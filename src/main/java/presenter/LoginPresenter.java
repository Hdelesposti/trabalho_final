
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LoginView;

/**
 *
 * @author Heloiza
 */
public class LoginPresenter {
    private LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
        
        
        this.view.getBtnEntrar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnNovoUsuario().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
    }
    
    
    
}
