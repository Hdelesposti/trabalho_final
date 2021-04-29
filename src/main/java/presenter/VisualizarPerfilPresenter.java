package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditarPerfilView;
import view.VisualizarPerfilView;
import view.TelaInicial;

/**
 *
 * @author Heloiza
 */
public class VisualizarPerfilPresenter {
    private VisualizarPerfilView view;

    public VisualizarPerfilPresenter(VisualizarPerfilView view) {
        view = new VisualizarPerfilView();
        
       this.view.getBtnEditar().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                EditarPerfilView a = new EditarPerfilView();
                TelaInicial.Desktop.add(a);
                a.setVisible(true);
            }    
        });
       
       this.view.getBtnExcluir().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
       
       this.view.getBtnHistorico().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
    }
    
    
    
    
}
