package com.softsimples.ui.base.actions;


import com.softsimples.ui.base.BasicFormPanel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class ExcluirAction extends AbstractAction {
    private static final long serialVersionUID = 1L;
    private BasicFormPanel basicPanel;
    public ExcluirAction(BasicFormPanel basicPanel) {
        super("Excluir",new ImageIcon(ExcluirAction.class.getResource("/icons/disk_blue_error.png")));
        this.putValue(SHORT_DESCRIPTION, "Exclui cadastro");
        this.putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
        this.putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_E));
        this.basicPanel = basicPanel;
    }

    public void actionPerformed(ActionEvent event) {
        this.basicPanel.excluir();
    }    
}
