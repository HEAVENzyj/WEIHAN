package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Tool;
import java.util.List;	

/**
 * 工具器械管理 数据层
 * 
 * @author ruoyi
 * @date 2019-03-13
 */
public interface ToolMapper 
{
	/**
     * 查询工具器械管理信息
     * 
     * @param id 工具器械管理ID
     * @return 工具器械管理信息
     */
	public Tool selectToolById(Integer id);
	
	/**
     * 查询工具器械管理列表
     * 
     * @param tool 工具器械管理信息
     * @return 工具器械管理集合
     */
	public List<Tool> selectToolList(Tool tool);
	
	/**
     * 新增工具器械管理
     * 
     * @param tool 工具器械管理信息
     * @return 结果
     */
	public int insertTool(Tool tool);
	
	/**
     * 修改工具器械管理
     * 
     * @param tool 工具器械管理信息
     * @return 结果
     */
	public int updateTool(Tool tool);
	
	/**
     * 删除工具器械管理
     * 
     * @param id 工具器械管理ID
     * @return 结果
     */
	public int deleteToolById(Integer id);
	
	/**
     * 批量删除工具器械管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteToolByIds(String[] ids);
	
}