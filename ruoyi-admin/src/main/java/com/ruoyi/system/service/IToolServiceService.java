package com.ruoyi.system.service;

import com.ruoyi.system.domain.ToolService;
import java.util.List;

/**
 * 学校设备维修记录 服务层
 * 
 * @author ruoyi
 * @date 2019-03-14
 */
public interface IToolServiceService 
{
	/**
     * 查询学校设备维修记录信息
     * 
     * @param id 学校设备维修记录ID
     * @return 学校设备维修记录信息
     */
	public ToolService selectToolServiceById(Integer id);
	
	/**
     * 查询学校设备维修记录列表
     * 
     * @param toolService 学校设备维修记录信息
     * @return 学校设备维修记录集合
     */
	public List<ToolService> selectToolServiceList(ToolService toolService);
	
	/**
     * 新增学校设备维修记录
     * 
     * @param toolService 学校设备维修记录信息
     * @return 结果
     */
	public int insertToolService(ToolService toolService);
	
	/**
     * 修改学校设备维修记录
     * 
     * @param toolService 学校设备维修记录信息
     * @return 结果
     */
	public int updateToolService(ToolService toolService);
		
	/**
     * 删除学校设备维修记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteToolServiceByIds(String ids);
	
}
