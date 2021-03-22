package com.sw.s3re;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConnectionTest {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private SqlSession sqlSession;
	
	public void connectionTest() throws Exception {
		assertNotNull(dataSource);
	}
	
	
	
}
