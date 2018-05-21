package com.example.dao;

import org.apache.ibatis.jdbc.SQL;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/21
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public class MapperSql {
    public String getAc01ByAac001Sql(Long aac001) {
        return new SQL() {
            {
            SELECT("*");
            FROM("AC01");
            WHERE(" aac001=#{aac001}");
        }}.toString();

    }


}
