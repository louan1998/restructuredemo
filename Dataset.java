package org.ai.restructuredemo.myself;

import lombok.Data;

@Data
public class Dataset {
    private String datasetName;
    private String alias;
    private String datasetType; // dataset | step  | metric | metricDataset | table
}
