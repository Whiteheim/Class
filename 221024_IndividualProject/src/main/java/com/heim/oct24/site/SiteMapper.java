package com.heim.oct24.site;

import java.util.List;

public interface SiteMapper {
	public abstract int signUpMember(SiteMember sm);
	public abstract List<SiteMember> siteMember();
}