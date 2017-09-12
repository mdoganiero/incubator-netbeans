/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013, 2016 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 */
package org.netbeans.core.multitabs.prefs;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.core.multitabs.impl.ProjectSupport;
import org.openide.util.NbBundle;

/**
 *
 * @author stan
 */
class InnerTabsPanel extends javax.swing.JPanel {

    private final SettingsImpl settings = new SettingsImpl();
    private final MultiTabsOptionsPanelController controller;

    /**
     * Creates new form InnerTabsPanel
     */
    public InnerTabsPanel(final MultiTabsOptionsPanelController controller) {
        this.controller = controller;
        initComponents();

        ItemListener listener = new ItemListener() {

            @Override
            public void itemStateChanged( ItemEvent e ) {
                fireChanged();
                enableControls();
            }
        };

        radioPlacementBottom.addItemListener( listener );
        radioPlacementLeft.addItemListener( listener );
        radioPlacementRight.addItemListener( listener );
        radioPlacementTop.addItemListener( listener );
        checkShowFolderName.addItemListener( listener );
        checkShowFullPath.addItemListener( listener );
        checkProjectColors.addItemListener( listener );
        checkSortDocumentList.addItemListener( listener );
        checkMultiRow.addItemListener( listener );
        radioRowCount.addItemListener( listener );
        radioRowPerProject.addItemListener( listener );
        spinRowCount.getModel().addChangeListener( new ChangeListener() {

            @Override
            public void stateChanged( ChangeEvent e ) {
                fireChanged();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        radioRowCount = new javax.swing.JRadioButton();
        spinRowCount = new javax.swing.JSpinner();
        radioRowPerProject = new javax.swing.JRadioButton();
        checkSortDocumentList = new javax.swing.JCheckBox();
        checkMultiRow = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        checkProjectColors = new javax.swing.JCheckBox();
        radioPlacementRight = new javax.swing.JRadioButton();
        radioPlacementBottom = new javax.swing.JRadioButton();
        radioPlacementLeft = new javax.swing.JRadioButton();
        radioPlacementTop = new javax.swing.JRadioButton();
        checkShowFullPath = new javax.swing.JCheckBox();
        checkShowFolderName = new javax.swing.JCheckBox();

        buttonGroup2.add(radioRowCount);
        radioRowCount.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(radioRowCount, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.radioRowCount.text")); // NOI18N

        spinRowCount.setModel(new javax.swing.SpinnerNumberModel(3, 2, 10, 1));

        buttonGroup2.add(radioRowPerProject);
        org.openide.awt.Mnemonics.setLocalizedText(radioRowPerProject, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.radioRowPerProject.text")); // NOI18N
        radioRowPerProject.setActionCommand(org.openide.util.NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.radioRowPerProject.actionCommand")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkSortDocumentList, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.checkSortDocumentList.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkMultiRow, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.checkMultiRow.text")); // NOI18N
        checkMultiRow.setActionCommand(org.openide.util.NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.checkMultiRow.actionCommand")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkProjectColors, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.checkProjectColors.text")); // NOI18N
        checkProjectColors.setActionCommand(org.openide.util.NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.checkProjectColors.actionCommand")); // NOI18N

        buttonGroup1.add(radioPlacementRight);
        org.openide.awt.Mnemonics.setLocalizedText(radioPlacementRight, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.radioPlacementRight.text")); // NOI18N

        buttonGroup1.add(radioPlacementBottom);
        org.openide.awt.Mnemonics.setLocalizedText(radioPlacementBottom, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.radioPlacementBottom.text")); // NOI18N

        buttonGroup1.add(radioPlacementLeft);
        org.openide.awt.Mnemonics.setLocalizedText(radioPlacementLeft, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.radioPlacementLeft.text")); // NOI18N

        buttonGroup1.add(radioPlacementTop);
        radioPlacementTop.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(radioPlacementTop, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.radioPlacementTop.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkShowFullPath, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.checkShowFullPath.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(checkShowFolderName, NbBundle.getMessage(InnerTabsPanel.class, "InnerTabsPanel.checkShowFolderName.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkShowFolderName)
                    .addComponent(checkShowFullPath)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioPlacementLeft)
                            .addComponent(radioPlacementTop)
                            .addComponent(radioPlacementBottom)
                            .addComponent(radioPlacementRight))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkMultiRow)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioRowPerProject)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioRowCount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(checkProjectColors)
                    .addComponent(checkSortDocumentList))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(radioPlacementTop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPlacementLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPlacementBottom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPlacementRight))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkMultiRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioRowCount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioRowPerProject)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkShowFolderName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkShowFullPath))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkProjectColors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkSortDocumentList)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    javax.swing.JCheckBox checkMultiRow;
    javax.swing.JCheckBox checkProjectColors;
    javax.swing.JCheckBox checkShowFolderName;
    javax.swing.JCheckBox checkShowFullPath;
    javax.swing.JCheckBox checkSortDocumentList;
    javax.swing.JLabel jLabel1;
    javax.swing.JRadioButton radioPlacementBottom;
    javax.swing.JRadioButton radioPlacementLeft;
    javax.swing.JRadioButton radioPlacementRight;
    javax.swing.JRadioButton radioPlacementTop;
    javax.swing.JRadioButton radioRowCount;
    javax.swing.JRadioButton radioRowPerProject;
    javax.swing.JSpinner spinRowCount;
    // End of variables declaration//GEN-END:variables

    private void fireChanged() {
        boolean isChanged = false;
        if (checkShowFolderName.isSelected() != settings.isShowFolderName()
                || checkShowFullPath.isSelected() != settings.isShowFullPath()
                || checkProjectColors.isSelected() != settings.isSameProjectSameColor()
                || checkSortDocumentList.isSelected() != settings.isSortDocumentListByProject()) {
            isChanged = true;
        }
        
        int rowCount = settings.getRowCount();
        if (checkMultiRow.isSelected() && radioRowCount.isSelected()) {
            rowCount = ((Number) spinRowCount.getValue()).intValue();
        }
        if (checkMultiRow.isSelected() != (rowCount > 1 || settings.isTabRowPerProject())) {
            isChanged = true;
        }
        if (rowCount != settings.getRowCount()) {
            isChanged = true;
        }
        if (radioRowPerProject.isSelected() != settings.isTabRowPerProject()) {
            isChanged = true;
        }
        
        if(radioPlacementBottom.isSelected() && settings.getTabsLocation() != JTabbedPane.BOTTOM
                || radioPlacementLeft.isSelected() && settings.getTabsLocation() != JTabbedPane.LEFT
                || radioPlacementRight.isSelected() && settings.getTabsLocation() != JTabbedPane.RIGHT
                || radioPlacementTop.isSelected() && settings.getTabsLocation() != JTabbedPane.TOP) {
            isChanged = true;
        }
        controller.changed(null, isChanged);
    }
    
    void load() {
        ProjectSupport projectSupport = ProjectSupport.getDefault();
        switch( settings.getTabsLocation() ) {
            case JTabbedPane.LEFT:
                radioPlacementLeft.setSelected( true );
                break;
            case JTabbedPane.RIGHT:
                radioPlacementRight.setSelected( true );
                break;
            case JTabbedPane.BOTTOM:
                radioPlacementBottom.setSelected( true );
                break;
            default:
                radioPlacementTop.setSelected( true );
        }
        checkShowFolderName.setSelected( settings.isShowFolderName() );
        checkShowFullPath.setSelected( settings.isShowFullPath() );
        checkProjectColors.setSelected( settings.isSameProjectSameColor() );
        checkSortDocumentList.setSelected( settings.isSortDocumentListByProject() );
        int rowCount = settings.getRowCount();
        checkMultiRow.setSelected( rowCount > 1 || settings.isTabRowPerProject() );
        if( rowCount > 1 )
            spinRowCount.getModel().setValue( Integer.valueOf( rowCount ) );
        radioRowPerProject.setSelected( settings.isTabRowPerProject() );
        radioRowCount.setSelected( rowCount > 1 );

        radioRowPerProject.setVisible( projectSupport.isEnabled() );
        checkProjectColors.setVisible( projectSupport.isEnabled() );
        checkSortDocumentList.setVisible( projectSupport.isEnabled() );

        enableControls();
    }

    boolean store() {
        boolean changed = false;
        int placement = JTabbedPane.TOP;
        if( radioPlacementBottom.isSelected() ) {
            placement = JTabbedPane.BOTTOM;
        } else if( radioPlacementLeft.isSelected() ) {
            placement = JTabbedPane.LEFT;
        } else if( radioPlacementRight.isSelected() ) {
            placement = JTabbedPane.RIGHT;
        }
        changed |= settings.setTabsLocation( placement );
        changed |= settings.setShowFullPath( checkShowFullPath.isSelected() );
        changed |= settings.setSameProjectSameColor( checkProjectColors.isSelected() );

        int rowCount = 1;
        if( checkMultiRow.isSelected() && radioRowCount.isSelected() )
            rowCount = ((Number)spinRowCount.getValue()).intValue();
        changed |= settings.setRowCount( rowCount );
        changed |= settings.setTabRowPerProject( radioRowPerProject.isSelected() && checkMultiRow.isSelected() );

        changed |= settings.setShowFolderName( checkShowFolderName.isSelected() );
        changed |= settings.setSortDocumentListByProject( checkSortDocumentList.isSelected() );

        return changed;

    }

    private void enableControls() {
        boolean horizontalOrientation = radioPlacementTop.isSelected() || radioPlacementBottom.isSelected();
        checkShowFullPath.setEnabled( horizontalOrientation );
        checkMultiRow.setEnabled( horizontalOrientation );
        if( !horizontalOrientation ) {
            checkMultiRow.setSelected( false );
            checkShowFullPath.setSelected( false );
        }
        radioRowCount.setEnabled( checkMultiRow.isSelected() );
        radioRowPerProject.setEnabled( checkMultiRow.isSelected() );
        spinRowCount.setEnabled( checkMultiRow.isSelected() && horizontalOrientation && radioRowCount.isSelected() );
    }
}