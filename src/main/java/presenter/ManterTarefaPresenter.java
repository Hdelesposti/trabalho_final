
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ManterTarefaView;
import view.NovaTarefaView;
import view.TelaInicial;

/**
 *
 * @author Heloiza
 */
public class ManterTarefaPresenter {
    private ManterTarefaView view;

    public ManterTarefaPresenter(ManterTarefaView view) {
        view = new ManterTarefaView();
        
        this.view.getBtnBuscar().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
        
        this.view.getBtnEditar().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                NovaTarefaView cad = new NovaTarefaView();
                TelaInicial.Desktop.add(cad);
                cad.setVisible(true);
            }    
        });
        
        this.view.getBtnExcluir().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        
        this.view.getBtnNovaTarefa().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                NovaTarefaView cad = new NovaTarefaView();
                TelaInicial.Desktop.add(cad);
                cad.setVisible(true);   
            }    
        });
        
        
    }
    
    
    
    
}
