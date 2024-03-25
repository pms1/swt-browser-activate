package sample;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

abstract class BrowserView extends ViewPart {

	private final int flag;
	private int activated;
	private int deactivated;
	
	BrowserView(int flag) {
		this.flag = flag;
	}
	
	Browser browser;
	
	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, flag);
		browser.addListener(SWT.Activate, (event) -> {
			activated++;
			System.out.println(this + " activated=" + activated + " deactivated=" + deactivated + " browser=" + browser);
		});
		browser.addListener(SWT.Deactivate, (event) -> {
			deactivated++;
			System.out.println(this + " activated=" + activated + " deactivated=" + deactivated + " browser=" + browser);
		});
		
		browser.setText("<body><input id=button type=\"button\" value=\"Button\"></body>");
		
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}

}
