package com.roche.group.provisioningtool.model;

import java.util.List;

public record User(long id, String name, List<Template> templates) {

}
