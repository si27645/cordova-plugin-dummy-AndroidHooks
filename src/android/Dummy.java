package de.dummy;

import android.content.Intent;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;


public class Dummy extends CordovaPlugin {

    private final String pluginName = "cordova-plugin-dummy";

    @Override
    public boolean execute(final String action, final JSONArray data, final CallbackContext callbackContext) {
            return true;        
    }
}
