/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fvgprinc.tools.string;

/**
 *
 * @author fvargas
 */
public class EscCharacters {

        private final String CharXml;
        private final String EscCharXml;

        public String getCharXml() {
            return CharXml;
        }

        public String getEscCharXml() {
            return EscCharXml;
        }

        public EscCharacters(String CharXml, String EscCharXml) {
            this.CharXml = CharXml;
            this.EscCharXml = EscCharXml;
        }

}
