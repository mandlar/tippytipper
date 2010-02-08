package net.mandaria;

import android.app.*;

public class TippyTipperApplication extends Application {
	private String BillAmount = "";

    public String getBillAmount() {
        return BillAmount;
    }

    public void setBillAmmount(String BillAmmunt) {
        this.BillAmount = BillAmmunt;
    }

}
