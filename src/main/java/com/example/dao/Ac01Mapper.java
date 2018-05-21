package com.example.dao;

import com.example.domain.entity.AC01;
import com.example.domain.entity.User;
import org.apache.ibatis.annotations.SelectProvider;

/********************************************************************************
 *
 * Title: 
 *
 * Description:
 *
 * author chenlm
 * create date on 2018/3/20
 * Copyright:Copyright © 2017-2018
 * Company:易联众信息技术股份有限公司
 *
 *******************************************************************************/
public interface Ac01Mapper {
    @SelectProvider(type = MapperSql.class, method = "getAc01ByAac001Sql")
    AC01 getAc01(AC01 ac01);


}
