package com.elmiramadadi.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        var lastIndex = states.size() - 1;   //We get the last item here
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
