package alert_messenger;

import alert_messenger.crawler.Crawler;
import alert_messenger.exception.AlertMessengerException;
import alert_messenger.sender.Sender;

/**
 * 災害情報をクローリングしてメッセージを送信するためのメイン処理クラス<br>
 * <br>
 */
public class AlertMessenger {

    public void execute(Crawler crawler, Sender sender) throws AlertMessengerException {

        while (!crawler.isStop()) {
            sender.post(crawler.patrol());

            if (crawler.isStop()) {
                break;
            } else {
                crawler.standBy();
            }
        }
    }
}
