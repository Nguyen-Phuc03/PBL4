/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import net.miginfocom.swing.MigLayout;

public class Menu_Left extends javax.swing.JPanel {

    public Menu_Left() {
        initComponents();
        init();
    }
    private void init(){
        menulist.setLayout(new MigLayout());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuButton1 = new component.MenuButton();
        menuButton2 = new component.MenuButton();
        menuButton3 = new component.MenuButton();
        menulist = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(242, 239, 239));

        menu.setBackground(new java.awt.Color(249, 246, 246));
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.LINE_AXIS));

        menuButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/message_selected.png"))); // NOI18N
        menuButton1.setContentAreaFilled(true);
        menu.add(menuButton1);

        menuButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group.png"))); // NOI18N
        menuButton2.setContentAreaFilled(true);
        menu.add(menuButton2);

        menuButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box_selected.png"))); // NOI18N
        menuButton3.setContentAreaFilled(true);
        menu.add(menuButton3);

        javax.swing.GroupLayout menulistLayout = new javax.swing.GroupLayout(menulist);
        menulist.setLayout(menulistLayout);
        menulistLayout.setHorizontalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menulistLayout.setVerticalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu)
            .addComponent(menulist)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menulist))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane menu;
    private component.MenuButton menuButton1;
    private component.MenuButton menuButton2;
    private component.MenuButton menuButton3;
    private javax.swing.JLayeredPane menulist;
    // End of variables declaration//GEN-END:variables
}
