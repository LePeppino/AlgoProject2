package com.company;

public class RBTNode {
    public static final boolean black=false;
    public static final boolean red=true;
    public int key;
    public String val;
    public Boolean color;
    public RBTNode left, right, parent;
    private String surname;
    private String name;
    private String gender;
    private int age;


    public RBTNode(int k, String s) {
        setKey(k);
        setVal(s);
        setColor(red);
        setLeft(null);
        setRight(null);
        setParent(null);
    }

    public String getSurname(){return surname;}
    public void setSurname(String surname){this.surname = surname;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public int getKey() {return key;}
    public void setKey(int key) {this.key = key;}

    public String getVal() {return val;}
    public void setVal(String val) {this.val = val;}

    public Boolean getColor() {return color;}
    public void setColor(Boolean color) {this.color = color;}

    public RBTNode getLeft() {return left;}
    public void setLeft(RBTNode left) {this.left = left;}

    public RBTNode getRight() {return right;}
    public void setRight(RBTNode right) {this.right = right;}

    public RBTNode getParent() {return parent;}
    public void setParent(RBTNode parent) {this.parent = parent;}

    public static boolean isBlack() {return black;}
    public static boolean isRed() {return red;}
}

