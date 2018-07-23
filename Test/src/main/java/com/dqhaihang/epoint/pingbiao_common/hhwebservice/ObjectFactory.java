
package com.dqhaihang.epoint.pingbiao_common.hhwebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dqhaihang.epoint.pingbiao_common.hhwebservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllHuiQianInfo_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getAllHuiQianInfo");
    private final static QName _GetAllHuiQianInfoResponse_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getAllHuiQianInfoResponse");
    private final static QName _GetHuiQianInfo_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getHuiQianInfo");
    private final static QName _GetHuiQianInfoResponse_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getHuiQianInfoResponse");
    private final static QName _GetHuiQianLunCi_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getHuiQianLunCi");
    private final static QName _GetHuiQianLunCiResponse_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getHuiQianLunCiResponse");
    private final static QName _GetPBResult_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getPBResult");
    private final static QName _GetPBResultResponse_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "getPBResultResponse");
    private final static QName _IsSynPW_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "isSynPW");
    private final static QName _IsSynPWResponse_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "isSynPWResponse");
    private final static QName _SynchronousAllInfo_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "synchronousAllInfo");
    private final static QName _SynchronousAllInfoResponse_QNAME = new QName("http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", "synchronousAllInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dqhaihang.epoint.pingbiao_common.hhwebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllHuiQianInfo }
     * 
     */
    public GetAllHuiQianInfo createGetAllHuiQianInfo() {
        return new GetAllHuiQianInfo();
    }

    /**
     * Create an instance of {@link GetAllHuiQianInfoResponse }
     * 
     */
    public GetAllHuiQianInfoResponse createGetAllHuiQianInfoResponse() {
        return new GetAllHuiQianInfoResponse();
    }

    /**
     * Create an instance of {@link GetHuiQianInfo }
     * 
     */
    public GetHuiQianInfo createGetHuiQianInfo() {
        return new GetHuiQianInfo();
    }

    /**
     * Create an instance of {@link GetHuiQianInfoResponse }
     * 
     */
    public GetHuiQianInfoResponse createGetHuiQianInfoResponse() {
        return new GetHuiQianInfoResponse();
    }

    /**
     * Create an instance of {@link GetHuiQianLunCi }
     * 
     */
    public GetHuiQianLunCi createGetHuiQianLunCi() {
        return new GetHuiQianLunCi();
    }

    /**
     * Create an instance of {@link GetHuiQianLunCiResponse }
     * 
     */
    public GetHuiQianLunCiResponse createGetHuiQianLunCiResponse() {
        return new GetHuiQianLunCiResponse();
    }

    /**
     * Create an instance of {@link GetPBResult }
     * 
     */
    public GetPBResult createGetPBResult() {
        return new GetPBResult();
    }

    /**
     * Create an instance of {@link GetPBResultResponse }
     * 
     */
    public GetPBResultResponse createGetPBResultResponse() {
        return new GetPBResultResponse();
    }

    /**
     * Create an instance of {@link IsSynPW }
     * 
     */
    public IsSynPW createIsSynPW() {
        return new IsSynPW();
    }

    /**
     * Create an instance of {@link IsSynPWResponse }
     * 
     */
    public IsSynPWResponse createIsSynPWResponse() {
        return new IsSynPWResponse();
    }

    /**
     * Create an instance of {@link SynchronousAllInfo }
     * 
     */
    public SynchronousAllInfo createSynchronousAllInfo() {
        return new SynchronousAllInfo();
    }

    /**
     * Create an instance of {@link SynchronousAllInfoResponse }
     * 
     */
    public SynchronousAllInfoResponse createSynchronousAllInfoResponse() {
        return new SynchronousAllInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHuiQianInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getAllHuiQianInfo")
    public JAXBElement<GetAllHuiQianInfo> createGetAllHuiQianInfo(GetAllHuiQianInfo value) {
        return new JAXBElement<GetAllHuiQianInfo>(_GetAllHuiQianInfo_QNAME, GetAllHuiQianInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHuiQianInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getAllHuiQianInfoResponse")
    public JAXBElement<GetAllHuiQianInfoResponse> createGetAllHuiQianInfoResponse(GetAllHuiQianInfoResponse value) {
        return new JAXBElement<GetAllHuiQianInfoResponse>(_GetAllHuiQianInfoResponse_QNAME, GetAllHuiQianInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHuiQianInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getHuiQianInfo")
    public JAXBElement<GetHuiQianInfo> createGetHuiQianInfo(GetHuiQianInfo value) {
        return new JAXBElement<GetHuiQianInfo>(_GetHuiQianInfo_QNAME, GetHuiQianInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHuiQianInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getHuiQianInfoResponse")
    public JAXBElement<GetHuiQianInfoResponse> createGetHuiQianInfoResponse(GetHuiQianInfoResponse value) {
        return new JAXBElement<GetHuiQianInfoResponse>(_GetHuiQianInfoResponse_QNAME, GetHuiQianInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHuiQianLunCi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getHuiQianLunCi")
    public JAXBElement<GetHuiQianLunCi> createGetHuiQianLunCi(GetHuiQianLunCi value) {
        return new JAXBElement<GetHuiQianLunCi>(_GetHuiQianLunCi_QNAME, GetHuiQianLunCi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHuiQianLunCiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getHuiQianLunCiResponse")
    public JAXBElement<GetHuiQianLunCiResponse> createGetHuiQianLunCiResponse(GetHuiQianLunCiResponse value) {
        return new JAXBElement<GetHuiQianLunCiResponse>(_GetHuiQianLunCiResponse_QNAME, GetHuiQianLunCiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPBResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getPBResult")
    public JAXBElement<GetPBResult> createGetPBResult(GetPBResult value) {
        return new JAXBElement<GetPBResult>(_GetPBResult_QNAME, GetPBResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPBResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "getPBResultResponse")
    public JAXBElement<GetPBResultResponse> createGetPBResultResponse(GetPBResultResponse value) {
        return new JAXBElement<GetPBResultResponse>(_GetPBResultResponse_QNAME, GetPBResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsSynPW }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "isSynPW")
    public JAXBElement<IsSynPW> createIsSynPW(IsSynPW value) {
        return new JAXBElement<IsSynPW>(_IsSynPW_QNAME, IsSynPW.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsSynPWResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "isSynPWResponse")
    public JAXBElement<IsSynPWResponse> createIsSynPWResponse(IsSynPWResponse value) {
        return new JAXBElement<IsSynPWResponse>(_IsSynPWResponse_QNAME, IsSynPWResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynchronousAllInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "synchronousAllInfo")
    public JAXBElement<SynchronousAllInfo> createSynchronousAllInfo(SynchronousAllInfo value) {
        return new JAXBElement<SynchronousAllInfo>(_SynchronousAllInfo_QNAME, SynchronousAllInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynchronousAllInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HHWebService.PingBiao_Common.epoint.dqhaihang.com/", name = "synchronousAllInfoResponse")
    public JAXBElement<SynchronousAllInfoResponse> createSynchronousAllInfoResponse(SynchronousAllInfoResponse value) {
        return new JAXBElement<SynchronousAllInfoResponse>(_SynchronousAllInfoResponse_QNAME, SynchronousAllInfoResponse.class, null, value);
    }

}
