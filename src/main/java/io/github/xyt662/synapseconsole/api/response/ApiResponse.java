package io.github.xyt662.synapseconsole.api.response;

/** 统一响应封装（示例骨架） */
public class ApiResponse<T> {
    private boolean success;
    private String code;
    private String message;
    private T data;
    public static <T> ApiResponse<T> ok(T data){ ApiResponse<T> r=new ApiResponse<>(); r.success=true; r.data=data; r.code="0"; return r; }
}