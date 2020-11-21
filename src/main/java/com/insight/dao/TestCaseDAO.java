package com.insight.dao;

import java.util.ArrayList;
import java.util.List;

import com.insight.dbconnector.DBConnector;
import com.insight.variables.CommonVariables;
import com.insight.pojo.resources.*;

public class TestCaseDAO {

	public DBConnector db = new DBConnector();
	public CommonVariables cv = new CommonVariables();

	public List<TestCasePOJO> getAllTestCasesDAO() {
		List<TestCasePOJO> lstTC = new ArrayList<TestCasePOJO>();
		try {
			String query = "select * from testcase";

			db.openDBConnection();
			cv.rs = db.executeQuery(query);

			while (cv.rs.next()) {
				lstTC.add(new TestCasePOJO(Integer.parseInt(cv.rs.getString("TCID")), cv.rs.getString("TCNAME"),
						cv.rs.getString("TCDESC"), cv.rs.getString("CREATEDDATE"), cv.rs.getString("MODIFIEDDATE"),
						cv.rs.getString("TCSTATUS")));
			}

			db.closeAllConnection();
			return lstTC;
		} catch (Exception e) {

			System.out.println("Following excepiton occured when running getAllTestCasesDAO()");
			e.printStackTrace();
			return lstTC;
		}
	}

	public List<TestCasePOJO> getTestCasesDAO(int tcid) {
		List<TestCasePOJO> lstTC = new ArrayList<TestCasePOJO>();
		try {
			String query = "select * from testcase where TCID= {tcid}";

			String tcID = Integer.toString(tcid);
			query = query.replace("{tcid}", tcID);

			db.openDBConnection();
			cv.rs = db.executeQuery(query);

			while (cv.rs.next()) {
				lstTC.add(new TestCasePOJO(Integer.parseInt(cv.rs.getString("TCID")), cv.rs.getString("TCNAME"),
						cv.rs.getString("TCDESC"), cv.rs.getString("CREATEDDATE"), cv.rs.getString("MODIFIEDDATE"),
						cv.rs.getString("TCSTATUS")));
			}

			db.closeAllConnection();
			return lstTC;
		} catch (Exception e) {

			System.out.println("Following excepiton occured when running getAllTestCasesDAO()");
			e.printStackTrace();
			return lstTC;
		}
	}

}
