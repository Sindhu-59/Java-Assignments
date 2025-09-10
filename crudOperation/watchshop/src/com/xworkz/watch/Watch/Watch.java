package com.xworkz.watch.Watch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Watch {

    private String watchName;
        private String brand;
        private String model;
        private String type;
        private double price;
        private boolean waterResistant;
}
