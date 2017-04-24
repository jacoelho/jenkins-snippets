#!groovy

Boolean shouldSkip(String commitId = "") {
    sh(script: "git log --pretty=oneline ${commitId}", returnStdout: true)
        .split('\n')
        .any { it =~/(?i)\[skip\s+ci\]/ } 
}
