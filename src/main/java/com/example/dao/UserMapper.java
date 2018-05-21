package com.example.dao;

import com.example.domain.entity.AC01;
import org.apache.ibatis.annotations.Select;

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
public interface UserMapper {
    String a="ereerew";
    @Select(a)
     AC01 getAc01(String aac002);

}
