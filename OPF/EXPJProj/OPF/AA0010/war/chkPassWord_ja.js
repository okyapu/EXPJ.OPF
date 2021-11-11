      // パスワードチェック用ＪａｖａＳｃｒｉｐｔ
      // 2byte文字が含まれているかチェック
      function chk2byte(str)
      {
        var i, cnt=0;
        for( i=0; i< str.length; i++ ){
          if ( escape(str.charAt(i)).length >= 4 ){
            return true ; // 2byte文字が含まれている
          }
        }
        return false; // 2byte文字は含まれていない
      }


	function chkinput2(minLen, rule) {
		// chkinput()
		if ( this.document.pswd.passwordOld.value.length == 0 ) {
			alert('必須入力項目が入力されていません');
			this.document.pswd.passwordOld.focus();
			return false;
		}
		if ( this.document.pswd.password1.value.length == 0 ) {
			alert('必須入力項目が入力されていません');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password2.value.length == 0 ) {
			alert('必須入力項目が入力されていません');
			this.document.pswd.password2.focus();
			return false;
		}
		if ( chk2byte(this.document.pswd.password1.value) == true ) {
			alert('パスワードには2byte文字は指定できません');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value != this.document.pswd.password2.value ) {
			alert('入力パスワードと確認入力したパスワードが違っています');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value == this.document.pswd.passwordOld.value ) {
			alert('旧パスワードと入力パスワードが同一です');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value == this.document.pswd.userCd.value ) {
			alert('ユーザコードとパスワードは異なる文字列で設定してください');
			this.document.pswd.password1.focus();
			return false;
		}

		// miniLength
		if ( this.document.pswd.password1.value.length < minLen ) {
			alert('新パスワードは' + minLen + '文字以上の英数字を指定してください')
			this.document.pswd.password1.focus();
			return false;
		}

		// rule
		if ( rule == '1' ) {
			// AlphabetCheck
			if ( !this.document.pswd.password1.value.match(/[a-zA-Z]/) ) {
				alert('パスワードには英字、及び、数字を含んで設定してください');
				return false;
			}
			// NumberCheck
			if ( !this.document.pswd.password1.value.match(/[0-9]/) ) {
				alert('パスワードには英字、及び、数字を含んで設定してください');
				return false;
			}
		}

		ret=confirm('指定内容でパスワードを変更しますか');
		return ret;
	}


      function chkinput(){
	if ( this.document.pswd.passwordOld.value.length == 0 ){
          alert('必須入力項目が入力されていません');
          this.document.pswd.passwordOld.focus();
          return false;
	}
        if ( this.document.pswd.password1.value.length == 0 ){
          alert('必須入力項目が入力されていません');
          this.document.pswd.password1.focus();
          return false;
        }
        if ( this.document.pswd.password2.value.length == 0 ){
          alert('必須入力項目が入力されていません');
          this.document.pswd.password2.focus();
          return false;
        }
	if ( chk2byte(this.document.pswd.password1.value) == true ){
          alert('パスワードには2byte文字は指定できません');
          this.document.pswd.password1.focus();
          return false;
        }
        if ( this.document.pswd.password1.value != this.document.pswd.password2.value ){
          alert('入力パスワードと確認入力したパスワードが違っています');
          this.document.pswd.password1.focus();
          return false;
        }
	if ( this.document.pswd.password1.value == this.document.pswd.passwordOld.value ){
          alert('旧パスワードと入力パスワードが同一です');
          this.document.pswd.password1.focus();
          return false;
	}
	if ( this.document.pswd.password1.value == this.document.pswd.userCd.value ){
          alert('ユーザコードとパスワードは異なる文字列で設定してください.');
          this.document.pswd.password1.focus();
          return false;
	}
        ret=confirm('指定内容でパスワードを変更しますか');
	return ret;
      }