
package org.me.ikarus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.ikarus package. 
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

    private final static QName _GET_QNAME = new QName("http://ikarus.me.org/", "GET");
    private final static QName _HelloResponse_QNAME = new QName("http://ikarus.me.org/", "helloResponse");
    private final static QName _DELETEResponse_QNAME = new QName("http://ikarus.me.org/", "DELETEResponse");
    private final static QName _DELETE_QNAME = new QName("http://ikarus.me.org/", "DELETE");
    private final static QName _STOREResponse_QNAME = new QName("http://ikarus.me.org/", "STOREResponse");
    private final static QName _Hello_QNAME = new QName("http://ikarus.me.org/", "hello");
    private final static QName _GETResponse_QNAME = new QName("http://ikarus.me.org/", "GETResponse");
    private final static QName _STORE_QNAME = new QName("http://ikarus.me.org/", "STORE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.ikarus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link STOREResponse }
     * 
     */
    public STOREResponse createSTOREResponse() {
        return new STOREResponse();
    }

    /**
     * Create an instance of {@link DELETE }
     * 
     */
    public DELETE createDELETE() {
        return new DELETE();
    }

    /**
     * Create an instance of {@link DELETEResponse }
     * 
     */
    public DELETEResponse createDELETEResponse() {
        return new DELETEResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GET }
     * 
     */
    public GET createGET() {
        return new GET();
    }

    /**
     * Create an instance of {@link STORE }
     * 
     */
    public STORE createSTORE() {
        return new STORE();
    }

    /**
     * Create an instance of {@link GETResponse }
     * 
     */
    public GETResponse createGETResponse() {
        return new GETResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GET }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "GET")
    public JAXBElement<GET> createGET(GET value) {
        return new JAXBElement<GET>(_GET_QNAME, GET.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DELETEResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "DELETEResponse")
    public JAXBElement<DELETEResponse> createDELETEResponse(DELETEResponse value) {
        return new JAXBElement<DELETEResponse>(_DELETEResponse_QNAME, DELETEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DELETE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "DELETE")
    public JAXBElement<DELETE> createDELETE(DELETE value) {
        return new JAXBElement<DELETE>(_DELETE_QNAME, DELETE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STOREResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "STOREResponse")
    public JAXBElement<STOREResponse> createSTOREResponse(STOREResponse value) {
        return new JAXBElement<STOREResponse>(_STOREResponse_QNAME, STOREResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "GETResponse")
    public JAXBElement<GETResponse> createGETResponse(GETResponse value) {
        return new JAXBElement<GETResponse>(_GETResponse_QNAME, GETResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STORE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "STORE")
    public JAXBElement<STORE> createSTORE(STORE value) {
        return new JAXBElement<STORE>(_STORE_QNAME, STORE.class, null, value);
    }

}
