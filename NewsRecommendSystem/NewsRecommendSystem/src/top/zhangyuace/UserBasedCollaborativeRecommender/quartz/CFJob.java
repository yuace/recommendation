/**
 * 
 */
package top.zhangyuace.UserBasedCollaborativeRecommender.quartz;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import top.zhangyuace.UserBasedCollaborativeRecommender.MahoutUserBasedCollaborativeRecommender;

/**
 * @author zhangyuace

 */
public class CFJob implements Job
{
	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException
	{
		List<Long> users=(List<Long>) arg0.getJobDetail().getJobDataMap().get("users");
		new MahoutUserBasedCollaborativeRecommender().recommend(users);
	}

}

