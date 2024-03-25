package sample;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
	private Button button;
	
	@Override
	public void createPartControl(Composite parent) {
			button = 	new Button(parent,SWT.PUSH);
			button.setText("Button");
	}

	@Override
	public void setFocus() {
		button.setFocus();
	}
}