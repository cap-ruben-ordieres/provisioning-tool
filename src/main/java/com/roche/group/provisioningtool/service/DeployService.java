package com.roche.group.provisioningtool.service;

import com.roche.group.provisioningtool.model.Template;
import com.roche.group.provisioningtool.model.User;

public interface DeployService {
     void deploy(User user, Template template);
}
