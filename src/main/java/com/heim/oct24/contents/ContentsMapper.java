package com.heim.oct24.contents;

import java.util.List;

public interface ContentsMapper {
	public abstract int writeContent(Content c);
	public abstract List<Content>getAllContent();
	public abstract List<Content>viewPost(Content c);
	public abstract void writeComment(Comment cm);
	public abstract List<Comment> printComment();
	public abstract List<Content> searchPost(Content c);
}
