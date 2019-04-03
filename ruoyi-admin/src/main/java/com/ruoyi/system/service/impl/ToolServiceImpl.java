package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ToolMapper;
import com.ruoyi.system.domain.Tool;
import com.ruoyi.system.service.IToolService;
import com.ruoyi.common.support.Convert;

/**
 * 工具器械管理 服务层实现
 * 
 * @author ruoyi
 * @date 2019-03-13
 */
@Service
public class ToolServiceImpl implements IToolService 
{
	@Autowired
	private ToolMapper toolMapper;

	/**
     * 查询工具器械管理信息
     * 
     * @param id 工具器械管理ID
     * @return 工具器械管理信息
     */
    @Override
	public Tool selectToolById(Integer id)
	{
	    return toolMapper.selectToolById(id);
	}
	
	/**
     * 查询工具器械管理列表
     * 
     * @param tool 工具器械管理信息
     * @return 工具器械管理集合
     */
	@Override
	public List<Tool> selectToolList(Tool tool)
	{
	    return toolMapper.selectToolList(tool);
	}
	
    /**
     * 新增工具器械管理
     * 
     * @param tool 工具器械管理信息
     * @return 结果
     */
	@Override
	public int insertTool(Tool tool)
	{
	    return toolMapper.insertTool(tool);
	}
	
	/**
     * 修改工具器械管理
     * 
     * @param tool 工具器械管理信息
     * @return 结果
     */
	@Override
	public int updateTool(Tool tool)
	{
	    return toolMapper.updateTool(tool);
	}

	/**
     * 删除工具器械管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteToolByIds(String ids)
	{
		return toolMapper.deleteToolByIds(Convert.toStrArray(ids));
	}
	
}
