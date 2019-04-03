package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 学校设备维修记录表 sys_tool_service
 * 
 * @author ruoyi
 * @date 2019-03-14
 */
public class ToolService extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 器材所在学校 */
	private String serviceSchool;
	/** 需维修器材名称 */
	private String serviceName;
	/** 需维修器材编号 */
	private Integer serviceNumber;
	/** 主要维修负责人 */
	private String serviceWho;
	/** 维修日期 */
	private Date serviceTime;
	/** 维修是否完成 */
	private String serviceResult;
	/** 备注 */
	private String comment;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setServiceSchool(String serviceSchool) 
	{
		this.serviceSchool = serviceSchool;
	}

	public String getServiceSchool() 
	{
		return serviceSchool;
	}
	public void setServiceName(String serviceName) 
	{
		this.serviceName = serviceName;
	}

	public String getServiceName() 
	{
		return serviceName;
	}
	public void setServiceNumber(Integer serviceNumber) 
	{
		this.serviceNumber = serviceNumber;
	}

	public Integer getServiceNumber() 
	{
		return serviceNumber;
	}
	public void setServiceWho(String serviceWho) 
	{
		this.serviceWho = serviceWho;
	}

	public String getServiceWho() 
	{
		return serviceWho;
	}
	public void setServiceTime(Date serviceTime) 
	{
		this.serviceTime = serviceTime;
	}

	public Date getServiceTime() 
	{
		return serviceTime;
	}
	public void setServiceResult(String serviceResult) 
	{
		this.serviceResult = serviceResult;
	}

	public String getServiceResult() 
	{
		return serviceResult;
	}
	public void setComment(String comment) 
	{
		this.comment = comment;
	}

	public String getComment() 
	{
		return comment;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("serviceSchool", getServiceSchool())
            .append("serviceName", getServiceName())
            .append("serviceNumber", getServiceNumber())
            .append("serviceWho", getServiceWho())
            .append("serviceTime", getServiceTime())
            .append("serviceResult", getServiceResult())
            .append("comment", getComment())
            .toString();
    }
}
