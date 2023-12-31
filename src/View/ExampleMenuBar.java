package View;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 * @author xudongze
 * @ClassName: ExampleMenuBar
 * @Description:
 * @date 2018年9月4日 下午8:32:09
 */
public abstract class ExampleMenuBar extends JMenuBar {
    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 1L;
    protected JMenu fileMenu;
    protected JMenuItem save, open, create, saveAs;

    public ExampleMenuBar() {
        init();
    }

    private void init() {
        fileMenu = new JMenu("File");
        open = new JMenuItem("Open...");
        create = new JMenuItem("New...");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save as...");

        fileMenu.add(open);
        fileMenu.addSeparator();
        fileMenu.add(create);
        fileMenu.addSeparator();
        fileMenu.add(save);
        fileMenu.add(saveAs);
        add(fileMenu);
    }

    protected abstract class MyOpenBntListener implements ActionListener {
    }

    ;

    protected abstract class MyCreateBntListener implements ActionListener {
    }

    ;

    protected abstract class MySaveBntListener implements ActionListener {
    }

    ;

    protected abstract class MySaveAsBntListener implements ActionListener {
    }

    ;

    /**
     * @param
     * @return void
     * @Title: addAllItemListeners
     * @Description: 设置所有的JMenuItem 的监听器
     */
    protected abstract void initItemListeners();

    /**
     * @param
     * @return void
     * @Title: addItemAccelaretors
     * @Description: 为JmenuBar 中的所有item绑定快捷键
     */
    protected abstract void initItemAccelerators();

    /**
     * @param
     * @return void
     * @Title: disableItems
     * @Description: 初始化item是否有效
     */
    protected abstract void initItemEnables();

    public JMenu getFileMenu() {
        return fileMenu;
    }

    public void setFileMenu(JMenu fileMenu) {
        this.fileMenu = fileMenu;
    }

    public JMenuItem getSave() {
        return save;
    }

    public void setSave(JMenuItem save) {
        this.save = save;
    }

    public JMenuItem getOpen() {
        return open;
    }

    public void setOpen(JMenuItem open) {
        this.open = open;
    }

    public JMenuItem getCreate() {
        return create;
    }

    public void setCreate(JMenuItem create) {
        this.create = create;
    }

    public JMenuItem getSaveAs() {
        return saveAs;
    }

    public void setSaveAs(JMenuItem saveAs) {
        this.saveAs = saveAs;
    }

}