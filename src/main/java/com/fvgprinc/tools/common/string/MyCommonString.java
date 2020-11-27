package com.fvgprinc.tools.common.string;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class MyCommonString {

    public static final String EMPTYSTR = "";
    public static final char COMILLA_SENCILLA = '\'';
    public static final char COMILLA_DOBLE = '"';
    public static final char CHRBLANCO = ' ';
    public static final char CHRCR = '\r';
    public static final char CHRLF = '\n';
    public static final String LINEFEED = new StringBuilder().append( CHRCR).toString()  + 
                                          new StringBuilder().append( CHRLF).toString();

    public static String entreChar(String ps, char pc) {
        String chStr;

        chStr = Character.toString(pc);
        return chStr + ps + chStr;
    }

    public static String arrayListToStringRaw(ArrayList<String> paLstStr) {
        String res = EMPTYSTR;

        for (String elem : paLstStr) {
            res = res + elem + "\n";
        }
        return res;
    }

    public static String cnvInputStream2String(InputStream in) {
        String res = EMPTYSTR;
        byte[] buf = new byte[12 * 1000];

        int total = 0;
        while (true) {
            try {
                int numRead = in.read(buf, total, buf.length - total);
                if (numRead <= 0) {
                    break;
                }
                total += numRead;
            } catch (IOException ex) {
                Logger.getLogger(MyCommonString.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        byte[] finalBuf = new byte[total];
        System.arraycopy(buf, 0, finalBuf, 0, total);

        res = new String(finalBuf);
        return res;
    }

    public static String cnvSqlDateToString (java.sql.Date pd) {
        String res = MyCommonString.EMPTYSTR;
        
        SimpleDateFormat dateFormatDd_Mm_Yyyy = new SimpleDateFormat("dd-MM-yyyy");
        
        String strFec = dateFormatDd_Mm_Yyyy.format(pd);
        
        res = strFec;
        return res;
    }
    
    public static String cnvTimeStamp2String (java.sql.Timestamp pTimeStamp) {
                String res = MyCommonString.EMPTYSTR;
        
        SimpleDateFormat dateFormatDd_Mm_Yyyy = new SimpleDateFormat("dd-MM-yyyy");
        
        String strFec = dateFormatDd_Mm_Yyyy.format(pTimeStamp);
        
        res = strFec;
        return res;

    }
    
}
