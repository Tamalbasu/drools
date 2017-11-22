package com.drools.webservices;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.drools.dto.Attributes;
import com.drools.dto.Response;
import com.drools.dto.UserAttributes;



/**
 * Webservice class to process the request and return the response in json
 * format
 * 
 * @author tabasu
 *
 */
@Path("drools")
public class DroolsWebservice {

	private final Logger LOGGER = LoggerFactory
			.getLogger(DroolsWebservice.class);

	/**
	 * POST method to process the input json request and return json response
	 * 
	 * @param request
	 * @return response
	 * @throws IOException
	 */

	@GET
	@Path("/GetUserProfile")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Attributes getKieSession(@Context HttpHeaders headers,
			@QueryParam("id") String id,
			@QueryParam("type") String type,
			@QueryParam("clientAppId") String clientAppId
			)
			throws IOException {
		//long currentTimeMillis = System.currentTimeMillis();
		LOGGER.info("Before invoking the service");
		
		Attributes request=new Attributes(id, type, clientAppId);
		

		try {
            // load up the knowledge base
			 KieServices ks = KieServices.Factory.get();
	    	    KieContainer kContainer = ks.getKieClasspathContainer();
	        	KieSession kSession = kContainer.newKieSession("ksession-rules");
	        	/*​ReleaseId releaseId1 = ks.newReleaseId( "com.cisco.container.webservices", "myartifact", "1.0-SNAPSHOT" );
	        	​KieContainer kContainer1 = ks.newKieContainer( releaseId1 );
	        	​KieScanner kScanner = ks.newKieScanner( kContainer1 );
                */
	        	
	        	//kScanner.scanNow();

	        
	        	System.out.println("add");
	        	kSession.insert(request);
	        	
	        	
	        	
	            kSession.fireAllRules();
	            
        } catch (Throwable t) {
            t.printStackTrace();
        }
		return request;
	}
	
	
	@GET
	@Path("/AddUserProfile")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public UserAttributes getKieSession2(@Context HttpHeaders headers,
			@QueryParam("id") String id, @QueryParam("type") String type,
			@QueryParam("loggedId") String loggedId) throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		LOGGER.info("Before invoking the service");

		UserAttributes request = new UserAttributes(id, type, loggedId);

		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			kSession.insert(request);
			kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return request;
	}
	

	@GET
	@Path("/ContractCCOID")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getKieSession1(@Context HttpHeaders headers,
			@QueryParam("id") String id,
			
			@QueryParam("clientAppId") String clientAppId
			)
			throws IOException {
		//long currentTimeMillis = System.currentTimeMillis();
		LOGGER.info("Before invoking the service");
		
		Attributes request=new Attributes(id,"", clientAppId);
		Response response=new Response();
		   response.setReasonCode(6);

		try {
            // load up the knowledge base
			 KieServices ks = KieServices.Factory.get();
	    	    KieContainer kContainer = ks.getKieClasspathContainer();
	        	KieSession kSession = kContainer.newKieSession("ksession-rules");

	        
	            kSession.insert(request);
	            kSession.insert(response);
	            kSession.fireAllRules();
	            
        } catch (Throwable t) {
            t.printStackTrace();
        }
		return response;
	}
	

	@GET
	@Path("/ContractSerialNumber")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getContractsCCOID(@Context HttpHeaders headers,
			@QueryParam("id") String id,
			@QueryParam("clientAppId") String clientAppId) throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		LOGGER.info("Before invoking the service");
		Attributes request = new Attributes(id, "", clientAppId);
		Response response = new Response();
		response.setReasonCode(5);

		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			kSession.insert(request);
			kSession.insert(response);
			kSession.fireAllRules();

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return response;
	}
	
	@GET
	@Path("/ProductByCCOID")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getProductByCCOID(@Context HttpHeaders headers,
			@QueryParam("id") String id,
			@QueryParam("clientAppId") String clientAppId) throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		LOGGER.info("Before invoking the service");
		Attributes request = new Attributes(id, "", clientAppId);
		Response response = new Response();
		response.setReasonCode(3);

		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			kSession.insert(request);
			kSession.insert(response);
			kSession.fireAllRules();

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return response;
	}



}
