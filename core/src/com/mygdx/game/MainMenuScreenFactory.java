package com.mygdx.game;

import com.badlogic.gdx.Screen;

public class MainMenuScreenFactory implements ScreenFactory {
    @Override
    public Screen createScreen(GameLluviaMenu game) {
        return new MainMenuScreen(game);
    }
}