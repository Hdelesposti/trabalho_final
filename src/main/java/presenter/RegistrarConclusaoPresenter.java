package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RegistrarConclusaoView;

/**
 *
 * @author Heloiza
 */
public class RegistrarConclusaoPresenter {

    private RegistrarConclusaoView view;

    public RegistrarConclusaoPresenter(RegistrarConclusaoView view) {
        view = new RegistrarConclusaoView();

        this.view.getBtnRealizada().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}
