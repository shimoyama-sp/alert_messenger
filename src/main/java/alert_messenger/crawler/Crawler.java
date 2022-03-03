package alert_messenger.crawler;

import java.util.concurrent.TimeUnit;

import alert_messenger.entity.AlertMessengerDetail;
import alert_messenger.exception.AlertMessengerException;

/**
 * 災害情報をクローリングして取得するためのインタフェイス<br>
 * <br>
 */
public interface Crawler {

    AlertMessengerDetail patrol() throws AlertMessengerException;

    boolean isStop();

    /**
     * クローリングを待機させる。<br>
     * <br>
     * デフォルト 5分待機<br>
     * <br>
     * @throws AlertMessengerException 待機中に割り込みが発生した場合
     */
    default void standBy() throws AlertMessengerException {
        try {
            TimeUnit.MINUTES.sleep(5L);
        } catch (InterruptedException e) {
            throw new AlertMessengerException("待機中に割り込みが発生しました", e);
        }
    }
}
