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
	//����ͶƱ
	public void addVote(Vote v){
		getHibernateTemplate().save(v);
	}
	//�༭ͶƱ
	public void mergeVote(Vote v){
		getHibernateTemplate().merge(v);
	}
	//ɾ��ͶƱ
	public void deleteVote(Vote v){
		getHibernateTemplate().delete(v);
	}
	//����ID����ͶƱ��Ϣ
	public Vote getById(Long id){
		return (Vote)getHibernateTemplate().get(Vote.class,id);
	}
}
