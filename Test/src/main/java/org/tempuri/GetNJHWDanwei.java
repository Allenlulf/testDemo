
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Danweiguid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "danweiguid",
    "mima"
})
@XmlRootElement(name = "GetNJHWDanwei")
public class GetNJHWDanwei {

    @XmlElement(name = "Danweiguid")
    protected String danweiguid;
    @XmlElement(name = "Mima")
    protected String mima;

    /**
     * 获取danweiguid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanweiguid() {
        return danweiguid;
    }

    /**
     * 设置danweiguid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanweiguid(String value) {
        this.danweiguid = value;
    }

    /**
     * 获取mima属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMima() {
        return mima;
    }

    /**
     * 设置mima属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMima(String value) {
        this.mima = value;
    }

}
