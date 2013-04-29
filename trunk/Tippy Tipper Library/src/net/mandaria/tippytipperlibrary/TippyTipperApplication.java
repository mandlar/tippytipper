package net.mandaria.tippytipperlibrary;

import net.mandaria.tippytipperlibrary.services.TipCalculatorService;
import android.app.Application;
import android.content.Context;

public class TippyTipperApplication extends Application {
	
	public TipCalculatorService service = new TipCalculatorService();
	
	// Use this variable to control if purchase links use Google PlayStore or Amazon Appstore 
	public final static boolean usePlayStoreLink = true;
	
	@Override
	public void onCreate() 
	{ 
		super.onCreate();
	}
	
	public static boolean isProVersion(Context context)
	{
		return context.getString(R.string.app_name).contains("donate");
	}
	
	public static String getPaidVersionLink()
	{
		String url = "";
		if(usePlayStoreLink)
			url = "https://play.google.com/store/apps/details?id=net.mandaria.tippytipperdonate";
		else
		// For Amazon Appstore
			url = "http://www.amazon.com/gp/mas/dl/android?p=net.mandaria.tippytipperdonate";
		return url;
	}
	
	public static int getApplicationID(Context context)
	{
		int applicationID = 2; // free - play store
		if(TippyTipperApplication.getPaidVersionLink().contains("amazon"))
			applicationID = 4; // free - amazon
		if(TippyTipperApplication.isProVersion(context))
			applicationID = 3; // pro - either store
		
		return applicationID;
	}
} 
