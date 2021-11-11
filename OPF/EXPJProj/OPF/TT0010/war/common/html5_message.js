function displayErrorMessage(errorCodes) {
    var errorMessage = "";
    var eStr = "";
    if (typeof(errorCodes) == "string") {
        errorMessage = "[" + errorCodes + "]" + getMessageOnly(errorCodes);
        eStr = eStr + '<img draggable="false" src="common/img/error.png">&nbsp;<span style="color: #FF0000;">[' + errorCodes + '] ' + getMessageOnly(errorCodes) + '</span>';
    } else {
        for (var i = 0; i < errorCodes.length; i++) {
            if (errorMessage.length > 0) {
                errorMessage += "\n";
                eStr += "<br>";
            }
            errorMessage +=  "[" + errorCodes[i] + "]" + getMessageOnly(errorCodes[i]);
            eStr = eStr + '<img draggable="false" src="common/img/error.png">&nbsp;<span style="color: #FF0000;">[' + errorCodes[i] + '] ' + getMessageOnly(errorCodes[i]) + '</span>';
        }
    }
    parent.expj.common.setScreenFrameConsoleMessage(eStr);
    alert(errorMessage);
}

function displayConfirmMessage(code) {
    var wStr = '';
    wStr = wStr + '<img draggable="false" src="common/img/warn.png">&nbsp;<span style="color:#007500;">[' + code + '] ' + getMessageOnly(code) + '</span>';
    parent.expj.common.setScreenFrameConsoleMessage(wStr);
    return confirm(getMessageOnly(code));
}