package com.example.helloworld.Models;

import org.json.JSONObject;

public interface Model {
    public void fromJson(JSONObject json);
    public JSONObject toJson();
}
