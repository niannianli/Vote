package demo.interfac;

import java.util.List;
import demo.entity.Vote;

public interface VoteBiz {

	public List<Vote> findAll();

	public Long getNewId();

	public void addVote(Vote v);

	public void mergeVote(Vote v);

	public void deleteVote(Vote v);
	
	public Vote getById(Long id);
}
