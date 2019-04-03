package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SchoolMapper;
import com.ruoyi.system.domain.School;
import com.ruoyi.system.service.ISchoolService;
import com.ruoyi.common.support.Convert;

/**
 * 各学校出货记录 服务层实现
 * 
 * @author ruoyi
 * @date 2019-03-15
 */
@Service
public class SchoolServiceImpl implements ISchoolService 
{
	@Autowired
	private SchoolMapper schoolMapper;

	/**
     * 查询各学校出货记录信息
     * 
     * @param id 各学校出货记录ID
     * @return 各学校出货记录信息
     */
    @Override
	public School selectSchoolById(Integer id)
	{
	    return schoolMapper.selectSchoolById(id);
	}
	
	/**
     * 查询各学校出货记录列表
     * 
     * @param school 各学校出货记录信息
     * @return 各学校出货记录集合
     */
	@Override
	public List<School> selectSchoolList(School school)
	{
	    return schoolMapper.selectSchoolList(school);
	}
	
    /**
     * 新增各学校出货记录
     * 
     * @param school 各学校出货记录信息
     * @return 结果
     */
	@Override
	public int insertSchool(School school)
	{
	    return schoolMapper.insertSchool(school);
	}
	
	/**
     * 修改各学校出货记录
     * 
     * @param school 各学校出货记录信息
     * @return 结果
     */
	@Override
	public int updateSchool(School school)
	{
	    return schoolMapper.updateSchool(school);
	}

	/**
     * 删除各学校出货记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSchoolByIds(String ids)
	{
		return schoolMapper.deleteSchoolByIds(Convert.toStrArray(ids));
	}
	
}
