package jtechlog.mytexentask;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.texen.ant.TexenTask;
import org.apache.velocity.context.Context;

public class MyTexenTask extends TexenTask {

    private static final String FORMAT = "yyyy MMMM dd. hh:mm";

    private static final Locale HU = new Locale("hu", "HU");

    protected void populateInitialContext(Context context)
            throws Exception {
        DateFormat df = new SimpleDateFormat(FORMAT, HU);
        context.put("dateOfGeneration", df.format(new Date()));
    }

}