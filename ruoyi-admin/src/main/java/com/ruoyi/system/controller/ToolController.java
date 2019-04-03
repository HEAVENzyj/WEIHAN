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
import com.ruoyi.system.domain.Tool;
import com.ruoyi.system.service.IToolService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 工具器械管理 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-03-13
 */
@Controller
@RequestMapping("/system/tool")
public class ToolController extends BaseController
{
    private String prefix = "system/tool";
	
	@Autowired
	private IToolService toolService;
	
	@RequiresPermissions("system:tool:view")
	@GetMapping()
	public String tool()
	{
	    return prefix + "/tool";
	}
	
	/**
	 * 查询工具器械管理列表
	 */
	@RequiresPermissions("system:tool:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Tool tool)
	{
		startPage();
        List<Tool> list = toolService.selectToolList(tool);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出工具器械管理列表
	 */
	@RequiresPermissions("system:tool:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Tool tool)
    {
    	List<Tool> list = toolService.selectToolList(tool);
        ExcelUtil<Tool> util = new ExcelUtil<Tool>(Tool.class);
        return util.exportExcel(list, "tool");
    }
	
	/**
	 * 新增工具器械管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存工具器械管理
	 */
	@RequiresPermissions("system:tool:add")
	@Log(title = "工具器械管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Tool tool)
	{		
		return toAjax(toolService.insertTool(tool));
	}

	/**
	 * 修改工具器械管理
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Tool tool = toolService.selectToolById(id);
		mmap.put("tool", tool);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存工具器械管理
	 */
	@RequiresPermissions("system:tool:edit")
	@Log(title = "工具器械管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Tool tool)
	{		
		return toAjax(toolService.updateTool(tool));
	}
	
	/**
	 * 删除工具器械管理
	 */
	@RequiresPermissions("system:tool:remove")
	@Log(title = "工具器械管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(toolService.deleteToolByIds(ids));
	}
	
}
