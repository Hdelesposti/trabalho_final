package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.RealizarEstornoView;

/**
 *
 * @author Heloiza
 */
public class RealizarEstornoPresenter {

    private RealizarEstornoView view;

    public RealizarEstornoPresenter(RealizarEstornoView view) {
        view = new RealizarEstornoView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}
