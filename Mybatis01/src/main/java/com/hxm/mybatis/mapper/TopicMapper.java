package com.hxm.mybatis.mapper;

import com.hxm.mybatis.pojo.Topic;
import com.hxm.mybatis.pojo.TopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int countByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int deleteByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int insert(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int insertSelective(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    List<Topic> selectByExampleWithBLOBs(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    List<Topic> selectByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    Topic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int updateByPrimaryKeySelective(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Wed Aug 31 10:16:35 CST 2022
     */
    int updateByPrimaryKey(Topic record);
}