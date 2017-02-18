package com.web.app;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
    	port(8080);
    	staticFileLocation("/js");
        get("/hello", (req, res) -> {
        	return "Hello World ah bagaimana mungkin biasa ajah";
        	}
        );
        get("iki", (req, res) -> "mulamnya biasa sjahk.<br> beersama kita bisaaa");
        get("/", (req, res) -> "mulamnya biasa sjahk.<br> beersama kita bisaaa<script src='ini.js'></script>");
    }
}