package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 各学校出货记录表 sys_school
 * 
 * @author ruoyi
 * @date 2019-03-15
 */
public class School extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 学校名称 */
	private String schoolName;
	/** 设备名称 */
	private String schoolTool;
	/** 出货量 */
	private Integer schoolMany;
	/** 单位 */
	private String schoolUnit;
	/** 交付时间 */
	private Date schoolTime;
	/** 备注 */
	private String remark;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setSchoolName(String schoolName) 
	{
		this.schoolName = schoolName;
	}

	public String getSchoolName() 
	{
		return schoolName;
	}
	public void setSchoolTool(String schoolTool) 
	{
		this.schoolTool = schoolTool;
	}

	public String getSchoolTool() 
	{
		return schoolTool;
	}
	public void setSchoolMany(Integer schoolMany) 
	{
		this.schoolMany = schoolMany;
	}

	public Integer getSchoolMany() 
	{
		return schoolMany;
	}
	public void setSchoolUnit(String schoolUnit) 
	{
		this.schoolUnit = schoolUnit;
	}

	public String getSchoolUnit() 
	{
		return schoolUnit;
	}
	public void setSchoolTime(Date schoolTime) 
	{
		this.schoolTime = schoolTime;
	}

	public Date getSchoolTime() 
	{
		return schoolTime;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("schoolName", getSchoolName())
            .append("schoolTool", getSchoolTool())
            .append("schoolMany", getSchoolMany())
            .append("schoolUnit", getSchoolUnit())
            .append("schoolTime", getSchoolTime())
            .append("remark", getRemark())
            .toString();
    }
}
