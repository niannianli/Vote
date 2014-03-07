package demo._impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import demo.entity.Vote;
import demo.interfac.VoteDao;

public class VoteDaoImpl extends HibernateDaoSupport implements VoteDao {
	@SuppressWarnings("unchecked")
	public List<Vote> findAll() {		
		return getHibernateTemplate().find("from Vote");
	}
	public Long getNewId() {		
		return (Long)getHibernateTemplate().find("select max(voteid) from Vote").get(0)+1;
	}
	//增加投票
	public void addVote(Vote v){
		getHibernateTemplate().save(v);
	}
	//编辑投票
	public void mergeVote(Vote v){
		getHibernateTemplate().merge(v);
	}
	//删除投票
	public void deleteVote(Vote v){
		getHibernateTemplate().delete(v);
	}
	//根据ID查找投票信息
	public Vote getById(Long id){
		return (Vote)getHibernateTemplate().get(Vote.class,id);
	}
}
