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
			alert('Mandatory input items are not entered.');
			this.document.pswd.passwordOld.focus();
			return false;
		}
		if ( this.document.pswd.password1.value.length == 0 ) {
			alert('Mandatory input items are not entered.');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password2.value.length == 0 ) {
			alert('Mandatory input items are not entered.');
			this.document.pswd.password2.focus();
			return false;
		}
		if ( chk2byte(this.document.pswd.password1.value) == true ) {
			alert('2-byte characters are not allowed for a password.');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value != this.document.pswd.password2.value ) {
			alert('The password that was entered and the password entered for confirmation do not match.');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value == this.document.pswd.passwordOld.value ) {
			alert('The old password and the password that was entered are identical.');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value == this.document.pswd.userCd.value ) {
			alert('User ID and the password that was entered are identical.');
			this.document.pswd.password1.focus();
			return false;
		}

		// miniLength
		if ( this.document.pswd.password1.value.length < minLen ) {
			alert('Please input more than ' + minLen + ' alphabet or figure for the new password.')
			this.document.pswd.password1.focus();
			return false;
		}

		// rule
		if ( rule == '1' ) {
			// AlphabetCheck
			if ( !this.document.pswd.password1.value.match(/[a-zA-Z]/) ) {
				alert('Please contain alphabet and figure in the password.');
				return false;
			}
			// NumberCheck
			if ( !this.document.pswd.password1.value.match(/[0-9]/) ) {
				alert('Please contain alphabet and figure in the password.');
				return false;
			}
		}

		ret=confirm('Do you wish to change the password with the specified contents?');
		return ret;
	}


      function chkinput(){
	if ( this.document.pswd.passwordOld.value.length == 0 ){
          alert('Mandatory input items are not entered.');
          this.document.pswd.passwordOld.focus();
          return false;
	}
        if ( this.document.pswd.password1.value.length == 0 ){
          alert('Mandatory input items are not entered.');
          this.document.pswd.password1.focus();
          return false;
        }
        if ( this.document.pswd.password2.value.length == 0 ){
          alert('Mandatory input items are not entered.');
          this.document.pswd.password2.focus();
          return false;
        }
	if ( chk2byte(this.document.pswd.password1.value) == true ){
          alert('2-byte characters are not allowed for a password.');
          this.document.pswd.password1.focus();
          return false;
        }
    if ( this.document.pswd.password1.value != this.document.pswd.password2.value ){
          alert('The password that was entered and the password entered for confirmation do not match.');
          this.document.pswd.password1.focus();
          return false;
        }
	if ( this.document.pswd.password1.value == this.document.pswd.passwordOld.value ){
          alert('The old password and the password that was entered are identical.');
          this.document.pswd.password1.focus();
          return false;
	}
	if ( this.document.pswd.password1.value == this.document.pswd.userCd.value ){
          alert('User ID and the password that was entered are identical.');
          this.document.pswd.password1.focus();
          return false;
	}
        ret=confirm('Do you wish to change the password with the specified contents?');
	return ret;
      }