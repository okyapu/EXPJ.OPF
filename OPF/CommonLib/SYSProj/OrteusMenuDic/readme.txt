簡易マニュアル（メニュー＆画面名）

　本台帳はメニュー情報の変換と、遷移画面の情報を付加を行います。
　メニュー情報自体は、「全体ビルド(メニュー)」を実施して作成します。

　詳細は、マニュアル(Wordファイル)を参照して下さい。



＜更新手順＞
　台帳内の情報、及び関連ファイルを更新します。
　本作業から実行環境への反映までは、一連の作業となります。
　その間、対象システムは停止させます。

１．CVSファイル取得
　CVSから最新の台帳ファイルを取得します。


２．メニュー更新
　メニューエディタにてメニュー定義を更新します。
　「全体ビルド(メニュー)」を行い、対象DBのメニュー情報を更新します。
　※ メニュー定義～DB更新作業までの詳細は、メニューエディタの説明書を参照して下さい。


３．台帳利用準備作業
　前作業(２．）を実施すると、メニュー情報ファイルが作成されます。
　　フォルダ ： "D:\EXPJStudio\lib"
　　ファイル ： "OrteusMenuDic.properties"

　上記ファイルを、フォルダにコピーします。
　　コピーするフォルダは、
　　　EXPLANNER/Jの場合、
　　　　→台帳フォルダSYSProj\OrteusMenuDic（すなわち、メニュー台帳.xlsと同一フォルダ）です。
　　　EXPLANNER/Jaの場合、
　　　　→SYSProj\OrteusMenuDic\OrteusMenuDic_Jaフォルダです。
　　　EXPLANNER/Jfの場合、
　　　　→SYSProj\OrteusMenuDic\OrteusMenuDic_Jfフォルダです。


４．台帳(Excelファイル)更新
　台帳内の情報を更新します。

　　「メニュー情報」シート
　　　メニュー情報ファイル内の文字列置換定義
　　　　日本語 → 英語 or 中国語

　　「画面遷移」シート
　　　画面遷移で移動する画面名定義
　　　　画面ID → 日本語 or 英語 or 中国語


５．関連ファイル更新
　関連ファイルの更新を行います。
　台帳内のマクロ起動ボタンをクリックします。


６．CVSファイル登録
　更新された全ファイルをCVSに登録します。



＜実行環境への反映手順＞
　作業中は対象システムを停止させます。

１．DB更新
　DB更新は、「全体ビルド(メニュー)」で実施済みとなります。

２．ファイル更新
　"EXPJStudio"フォルダ配下のファイルを実行環境にコピーします。
　EXPLANNER/Jaの場合、
　　OrteusMenuDic_Ja\EXPJStudioフォルダ配下の更新ファイルを実行環境に上書きコピーします。
　EXPLANNER/Jfの場合、
　　OrteusMenuDic_Jf\EXPJStudioフォルダ配下の更新ファイルを実行環境に上書きコピーします。

　※サブフォルダごと上書きコピー


----- J,Ja,Jf用専用設定（マクロ実行処理速度改善方法） -----
　提供されるメニュー台帳のマクロは、J,Ja,Jfの全処理を行います。
　通常、ご購入頂いたEXPLANNER/J or Ja or Jfの１つの処理だけが必要です。
　ご購入以外の処理を省く方法を下記に記載します。

　　EXPLANNER/Jの場合、
rmdir /s /q SYSProj\OrteusMenuDic\OrteusMenuDic_Ja
rmdir /s /q SYSProj\OrteusMenuDic\OrteusMenuDic_Jf
　　EXPLANNER/Jaの場合、
rmdir /s /q SYSProj\OrteusMenuDic\OrteusMenuDic_Jf
rmdir /s /q SYSProj\OrteusMenuDic\EXPJStudio
del SYSProj\OrteusMenuDic\OrteusMenuDic.properties
　　EXPLANNER/Jfの場合、
rmdir /s /q SYSProj\OrteusMenuDic\OrteusMenuDic_Ja
rmdir /s /q SYSProj\OrteusMenuDic\EXPJStudio
del SYSProj\OrteusMenuDic\OrteusMenuDic.properties



以上
