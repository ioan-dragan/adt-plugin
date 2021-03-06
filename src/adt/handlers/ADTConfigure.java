package adt.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.jface.dialogs.InputDialog;
import adt.NewSuperCategoryDialog;
import adt.MyComposite;
/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ADTConfigure extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		/*
		MessageDialog.openInformation(
				window.getShell(),
				"Titlu",
				"Configured ADT");
		
		
		*/
		
		NewSuperCategoryDialog dialog = new NewSuperCategoryDialog(window.getShell());
		dialog.create();
		
		if (dialog.open() == Window.OK){
			System.out.println(dialog.getFirstName());
			System.out.println(dialog.getLastName());
		}
		
		return null;
	}
}
