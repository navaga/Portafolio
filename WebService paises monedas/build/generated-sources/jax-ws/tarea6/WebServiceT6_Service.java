
package tarea6;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "webServiceT6", targetNamespace = "http://tarea6/", wsdlLocation = "http://localhost:8080/ServicioWebT4/webServiceT6?wsdl")
public class WebServiceT6_Service
    extends Service
{

    private final static URL WEBSERVICET6_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICET6_EXCEPTION;
    private final static QName WEBSERVICET6_QNAME = new QName("http://tarea6/", "webServiceT6");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServicioWebT4/webServiceT6?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICET6_WSDL_LOCATION = url;
        WEBSERVICET6_EXCEPTION = e;
    }

    public WebServiceT6_Service() {
        super(__getWsdlLocation(), WEBSERVICET6_QNAME);
    }

    public WebServiceT6_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICET6_QNAME, features);
    }

    public WebServiceT6_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICET6_QNAME);
    }

    public WebServiceT6_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICET6_QNAME, features);
    }

    public WebServiceT6_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceT6_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceT6
     */
    @WebEndpoint(name = "webServiceT6Port")
    public WebServiceT6 getWebServiceT6Port() {
        return super.getPort(new QName("http://tarea6/", "webServiceT6Port"), WebServiceT6.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceT6
     */
    @WebEndpoint(name = "webServiceT6Port")
    public WebServiceT6 getWebServiceT6Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://tarea6/", "webServiceT6Port"), WebServiceT6.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICET6_EXCEPTION!= null) {
            throw WEBSERVICET6_EXCEPTION;
        }
        return WEBSERVICET6_WSDL_LOCATION;
    }

}
