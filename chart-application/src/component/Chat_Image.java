package component;

import event.PublicEvent;
import model.Model_File_Sender;
import model.Model_Receive_Image;
import swing.blurHash.BlurHash;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class Chat_Image extends javax.swing.JLayeredPane {

    public Chat_Image(boolean right) {
        initComponents();
        setLayout(new MigLayout("", "0[" + (right ? "right" : "left") + "]0", "3[]3"));
    }

    public void addImage(Model_File_Sender fileSender) {
        Icon image = new ImageIcon(fileSender.getFile().getAbsolutePath());
       // System.out.println(fileSender.getFile().getAbsolutePath());
        Image_Item pic = new Image_Item();
        pic.setPreferredSize(getAutoSize(image, 200, 200));
        pic.setImage(image, fileSender);
        addEvent(pic, image);
        add(pic, "wrap");
    }

    public void addImage(Model_Receive_Image dataImage) {
    Image_Item pic = new Image_Item();
    pic.setPreferredSize(new Dimension(dataImage.getWidth(), dataImage.getHeight()));
    pic.setImage(dataImage);

    int idfile = dataImage.getFileID();
    addEvent1(pic, idfile);
    add(pic, "wrap");
}

private void addEvent1(Component com, int idfile) {
    com.setCursor(new Cursor(Cursor.HAND_CURSOR));
    com.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
            if (SwingUtilities.isLeftMouseButton(me)) {
                String parentDirectoryPath = "client_data/";
                String filepng = idfile + ".png";
                String filejpg = idfile + ".jpg";
                String filejpeg = idfile + ".jpeg";
                String filePathpng = parentDirectoryPath + File.separator + filepng;
                String filePathjpg = parentDirectoryPath + File.separator + filejpg;
                String filePathjpeg = parentDirectoryPath + File.separator + filejpeg;
                File fileToOpen;
                
                if (new File(filePathpng).exists()) {
                    fileToOpen = new File(filePathpng);
                    Icon image = new ImageIcon(fileToOpen.toPath().toString());
                    PublicEvent.getInstance().getEventImageView().viewImage(image);
                } else if (new File(filePathjpg).exists()) {
                    fileToOpen = new File(filePathjpg);
                    Icon image = new ImageIcon(fileToOpen.toPath().toString());
                    PublicEvent.getInstance().getEventImageView().viewImage(image);
                }
                else if (new File(filePathjpeg).exists()) {
                    fileToOpen = new File(filePathjpeg);
                    Icon image = new ImageIcon(fileToOpen.toPath().toString());
                    PublicEvent.getInstance().getEventImageView().viewImage(image);
                }
                else {
                    System.out.println("Không tìm thấy tệp: ");
                    return;
                }
            }
        }
    });
}
    private void addEvent(Component com, Icon image) {
        com.setCursor(new Cursor(Cursor.HAND_CURSOR));
        com.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    PublicEvent.getInstance().getEventImageView().viewImage(image);
                }
            }
        });
    }

    private Dimension getAutoSize(Icon image, int w, int h) {
        if (w > image.getIconWidth()) {
            w = image.getIconWidth();
        }
        if (h > image.getIconHeight()) {
            h = image.getIconHeight();
        }
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.min(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        return new Dimension(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
