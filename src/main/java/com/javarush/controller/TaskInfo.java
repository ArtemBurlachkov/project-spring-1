package com.javarush.controller;

import com.javarush.domain.Status;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskInfo {
    private String description;
    private Status status;
}
