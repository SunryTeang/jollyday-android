//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 12:42:28 AM MEZ 
//


package de.galgtonold.jollydayandroid.config;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;


/**
 * <p>Java class for FixedWeekdayRelativeToFixed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedWeekdayRelativeToFixed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/Holiday}Holiday">
 *       &lt;sequence>
 *         &lt;element name="day" type="{http://www.example.org/Holiday}Fixed"/>
 *       &lt;/sequence>
 *       &lt;attribute name="which" type="{http://www.example.org/Holiday}Which" />
 *       &lt;attribute name="weekday" type="{http://www.example.org/Holiday}Weekday" />
 *       &lt;attribute name="when" type="{http://www.example.org/Holiday}When" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class FixedWeekdayRelativeToFixed
    extends Holiday
{

    @Element
    protected Fixed day;
    @Attribute
    protected Which which;
    @Attribute
    protected Weekday weekday;
    @Attribute
    protected When when;

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Fixed }
     *     
     */
    public Fixed getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fixed }
     *     
     */
    public void setDay(Fixed value) {
        this.day = value;
    }

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
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link When }
     *     
     */
    public When getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link When }
     *     
     */
    public void setWhen(When value) {
        this.when = value;
    }

}
