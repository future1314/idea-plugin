package idea.plugin.demo.ui;

import java.awt.*;
import java.net.URL;

import javax.swing.*;
public class DiaLogWindow extends JDialog {

  private JPanel contentPane;
  private JTextPane
      TextPane;
  private JTextField textField2;
  private JTextField textField3;
  private JPasswordField passwordField1;
  private JTable table1;
  private JButton createCodeButton;

  public DiaLogWindow() {
    setContentPane(contentPane);
    getContentPane().setPreferredSize(new Dimension(900, 700));
    setModal(true);

    try{
      // 得到绝对路径
      String path =this.getClass().getClassLoader().getResource("xiaowanzi.png").getPath();
      // debug 时，是从文件系统中读取图片的，需要在加上 file 协议
//      TextPane.insertIcon(new ImageIcon(new URL("file:" + path), "xiaowanzi"));
      // 打包上线之后，是从 jar 包读取图片的，需要在加上 jar 协议
      TextPane.insertIcon(new ImageIcon(new URL("jar:" + path), "DMVP"));
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    DiaLogWindow window = new DiaLogWindow();
    window.pack();
    window.setVisible(true);
  }

}
