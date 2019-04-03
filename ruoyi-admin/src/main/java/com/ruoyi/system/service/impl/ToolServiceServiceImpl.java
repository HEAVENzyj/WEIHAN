package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ToolServiceMapper;
import com.ruoyi.system.domain.ToolService;
import com.ruoyi.system.service.IToolServiceService;
import com.ruoyi.common.support.Convert;

/**
 * 学校设备维修记录 服务层实现
 * 
 * @author ruoyi
 * @date 2019-03-14
 */
@Service
public class ToolServiceServiceImpl implements IToolServiceService 
{
	@Autowired
	private ToolServiceMapper toolServiceMapper;

	/**
     * 查询学校设备维修记录信息
     * 
     * @param id 学校设备维修记录ID
     * @return 学校设备维修记录信息
     */
    @Override
	public ToolService selectToolServiceById(Integer id)
	{
	    return toolServiceMapper.selectToolServiceById(id);
	}
	
	/**
     * 查询学校设备维修记录列表
     * 
     * @param toolService 学校设备维修记录信息
     * @return 学校设备维修记录集合
     */
	@Override
	public List<ToolService> selectToolServiceList(ToolService toolService)
	{
	    return toolServiceMapper.selectToolServiceList(toolService);
	}
	
    /**
     * 新增学校设备维修记录
     * 
     * @param toolService 学校设备维修记录信息
     * @return 结果
     */
	@Override
	public int insertToolService(ToolService toolService)
	{
	    return toolServiceMapper.insertToolService(toolService);
	}
	
	/**
     * 修改学校设备维修记录
     * 
     * @param toolService 学校设备维修记录信息
     * @return 结果
     */
	@Override
	public int updateToolService(ToolService toolService)
	{
	    return toolServiceMapper.updateToolService(toolService);
	}

	/**
     * 删除学校设备维修记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteToolServiceByIds(String ids)
	{
		return toolServiceMapper.deleteToolServiceByIds(Convert.toStrArray(ids));
	}
	
}
