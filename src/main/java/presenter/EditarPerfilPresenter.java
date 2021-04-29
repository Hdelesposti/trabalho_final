package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditarPerfilView;

/**
 *
 * @author Heloiza
 */
public class EditarPerfilPresenter {

    private EditarPerfilView view;

    public EditarPerfilPresenter(EditarPerfilView view) {
        view = new EditarPerfilView();

        this.view.getBtnConfirmar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}
