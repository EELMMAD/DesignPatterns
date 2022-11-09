package com.elmiramadadi.momento;

public class Main {

    //Momento --> implementing undo mechanism
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());  //undo
        editor.restore(history.pop());  //undo


        System.out.println(editor.getContent());
    }

}
