package qqcommon;

public interface MessageType {
    public static final String MESSAGE_LOGIN_SUCCEED = "1";
    public static final String MESSAGE_LOGIN_FAIL = "2";
    public static final String MESSAGE_COMM_MES = "3";//普通信息包
    public static final String MESSAGE_GET_ONLINE_FRIEND = "4";//要求返回在线用户列表
    public static final String MESSAGE_RET_ONLINE_FRIEND = "5";//返回在线用户列表
    public static final String MESSAGE_CLIENT_EXIT = "6";//客户端请求退出
    public static final String MESSAGE_GET_PRIVATE_CHAT = "7";//客户端请求私聊
    public static final String MESSAGE_RET_PRIVATE_CHAT = "8";//服务器返回私聊的消息



}
