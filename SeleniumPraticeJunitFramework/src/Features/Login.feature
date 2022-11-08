
Feature: ログイン

Scenario: ログイン成功の場合
    Given ブラウザを開く
    When ログイン画面に遷移したあと
    And それぞれの画面上のメールとパスワードでログインする
    And ログインボタンを押下
    Then ログインが成功し、admin画面が表示されて、"Dashboard" が表示される

    