package com.heim.oct24.site;

import java.util.List;

public interface SiteMapper {
	public abstract int signUpMember(SiteMember sm);
	public abstract Integer correctMember(SiteMember sm);
	public abstract List<SiteMember> loginMembers(SiteMember sm);
	public abstract Integer deleteMember(SiteMember sm);
}
