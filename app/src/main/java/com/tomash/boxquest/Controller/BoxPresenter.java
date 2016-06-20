package com.tomash.boxquest.Controller;

import com.tomash.boxquest.Model.Box;

/**
 * Created by Andrew on 20.06.2016.
 */
public interface BoxPresenter {
    /**
     * Callback for list size for presenter
     * @param size size of list
     */
    void onBoxClick(int size);

    /**
     * Callback for lose state.
     */
    void onLose();

    /**
     * Callback for win state.
     */
    void onWin();
}
