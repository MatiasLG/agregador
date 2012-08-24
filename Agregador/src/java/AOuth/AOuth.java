/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AOuth;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.netbeans.saas.google.GoogleAccountsService;
import org.netbeans.saas.RestResponse;

/**
 *
 * @author sebastian
 */
@WebService(serviceName = "AOuth")
public class AOuth {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        
        try {
            String accountType = null;
            String email = "";
            String passwd = "";
            String service = "";
            String source = null;

            RestResponse result = GoogleAccountsService.accountsClientLogin(accountType, email, passwd, service, source);
            //TODO - Uncomment the print Statement below to print result.
            //System.out.println("The SaasService returned: "+result.getDataAsString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Hello " + txt + " !";

    }
}
