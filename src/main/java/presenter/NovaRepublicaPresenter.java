package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NovaRepublicaView;

/**
 *
 * @author Heloiza
 */
public class NovaRepublicaPresenter {

    private NovaRepublicaView view;

    public NovaRepublicaPresenter(NovaRepublicaView view) {
        view = new NovaRepublicaView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}
