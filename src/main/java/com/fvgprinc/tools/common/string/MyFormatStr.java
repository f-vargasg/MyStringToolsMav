/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.common.string;

/**
 *
 * @author fvargas
 */
public class MyFormatStr {
    public static String getFormatNumberFixed (int pDataPrecision, int pScale,
                                               String pMilesSep, 
                                               String pDecialSep) {
        String res = MyCommonString.EMPTYSTR;
        String intPartFmt = MyCommonString.EMPTYSTR;
        String decPartFmt = MyCommonString.EMPTYSTR;
        
        for (int i = 0; i < pDataPrecision; i++) {
            intPartFmt += (((pDataPrecision - i) % 3 == 0 && i > 0) ? pMilesSep : MyCommonString.EMPTYSTR);
            intPartFmt += ((pDataPrecision - i) == 1  ? "0" : "#");
        }
        
        for (int i = 0; i < pScale; i++) {
            decPartFmt += "0";
        }
        res = intPartFmt + pDecialSep + decPartFmt;
        
        return res;
    }
}
