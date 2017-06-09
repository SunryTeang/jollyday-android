//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 12:42:28 AM MEZ 
//


package de.galgtonold.jollydayandroid.config;

/**
 * <p>Java class for ChristianHolidayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChristianHolidayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GOOD_FRIDAY"/>
 *     &lt;enumeration value="EASTER_MONDAY"/>
 *     &lt;enumeration value="ASCENSION_DAY"/>
 *     &lt;enumeration value="WHIT_MONDAY"/>
 *     &lt;enumeration value="CORPUS_CHRISTI"/>
 *     &lt;enumeration value="MAUNDY_THURSDAY"/>
 *     &lt;enumeration value="ASH_WEDNESDAY"/>
 *     &lt;enumeration value="MARDI_GRAS"/>
 *     &lt;enumeration value="GENERAL_PRAYER_DAY"/>
 *     &lt;enumeration value="CLEAN_MONDAY"/>
 *     &lt;enumeration value="SHROVE_MONDAY"/>
 *     &lt;enumeration value="PENTECOST"/>
 *     &lt;enumeration value="CARNIVAL"/>
 *     &lt;enumeration value="EASTER_SATURDAY"/>
 *     &lt;enumeration value="EASTER_TUESDAY"/>
 *     &lt;enumeration value="SACRED_HEART"/>
 *     &lt;enumeration value="EASTER"/>
 *     &lt;enumeration value="PENTECOST_MONDAY"/>
 *     &lt;enumeration value="WHIT_SUNDAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum ChristianHolidayType {

    GOOD_FRIDAY,
    EASTER_MONDAY,
    ASCENSION_DAY,
    WHIT_MONDAY,
    CORPUS_CHRISTI,
    MAUNDY_THURSDAY,
    ASH_WEDNESDAY,
    MARDI_GRAS,
    GENERAL_PRAYER_DAY,
    CLEAN_MONDAY,
    SHROVE_MONDAY,
    PENTECOST,
    CARNIVAL,
    EASTER_SATURDAY,
    EASTER_TUESDAY,
    SACRED_HEART,
    EASTER,
    PENTECOST_MONDAY,
    WHIT_SUNDAY;

    public String value() {
        return name();
    }

    public static ChristianHolidayType fromValue(String v) {
        return valueOf(v);
    }

}
