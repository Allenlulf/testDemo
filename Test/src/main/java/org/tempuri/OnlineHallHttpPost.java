package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2018-02-03T12:03:58.579+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "OnlineHallHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OnlineHallHttpPost {

    /**
     * <b><i>获取今日开标项目个数</i></b><br>
     *                                 <font color='blue'>string</font> CreateDateAfter: 时间<br>
     */
    @WebMethod(operationName = "GetTodayKBCountKBDT")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getTodayKBCountKBDT(
        @WebParam(partName = "CreateDateAfter", name = "CreateDateAfter", targetNamespace = "http://tempuri.org/")
        java.lang.String createDateAfter
    );

    /**
     * <b><i>招标代理、投标人登录</i></b><br>
     *                                 <font color='blue'>string</font> usertype: 用户类型<br>
     *                                 <font color='blue'>string</font> strDognum: 锁号(1：用户名登录，参数传空)<br>
     *                                 <font color='blue'>string</font> md5: 校验码(**strDognum ## MD5值)<br>
     */
    @WebMethod(operationName = "GetHuiYuanUserinfoKBDT")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getHuiYuanUserinfoKBDT(
        @WebParam(partName = "usertype", name = "usertype", targetNamespace = "http://tempuri.org/")
        java.lang.String usertype,
        @WebParam(partName = "strDognum", name = "strDognum", targetNamespace = "http://tempuri.org/")
        java.lang.String strDognum,
        @WebParam(partName = "md5", name = "md5", targetNamespace = "http://tempuri.org/")
        java.lang.String md5
    );

    /**
     * <b><i>获取单位今日所有开标项目</i></b><br>
     *                                 <font color='blue'>string</font> Danweiguid: 单位标识<br>
     *                                 <font color='blue'>string</font> Mima: 密码<br>
     */
    @WebMethod(operationName = "GetNJHWDanwei")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getNJHWDanwei(
        @WebParam(partName = "Danweiguid", name = "Danweiguid", targetNamespace = "http://tempuri.org/")
        java.lang.String danweiguid,
        @WebParam(partName = "Mima", name = "Mima", targetNamespace = "http://tempuri.org/")
        java.lang.String mima
    );

    /**
     * <b><i>工作人员登录</i></b><br>
     *                                 <font color='blue'>string</font> loginID: 用户名<br>
     *                                 <font color='blue'>string</font> loginKey: 密码(CA登录密码传空)<br>
     *                                 <font color='blue'>string</font> strDognum: 锁号(1：用户名登录，参数传空)<br>
     *                                 <font color='blue'>string</font> logintype: 登录方式(1：用户名，密码登录,2：CA登录)<br>
     *                                 <font color='blue'>string</font> md5: 校验码(**loginID## MD5值)<br>
     */
    @WebMethod(operationName = "GetFrameUserinfoKBDT")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getFrameUserinfoKBDT(
        @WebParam(partName = "loginID", name = "loginID", targetNamespace = "http://tempuri.org/")
        java.lang.String loginID,
        @WebParam(partName = "loginKey", name = "loginKey", targetNamespace = "http://tempuri.org/")
        java.lang.String loginKey,
        @WebParam(partName = "strDognum", name = "strDognum", targetNamespace = "http://tempuri.org/")
        java.lang.String strDognum,
        @WebParam(partName = "logintype", name = "logintype", targetNamespace = "http://tempuri.org/")
        java.lang.String logintype,
        @WebParam(partName = "md5", name = "md5", targetNamespace = "http://tempuri.org/")
        java.lang.String md5
    );

    /**
     * <b><i>获取标段信息</i></b><br>
     *                                 <font color='blue'>string</font> BiaoDuanGuid: 标段唯一标识<br>
     *                                 <font color='blue'>string</font> CreateDateAfter: 时间<br>
     *                                 <font color='blue'>string</font> md5: 校验码<br>
     *                                 <font color='blue'>string</font> DaiLiGuid: 代理GUID<br>
     */
    @WebMethod(operationName = "GetBiaoDuanKBDT")
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    public java.lang.String getBiaoDuanKBDT(
        @WebParam(partName = "BiaoDuanGuid", name = "BiaoDuanGuid", targetNamespace = "http://tempuri.org/")
        java.lang.String biaoDuanGuid,
        @WebParam(partName = "CreateDateAfter", name = "CreateDateAfter", targetNamespace = "http://tempuri.org/")
        java.lang.String createDateAfter,
        @WebParam(partName = "md5", name = "md5", targetNamespace = "http://tempuri.org/")
        java.lang.String md5,
        @WebParam(partName = "DaiLiGuid", name = "DaiLiGuid", targetNamespace = "http://tempuri.org/")
        java.lang.String daiLiGuid
    );
}