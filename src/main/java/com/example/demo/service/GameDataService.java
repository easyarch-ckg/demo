package com.example.demo.service;

import com.example.demo.model.GameData;

public interface GameDataService {
    GameData add(GameData data);
    int delete(String user_id);
    int update(String user_id);
    GameData getDameDataById(String user_id);

}
