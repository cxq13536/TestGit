package cn.sgxy.listener;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
/**
 *  配置Redis消息的监听器
 *    获取Redis中的消息并进行处理
 *
 */
public class RedisMessageListener implements MessageListener {

	/**
	 * onMessage:处理消息
	 * 
	 */
	public void onMessage(Message message, byte[] pattern) {
		System.out.println("从channel为"+new String(message.getChannel())+"中获取了一条新的消息,消息内容:"
				+new String(message.getBody()));

	}

}
