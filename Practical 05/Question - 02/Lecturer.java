package com.mycompany.practical5_2;

public class Lecturer implements Speaker
{
    @Override
    public void speak()
    {
        System.out.println("As a lecturer, I conduct lectures");
    }
}