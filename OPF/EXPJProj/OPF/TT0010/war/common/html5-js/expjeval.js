if (typeof(expj) === 'undefined' || expj === null) {
  expj = {};
}
if (typeof(expj.common) === 'undefined' || expj.common === null) {
  expj.common = {};
}
if (typeof(expj.common.pscript) === 'undefined' || expj.common.pscript === null) {
  expj.common.pscript = {};
}

/**
 * バージョン管理用
 */
if (typeof(expj.common.version) === 'undefined' || expj.common.version === null) {
  expj.common.version = {};
}
expj.common.version.expjeval = 'expjeval.js Ver1.0.0';

expj.common.pscript.evalTrimFixed = function (a) {
    var x = "" + a;
    var m = 0;
    var e = x.length;

    for(var i = 0; i < x.length; i++) {
        var c = x.substring(i, i + 1);

        if(c >= "0" && c <= "9"){
            if (m == 0 && c == "0"){
            }else{
                m++;
            }
        }else if(c == " " || c == "+" || c == "-" || c == "."){
        }else if(c == "E" || c == "e") {
            e = i;
            break;
        }else{
            return a;
        }
    }

    var b = 1.0 / 3.0;
    var y = "" + b;
    var q = y.indexOf(".");
    var n;
    if(q >= 0){
        n = y.length - (q + 1);
    }else{
        return a;
    }

    if(m < n){
        return a;
    }

    var p = x.indexOf(".");
    if(p == -1){
        return a;
    }

    var w = " ";
    for(var i = e - (m - n) - 1; i >= p + 1; i--){
        var c = x.substring(i, i + 1);

        if(i == e - (m - n) - 1){
            continue;
        }
        if(i == e - (m - n) - 2){
            if(c == "0" || c == "9"){
                w = c;
                continue;
            }else{
                return a;
            }
        }
        if(c != w){
            if(w == "0"){
                var z = (x.substring(0, i + 1) + x.substring(e, x.length)) - 0;

                return z;
            }else if(w == "9"){
                var z = (x.substring(0, i) + ("" + ((c - 0) + 1)) + x.substring(e, x.length)) - 0;

                return z;
            }else{
                return a;
            }
        }
    }
    if(w == "0"){
        var z = (x.substring(0, p) + x.substring(e, x.length)) - 0;

        return z;
    }else if(w == "9"){
        var z = x.substring(0, p) - 0;
        var f;

        if(a > 0){
            f = 1;
        }else if(a < 0){
            f = -1;
        }else{
            return a;
        }
        var r = (("" + (z + f)) + x.substring(e, x.length)) - 0;

        return r;
    }else{
        return a;
    }
};

expj.common.pscript.ExEval = {

    create: function(){

        var pscript = {};

        var name;
        var type;
        var value;
        var iPos;
        var iLen;
        var tok ;
        var sExpr;
        var iError;
        var iErrorMsg;
        var aStack;
        var sErrorMsg;
        var tVal;

        pscript.name = function(){
            return name;
        };
        pscript.type = function(){
            return type;
        };
        pscript.value = function(){
            return value;
        };
        pscript.iPos = function(){
            return iPos;
        };
        pscript.iLen = function(){
            return iLen;
        };
        pscript.tok = function(){
            return tok;
        };
        pscript.sExpr = function(){
            return sExpr;
        };
        pscript.iError = function(){
            return iError;
        };
        pscript.aStack = function(){
            return aStack;
        };
        pscript.iErrorMsg = function(){
            return iErrorMsg;
        };
        pscript.sErrorMsg = function(){
            return sErrorMsg;
        };
        pscript.tVal = function(){
            return tVal;
        };

        pscript.token = function(sName, sType, sValue){
            var t = {};
            t.name = sName;
            t.type = sType;
            t.value = sValue;
            return t;
        };

        pscript.isNotIDChar = function(ch){
            var tmp = "abcdefghijklmnopqrstuvwxyz._";
            if(tmp.indexOf(ch) < 0){
                return true;
            }
            return false;
        };

        pscript.isOperatorChar = function(ch){
            var tmp = "+-*/%(),";
            if(tmp.indexOf(ch) >= 0){
                return true;
            }
            return false;
        };

        pscript.isNotNumberChar = function(ch){
            var tmp= "0123456789.e";
            if(tmp.indexOf(ch) < 0){
                return true;
            }
            return false;
        };


        pscript.error = function(msg){
            if(iError == 0){
                sErrorMsg = "ERROR at " + iPos + ":  " + msg;
                iError = 1;
            }
            return false;
        };

        pscript.newError = function(pos,msg){
            if(iError == 0){
                sErrorMsg = "ERROR at position " + pos + ": " + msg;
                iError = 1;
            }
            sErrorMsg = "ERROR at position " + pos + ": " + msg;
            return false;
        };


        pscript.castNumber = function(str){
            while(str.charAt(0) == "0"){
                if(str.length == 1){
                    return 0;
                }
                str = str.slice(1,str.length);
            }
            return Number(str);
        };


        pscript.nextToken = function(){
            var ch, s;

            do{
                iPos++;
            }while(iPos < iLen && (ch = sExpr.charAt(iPos)) <= " ");
            if(iPos >= iLen){
                return false;
            }

            if(this.isOperatorChar(ch)){
                tok = this.token(ch,"","");
                return true;
            }

            if(ch >= "a" && ch <= "z"){
                //s = ch;
                //do{
                //    iPos++;
                //    if(iPos >= iLen)break;
                //    ch = sExpr.charAt(iPos);
                //    if(this.isNotIDChar(ch))break;
                //    s += ch;
                //}while(1);
                //
                //iPos--;
                //if(s.indexOf("math.") == 0){
                //    s = s.substring(5);
                //}
                //if(typeof(Math[s]) == "function"){
                //    tok = this.token(s,"f",Math[s]);
                //}else if(typeof(eval(s)) == "function"){
                //    tok = this.token(s,"f",eval(s));
                //}else{
                //    tok = this.token(s,"v",s);
                //}

                return this.error( " your input error , '" +ch + "' can not be recognized .");
            }

            if((ch >= "0" && ch <= "9") || ch == "."){
                s = ch;
                do{
                    iPos++;
                    if(iPos >= iLen)break;
                    ch = sExpr.charAt(iPos);
                    if(ch != "e") {
                        if (this.isNotNumberChar(ch))break;
                        s += ch;
                    }else{
                        s +=ch;
                        var i=-1;
                        do{
                            iPos++;
                            i++;
                            if(iPos >= iLen)break;
                            ch = sExpr.charAt(iPos);
                            if(i == 0) {
                                if(ch =="-"||ch=="+"||(ch>="1" && ch<="9")){
                                    s += ch;
                                }else{
                                    break;
                                }
                            }else{
                                if(ch >= "0"&& ch <= "9"){
                                    s += ch;
                                }else{
                                    break;
                                }
                            }
                        }while(1);
                        iPos--;
                    }
                }while(1);

                iPos--;

                if( typeof(Number(s)) == "number"){
                    if(isNaN(Number(s))){
                        var pos = iPos - s.length +1;
                        return this.newError(pos, "'"+s + "' is an error expression ");
                    }
                    tok = this.token(s,"n",Number(s));
                    return true
                } else {
                    var pos = iPos - s.length+1;
                    return this.newError(pos, "'"+s + "' is an error expression ");
                }
            }
            return this.error("nextToken: no more tokens available: " + ch + " rest: " + sExpr.substring(iPos+1));
        };

        pscript.execute = function(compiledExpression){
            var type = "";
            var operands = [];

            for(var i = 0;i < compiledExpression.length;i++){
                type = compiledExpression[i++];
                if(type == "n"){
                    operands.push(compiledExpression[i]);
                } else if( type == "v"){
                    operands.push(eval(compiledExpression[i]));
                } else if( type == "f0"){
                    operands.push(compiledExpression[i]());
                } else if( type == "f1"){
                    operands.push(compiledExpression[i](operands.pop()));
                } else if( type == "f2"){
                    operands.push(compiledExpression[i](operands.pop(),operands.pop()));
                } else if( type == "f3"){
                    operands.push(compiledExpression[i](operands.pop(),operands.pop(),operands.pop()));
                } else {
                    return this.error("execute: tokentype not recognized: " + type);
                }
            }
            return this.removeE(operands[0]);
        }

        pscript.compile = function(stringExpression){
            iError = 0;
            sErrorMsg = "";
            sExpr = stringExpression.toLowerCase();
            iLen = stringExpression.length;
            iPos = -1;
            aStack = [];
            tok = null;

            var ret =  this.nextToken();
            if( ret == false ) {
                return sErrorMsg;
            }
            if(this.addExpr()){
                if(iPos >= iLen){
                    return aStack;
                } else {
                    this.error("eval: too many tokens");
                }
            }
            return sErrorMsg;
        };

       pscript.plus = function(a,b){
           return expj.common.pscript.evalTrimFixed(a + b);
       };

       pscript.minus = function(a,b){

            var ttbb = String(b);
            var isMinus = false;
            var subMinus = false;
            if(a < 0 ){
                isMinus = true;
                subMinus = true;
            }

            if(ttbb.charAt(0) == "-"){
                ttbb = ttbb.slice(1,ttbb.length);
                return expj.common.pscript.evalTrimFixed(a + Number(ttbb)) * -1;
            }

            if(a == 0){
                return expj.common.pscript.evalTrimFixed(Number(b));
            }

            var am = String(a).indexOf(".");
            var bm = String(b).indexOf(".");
            var al = 0;
            var bl = 0;
            var mf = 1;

            var aary = new Array();
            var bary = new Array();

            if(am != -1){
                aary = String(a).split(".");
                aary[0] = aary[0];
                al = aary[1].length;
                aary[1] = aary[1];
            }else{
                aary[0] = a;
                aary[1] = 0;
                al = 1;
            }

            if(bm != -1){
                bary = String(b).split(".");
                bary[0] = bary[0];
                bl = bary[1].length;
                bary[1] = bary[1];
            }else{
                bary[0] = b;
                bary[1] = 0;
                bl = 1;
            }

            var ptcnt = -1;

            if(al != bl){
                var cnt = 0;
                var i = 0;
                var t = "";

                if(al < bl){
                    cnt = bl - al;
                    t = String(aary[1]);
                    for(;i < cnt;i++){
                        t += "0";
                    }
                    aary[1] = t;
                    ptcnt = t.length;
                }else{
                    cnt = al - bl;
                    t = String(bary[1]);
                    for(;i < cnt;i++){
                        t += "0";
                    }
                    bary[1] = t;
                    ptcnt = t.length;
                }
            }
            if((Number(aary[1]) - Number(bary[1])) < 0){
                var ti = Number(aary[0]) - 1;
                aary[0] = String(ti);
                var tp = "1" + aary[1];
                aary[1] = tp;
            }

            var tmp;

            aary[0] = Number(aary[0]);
            bary[0] = Number(bary[0]);

            while(aary[1].toString().charAt(0) == "0"){
                if(aary[1].toString().length == 1){
                    break;
                }
                aary[1] = aary[1].toString().slice(1,aary[1].length);
            }
            aary[1] = Number(aary[1]);

            while(bary[1].toString().charAt(0) == "0"){
                if(bary[1].toString().length == 1){
                    break;
                }
                bary[1] = bary[1].toString().slice(1,bary[1].length);
            }
            bary[1] = Number(bary[1]);

            if(am != -1 || bm != -1){
                var tnu = (aary[1] - bary[1]);

                if(subMinus == true){
                    tnu = (aary[1] + bary[1]);
                    if(tnu >=100 ){
                        tnu = Number(String(tnu).slice(1,String(tnu).length));
                    }
                }

                if(String(tnu).charAt(0) == "-"){
                    tnu = Number(String(tnu).slice(1,String(tnu).length));
                    isMinus = true;
                }

                if(Number(aary[0]) < Number(bary[0])){
                    var tary;

                    tary = aary[0];
                    aary[0] = bary[0];
                    bary[0] = tary;
                    isMinus = true;
                }

                if(String(tnu).length == ptcnt){

                    if (isMinus == true && tnu != 0 && subMinus == false) {
                        var reverseTmp = "1";
                        for (var p = 0; p < String(tnu).length; p++) {
                            reverseTmp += "0";
                        }
                        var reverseResult = Number(reverseTmp) - parseInt(tnu, 10);
                        while (String(reverseResult).length < String(tnu).length) {
                            reverseResult = "0" + reverseResult;
                        }
                        tmp = (aary[0] - bary[0] - 1) + "." + reverseResult;

                    } else {
                        tmp = (aary[0] - bary[0]) + "." +  String(tnu);
                    }


                }else{
                    if(ptcnt != -1){
                        var tpp = ptcnt - String(tnu).length;
                        var tpv = "";

                        for(var p = 0;p < tpp;p++){
                            tpv += "0";
                        }
                        tpv += String(tnu);

                        if (isMinus == true && tpv != 0 && subMinus == false) {

                            var reverseTmp = "1";
                            for (var p = 0; p < String(tpv).length; p++) {
                                reverseTmp += "0";
                            }
                            var reverseResult = Number(reverseTmp) - parseInt(tpv, 10);
                            while (String(reverseResult).length < String(tnu).length) {
                                reverseResult = "0" + reverseResult;
                            }

                            tmp = (aary[0] - bary[0] - 1) + "." + reverseResult;

                        } else {

                            tmp = (aary[0] - bary[0]) + "." + tpv;
                        }


                    }else{
                        var vint = 0;

                        if(al > bl){
                            vint = al;
                        }else{
                            vint = bl;
                        }
                        var tpp = vint - String(tnu).length;
                        var tpv = "";

                        for(var p = 0;p < tpp;p++){
                            tpv += "0";
                        }
                        tpv += String(tnu);


                        if (isMinus == true && tpv != 0 && subMinus == false) {

                            var reverseTmp = "1";
                            for (var p = 0; p < String(tpv).length; p++) {
                                reverseTmp += "0";
                            }
                            var reverseResult = Number(reverseTmp) - parseInt(tpv, 10);
                            while (String(reverseResult).length < String(tnu).length) {
                                reverseResult = "0" + reverseResult;
                            }

                            tmp = (aary[0] - bary[0] - 1) + "." + reverseResult;

                        } else {

                            tmp = (aary[0] - bary[0]) + "." + tpv;
                        }

                    }
                }
            }else{
                tmp = (aary[0] - bary[0]);
            }

            if(isMinus == true){
                if(tmp>0){
                    tmp = "-" + tmp;
                }
            }
            var r= -Number(tmp) * mf;
            return expj.common.pscript.evalTrimFixed(r);
        };

        pscript.mul = function(a,b){
            return expj.common.pscript.evalTrimFixed(a * b);
        }
        pscript.div = function(a,b){
            return expj.common.pscript.evalTrimFixed(b / a);
        }
       pscript.mod = function(a,b){
            if(a == 0){
                return Infinity
            }
            return expj.common.pscript.evalTrimFixed(b % a);
        }


       pscript.pow2 = function(x,y){
            if(x == 0 && y > 0){
                return 0;
            }

            if(x < 0 && y == Math.floor(y)){
                if(y % 2){
                    return(-Math.pow(-x,y));
                }else{
                    return Math.pow (-x, y);
                }
            }
            return Math.pow(x,y);
        }

        pscript.addExpr = function(){
            var r1, r2;

            if(this.mulExpr()){
                while(1){
                    if(tok.name == "+"){
                        if(! this.nextToken()) return this.error("addExpr: 1 expression expected");

                        if(this.mulExpr()){
                            aStack.push("f2");
                            aStack.push(this.plus);
                        }else{
                            return this.error("addExpr: 2 expression expected");
                        }
                    }else if(tok.name == "-"){
                        if(! this.nextToken()) return this.error("addExpr: 3 expression expected");

                        if(this.mulExpr()){
                            aStack.push("f2");
                            aStack.push(this.minus);
                        }else{
                            return this.error("addExpr: 4 expression expected");
                        }
                    }else{
                        break;
                    }
                }
                return true;
            }else{
                return this.error("addExpr: 6 expression expected");
            }
        };


        pscript.mulExpr = function(){
            var r1, r2;

            if(this.unaryExpr()){
                while(1){
                    if(tok.name == "*"){
                        if(! this.nextToken()) return this.error("mulExpr: 1 expression expected");
                        if(this.unaryExpr()){
                            aStack.push("f2");
                            aStack.push(this.mul);
                        }else{
                            return this.error("mulExp: 2 expression expected");
                        }
                    }else if(tok.name == "/"){
                        if(! this.nextToken()) return this.error("mulExpr: 3 expression expected");
                        if(this.unaryExpr()){
                            aStack.push("f2");
                            aStack.push(this.div);
                        }else{
                            return this.error("mulExp: 4 expression expected");
                        }
                    }else if(tok.name == "%"){
                        if(! this.nextToken()) return this.error("mulExpr: 5 expression expected");
                        if(this.unaryExpr()){
                            aStack.push("f2");
                            aStack.push(this.mod);
                        }else{
                            return this.error("mulExp: 6 expression expected");
                        }
                    }else break;
                }
                return true

            }else{
                return this.error("mulExp: 7 expression expected");
            }
        };

        pscript.unaryExpr = function(){
            if(tok.name == "+"){
                if(!this.nextToken()) return this.error("unaryExpr: 1 expression expected");
                if(this.unaryExpr()){
                    return true;
                }else{
                    return this.error("unaryExpr: 2 expression expected");
                }
            }else if(tok.name == "-"){
                if(!this.nextToken()) return this.error("unaryExpr: 3 expression expected");
                aStack.push("n");
                aStack.push(0);
                if(this.unaryExpr()){
                    aStack.push("f2");
                    aStack.push(this.minus);
                    return true;
                }else{
                    return this.error("unaryExpr: 4 expression expected");
                }
            }else if(this.primaryExpr()){
                return true;
            }else{
                return this.error("unaryExpr: 3 expression expected");
            }
        };


        pscript.primaryExpr = function(){
            var r1, r2, r3;
            var tValArray = [];

            if(tok.name == "("){
                if(! this.nextToken()) return this.error("primaryExpr: 1 expression expected");
                if(this.addExpr()){
                    if(tok.name == ")"){
                        this.nextToken();
                        return true;
                    }else{
                        return this.error("primaryExpr: 2 ')' expected");
                    }
                }else{
                    return this.error("primaryExpr: 3 expression expected");
                }
            }else if( tok.type == "n"){
                aStack.push("n");
                aStack.push(tok.value);
                this.nextToken();

                return true;
            }else if(tok.type == "f"){
                r1 = tok;
                if(this.nextToken() && tok.name == "("){
                    if(!this.nextToken()) return this.error("primaryExpr: 4 token expected");
                    if(tok.name == ")"){
                        this.nextToken();
                        aStack.push("f0");
                        aStack.push(r1.value);

                        return true;
                    }else if(this.exprList(tValArray)){
                        if(tok.name == ")"){
                            this.nextToken();
                            aStack.push("f" + tValArray.length);
                            if(tValArray.length == 2 && r1.name == "pow"){
                                aStack.push(this.pow2);
                            }else aStack.push(r1.value);

                            return true;
                        }else{
                            return this.error("primaryExpr: 5 ')' expected");
                        }
                    }else{
                        return this.error("primaryExpr: 6 exprList expected");
                    }
                }else{
                    return this.error("primaryExp: 7 '(' expected");
                }
            }else if(tok.type == "v") {
                aStack.push("v");
                aStack.push(this.tok.name);
                this.nextToken();

                return true;
            }else{
                return this.error("primaryExpr: 8 expression expected: " + tok.name + " " + tok.type);
            }
        };

        pscript.exprList = function(tValArray){
            while(this.addExpr()){
                tValArray.push(1);
                if(tok.name != ",") break;
                if(!this.nextToken()) return this.error("exprList: 1 expression expected");
            }

            return true;
        };



        pscript.removeE = function(val) {
            var expNum;
            var baseNumStr;
            var idx;
            var dotIdx;
            var dotLen;
            var dotMoveLen;
            var resultStrLen;
            var evalStr;
            var resultStr;
            var i ;
            var workStr;
            var checkChar;
            var firstDotFlg=true;
            var minusFlg= false;
            var addZeroNum;

            resultStr = val;
            evalStr = val.toString();
            evalStr = evalStr.toLowerCase();

            idx = evalStr.indexOf("e");
            if(idx > 0) {
                workStr = evalStr.substring(0,idx) + evalStr.substr(idx+1);
                for(i=0; i<workStr.length; i++) {
                    checkChar = workStr.charAt(i);
                    if(checkChar==".") {
                        if(firstDotFlg==true) {
                            firstDotFlg=false;
                        } else {
                            return resultStr;
                        }
                    }
                    if(checkChar=="-") {
                        if((i != 0) && (i != idx)) {
                            return resultStr;
                        }
                    }
                    if(checkChar=="+") {
                        if((i != 0) && (i != idx)) {
                            return resultStr;
                        }
                    }
                    if(((checkChar <"0") || (checkChar >"9")) && (checkChar != ".") && (checkChar != "-")  && (checkChar != "+")) {
                        return resultStr;
                    }
                }

                expNum = this.Number(evalStr.substr(idx+1));
                if(isNaN(expNum)) {
                    return resultStr;
                }
                baseNumStr = evalStr.substring(0,idx);
                if(baseNumStr.charAt(0) == "-") {
                    baseNumStr = baseNumStr.substr(1);
                    minusFlg=true;
                }

                dotIdx = baseNumStr.indexOf(".");

                if(dotIdx != -1) {
                    dotLen = baseNumStr.length-(dotIdx+1);
                } else {
                    dotLen = 0;
                }

                resultStr = baseNumStr;
                dotMoveLen = expNum - dotLen;
                resultStr = baseNumStr.split(".").join("");

                i=0;
                while(resultStr.charAt(i) == "0") {
                    i++;
                    if(i>=resultStr.length) {
                        break;
                    }
                }
                resultStr = resultStr.substr(i);

                if(dotMoveLen>0) {
                    for(i=0; i<dotMoveLen;i++) {
                        resultStr = resultStr + "0";
                    }
                } else if(dotMoveLen<0){
                    addZeroNum = 0-(resultStr.length + dotMoveLen-1);
                    if(addZeroNum > 0) {
                        for(i=0; i<addZeroNum; i++) {
                            resultStr = "0" + resultStr;
                        }
                    }

                    resultStr = resultStr.substring(0, resultStr.length+dotMoveLen) + "." + resultStr.substr(dotMoveLen);
                }

                if(minusFlg == true) {
                    resultStr = "-" + resultStr;
                }

            }

            return resultStr;
        };


        pscript.Number =function(obj){
            if(obj == undefined)return Number.NaN;
            if(isNaN(obj)==true) return Number.NaN;

            if(typeof(obj) == "string"){
                if(obj.indexOf("0x") != -1){
                    return Number(obj);
                }else{
                    if(obj.indexOf(".") != -1){
                        return parseFloat(obj);
                    }else{
                        return parseInt(obj,10);
                    }
                }
            }else{
                return parseInt(String(obj),10);
            }
        };

        pscript.eval = function(stringExpression){
            return this.execute(this.compile(stringExpression));
        };

        return pscript;
    }
};

expj.common.pscript.evalInstance = expj.common.pscript.ExEval.create();

expj.common.pscript.eval = function (stringExpression) {
  var expression = stringExpression.replace(/{/g, '(');
  expression = expression.replace(/}/g, ')');
  return expj.common.pscript.evalInstance.eval(expression.replace(/,/g, ''));
};
