
package cn.com.epoint;

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
 *         &lt;element name="BJGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttachConName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsQianZhang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "bjGuid",
    "attachConName",
    "isQianZhang"
})
@XmlRootElement(name = "UpdateBJQianZhangInfo")
public class UpdateBJQianZhangInfo {

    @XmlElement(name = "BJGuid")
    protected String bjGuid;
    @XmlElement(name = "AttachConName")
    protected String attachConName;
    @XmlElement(name = "IsQianZhang")
    protected String isQianZhang;

    /**
     * 获取bjGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBJGuid() {
        return bjGuid;
    }

    /**
     * 设置bjGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBJGuid(String value) {
        this.bjGuid = value;
    }

    /**
     * 获取attachConName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachConName() {
        return attachConName;
    }

    /**
     * 设置attachConName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachConName(String value) {
        this.attachConName = value;
    }

    /**
     * 获取isQianZhang属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsQianZhang() {
        return isQianZhang;
    }

    /**
     * 设置isQianZhang属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsQianZhang(String value) {
        this.isQianZhang = value;
    }

}
