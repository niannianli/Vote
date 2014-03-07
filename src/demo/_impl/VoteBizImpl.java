package demo._impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.entity.Vote;
import demo.interfac.VoteBiz;
import demo.interfac.VoteDao;

public class VoteBizImpl implements VoteBiz {
	private VoteDao voteDao;	
	
	public void setVoteDao(VoteDao voteDao) {
		this.voteDao = voteDao;
	}

	public List<Vote> findAll() {
		return voteDao.findAll();		
	}
	
	public Long getNewId() {		
		return voteDao.getNewId();
	}
	public void addVote(Vote v) {
		voteDao.addVote(v);
	}
	public void deleteVote(Vote v) {
		voteDao.deleteVote(v);
	}
	public void mergeVote(Vote v) {
		voteDao.mergeVote(v);
	}
	//根据ID查找投票信息
	public Vote getById(Long id){
		return voteDao.getById(id);
	}
	//测试看看
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		VoteBizImpl ui=(VoteBizImpl) app.getBean("voteBiz");
		List<Vote> list=ui.findAll();
		for(Vote v:list){
			System.out.println(v.getFinishdate()+"\t"+v.getPublishdate());
		}
	}
}
