import com.thoughtworks.gauge.AfterSuite
import com.thoughtworks.gauge.BeforeSuite

class ExecutionHooks {

    @BeforeSuite
    fun beforeSuite() {
        println(">>>>> テストスイート全体の実行を開始します <<<<<")
        // 例: テスト環境のセットアップ、データベース接続など
    }

    @AfterSuite
    fun afterSuite() {
        println(">>>>> テストスイート全体の実行が完了しました <<<<<")
        // 例: テスト環境のクリーンアップ、レポート生成など
    }
}