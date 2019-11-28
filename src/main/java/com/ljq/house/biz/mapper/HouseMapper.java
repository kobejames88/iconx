package com.ljq.house.biz.mapper;

import com.ljq.house.common.model.*;
import com.ljq.house.common.page.PageParams;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


/**
 * @Author: ljq
 * @Date: 18-12-26 下午7:54
 */


public interface HouseMapper {
    public List<House> selectPageHouses(@Param("house") House house, @Param("pageParams") PageParams pageParams);

    public Long selectPageCount(@Param("house") House query);

    public int insert(User account);

    public List<Community> selectCommunity(Community community);

    public int insert(House house);

    public HouseUser selectHouseUser(@Param("userId") Long userId, @Param("id") Long houseId, @Param("type") Integer
            value);

    public HouseUser selectSaleHouseUser(@Param("id") Long houseId);

    public int insertHouseUser(HouseUser houseUser);

    public int insertUserMsg(UserMsg userMsg);

    public int updateHouse(House updateHouse);

    public int updateHouseAll(House updateHouse);

    public int downHouse(Long id);

    public int deleteHouseUser(@Param("id") Long id, @Param("userId") Long userId, @Param("type") Integer value);

    public List<House> selectHouses();

    boolean batchImport(String fileName, MultipartFile file) throws Exception;

    public House selectHouseById(@Param("id") Long id);

    public List<String> selectNationCount();

    @Select("SELECT COUNT(*) FROM house")
    public int selectHouseCount();

    @Delete("DELETE FROM house WHERE ID = #{id}")
    void delete(Integer id);

}
