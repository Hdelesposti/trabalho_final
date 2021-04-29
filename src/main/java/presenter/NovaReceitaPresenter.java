package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NovaReceitaView;

/**
 *
 * @author Heloiza
 */
public class NovaReceitaPresenter {

    private NovaReceitaView view;

    public NovaReceitaPresenter(NovaReceitaView view) {
        view = new NovaReceitaView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
