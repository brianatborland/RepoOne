package com.starbase.starteam.changerequest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.starbase.starteam.starflow.guicomponents.AttachmentsEditor;
import com.starbase.starteam.starflow.guicomponents.ComboEditor;
import com.starbase.starteam.starflow.guicomponents.RevisionCommentEditor;
import com.starbase.starteam.starflow.guicomponents.StaticTextEditor;
import com.starbase.starteam.starflow.guicomponents.TextAreaEditor;
import com.starbase.starteam.starflow.guicomponents.TextFieldEditor;
import com.starbase.util.errorhandling.GraphicalErrorHandler;

/**
 * Title: Change Request Form Description: Sample Change Request form
 * Copyright: Copyright (c) 2001 Company: Borland
 * 
 * @author Brian Stiles
 * @version 1.0
 */
public class ChangeRequestForm extends JPanel {
    BorderLayout borderLayout2 = new BorderLayout();
    JTabbedPane jTabbedPane1 = new JTabbedPane();
    JPanel synopsisTab = new JPanel();
    JPanel descriptionTab = new JPanel();
    JPanel solutionTab = new JPanel();
    JPanel attachmentsTab = new JPanel();
    JPanel commentTab = new JPanel();
    TitledBorder titledBorder1;
    ComboEditor priority = new ComboEditor();
    ComboEditor platform = new ComboEditor();
    ComboEditor severity = new ComboEditor();
    TextFieldEditor externalReference = new TextFieldEditor();
    TextFieldEditor component = new TextFieldEditor();
    TextFieldEditor category = new TextFieldEditor();
    TextAreaEditor synopsis = new TextAreaEditor();
    ComboEditor type = new ComboEditor();
    ComboEditor lastBuildTested = new ComboEditor();
    StaticTextEditor addressedBy = new StaticTextEditor();
    ComboEditor addressedIn = new ComboEditor();
    ComboEditor responsibility = new ComboEditor();
    StaticTextEditor lastModifiedTime = new StaticTextEditor();
    JPanel enteredBy = new JPanel();
    StaticTextEditor createdTime = new StaticTextEditor();
    BorderLayout borderLayout3 = new BorderLayout();
    StaticTextEditor createdUserID = new StaticTextEditor();
    TextAreaEditor description = new TextAreaEditor();
    TextAreaEditor workaround = new TextAreaEditor();
    TextAreaEditor fix = new TextAreaEditor();
    BorderLayout borderLayout5 = new BorderLayout();
    BorderLayout borderLayout6 = new BorderLayout();
    ComboEditor workflowStatus = new ComboEditor();
    AttachmentsEditor attachmentsEditor1 = new AttachmentsEditor();
    Border border1;
    RevisionCommentEditor revisionCommentEditor1 = new RevisionCommentEditor();
    Border border2;
    BorderLayout borderLayout1 = new BorderLayout();
    GridLayout gridLayout1 = new GridLayout();
    Border border3;
    Border border4;

    public ChangeRequestForm() {
        try {
            setLayout(new BorderLayout());
            jbInit();
        } catch (Exception ex) {
            new GraphicalErrorHandler().handleErrors(this, "StarTeam", "Error while initializing", ex, this, null, 0, 0);
        }
    }

    void jbInit() throws Exception {
        titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,
                new Color(134, 134, 134)), "Entered by");
        border1 = BorderFactory.createEmptyBorder(3, 3, 3, 3);
        border2 = BorderFactory.createEmptyBorder(3, 3, 3, 3);
        border3 = BorderFactory.createEmptyBorder(4, 4, 4, 4);
        border4 = BorderFactory.createEmptyBorder(4, 4, 4, 4);
        synopsisTab.setLayout(null);
        priority.setPropertyName("Priority");
        priority.setMnemonic(KeyEvent.VK_P);
        platform.setPropertyName("Platform");
        platform.setMnemonic(KeyEvent.VK_L);
        platform.setSortOrdering(
                com.starbase.starteam.starflow.guicomponents.ComboEditor.ASCENDING);
        severity.setPropertyName("Severity");
        severity.setMnemonic(KeyEvent.VK_E);
        externalReference.setPropertyName("ExternalReference");
        externalReference.setMnemonic(KeyEvent.VK_X);
        component.setPropertyName("Component");
        component.setMnemonic(KeyEvent.VK_C);
        category.setPropertyName("Category");
        category.setMnemonic(KeyEvent.VK_A);
        synopsis.setPropertyName("Synopsis");
        synopsis.setMnemonic(KeyEvent.VK_Y);
        type.setPropertyName("Type");
        type.setMnemonic(KeyEvent.VK_P);
        lastBuildTested.setPropertyName("LastBuildTested");
        lastBuildTested.setMnemonic(KeyEvent.VK_U);
        addressedBy.setPropertyName("AddressedBy");
        addressedBy.setLabel("By:");
        addressedIn.setPropertyName("AddressedIn");
        addressedIn.setMnemonic(KeyEvent.VK_D);
        responsibility.setPropertyName("Responsibility");
        responsibility.setMnemonic(KeyEvent.VK_R);
        responsibility.setSortOrdering(
                com.starbase.starteam.starflow.guicomponents.ComboEditor.ASCENDING);
        lastModifiedTime.setPropertyName("ModifiedTime");
        lastModifiedTime.setLabel("As of:");
        enteredBy.setLayout(borderLayout3);
        enteredBy.setBorder(titledBorder1);
        createdTime.setPropertyName("CreatedTime");
        createdTime.setLabel("On:");
        createdUserID.setPropertyName("CreatedUserID");
        createdUserID.setLabel("");
        descriptionTab.setLayout(borderLayout1);
        description.setPropertyName("Description");
        description.setMnemonic(KeyEvent.VK_D);
        solutionTab.setLayout(gridLayout1);
        workaround.setPropertyName("Workaround");
        workaround.setMnemonic(KeyEvent.VK_A);
        fix.setPropertyName("Fix");
        fix.setMnemonic(KeyEvent.VK_I);
        attachmentsTab.setLayout(borderLayout5);
        commentTab.setLayout(borderLayout6);
        workflowStatus.setPropertyName("Usr_StarFlowStatus");
        workflowStatus.setMnemonic(KeyEvent.VK_W);
        workflowStatus.setSortOrdering(
                com.starbase.starteam.starflow.guicomponents.ComboEditor.ASCENDING);
        synopsisTab.setMinimumSize(new Dimension(530, 375));
        synopsisTab.setPreferredSize(new Dimension(530, 375));
        attachmentsTab.setBorder(border1);
        commentTab.setBorder(border2);
        gridLayout1.setColumns(1);
        gridLayout1.setRows(0);
        solutionTab.setBorder(border3);
        descriptionTab.setBorder(border4);
        add(jTabbedPane1, BorderLayout.CENTER);
        jTabbedPane1.add(synopsisTab, "Synopsis");
        jTabbedPane1.add(descriptionTab, "Description");
        descriptionTab.add(description, BorderLayout.CENTER);
        jTabbedPane1.add(solutionTab, "Solution");
        jTabbedPane1.add(attachmentsTab, "Attachments");
        attachmentsTab.add(attachmentsEditor1, BorderLayout.CENTER);
        jTabbedPane1.add(commentTab, "Comment");
        commentTab.add(revisionCommentEditor1, BorderLayout.CENTER);
        revisionCommentEditor1.setMnemonicForOldComment(KeyEvent.VK_C);
        revisionCommentEditor1.setMnemonicForNewComment(KeyEvent.VK_N);
        enteredBy.add(createdTime, BorderLayout.SOUTH);
        enteredBy.add(createdUserID, BorderLayout.NORTH);
        synopsisTab.add(addressedIn);
        //addressedIn.add(addressedBy, null);
        addressedIn.addComponent(addressedBy);
        synopsisTab.add(externalReference);
        synopsisTab.add(component);
        synopsisTab.add(category);
        synopsisTab.add(responsibility);
        //responsibility.add(lastModifiedTime, null);
        responsibility.addComponent(lastModifiedTime);
        synopsisTab.add(enteredBy);
        synopsisTab.add(workflowStatus);
        synopsisTab.add(priority);
        synopsisTab.add(type);
        synopsisTab.add(severity);
        synopsisTab.add(platform);
        synopsisTab.add(synopsis);
        synopsisTab.add(lastBuildTested);
        type.setBounds(new Rectangle(327, 4, 200, 56));
        workflowStatus.setBounds(new Rectangle(5, 4, 181, 56));
        priority.setBounds(new Rectangle(186, 4, 137, 56));
        severity.setBounds(new Rectangle(186, 58, 137, 56));
        platform.setBounds(new Rectangle(5, 58, 181, 56));
        externalReference.setBounds(new Rectangle(11, 118, 307, 37));
        component.setBounds(new Rectangle(11, 159, 307, 37));
        category.setBounds(new Rectangle(11, 201, 307, 37));
        synopsis.setBounds(new Rectangle(11, 242, 307, 127));
        responsibility.setBounds(new Rectangle(327, 187, 200, 74));
        addressedIn.setBounds(new Rectangle(327, 112, 200, 74));
        lastBuildTested.setBounds(new Rectangle(327, 58, 200, 56));
        enteredBy.setBounds(new Rectangle(327, 285, 200, 83));
        solutionTab.add(fix, null);
        solutionTab.add(workaround, null);
    }

    /**
     * Places the form in a frame for development-time convenience of seeing
     * the form "running".
     * 
     * @param args
     *                ignored
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // This shouldn't happen
            // Ignore and fall back
        } catch (Exception e) {
            // Ignore and fall back
        }
        JFrame f = new JFrame();
        ChangeRequestForm crform = new ChangeRequestForm();
        f.getContentPane().add(crform);
        f.pack();
        f.show();
    }

}