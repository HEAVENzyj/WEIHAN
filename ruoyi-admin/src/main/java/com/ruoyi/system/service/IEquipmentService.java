package com.ruoyi.system.service;

import com.ruoyi.system.domain.Equipment;
import java.util.List;

/**
 * 设备管理 服务层
 * 
 * @author ruoyi
 * @date 2019-03-28
 */
public interface IEquipmentService 
{
	/**
     * 查询设备管理信息
     * 
     * @param id 设备管理ID
     * @return 设备管理信息
     */
	public Equipment selectEquipmentById(Integer id);
	
	/**
     * 查询设备管理列表
     * 
     * @param equipment 设备管理信息
     * @return 设备管理集合
     */
	public List<Equipment> selectEquipmentList(Equipment equipment);
	
	/**
     * 新增设备管理
     * 
     * @param equipment 设备管理信息
     * @return 结果
     */
	public int insertEquipment(Equipment equipment);
	
	/**
     * 修改设备管理
     * 
     * @param equipment 设备管理信息
     * @return 结果
     */
	public int updateEquipment(Equipment equipment);
		
	/**
     * 删除设备管理信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteEquipmentByIds(String ids);
	
}
