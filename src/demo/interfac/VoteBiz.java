package demo.interfac;

import java.util.List;

import demo.entity.Vote;

public interface VoteBiz {
	//查看所有的投票信息
	public List<Vote> findAll();
	//获取新的ID值
	public Long getNewId();
	//增加投票
	public void addVote(Vote v);
	//编辑投票
	public void mergeVote(Vote v);
	//删除投票
	public void deleteVote(Vote v);
	//根据ID查找投票信息
	public Vote getById(Long id);
}
