/**
 * 
 */
package top.zhangyuace.contentbasedrecommend.quartz;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import top.zhangyuace.contentbasedrecommend.ContentBasedRecommender;

/**
 * @author qianxinyao
 
 * 每天定时根据用户当日的新闻浏览记录来更新用户的喜好关键词列表
 */
public class CBJob implements Job
{
	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException
	{
		List<Long> users=(List<Long>) arg0.getJobDetail().getJobDataMap().get("users");
		new ContentBasedRecommender().recommend(users);
	}

}

