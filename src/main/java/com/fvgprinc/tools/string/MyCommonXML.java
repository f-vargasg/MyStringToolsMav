/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.tools.string;

/**
 *
 * @author fvargas
 */
public final class MyCommonXML {

    // Escape chacraters for XML
    public static final String QUOTEESCXML = "&quot;";
    public static final String APOSTROPHEESCXML = "&apos;";
    public static final String AMPERSANDESCXML = "&amp;";
    public static final String LESSTHANESCXML = "&lt;";
    public static final String GREATERTHANESCXML = "&gt;";
    public static final EscCharacters EscCharacter[] = {
        new EscCharacters("\"", QUOTEESCXML),
        new EscCharacters("'", APOSTROPHEESCXML),
        new EscCharacters("&", AMPERSANDESCXML),
        new EscCharacters("<", LESSTHANESCXML),
        new EscCharacters(">", GREATERTHANESCXML)
    };

    /**
     * Replace xml no escape strings to xml escape characters
     * @param str
     */

    public static String fixStrToXmlContent (String str) {
        String res = str;

        for (int i = 0; i < EscCharacter.length; i++) {
            res = res.replaceAll(EscCharacter[i].getCharXml(), EscCharacter[i].getEscCharXml() );
        }
        return res;
    }

    public static String fixXmlContentToStr (String xmlContent) {
         String res = xmlContent;

        for (int i = 0; i < EscCharacter.length; i++) {
            res = res.replaceAll(EscCharacter[i].getEscCharXml(), EscCharacter[i].getCharXml());
        }
        return res;
    }


}
