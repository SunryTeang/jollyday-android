//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 12:42:28 AM MEZ 
//


package de.galgtonold.jollydayandroid.config;

/**
 * <p>Java class for IslamicHolidayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IslamicHolidayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEWYEAR"/>
 *     &lt;enumeration value="ASCHURA"/>
 *     &lt;enumeration value="MAWLID_AN_NABI"/>
 *     &lt;enumeration value="LAILAT_AL_MIRAJ"/>
 *     &lt;enumeration value="LAILAT_AL_BARAT"/>
 *     &lt;enumeration value="RAMADAN"/>
 *     &lt;enumeration value="LAILAT_AL_QADR"/>
 *     &lt;enumeration value="ID_AL_FITR"/>
 *     &lt;enumeration value="ID_UL_ADHA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum IslamicHolidayType {

    NEWYEAR,
    ASCHURA,
    MAWLID_AN_NABI,
    LAILAT_AL_MIRAJ,
    LAILAT_AL_BARAT,
    RAMADAN,
    LAILAT_AL_QADR,
    ID_AL_FITR,
    ID_UL_ADHA;

    public String value() {
        return name();
    }

    public static IslamicHolidayType fromValue(String v) {
        return valueOf(v);
    }

}