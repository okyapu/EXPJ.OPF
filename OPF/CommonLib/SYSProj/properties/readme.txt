Explanner/J WebLogic環境変数設定


＜設定ファイル＞

expjprsaR2\SYSProj\properties\EXPJStudio\lib フォルダ

	metamorBaseSystem.japanese
	metamorBaseSystem.properties

	SystemLog.japanese
	SystemLog.properties

	SystemLogApplication.japanese
	SystemLogApplication.properties

※"japanese"ファイル修正後、上記フォルダで"ant"を実行（"properties"ファイル作成）

★注意：本ファイルは、EJ環境のデフォルト値です。
　　　　よって、構築済み環境に本ファイルだけを適用するのは、非推奨です。
　　　　EJ環境設定ツール（D:\EXPJStudio\support\SysEnvFiles）で設定することを、推奨します。

　　　　例：データベースのユーザをデフォルト値以外で構築した環境の場合、
　　　　　　本ファイルのみ環境に適用した場合に、業務メッセージ一覧のユーザが、
　　　　　デフォルト値側に出力先などの問題が発生しますので十分注意願います。
