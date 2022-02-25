package alert_messenger.exception;

/**
 * アプリ内からスローする例外クラス<br>
 * <br>
 *
 */
public class AlertMessengerException extends Exception {

    /**
     * 発生した例外をラップしてスローする為のコンストラクタ<br>
     * <br>
     * @param message メッセージ
     * @param cause 発生元例外
     */
    public AlertMessengerException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 例外を作成してスローするためのコンストラクタ<br>
     * <br>
     * @param message メッセージ
     */
    public AlertMessengerException(String message) {
        super(message);
    }

}
