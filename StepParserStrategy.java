package org.ai.restructuredemo.parser;

import org.ai.restructuredemo.solutionstep.SolutionStep;

public interface StepParserStrategy {
    void parse(SolutionStep step);
}
