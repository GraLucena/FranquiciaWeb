/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosweb;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Diego Alienware
 */
@WebService(serviceName = "ServicioWeb1")
public class ServicioWeb1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerfechadeldia")
    public String obtenerfechadeldia() {
        //TODO write your implementation code here:
        System.out.println("Hola mi rey");
        return new Date().toString() + " Que lo que";
    }
}
