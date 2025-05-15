package com.roche.group.provisioningtool.model;

import java.util.Map;

public record Template(String productId, Map<String, String> manifest) {

}
