const fs = require('fs');
const path = require('path');
const glob = require('glob');

const specRegEx = /resourcemanager-(.+)\/src/g;
const clientRegEx = /private.+\s+(\w+Client)\s+/g;
const mgmtCliRegEx = /<(.+ManagementClient)>/g;
const 
var data = {};

function rescover() {
	// console.log('start to detect resource coverage');
	const cliPath = 'azure-resourcemanager-*/src/main/java/com/azure/resourcemanager/*/fluent/*Client.java';
	
	var cliFiles = glob.sync(cliPath);
	
	for (var i in cliFiles) {
		collect(cliFiles[i]);
	}
	console.log(data);
}

function collect(filename) {
	var match = specRegEx.exec(filename);
	if (match == null) {
		console.log('[WARN] No spec found in ' + filename);
	} else {
		if (data[match[1]] == null) {
			data[match[1]] = {};
		}
		getClient(fs.readFileSync(filename, 'utf-8'));
	}
	// reset RegExp state
	specRegEx.lastIndex = 0;
}

function getClient(content) {
}

rescover();