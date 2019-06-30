package idea.plugin.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import idea.plugin.demo.ui.DiaLogWindow;

/**
 * TestAction
 * author  wenhe
 * date 2019/6/29
 */
public class TestAction extends AnAction {

  @Override
  public void actionPerformed(AnActionEvent e) {
    DiaLogWindow dialog = new DiaLogWindow();
    dialog.pack();
    dialog.setVisible(true);
  }


}
