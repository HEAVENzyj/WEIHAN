package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EquipmentMapper;
import com.ruoyi.system.domain.Equipment;
import com.ruoyi.system.service.IEquipmentService;
import com.ruoyi.common.support.Convert;

/**
 * 设备管理 服务层实现
 * 
 * @author ruoyi
 * @date 2019-03-28
 */
@Service
public class EquipmentServiceImpl implements IEquipmentService 
{
	@Autowired
	private EquipmentMapper equipmentMapper;

	/**
     * 查询设备管理信息
     * 
     * @param id 设备管理ID
     * @return 设备管理信息
     */
    @Override
	public Equipment selectEquipmentById(Integer id)
	{
	    return equipmentMapper.selectEquipmentById(id);
	}
	
	/**
     * 查询设备管理列表
     * 
     * @param equipment 设备管理信息
     * @return 设备管理集合
     */
	@Override
	public List<Equipment> selectEquipmentList(Equipment equipment)
	{
	    return equipmentMapper.selectEquipmentList(equipment);
	}
	
    /**
     * 新增设备管理
     * 
     * @param equipment 设备管理信息
     * @return 结果
     */
	@Override
	public int insertEquipment(Equipment equipment)
	{
	    return equipmentMapper.insertEquipment(equipment);
	}
	
	/**
     * 修改设备管理
     * 
     * @param equipment 设备管理信息
     * @return 结果
     */
	@Override
	public int updateEquipment(Equipment equipment)
	{
	    return equipmentMapper.updateEquipment(equipment);
	}

	/**
     * 删除设备管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteEquipmentByIds(String ids)
	{
		return equipmentMapper.deleteEquipmentByIds(Convert.toStrArray(ids));
	}
	
}
