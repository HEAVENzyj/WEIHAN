package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

/**
 * 工具器械管理表 sys_tool
 * 
 * @author ruoyi
 * @date 2019-03-13
 */
public class Tool extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键id,自动增长 */
	private Integer id;
	/** 器材编号 */
	private Integer toolNumber;
	/** 器材名称 */
	private String toolName;
	/** 器材数量 */
	private Integer toolQuantity;
	/** 单位 */
	private String toolUnit;
	/** 备注 */
	private String toolRemark;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setToolNumber(Integer toolNumber) 
	{
		this.toolNumber = toolNumber;
	}

	public Integer getToolNumber() 
	{
		return toolNumber;
	}
	public void setToolName(String toolName) 
	{
		this.toolName = toolName;
	}

	public String getToolName() 
	{
		return toolName;
	}
	public void setToolQuantity(Integer toolQuantity) 
	{
		this.toolQuantity = toolQuantity;
	}

	public Integer getToolQuantity() 
	{
		return toolQuantity;
	}
	public void setToolUnit(String toolUnit) 
	{
		this.toolUnit = toolUnit;
	}

	public String getToolUnit() 
	{
		return toolUnit;
	}
	public void setToolRemark(String toolRemark) 
	{
		this.toolRemark = toolRemark;
	}

	public String getToolRemark() 
	{
		return toolRemark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("toolNumber", getToolNumber())
            .append("toolName", getToolName())
            .append("toolQuantity", getToolQuantity())
            .append("toolUnit", getToolUnit())
            .append("toolRemark", getToolRemark())
            .toString();
    }
}
