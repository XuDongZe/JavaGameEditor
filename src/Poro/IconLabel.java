package Poro;

import java.awt.Dimension;
import java.awt.Image;
import java.io.Serializable;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Constant.Constant;
import Util.ImageUtil;

public class IconLabel extends JLabel implements Serializable {
    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 1L;

    private static int DEFAULT_WIDTH = Constant.CS;
    private static int DEFAULT_HEIGHT = Constant.CS;
    private static ImageIcon DEFAULT_ICON = ImageUtil.loadIcon("bg0.png");
    private String iconURL;
    private ImageIcon icon;
    private int width;
    private int height;

    public IconLabel(String url, int width, int height) {
        setPreferredSize(new Dimension(width, height));
        icon = ImageUtil.loadIcon(url);
        icon = icon == null ? DEFAULT_ICON : icon;
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        setIcon(icon);
        iconURL = url;
        this.height = height;
        this.width = width;
    }

    public IconLabel(String url) {
        this(url, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public IconLabel() {
        this("bg0.png");
    }

    public IconLabel selfDup() {
        return new IconLabel(this.getIconURL(), this.getWidth(), this.getHeight());
    }

    public String getIconURL() {
        return iconURL;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        setIcon(icon);
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        setIcon(icon);
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return getIconURL();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IconLabel)) {
            return false;
        }
        IconLabel iconLabel = (IconLabel) o;
        return width == iconLabel.width && height == iconLabel.height && iconURL.equals(iconLabel.iconURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iconURL, width, height);
    }
}
