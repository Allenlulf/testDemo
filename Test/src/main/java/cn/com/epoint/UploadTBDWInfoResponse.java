
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
 *         &lt;element name="UploadTBDWInfoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "uploadTBDWInfoResult"
})
@XmlRootElement(name = "UploadTBDWInfoResponse")
public class UploadTBDWInfoResponse {

    @XmlElement(name = "UploadTBDWInfoResult")
    protected boolean uploadTBDWInfoResult;

    /**
     * 获取uploadTBDWInfoResult属性的值。
     * 
     */
    public boolean isUploadTBDWInfoResult() {
        return uploadTBDWInfoResult;
    }

    /**
     * 设置uploadTBDWInfoResult属性的值。
     * 
     */
    public void setUploadTBDWInfoResult(boolean value) {
        this.uploadTBDWInfoResult = value;
    }

}
