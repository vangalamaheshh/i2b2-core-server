//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 02:55:54 PM EDT 
//


package edu.harvard.i2b2.crc.loader.datavo.loader.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for missing_codes_modifier_setType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="missing_codes_modifier_setType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifier" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modifier_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="missing_total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "missing_codes_modifier_setType", propOrder = {
    "modifier"
})
public class MissingCodesModifierSetType {

    @XmlElement(required = true)
    protected List<MissingCodesModifierSetType.Modifier> modifier;

    /**
     * Gets the value of the modifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingCodesModifierSetType.Modifier }
     * 
     * 
     */
    public List<MissingCodesModifierSetType.Modifier> getModifier() {
        if (modifier == null) {
            modifier = new ArrayList<MissingCodesModifierSetType.Modifier>();
        }
        return this.modifier;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="modifier_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="missing_total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modifierCd"
    })
    public static class Modifier {

        @XmlElement(name = "modifier_cd", required = true)
        protected String modifierCd;
        @XmlAttribute(name = "missing_total")
        protected Integer missingTotal;

        /**
         * Gets the value of the modifierCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierCd() {
            return modifierCd;
        }

        /**
         * Sets the value of the modifierCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierCd(String value) {
            this.modifierCd = value;
        }

        /**
         * Gets the value of the missingTotal property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMissingTotal() {
            return missingTotal;
        }

        /**
         * Sets the value of the missingTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMissingTotal(Integer value) {
            this.missingTotal = value;
        }

    }

}
