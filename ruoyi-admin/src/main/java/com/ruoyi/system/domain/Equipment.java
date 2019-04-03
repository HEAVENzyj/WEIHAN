package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 设备管理表 sys_equipment
 * 
 * @author ruoyi
 * @date 2019-03-28
 */
public class Equipment extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 设备ID */
	private String eqId;
	/** 绑定班级 */
	private String eqClass;
	/** 导入时间 */
	private Date eqImportTime;
	/** 在线状态 */
	private String eqState;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setEqId(String eqId) 
	{
		this.eqId = eqId;
	}

	public String getEqId() 
	{
		return eqId;
	}
	public void setEqClass(String eqClass) 
	{
		this.eqClass = eqClass;
	}

	public String getEqClass() 
	{
		return eqClass;
	}
	public void setEqImportTime(Date eqImportTime) 
	{
		this.eqImportTime = eqImportTime;
	}

	public Date getEqImportTime() 
	{
		return eqImportTime;
	}
	public void setEqState(String eqState) 
	{
		this.eqState = eqState;
	}

	public String getEqState() 
	{
		return eqState;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eqId", getEqId())
            .append("eqClass", getEqClass())
            .append("eqImportTime", getEqImportTime())
            .append("eqState", getEqState())
            .toString();
    }
}
