package com.dianrong.common.uniauth.common.bean.dto;

public class PermissionDto {
	private Integer id;
	private String value;
	private String description;
	private Byte status;
	private Integer permTypeId;
	private Integer domainId;
	
	private PermTypeDto permTypeDto;
	
	//whether this permission connected with this role
	private boolean checked;
	
	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getPermTypeId() {
		return permTypeId;
	}

	public void setPermTypeId(Integer permTypeId) {
		this.permTypeId = permTypeId;
	}

	public Integer getDomainId() {
		return domainId;
	}

	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}

	public PermTypeDto getPermTypeDto() {
		return permTypeDto;
	}

	public void setPermTypeDto(PermTypeDto permTypeDto) {
		this.permTypeDto = permTypeDto;
	}
}