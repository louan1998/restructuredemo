package org.ai.restructuredemo.myself;

import lombok.Data;

import java.util.List;

@Data
public class Step {
    private List<Dataset> dataSets;
    private List<Field> fields;
    private List<Definition>  definitions;
}
