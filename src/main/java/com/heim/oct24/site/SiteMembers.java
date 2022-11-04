package com.heim.oct24.site;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SiteMembers {
	private List<SiteMember> siteMember;
	
	public SiteMembers() {
		// TODO Auto-generated constructor stub
	}

	public SiteMembers(List<SiteMember> siteMember) {
		super();
		this.siteMember = siteMember;
	}

	public List<SiteMember> getSiteMember() {
		return siteMember;
	}

	public void setSiteMember(List<SiteMember> siteMember) {
		this.siteMember = siteMember;
	}
	
	
}
