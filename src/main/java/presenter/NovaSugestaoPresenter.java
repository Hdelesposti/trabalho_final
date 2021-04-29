package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NovaSugestaoView;

/**
 *
 * @author Heloiza
 */
public class NovaSugestaoPresenter {

    private NovaSugestaoView view;

    public NovaSugestaoPresenter(NovaSugestaoView view) {
        view = new NovaSugestaoView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}
