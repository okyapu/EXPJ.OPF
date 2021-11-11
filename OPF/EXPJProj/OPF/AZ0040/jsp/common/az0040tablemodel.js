function TableModel() {
	this.rows = new Vector();
	this.getRowCount = new Function("return this.rows.size();");
	this.getValueAt = new Function("row", "col", "return this.rows.get(row).get(col);");
	this.setValueAt = new Function("obj", "rowIndex", "colIndex", "for (var i = this.rows.size(); i <= rowIndex; i++) { var row = new Vector(); for (var j = 0; j < colIndex; j++) { row.add(null); } this.rows.add(row); } this.rows.get(rowIndex).set(colIndex, obj);");
}