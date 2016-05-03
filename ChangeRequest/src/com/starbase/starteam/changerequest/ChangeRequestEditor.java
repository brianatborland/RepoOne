package com.starbase.starteam.changerequest;

import com.starbase.starteam.starflow.AbstractItemEditor;
import javax.swing.JComponent;

public class ChangeRequestEditor
        extends AbstractItemEditor {

    /**
     * Returns the component that the user interacts with to edit the
     * properties of the item.  This component will be placed in a
     * container which will notify the
     * <CODE>ItemPropertyEditor</CODE>-derived and
     * <CODE>ItemDisplayListener</CODE>-implementing components which
     * <CODE>Item</CODE> is being edited, when the item is being
     * saved, when the modifications have been cancelled by the user,
     * etc. via the automatic propagation of events.
     */
    public JComponent createForm() {
        return new ChangeRequestForm();
    }
}
