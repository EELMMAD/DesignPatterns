package com.elmiramadadi.momento;

import java.util.List;

public class EditorState {
    private final String content;

     public String getContent() {
          return content;
     }

     public EditorState(String content) {
          this.content = content;
     }
}
