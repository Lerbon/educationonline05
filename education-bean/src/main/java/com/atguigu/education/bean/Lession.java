package com.atguigu.education.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author York
 * @create 2018-11-29 20:24
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Lession {
    private int id;
    private String name;
    private double price;
    private int time;
}
