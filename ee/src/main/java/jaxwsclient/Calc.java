
package jaxwsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Calc", targetNamespace = "http://toy.service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calc {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://toy.service/", className = "jaxwsclient.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://toy.service/", className = "jaxwsclient.AddResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://toy.service/", className = "jaxwsclient.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://toy.service/", className = "jaxwsclient.SubtractResponse")
    public int subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://toy.service/", className = "jaxwsclient.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://toy.service/", className = "jaxwsclient.MultiplyResponse")
    public int multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://toy.service/", className = "jaxwsclient.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://toy.service/", className = "jaxwsclient.DivideResponse")
    public int divide(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
