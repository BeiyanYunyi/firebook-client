package store.firebook.swv;

import android.content.Context;
import android.webkit.JavascriptInterface;

public class WebAppInterface {
	Context mContext;
	String currUrl = "";

	WebAppInterface(Context c) {
		mContext = c;
	}

	@JavascriptInterface
	public void setCurrUrl(String newUrl) {
		this.currUrl = newUrl;
	}

	@JavascriptInterface
	public String getAppVersion() {
		return "1.0.0";
	}
}
