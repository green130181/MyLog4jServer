package com.green;

import org.apache.log4j.EnhancedPatternLayout;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.jdbc.JDBCAppender;

public class MyJDBCAppender extends JDBCAppender {
	@Override
	public void setSql(String sql) {
		// TODO Auto-generated method stub
		sqlStatement = sql;
	    if (getLayout() == null) {
	        this.setLayout(new PatternLayout(sql));
	    }
	    else {
	        ((EnhancedPatternLayout)getLayout()).setConversionPattern(sql);
	    }
	}
}
