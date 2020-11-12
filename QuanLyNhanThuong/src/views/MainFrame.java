/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Bean.DanhMucBean;
import controllers.MainController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setTitle("QUẢN LÝ NHẬN THƯỞNG");
        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("TrangChu", homeBtn, jblTrangChu));
        listDanhMuc.add(new DanhMucBean("HocSinhGioi", hocSinhGioiBtn, jlbHocSinhGioi));
        listDanhMuc.add(new DanhMucBean("TreEm", treEmBtn, jlbTreEm));
        listDanhMuc.add(new DanhMucBean("QuyTienThuong", quyTienThuongBtn, jlbQuyTienThuong));
        listDanhMuc.add(new DanhMucBean("HoGiaDinh", hoGiaDinhBtn, jlbHoGiaDinh));
        
        MainController controller = new MainController(jpnBean, this);
        controller.setView(homeBtn, jblTrangChu, "TrangChu");
        controller.setEvent(listDanhMuc);
        
        // confirm de thuc hien dong
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Confirm", JOptionPane.YES_NO_OPTION) == 0) {
                    dispose();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnContainer = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        homeBtn = new javax.swing.JPanel();
        jblTrangChu = new javax.swing.JLabel();
        hocSinhGioiBtn = new javax.swing.JPanel();
        jlbHocSinhGioi = new javax.swing.JLabel();
        treEmBtn = new javax.swing.JPanel();
        jlbTreEm = new javax.swing.JLabel();
        quyTienThuongBtn = new javax.swing.JPanel();
        jlbQuyTienThuong = new javax.swing.JLabel();
        hoGiaDinhBtn = new javax.swing.JPanel();
        jlbHoGiaDinh = new javax.swing.JLabel();
        jpnBean = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnContainer.setBackground(new java.awt.Color(255, 255, 255));

        jpnMenu.setBackground(new java.awt.Color(153, 153, 153));

        homeBtn.setBackground(new java.awt.Color(0, 160, 50));

        jblTrangChu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/app.png"))); // NOI18N
        jblTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout homeBtnLayout = new javax.swing.GroupLayout(homeBtn);
        homeBtn.setLayout(homeBtnLayout);
        homeBtnLayout.setHorizontalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeBtnLayout.setVerticalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeBtnLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jblTrangChu)
                .addGap(21, 21, 21))
        );

        hocSinhGioiBtn.setBackground(new java.awt.Color(102, 102, 102));
        hocSinhGioiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbHocSinhGioi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbHocSinhGioi.setForeground(new java.awt.Color(255, 255, 255));
        jlbHocSinhGioi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/students.png"))); // NOI18N
        jlbHocSinhGioi.setText("Học sinh giỏi");

        javax.swing.GroupLayout hocSinhGioiBtnLayout = new javax.swing.GroupLayout(hocSinhGioiBtn);
        hocSinhGioiBtn.setLayout(hocSinhGioiBtnLayout);
        hocSinhGioiBtnLayout.setHorizontalGroup(
            hocSinhGioiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hocSinhGioiBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHocSinhGioi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hocSinhGioiBtnLayout.setVerticalGroup(
            hocSinhGioiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hocSinhGioiBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbHocSinhGioi)
                .addContainerGap())
        );

        jlbHocSinhGioi.getAccessibleContext().setAccessibleDescription("");

        treEmBtn.setBackground(new java.awt.Color(102, 102, 102));
        treEmBtn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                treEmBtnAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlbTreEm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTreEm.setForeground(new java.awt.Color(255, 255, 255));
        jlbTreEm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/boy.png"))); // NOI18N
        jlbTreEm.setText("Trẻ em");
        jlbTreEm.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                none(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout treEmBtnLayout = new javax.swing.GroupLayout(treEmBtn);
        treEmBtn.setLayout(treEmBtnLayout);
        treEmBtnLayout.setHorizontalGroup(
            treEmBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treEmBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTreEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        treEmBtnLayout.setVerticalGroup(
            treEmBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treEmBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTreEm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        quyTienThuongBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbQuyTienThuong.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbQuyTienThuong.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuyTienThuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/budget.png"))); // NOI18N
        jlbQuyTienThuong.setText("Quỹ tiền thưởng");

        javax.swing.GroupLayout quyTienThuongBtnLayout = new javax.swing.GroupLayout(quyTienThuongBtn);
        quyTienThuongBtn.setLayout(quyTienThuongBtnLayout);
        quyTienThuongBtnLayout.setHorizontalGroup(
            quyTienThuongBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quyTienThuongBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuyTienThuong)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quyTienThuongBtnLayout.setVerticalGroup(
            quyTienThuongBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quyTienThuongBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbQuyTienThuong)
                .addContainerGap())
        );

        hoGiaDinhBtn.setBackground(new java.awt.Color(102, 102, 102));
        hoGiaDinhBtn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                hoGiaDinhBtnAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlbHoGiaDinh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbHoGiaDinh.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoGiaDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/family.png"))); // NOI18N
        jlbHoGiaDinh.setText("Hộ gia đình");

        javax.swing.GroupLayout hoGiaDinhBtnLayout = new javax.swing.GroupLayout(hoGiaDinhBtn);
        hoGiaDinhBtn.setLayout(hoGiaDinhBtnLayout);
        hoGiaDinhBtnLayout.setHorizontalGroup(
            hoGiaDinhBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoGiaDinhBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoGiaDinh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hoGiaDinhBtnLayout.setVerticalGroup(
            hoGiaDinhBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hoGiaDinhBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbHoGiaDinh)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hocSinhGioiBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(treEmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quyTienThuongBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoGiaDinhBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(hocSinhGioiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(treEmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quyTienThuongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hoGiaDinhBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnBeanLayout = new javax.swing.GroupLayout(jpnBean);
        jpnBean.setLayout(jpnBeanLayout);
        jpnBeanLayout.setHorizontalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        jpnBeanLayout.setVerticalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnContainerLayout = new javax.swing.GroupLayout(jpnContainer);
        jpnContainer.setLayout(jpnContainerLayout);
        jpnContainerLayout.setHorizontalGroup(
            jpnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContainerLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jpnBean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnContainerLayout.setVerticalGroup(
            jpnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnBean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treEmBtnAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_treEmBtnAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_treEmBtnAncestorAdded

    private void none(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void hoGiaDinhBtnAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_hoGiaDinhBtnAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_hoGiaDinhBtnAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hoGiaDinhBtn;
    private javax.swing.JPanel hocSinhGioiBtn;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel jblTrangChu;
    private javax.swing.JLabel jlbHoGiaDinh;
    private javax.swing.JLabel jlbHocSinhGioi;
    private javax.swing.JLabel jlbQuyTienThuong;
    private javax.swing.JLabel jlbTreEm;
    private javax.swing.JPanel jpnBean;
    private javax.swing.JPanel jpnContainer;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel quyTienThuongBtn;
    private javax.swing.JPanel treEmBtn;
    // End of variables declaration//GEN-END:variables
}
