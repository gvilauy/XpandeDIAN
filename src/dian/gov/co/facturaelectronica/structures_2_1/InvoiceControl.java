//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.28 at 09:51:24 AM UYT 
//


package dian.gov.co.facturaelectronica.structures_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.NumericType;


/**
 * Datos Resolución de Numeración de Facturas
 * 
 * <p>Java class for InvoiceControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceAuthorization" type="{urn:oasis:names:specification:ubl:schema:xsd:UnqualifiedDataTypes-2}NumericType"/>
 *         &lt;element name="AuthorizationPeriod" type="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PeriodType"/>
 *         &lt;element name="AuthorizedInvoices" type="{dian:gov:co:facturaelectronica:Structures-2-1}AuthrorizedInvoices"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceControl", propOrder = {
    "invoiceAuthorization",
    "authorizationPeriod",
    "authorizedInvoices"
})
public class InvoiceControl {

    @XmlElement(name = "InvoiceAuthorization", required = true)
    protected NumericType invoiceAuthorization;
    @XmlElement(name = "AuthorizationPeriod", required = true)
    protected PeriodType authorizationPeriod;
    @XmlElement(name = "AuthorizedInvoices", required = true)
    protected AuthrorizedInvoices authorizedInvoices;

    /**
     * Gets the value of the invoiceAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getInvoiceAuthorization() {
        return invoiceAuthorization;
    }

    /**
     * Sets the value of the invoiceAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setInvoiceAuthorization(NumericType value) {
        this.invoiceAuthorization = value;
    }

    /**
     * Gets the value of the authorizationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getAuthorizationPeriod() {
        return authorizationPeriod;
    }

    /**
     * Sets the value of the authorizationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setAuthorizationPeriod(PeriodType value) {
        this.authorizationPeriod = value;
    }

    /**
     * Gets the value of the authorizedInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link AuthrorizedInvoices }
     *     
     */
    public AuthrorizedInvoices getAuthorizedInvoices() {
        return authorizedInvoices;
    }

    /**
     * Sets the value of the authorizedInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthrorizedInvoices }
     *     
     */
    public void setAuthorizedInvoices(AuthrorizedInvoices value) {
        this.authorizedInvoices = value;
    }

}
