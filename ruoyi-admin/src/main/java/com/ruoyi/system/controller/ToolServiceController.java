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
import com.ruoyi.system.domain.ToolService;
import com.ruoyi.system.service.IToolServiceService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 学校设备维修记录 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-03-14
 */
@Controller
@RequestMapping("/system/toolService")
public class ToolServiceController extends BaseController
{
    private String prefix = "system/toolService";
	
	@Autowired
	private IToolServiceService toolServiceService;
	
	@RequiresPermissions("system:toolService:view")
	@GetMapping()
	public String toolService()
	{
	    return prefix + "/toolService";
	}
	
	/**
	 * 查询学校设备维修记录列表
	 */
	@RequiresPermissions("system:toolService:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ToolService toolService)
	{
		startPage();
        List<ToolService> list = toolServiceService.selectToolServiceList(toolService);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出学校设备维修记录列表
	 */
	@RequiresPermissions("system:toolService:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ToolService toolService)
    {
    	List<ToolService> list = toolServiceService.selectToolServiceList(toolService);
        ExcelUtil<ToolService> util = new ExcelUtil<ToolService>(ToolService.class);
        return util.exportExcel(list, "toolService");
    }
	
	/**
	 * 新增学校设备维修记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存学校设备维修记录
	 */
	@RequiresPermissions("system:toolService:add")
	@Log(title = "学校设备维修记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(ToolService toolService)
	{		
		return toAjax(toolServiceService.insertToolService(toolService));
	}

	/**
	 * 修改学校设备维修记录
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		ToolService toolService = toolServiceService.selectToolServiceById(id);
		mmap.put("toolService", toolService);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存学校设备维修记录
	 */
	@RequiresPermissions("system:toolService:edit")
	@Log(title = "学校设备维修记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ToolService toolService)
	{		
		return toAjax(toolServiceService.updateToolService(toolService));
	}
	
	/**
	 * 删除学校设备维修记录
	 */
	@RequiresPermissions("system:toolService:remove")
	@Log(title = "学校设备维修记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(toolServiceService.deleteToolServiceByIds(ids));
	}
	
}
