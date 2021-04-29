package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NovoUsuarioView;

/**
 *
 * @author Heloiza
 */
public class NovoUsuarioPresenter {
    private NovoUsuarioView view;

    public NovoUsuarioPresenter(NovoUsuarioView view) {
        view = new NovoUsuarioView();
        
        this.view.getBtnCancelar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnSalvar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
