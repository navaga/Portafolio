
package tarea6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pais complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoBandera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoDivisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoNic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idArea" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pais", propOrder = {
    "codigoBandera",
    "codigoDivisa",
    "codigoNic",
    "id",
    "idArea",
    "nombre"
})
public class Pais {

    protected String codigoBandera;
    protected String codigoDivisa;
    protected String codigoNic;
    protected long id;
    protected long idArea;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad codigoBandera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBandera() {
        return codigoBandera;
    }

    /**
     * Define el valor de la propiedad codigoBandera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBandera(String value) {
        this.codigoBandera = value;
    }

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

    /**
     * Obtiene el valor de la propiedad codigoNic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNic() {
        return codigoNic;
    }

    /**
     * Define el valor de la propiedad codigoNic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNic(String value) {
        this.codigoNic = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idArea.
     * 
     */
    public long getIdArea() {
        return idArea;
    }

    /**
     * Define el valor de la propiedad idArea.
     * 
     */
    public void setIdArea(long value) {
        this.idArea = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
