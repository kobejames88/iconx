package com.ljq.house.biz.mapper;

import com.ljq.house.common.model.Blog;
import com.ljq.house.common.page.PageParams;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: ljq
 * @Date: 18-12-26 下午9:40
 */

public interface BlogMapper {
    public List<Blog> selectBlog(@Param("blog") Blog query, @Param("pageParams") PageParams params);

    public Long selectBlogCount(Blog query);

    @Delete("DELETE FROM blog WHERE ID = #{id}")
    void delete(Integer id);

    @Insert("INSERT INTO blog(TAGS,CONTENT,TITLE) VALUES(#{tags},#{content},#{title})")
    Integer insert(Blog blog);

    @Select("SELECT COUNT(*) FROM blog")
    Long selectCount();

    @Select("SELECT * FROM blog")
    List<Blog> selectAllBlog();
}
