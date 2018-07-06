package top.zhangyuace.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRecommendations<M extends BaseRecommendations<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

	public java.lang.Long getUserId() {
		return get("user_id");
	}

	public void setNewsId(java.lang.Long newsId) {
		set("news_id", newsId);
	}

	public java.lang.Long getNewsId() {
		return get("news_id");
	}

	public void setDeriveTime(java.util.Date deriveTime) {
		set("derive_time", deriveTime);
	}

	public java.util.Date getDeriveTime() {
		return get("derive_time");
	}

	public void setFeedback(java.lang.Boolean feedback) {
		set("feedback", feedback);
	}

	public java.lang.Boolean getFeedback() {
		return get("feedback");
	}

	public void setDeriveAlgorithm(java.lang.Integer deriveAlgorithm) {
		set("derive_algorithm", deriveAlgorithm);
	}

	public java.lang.Integer getDeriveAlgorithm() {
		return get("derive_algorithm");
	}

}
