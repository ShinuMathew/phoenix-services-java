package com.insight.controller;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.insight.pojo.resources.*;
import com.insight.services.TestCaseServiceImpl;
import com.insight.variables.CommonVariables;

@Path("testcases")
public class TestCases 
{	
	TestCaseServiceImpl testcaseAPIimpl = new TestCaseServiceImpl();
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})	
	public List<TestCasePOJO> getAllTestCases()
	{
		return testcaseAPIimpl.getAllTestCasesServiceImpl();		
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Path("/{testcaseid}")
	public List<TestCasePOJO> getTestCase(@PathParam("testcaseid") int tcid)
	{		
		return testcaseAPIimpl.getTestCaseServiceImpl(tcid);
		
	}
	
	/*@POST
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public ResponseBuilder createTestCase(@QueryParam("tcid") int tcid, @QueryParam("tcname") int tcname, @QueryParam("tcdesc") int tcdesc, @QueryParam("tcdesc") int tcstatus)
	{	
		return Response.status(200);
		
	}*/
}