package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.GroupCode;
import com.dianrong.common.uniauth.server.data.entity.GroupCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int countByExample(GroupCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int deleteByExample(GroupCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int insert(GroupCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int insertSelective(GroupCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    List<GroupCode> selectByExample(GroupCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    GroupCode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") GroupCode record, @Param("example") GroupCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int updateByExample(@Param("record") GroupCode record, @Param("example") GroupCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int updateByPrimaryKeySelective(GroupCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_code
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    int updateByPrimaryKey(GroupCode record);
}