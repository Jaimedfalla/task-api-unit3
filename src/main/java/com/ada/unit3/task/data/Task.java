package com.ada.unit3.task.data;

import com.ada.unit3.task.enums.Status;
import java.util.Date;

public class Task {
    private String id;
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;
    private Date created;
}
