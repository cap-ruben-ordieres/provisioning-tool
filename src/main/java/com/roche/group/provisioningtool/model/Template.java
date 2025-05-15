package com.roche.group.provisioningtool.model;

import java.util.Map;

public record Template(String deploy, Map<String, String> manifest) {

}
