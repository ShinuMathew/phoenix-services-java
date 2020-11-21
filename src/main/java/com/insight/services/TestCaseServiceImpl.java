package com.insight.services;
import java.util.ArrayList;
import java.util.List;

import com.insight.dao.TestCaseDAO;
import com.insight.pojo.resources.*;

public class TestCaseServiceImpl 
{
	
	public List<TestCasePOJO> getAllTestCasesServiceImpl()
	{
		TestCaseDAO tcdao = new TestCaseDAO();
		
		return tcdao.getAllTestCasesDAO();
	}
	
	public List<TestCasePOJO> getTestCaseServiceImpl(int tcid)
	{
		TestCaseDAO tcdao = new TestCaseDAO();
		
		return tcdao.getTestCasesDAO(tcid);
	}
	
}
