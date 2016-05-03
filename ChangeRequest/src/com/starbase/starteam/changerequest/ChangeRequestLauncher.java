package com.starbase.starteam.changerequest;

import java.awt.Window;
import java.io.IOException;

import javax.swing.JComponent;

import com.starbase.starteam.Item;
import com.starbase.starteam.starflow.BasicLauncher;

public class ChangeRequestLauncher
        extends BasicLauncher {

  /**
   * Returns the component that the user interacts with to edit the
   * properties of the item.  This component will be placed in a
   * <CODE>DefaultNavigatorPanel</CODE> which will notify the
   * <CODE>ItemPropertyEditor</CODE>-derived and
   * <CODE>ItemDisplayListener</CODE>-implementing components which
   * <CODE>Item</CODE> is being edited, when the item is being
   * saved, when the modifications have been cancelled by the user,
   * etc. via the automatic propagation of events.
   */
  public JComponent createForm() {
    return new ChangeRequestForm();
  }

  /**
   * Specifies the type of <CODE>Item</CODE>s this editor can edit.
   * This is not used when run under a client that passes in the
   * <CODE>Item</CODE> instances to be edited.  It is only used when
   * the editor is invoked through the command line by a client
   * (such as the Win32 client) that does not internally use the
   * StarTeam SDK.
   */
  public String getTypeName() {
    return "ChangeRequest";
  }

  /**
   * This entry point is called by clients that are not StarTeam SDK-based.
   * Command line arguments describe which items are to be added/edited
   * and the superclass loads the StarTeam objects to be edited by the form.
   */
  public static void main(String[] args) {
    ChangeRequestLauncher launcher = new ChangeRequestLauncher();
    launcher.runWithCommandLineArgs(args);
  }
    
  /**
   * This entry point is called by clients that are StarTeam SDK-based.  The 
   * StarTeam objects are used directly by the form.
   */
  public static void main(Window window,
                          Item[] items,
                          int firstItemIndex,
                          boolean isHistoryItem) throws IOException {
    ChangeRequestLauncher launcher = new ChangeRequestLauncher();
    launcher.runWithObjectArgs(window, items, firstItemIndex, isHistoryItem);
  }

}
/* Ignore -- this comment may be deleted
 * Local variables:
 * c-basic-offset: 2
 * End:
 */
