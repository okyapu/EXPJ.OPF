function Vector() {
	this.array = new Array();
	this.elementAt = new Function("index", "return this.array[index];");
	this.get = new Function("index", "return this.elementAt(index);");
	this.size = new Function("return this.array.length;");
	this.addElement = new Function("obj", "this.array[this.array.length] = obj;");
	this.add = new Function("obj", "this.addElement(obj);");
	this.removeElementAt = new Function("index", "var a1 = this.array.slice(0, index);var a2 = this.array.slice(index + 1);this.array = a1;this.array = this.array.concat(a2);");
	this.remove = new Function("obj","var index = indexOf(obj);this.removeElementAt(index);");
	this.clear = new Function("this.array.length = 0;");
	this.set = new Function("index", "obj", "this.array[index] = obj");
}
