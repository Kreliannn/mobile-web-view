package com.example.testprint;
import com.dantsu.escposprinter.EscPosPrinter;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    public WebAppInterface(Context context) {
        mContext = context;
    }

    @JavascriptInterface
    public void triggerPrint() {
        try {
            // Try to load the EscPosPrinter class
            Class.forName("com.dantsu.escposprinter.EscPosPrinter");
            Toast.makeText(mContext, "Library installed", Toast.LENGTH_SHORT).show();
        } catch (ClassNotFoundException e) {
            Toast.makeText(mContext, "Library NOT installed", Toast.LENGTH_SHORT).show();
        }
    }
}
