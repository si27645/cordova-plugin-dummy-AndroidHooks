var exec = require('cordova/exec');
var PLUGIN_NAME = 'Dummy';

var dummy = {

	hello_world : function (params,success, error ) {
		exec(success, error, 'Dummy', 'hello_world', [params]);
	}
};

module.exports = dummy;
