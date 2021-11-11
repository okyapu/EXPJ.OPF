      // JavaScript for Password check
      // 2byte charactor check
      function chk2byte(str)
      {
        var i, cnt=0;
        for( i=0; i< str.length; i++ ){
          if ( escape(str.charAt(i)).length >= 4 ){
            return true ; // 2byte character used
          }
        }
        return false; // 2byte character no-used
      }


	function chkinput2(minLen, rule) {
		// chkinput()
		if ( this.document.pswd.passwordOld.value.length == 0 ) {
			alert('必需输入的项目没被输入');
			this.document.pswd.passwordOld.focus();
			return false;
		}
		if ( this.document.pswd.password1.value.length == 0 ) {
			alert('必需输入的项目没被输入');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password2.value.length == 0 ) {
			alert('必需输入的项目没被输入');
			this.document.pswd.password2.focus();
			return false;
		}
		if ( chk2byte(this.document.pswd.password1.value) == true ) {
			alert('密码里不能指定2byte文字');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value != this.document.pswd.password2.value ) {
			alert('输入密码和确认密码不一样');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value == this.document.pswd.passwordOld.value ) {
			alert('旧密码和输入密码一样');
			this.document.pswd.password1.focus();
			return false;
		}
		if ( this.document.pswd.password1.value == this.document.pswd.userCd.value ) {
			alert('用户名和密码相同');
			this.document.pswd.password1.focus();
			return false;
		}

		// miniLength
		if ( this.document.pswd.password1.value.length < minLen ) {
			alert('新密码请指定' + minLen + '以上的英数字')
			this.document.pswd.password1.focus();
			return false;
		}

		// rule
		if ( rule == '1' ) {
			// AlphabetCheck
			if ( !this.document.pswd.password1.value.match(/[a-zA-Z]/) ) {
				alert('密码可以使用英文和数字');
				return false;
			}
			// NumberCheck
			if ( !this.document.pswd.password1.value.match(/[0-9]/) ) {
				alert('密码可以使用英文和数字');
				return false;
			}
		}

		ret=confirm('用指定内容来变更密码吗?');
		return ret;
	}


      function chkinput(){
	if ( this.document.pswd.passwordOld.value.length == 0 ){
          alert('必需输入的项目没被输入');
          this.document.pswd.passwordOld.focus();
          return false;
	}
        if ( this.document.pswd.password1.value.length == 0 ){
          alert('必需输入的项目没被输入');
          this.document.pswd.password1.focus();
          return false;
        }
        if ( this.document.pswd.password2.value.length == 0 ){
          alert('必需输入的项目没被输入');
          this.document.pswd.password2.focus();
          return false;
        }
	if ( chk2byte(this.document.pswd.password1.value) == true ){
          alert('密码里不能指定2byte文字');
          this.document.pswd.password1.focus();
          return false;
        }
        if ( this.document.pswd.password1.value != this.document.pswd.password2.value ){
          alert('输入密码和确认密码不一样');
          this.document.pswd.password1.focus();
          return false;
        }
	if ( this.document.pswd.password1.value == this.document.pswd.passwordOld.value ){
          alert('旧密码和输入密码一样');
          this.document.pswd.password1.focus();
          return false;
	}
	if ( this.document.pswd.password1.value == this.document.pswd.userCd.value ){
          alert('用户名和密码相同。');
          this.document.pswd.password1.focus();
          return false;
	}
        ret=confirm('用指定内容来变更密码吗?');
	return ret;
      }