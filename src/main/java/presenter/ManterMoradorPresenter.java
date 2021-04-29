package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ManterMoradorView;

/**
 *
 * @author Heloiza
 */
public class ManterMoradorPresenter {

    private ManterMoradorView view;

    public ManterMoradorPresenter(ManterMoradorView view) {
        view = new ManterMoradorView();

        this.view.getBtnConvidar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnEditar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnHistorico().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        this.view.getBtnRemoverRepublica().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }

}
