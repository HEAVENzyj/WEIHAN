package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.School;
import java.util.List;	

/**
 * 各学校出货记录 数据层
 * 
 * @author ruoyi
 * @date 2019-03-15
 */
public interface SchoolMapper 
{
	/**
     * 查询各学校出货记录信息
     * 
     * @param id 各学校出货记录ID
     * @return 各学校出货记录信息
     */
	public School selectSchoolById(Integer id);
	
	/**
     * 查询各学校出货记录列表
     * 
     * @param school 各学校出货记录信息
     * @return 各学校出货记录集合
     */
	public List<School> selectSchoolList(School school);
	
	/**
     * 新增各学校出货记录
     * 
     * @param school 各学校出货记录信息
     * @return 结果
     */
	public int insertSchool(School school);
	
	/**
     * 修改各学校出货记录
     * 
     * @param school 各学校出货记录信息
     * @return 结果
     */
	public int updateSchool(School school);
	
	/**
     * 删除各学校出货记录
     * 
     * @param id 各学校出货记录ID
     * @return 结果
     */
	public int deleteSchoolById(Integer id);
	
	/**
     * 批量删除各学校出货记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSchoolByIds(String[] ids);
	
}