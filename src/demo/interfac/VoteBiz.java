package demo.interfac;

import java.util.List;

import demo.entity.Vote;

public interface VoteBiz {
	//�鿴���е�ͶƱ��Ϣ
	public List<Vote> findAll();
	//��ȡ�µ�IDֵ
	public Long getNewId();
	//����ͶƱ
	public void addVote(Vote v);
	//�༭ͶƱ
	public void mergeVote(Vote v);
	//ɾ��ͶƱ
	public void deleteVote(Vote v);
	//����ID����ͶƱ��Ϣ
	public Vote getById(Long id);
}
