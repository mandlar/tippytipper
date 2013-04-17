  package net.mandaria.tippytipperlibrary;

import net.mandaria.tippytipperlibrary.services.TipCalculatorService;
import android.app.*;

public class TippyTipperApplication extends Application {
	
	public TipCalculatorService service = new TipCalculatorService();
	
	
	@Override
	public void onCreate() 
	{ 
		super.onCreate();
	}
} 
