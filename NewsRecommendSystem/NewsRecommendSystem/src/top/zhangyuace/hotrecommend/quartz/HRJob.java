/**
 * 
 */
package top.zhangyuace.hotrecommend.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import top.zhangyuace.hotrecommend.HotRecommender;

/**
 * @author zhangyuace

 * 每天定时生成热点新闻的列表
 */
public class HRJob implements Job
{
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException
	{
		HotRecommender.getTopHotNewsList().clear();
		HotRecommender.formTodayTopHotNewsList();
	}

}

