package blog.service;

/**
 * Created by zillur on 9/20/16.
 */
public interface NotificationService {
    void addInfoMessage(String msg);
    void addErrorMessage(String msg);
}