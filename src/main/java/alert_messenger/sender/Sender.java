package alert_messenger.sender;

import alert_messenger.entity.AlertMessengerDetail;
import alert_messenger.exception.AlertMessengerException;

/**
 * 通知処理を行うためのインタフェイス<br>
 * <br>
 */
public interface Sender {

    /**
     * メッセージを送信する。<br>
     * <br>
     * @param detail 通知内容
     * @return 通知結果
     * @throws AlertMessengerException 送信中に例外が発生した場合
     */
    int post(AlertMessengerDetail detail) throws AlertMessengerException;
}
