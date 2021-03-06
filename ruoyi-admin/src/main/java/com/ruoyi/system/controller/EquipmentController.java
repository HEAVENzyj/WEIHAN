package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Equipment;
import com.ruoyi.system.service.IEquipmentService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 设备管理 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-03-28
 */
@Controller
@RequestMapping("/system/equipment")
public class EquipmentController extends BaseController
{
    private String prefix = "system/equipment";
	
	@Autowired
	private IEquipmentService equipmentService;
	
	@RequiresPermissions("system:equipment:view")
	@GetMapping()
	public String equipment()
	{
	    return prefix + "/equipment";
	}
	
	/**
	 * 查询设备管理列表
	 */
	@RequiresPermissions("system:equipment:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Equipment equipment)
	{
		startPage();
        List<Equipment> list = equipmentService.selectEquipmentList(equipment);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出设备管理列表
	 */
	@RequiresPermissions("system:equipment:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Equipment equipment)
    {
    	List<Equipment> list = equipmentService.selectEquipmentList(equipment);
        ExcelUtil<Equipment> util = new ExcelUtil<Equipment>(Equipment.class);
        return util.exportExcel(list, "equipment");
    }
	
	/**
	 * 新增设备管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存设备管理
	 */
	@RequiresPermissions("system:equipment:add")
	@Log(title = "设备管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Equipment equipment)
	{		
		return toAjax(equipmentService.insertEquipment(equipment));
	}

	/**
	 * 修改设备管理
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Equipment equipment = equipmentService.selectEquipmentById(id);
		mmap.put("equipment", equipment);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存设备管理
	 */
	@RequiresPermissions("system:equipment:edit")
	@Log(title = "设备管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Equipment equipment)
	{		
		return toAjax(equipmentService.updateEquipment(equipment));
	}
	
	/**
	 * 删除设备管理
	 */
	@RequiresPermissions("system:equipment:remove")
	@Log(title = "设备管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(equipmentService.deleteEquipmentByIds(ids));
	}
	
}
