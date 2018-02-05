package com.tanyouping.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tan Youping on 2017/12/14.
 */
@ApiModel(description="Swagger对象")
public class Swagger implements Serializable{

    @ApiModelProperty(value="id",name="id")
    private String id;
    @ApiModelProperty(value="创建时间",name="created")
    public Date created;
    @ApiModelProperty(value="创建时间毫秒数",name="createdMillisecond")
    public Long createdMillisecond;
    @ApiModelProperty(value="名称",name="name")
    private String name;
    @ApiModelProperty(value="状态",name="status")
    private Integer status;
    @ApiModelProperty(value="备注",name="remark")
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getCreatedMillisecond() {
        return createdMillisecond;
    }

    public void setCreatedMillisecond(Long createdMillisecond) {
        this.createdMillisecond = createdMillisecond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
