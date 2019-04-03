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
import com.ruoyi.system.domain.School;
import com.ruoyi.system.service.ISchoolService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 各学校出货记录 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-03-15
 */
@Controller
@RequestMapping("/system/school")
public class SchoolController extends BaseController
{
    private String prefix = "system/school";
	
	@Autowired
	private ISchoolService schoolService;
	
	@RequiresPermissions("system:school:view")
	@GetMapping()
	public String school()
	{
	    return prefix + "/school";
	}
	
	/** 
	 * 查询各学校出货记录列表
	 */
	@RequiresPermissions("system:school:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(School school)
	{
		startPage();
        List<School> list = schoolService.selectSchoolList(school);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出各学校出货记录列表
	 */
	@RequiresPermissions("system:school:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(School school)
    {
    	List<School> list = schoolService.selectSchoolList(school);
        ExcelUtil<School> util = new ExcelUtil<School>(School.class);
        return util.exportExcel(list, "school");
    }
	
	/**
	 * 新增各学校出货记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存各学校出货记录
	 */
	@RequiresPermissions("system:school:add")
	@Log(title = "各学校出货记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(School school)
	{		
		return toAjax(schoolService.insertSchool(school));
	}

	/**
	 * 修改各学校出货记录
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		School school = schoolService.selectSchoolById(id);
		mmap.put("school", school);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存各学校出货记录
	 */
	@RequiresPermissions("system:school:edit")
	@Log(title = "各学校出货记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(School school)
	{		
		return toAjax(schoolService.updateSchool(school));
	}
	
	/**
	 * 删除各学校出货记录
	 */
	@RequiresPermissions("system:school:remove")
	@Log(title = "各学校出货记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(schoolService.deleteSchoolByIds(ids));
	}
	
}
