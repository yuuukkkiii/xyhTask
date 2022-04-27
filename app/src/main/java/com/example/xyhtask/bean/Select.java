package com.example.xyhtask.bean;

/**
 * author : Zhai Hao
 * date : 2022/4/26 9:21
 * description :
 */
public class Select {
    private String input;

    private String operator;

    private String optional;

    public Select() {

    }

    public Select(String input, String operator, String optional) {
        this.input = input;
        this.operator = operator;
        this.optional = optional;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    @Override
    public String toString() {
        return "Select{" +
                "input='" + input + '\'' +
                ", operator='" + operator + '\'' +
                ", optional='" + optional + '\'' +
                '}';
    }
}
