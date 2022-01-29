
package tarea6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPaisesMoneda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPaisesMoneda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDivisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaisesMoneda", propOrder = {
    "codigoDivisa"
})
public class GetPaisesMoneda {

    protected String codigoDivisa;

    /**
     * Obtiene el valor de la propiedad codigoDivisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDivisa() {
        return codigoDivisa;
    }

    /**
     * Define el valor de la propiedad codigoDivisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDivisa(String value) {
        this.codigoDivisa = value;
    }

}
