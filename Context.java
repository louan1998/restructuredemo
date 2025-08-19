package org.ai.restructuredemo.context;

import lombok.Data;
import org.ai.restructuredemo.myself.Step;

import java.util.List;

@Data
public class Context {
    private List<Step> solutionStep;
}
