package com.example.todolist.base;


public interface BaseView<T> {
    void setPresenter(T presenter);

//    void setLoadingDialog(boolean isLoading, @Nullable String message);
//    void showStatus(int type, String message);
}
