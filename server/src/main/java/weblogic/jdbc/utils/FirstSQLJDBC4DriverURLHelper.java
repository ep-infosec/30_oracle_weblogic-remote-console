// Copyright (c) 2020, 2021, Oracle Corporation and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

package weblogic.jdbc.utils;

import java.util.Properties;

import weblogic.jdbc.common.internal.JDBCUtil;



public class FirstSQLJDBC4DriverURLHelper extends JDBCURLHelper {

  public String getURL() throws JDBCDriverInfoException {
    //jdbc:dbcp://${dbhost}:${dbport}
    JDBCDriverInfo info = getJDBCInfo();
    if (!isValid(info.getDbmsHost())) {
      throw new JDBCDriverInfoException(JDBCUtil.getTextFormatter().dbHostReqd());
    }
    if (!isValid(info.getDbmsPort())) {
      throw new JDBCDriverInfoException(JDBCUtil.getTextFormatter().dbPortReqd());
    }
    return "jdbc:dbcp://" + info.getDbmsHost() + ":" + info.getDbmsPort();
  }

  public Properties getProperties() throws JDBCDriverInfoException {
    JDBCDriverInfo info = getJDBCInfo();
    if (!isValid(info.getUserName())) {
      throw new JDBCDriverInfoException(JDBCUtil.getTextFormatter().dbUsernameReqd());
    }
    Properties props = new Properties();
    props.put("user", info.getUserName());
    return props;
  }
}
