多言語辞書

生産・販売・売掛・買掛・帳票・実際原価の統合情報です。
個別管理は行っていません。


＜更新手順＞
※ "ant"が実行可能な環境で更新する必要があります。
  （Explanner/Jの開発環境であれば上記条件は満たしています。）

詳細はドキュメント(Wordファイル)を参照して下さい。

１．台帳(Excelファイル)更新

２．関連ファイル更新
多言語辞書の関連ファイルを更新します。
台帳内の「ファイル更新」ボタンをクリックして下さい。

３．CVSファイル登録
更新されたファイルをCVSに登録します。
当フォルダ配下（サブフォルダ内含む）と下記フォルダ内の更新ファイルが対象です。
  EXPJProj\common


＜実行環境＞
１．ファイル更新
"EXPJStudio"フォルダ配下のファイルを実行環境に上書コピーして下さい。
DBへの多言語辞書の情報を登録する必要はありません。


＜開発環境＞
１．ファイル更新
"EXPJProj\common"直下の更新ファイルを開発環境に上書きコピーして下さい。
サブフォルダ以下を上書きする必要はありません。


----- J,Ja,Jf用専用設定（マクロ実行処理速度改善方法） -----
　提供される多言語辞書のマクロは、J,Ja,Jfの全処理を行います。
　通常、ご購入頂いたEXPLANNER/J or Ja or Jfの１つの処理だけが必要です。
　ご購入以外の処理を省く方法を下記に記載します。

フォルダを削除します。
　rmdir /s /q SYSProj\MULTI_LANGUAGE\MULTI_LANGUAGE_Ja
　rmdir /s /q SYSProj\MULTI_LANGUAGE\MULTI_LANGUAGE_Jf

多言語辞書.xlsを開き、左上の「シリーズタイプ」を選択して
「ファイル更新（保存）」ボタンを押下します。
