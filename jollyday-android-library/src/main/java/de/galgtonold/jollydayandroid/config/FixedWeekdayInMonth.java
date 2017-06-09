//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 12:42:28 AM MEZ 
//


package de.galgtonold.jollydayandroid.config;

import org.simpleframework.xml.Attribute;


/**
 * <p>Java class for FixedWeekdayInMonth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FixedWeekdayInMonth">
 *   <complexContent>
 *     <extension base="{http://www.example.org/Holiday}Holiday">
 *       <attribute name="which" type="{http://www.example.org/Holiday}Which" />
 *       <attribute name="weekday" type="{http://www.example.org/Holiday}Weekday" />
 *       <attribute name="month" type="{http://www.example.org/Holiday}Month" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
public class FixedWeekdayInMonth
    extends Holiday
{

    @Attribute
    protected Which which;
    @Attribute
    protected Weekday weekday;
    @Attribute
    protected Month month;

    /**
     * Gets the value of the which property.
     * 
     * @return
     *     possible object is
     *     {@link Which }
     *     
     */
    public Which getWhich() {
        return which;
    }

    /**
     * Sets the value of the which property.
     * 
     * @param value
     *     allowed object is
     *     {@link Which }
     *     
     */
    public void setWhich(Which value) {
        this.which = value;
    }

    /**
     * Gets the value of the weekday property.
     * 
     * @return
     *     possible object is
     *     {@link Weekday }
     *     
     */
    public Weekday getWeekday() {
        return weekday;
    }

    /**
     * Sets the value of the weekday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weekday }
     *     
     */
    public void setWeekday(Weekday value) {
        this.weekday = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Month }
     *     
     */
    public Month getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Month }
     *     
     */
    public void setMonth(Month value) {
        this.month = value;
    }

}
