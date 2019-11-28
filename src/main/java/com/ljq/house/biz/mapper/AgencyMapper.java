package com.ljq.house.biz.mapper;

import com.ljq.house.common.model.Agency;
import com.ljq.house.common.model.User;
import com.ljq.house.common.page.PageParams;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ljq
 * @Date: 18-12-26 下午9:44
 */
public interface AgencyMapper {

    List<Agency> select(Agency agency);

    int insert(Agency agency);

    List<User> selectAgent(@Param("user") User user, @Param("pageParams") PageParams pageParams);

    Long selectAgentCount(@Param("user") User user);
}
